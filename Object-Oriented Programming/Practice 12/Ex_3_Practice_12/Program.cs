using System;
using System.Globalization;
using System.Text;
using System.Threading;

namespace Ex_3_Practice_12
{
    class Program
    {
        private static AutoResetEvent ResetEvent = new AutoResetEvent(false);
        static void Main(string[] args)
        {
            Thread video_bufer = new Thread(() =>
            {
                Console.WriteLine("Буферизування відео...");
                Thread.Sleep(10000);
                ResetEvent.Set();

            });
            Thread out_video = new Thread(() =>
            {
                ResetEvent.WaitOne();
                Console.WriteLine("Відтворення відео");
            });
            PrintTimeStamp("Solomianiy Yaroslav, Student group 2P-18");
            video_bufer.Start();
            out_video.Start();
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
