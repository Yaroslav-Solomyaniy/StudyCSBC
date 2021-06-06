using System;
using System.IO;
using System.Threading.Tasks;

namespace Practice10_ex_2
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
        }
        static void FileRead() 
        {
            string path = @"C:\Users\Anzhelika\source\repos\Practice10_ex_2";
            using (FileStream fstream = File.OpenRead($"{path}\note.txt"))
            {
                // преобразуем строку в байты
                byte[] array = new byte[fstream.Length];
                // считываем данные
                fstream.Read(array, 0, array.Length);
                // декодируем байты в строку
                string textFromFile = System.Text.Encoding.Default.GetString(array);
                Console.WriteLine($"Текст из файла: {textFromFile}");
            }
        }
    }
}
