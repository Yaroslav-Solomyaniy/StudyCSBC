using System;
using System.Diagnostics;
using System.Threading;
using System.Threading.Tasks;
using System.Text;
using System.Globalization;
using System.Collections.Generic;

namespace Practice_10_ex_1_McDonalds
{
    class Program
    {
        static void Main(string[] args)
        {
            OrderAsync();
            Console.ReadLine();
        }

        static async void OrderAsync()
        {
            Console.OutputEncoding = Encoding.UTF8;
            var stopwatch = Stopwatch.StartNew();

            var friesTask = Task.Delay(3000).ContinueWith(task => ShowText("Картошка фрі", stopwatch.Elapsed));
            var drinkTask = Task.Delay(1000).ContinueWith(task => ShowText("Кола", stopwatch.Elapsed));
            var burgerTask = Task.Delay(5000).ContinueWith(task => ShowText("Бургер", stopwatch.Elapsed));
            var tasks = new List<Task>() { friesTask, drinkTask, burgerTask };
            while (tasks.Count > 0)
            {
                var task = await Task.WhenAny(tasks);
                tasks.Remove(task);

                Console.WriteLine($"Клієнт спожив продукт. Залишилось приготувати продуктів: {tasks.Count} ");
            }
            ShowText("Заказ", stopwatch.Elapsed);
            stopwatch.Stop();
            PrintTimeStamp("Ярослав Солом'яний, студент групи 2П-18");
        }

        static void ShowText(string name, TimeSpan time)
        {
            Console.WriteLine($"{name} Приготувався(-лась) за {time}");
        }
        public static void PrintTimeStamp(string name)
        {
            Console.OutputEncoding = Encoding.UTF8;
            DateTime localDate = DateTime.Now;
            var culture = new CultureInfo("ru-RU");
            Console.WriteLine("Дата та час компіляції: {0}", localDate.ToString(culture));
            Console.WriteLine("Автор: {0}", name);
        }

    }
}
