using System;
using System.Diagnostics;
using System.Globalization;
using System.Text;
using System.Threading;

namespace Ex_1_Practice_12
{
    class Program
    {
        static Stopwatch time = new Stopwatch();
        static Barrier orderbarier = new Barrier(3, (barrier) => {

            time.Stop();
            TimeSpan ts = time.Elapsed;
            Console.WriteLine("Your order is ready. Cooking time: {0:00}:{1:00}:{2:00}.{3:00}", ts.Hours, ts.Minutes, ts.Seconds, ts.Milliseconds / 10);
            PrintTimeStamp("Yaroslav Solomianiy, студент групи 2П-18");
        });

        static void Main(string[] args)
        {
            Stopwatch timeFries = new Stopwatch();
            Stopwatch timeHamburger = new Stopwatch();
            Stopwatch timeCola = new Stopwatch();

            time.Start();
            Console.WriteLine("We are preparing your order");

            Thread drink = new Thread(() =>
            {
                time.Start();
                Thread.Sleep(2000);
                TimeSpan ts1 = time.Elapsed;
                Console.WriteLine("Your Cola is ready. Cooking time:{0:00}:{1:00}:{2:00}.{3:00}", ts1.Hours, ts1.Minutes, ts1.Seconds, ts1.Milliseconds / 10);
                orderbarier.SignalAndWait();
                timeCola.Stop();
            });

            Thread fries = new Thread(() =>
            {
                timeFries.Start();
                Thread.Sleep(13000);
                TimeSpan ts2 = timeFries.Elapsed;
                Console.WriteLine("Your Fries is ready. Cooking time:{0:00}:{1:00}:{2:00}.{3:00}", ts2.Hours, ts2.Minutes, ts2.Seconds, ts2.Milliseconds / 10);
                orderbarier.SignalAndWait();
                time.Stop();
                timeFries.Stop();
            });
            Thread hamburger = new Thread(() => {
                timeHamburger.Start();
                Thread.Sleep(10000);
                TimeSpan ts3 = timeHamburger.Elapsed;
                Console.WriteLine("Your Burger is ready. Cooking time:{0:00}:{1:00}:{2:00}.{3:00}", ts3.Hours, ts3.Minutes, ts3.Seconds, ts3.Milliseconds / 10);
                orderbarier.SignalAndWait();
                time.Stop();
                });
            
            fries.Start();
            hamburger.Start();
            drink.Start();
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
