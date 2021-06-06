using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ex_2_Practice_13
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            timer1.Interval = 200;
            timer1.Enabled = true;
            timer2.Interval = 2000;
            timer2.Enabled = true;

        }

        private void progressBar1_Click(object sender, EventArgs e)
        {

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            progressBar1.PerformStep();
        }

        private void timer2_Tick(object sender, EventArgs e)
        {
            timer2.Stop();
            new Form2().Show();
            this.Hide();
        }
    }
}
