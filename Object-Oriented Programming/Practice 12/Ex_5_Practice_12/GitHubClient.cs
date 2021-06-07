namespace Ex_5_Practice_12
{
    internal class GitHubClient
    {
        private Octokit.ProductHeaderValue productHeaderValue;

        public GitHubClient(Octokit.ProductHeaderValue productHeaderValue)
        {
            this.productHeaderValue = productHeaderValue;
        }

        public object Credentials { get; set; }
    }
}