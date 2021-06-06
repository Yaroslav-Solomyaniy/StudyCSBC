using System;
using System.Globalization;
using System.IO;
using System.Threading.Tasks;

namespace Ex_3_Practice_10
{
    class Program
    {
        async static Task Main(string[] args)
        {
            Console.OutputEncoding = System.Text.Encoding.UTF8;
            await AsyncgMethod();

        }
        async static Task TaskMethod()
        {
            await Task.Run(() =>
            {
                if (File.Exists(@"D:\1.txt") == true)
                {
                    Console.WriteLine("Початок зчитування файлу 1.txt");
                    while (File.Exists(@"D:\1.txt"))
                    {
                    }
                }

            }); ;
        }
        public static async Task AsyncgMethod()
        {
            Task t1 = Task.Run(() => TaskMethod());
            Task t2 = Task.Run(() =>
            {
                string writePath = @"D:\1.txt";
                try
                {
                    Console.WriteLine("Ви можете ввести текст, але ваш ліміт 5 тисяч символів.");
                    int A = 1;
                    while (A < 5000)
                    {
                        string text = Console.ReadLine();
                        using (StreamWriter sw = new StreamWriter(writePath, true, System.Text.Encoding.Default))
                        {
                            sw.WriteLineAsync(text);
                        }
                        Console.WriteLine($"Запись выполнена {A++} раз");
                    }
                    Console.WriteLine("Запись окончена");
                    PrintTimeStamp("Солом'яний Ярослав, Студент групи 2П-18");
                }
                catch (Exception e)
                {
                    Console.WriteLine(e.Message);
                }
            });

            await Task.WhenAll(new[] { t1, t2 });
        }
        public static void PrintTimeStamp(string name)
        {
            Console.OutputEncoding = System.Text.Encoding.UTF8;
            DateTime localDate = DateTime.Now;
            var culture = new CultureInfo("ru-RU");
            Console.WriteLine("Дата та час компіляції: {0}", localDate.ToString(culture));
            Console.WriteLine("Автор: {0}", name);
        }
    }

}
