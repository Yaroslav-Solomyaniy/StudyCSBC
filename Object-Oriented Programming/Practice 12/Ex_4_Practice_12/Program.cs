using System;
using System.Globalization;
using System.Text;
using System.Threading;

namespace Ex_4_Practice_12
{
    class Program
    {
        private static AutoResetEvent autoResetEvent = new AutoResetEvent(false);
        static void Main(string[] args)
        {
           
            var random_number = new Random();
            int percent = 0;
            int buff = 0;
            Thread buffering = new Thread(() => {
                while (percent <= 100)
                {
                    Thread.Sleep(1000);
                    while (buff < 10)
                    {
                        buff += random_number.Next(1, 6);
                        Console.WriteLine("Buffering video :  {0}%", buff);
                        Thread.Sleep(1000);
                    }
                    percent += buff;
                    buff = 0;
                    autoResetEvent.Set();
                }
            });
            Thread outputing = new Thread(() => {
                while (true)
                {
                    autoResetEvent.WaitOne();

                    if (percent >= 100)
                    {
                        percent = 100;
                        Console.WriteLine("Video downloading : {0}%", percent);
                        Console.WriteLine("buffering is complete, the video can be viewed");
                        Thread.Sleep(3000);
                        PrintTimeStamp("Yaroslav Solomianiy, Student group 2P-18");
                        break;
                    }
                    else
                    {
                        Console.WriteLine("Video downloading : {0}%", percent);
                        Thread.Sleep(3000);
                    }
                }
            });
            outputing.Start();
            buffering.Start();
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
