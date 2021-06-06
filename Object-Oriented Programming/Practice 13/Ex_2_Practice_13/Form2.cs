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
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label1.Text = "Author: Yaroslav Solomianiy";
            label2.Text = "Study in CSBC";
            label3.Text = "Виконав 06.06.2021";
            label4.Text = "Час: 20:21";
        }
    }
}
