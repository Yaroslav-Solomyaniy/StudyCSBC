using System;
using System.Diagnostics;
using System.Globalization;
using System.Linq;
using System.Text;

namespace Ex_4_Practice_11
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime StartTime = DateTime.Now;
            var ParallelQuery = from n in Enumerable.Range(2, 1000000)
                                .AsParallel().WithDegreeOfParallelism(32)
                                where Enumerable.Range(0, (int)Math.Sqrt(n) / 2 + 1).Select(e => e == 0 ? 2 : e + 1).All(i => n % i > 0)
                                select n;
            int[] primes = ParallelQuery.ToArray();
            TimeSpan ts = DateTime.Now.Subtract(StartTime);
            string elapsedTime = String.Format("{0:00}:{1:00}:{2:00}.{3:00}",
                    ts.Hours, ts.Minutes, ts.Seconds,
                    ts.Milliseconds / 10);
            Console.WriteLine(elapsedTime, "RunTime");
            PrintTimeStamp("Солом'яний Ярослав, студент групи 2П-18");
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
