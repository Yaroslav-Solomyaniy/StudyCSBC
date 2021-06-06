using System;
using System.Net.Http;
using System.Net.Http.Json;
using System.Threading.Tasks;

namespace Ex_5_Practice_10
{
    class Program
    {
        public static async Task Main()
        {
            using HttpClient client = new()
            {
                BaseAddress = new Uri("https://api.github.com/repos/angular/angular/contributors")
            };

            // Get the user information.
            User user = await client.GetFromJsonAsync<User>("login/1");
            Console.WriteLine($"Login: {user.login}");
            Console.WriteLine($"Contributions: {user.Contributions}");
        }
    }
    public class User
    {
        public string login { get; set; }
        public int Contributions { get; set; }
    }
}