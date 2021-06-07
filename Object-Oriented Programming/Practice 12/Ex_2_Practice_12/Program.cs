using System;
using System.Globalization;
using System.Text;
using System.Threading;

namespace Ex_2_Practice_12
{
    class Program
    {
        private static Semaphore semaphore;

        static void Main(string[] args)
        {
            PrintTimeStamp("Yaroslav Solomianiy, student group 2P-18");
            semaphore = new Semaphore(0, 4);
            Thread firstClient = new Thread(new ParameterizedThreadStart(Client));
            Thread secondClient = new Thread(new ParameterizedThreadStart(Client));
            Thread thridClient = new Thread(new ParameterizedThreadStart(Client));
            Thread fourthClient = new Thread(new ParameterizedThreadStart(Client));
            Thread fifthClient = new Thread(new ParameterizedThreadStart(Client));
            Thread sixthClient = new Thread(new ParameterizedThreadStart(Client));
            Thread[] arrayTread = new Thread[] { firstClient, secondClient, thridClient, fourthClient, fifthClient, sixthClient };
            for (int i = 0; i < 6; i++)
            {
                arrayTread[i].Start();
            }
            Thread.Sleep(500);
           semaphore.Release(4);
        }
        public static void Client(object num)
        {

            Console.WriteLine("acquiring lock...");
            semaphore.WaitOne();
            Console.WriteLine("got the permit!");
            for (int i = 0; i < 5; i++) 
            {
                Console.WriteLine("Is performing operation " + i);
                Thread.Sleep(1000);
            }
            Console.WriteLine(" releasing lock...");
            semaphore.Release();
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
