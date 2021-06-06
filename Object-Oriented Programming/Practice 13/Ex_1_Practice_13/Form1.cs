using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Practice_13_Ex_1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            textBox1.TextChanged += textBox1_TextChanged;
            textBox2.TextChanged += textBox2_TextChanged;
            textBox3.TextChanged += textBox3_TextChanged;
            textBox5.TextChanged += textBox5_TextChanged;
            maskedTextBox1.TextChanged += maskedtextBox1_TextChanged;
        }
        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            label12.Text = textBox1.Text;
        }
        private void textBox2_TextChanged(object sender, EventArgs e)
        {
            label13.Text = textBox2.Text;
        }
        private void textBox3_TextChanged(object sender, EventArgs e)
        {
            label14.Text = textBox3.Text;
        }
        private void maskedtextBox1_TextChanged(object sender, EventArgs e)
        {
            label15.Text = "Інформація прихована";
        }
        private void textBox5_TextChanged(object sender, EventArgs e)
        {
            label16.Text = textBox5.Text;
        }
    }
}
