using System;
using System.Globalization;
using System.Text;

namespace ex_1__Practice_11
{
    class Program
    {
        static void Main(string[] args)
        {
            String[] urls = {
            "www.vk.com",
            "www.facebook.com",
            "www.cyberforum.ru",
            "www.sinoptik.ua",
            "www.repl.it",
            "www.allo.ua",
            "www.mail.ru",
            "www.yandex.ru",
            "www.google.com",
            "www.flyuia.com",
            "www.emailondeck.com",
            "www.csbc.edu.ua",
            "www.instagram.com"
            };
            System.Threading.Tasks.Parallel.ForEach(urls, url =>
             {
                 var ping = new System.Net.NetworkInformation.Ping();
                 var result = ping.Send(url);
                 if (result.Status == System.Net.NetworkInformation.IPStatus.Success)
                 {
                     Console.WriteLine(string.Format("{0} is online", url));
                 }
                 else 
                 {
                     Console.WriteLine(string.Format("{0} is offline",url));
                 }
             }
            );
            Console.OutputEncoding = System.Text.Encoding.UTF8;
            PrintTimeStamp("Солом'яний Ярослав Сергійович, 2П-18");
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
