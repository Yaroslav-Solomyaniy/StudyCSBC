using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ex_1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            Text = "Exercise 1";
            this.Width = 250;
            this.Height = 300;
            this.BackColor = Color.Aquamarine;
            this.StartPosition = FormStartPosition.CenterScreen;
            this.ForeColor = Color.Red;

        }

        private void button1_Click(object sender, EventArgs e)
        {
            Text = "Кнопка";
        }

        private void label1_Click(object sender, EventArgs e)
        {
            Text = "ТУТ НАДПИСЬ";
        }
    }
}
