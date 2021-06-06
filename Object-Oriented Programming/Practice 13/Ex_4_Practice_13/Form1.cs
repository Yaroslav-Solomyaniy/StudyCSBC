using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ex_4_Practice_13
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Button Buttnew = new Button();
            Buttnew.Location = new Point(23,90);
            Buttnew.BackColor = Color.Bisque;
            Buttnew.Text = "Новостворенна кнопка";
            Buttnew.Size = new Size(157, 43);
            this.Controls.Add(Buttnew);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            TextBox tx = new TextBox();
            tx.Location = new Point(221, 90);
            tx.BackColor = Color.Beige;
            tx.Text = "Новостворене текстове поле";
            tx.Size = new Size(157, 43);
            tx.Multiline = true;
            this.Controls.Add(tx);
        }

        private void button3_Click(object sender, EventArgs e)
        {
            Label lb = new Label();
            lb.Location = new Point(412, 90);
            lb.BackColor = Color.Aquamarine;
            lb.Text = "Новостворений надпис";
            lb.Size = new Size(157,43);
            this.Controls.Add(lb);
        }

        private void button4_Click(object sender, EventArgs e)
        {
            CheckBox cb = new CheckBox();
            cb.Location = new Point(607,90);
            cb.BackColor = Color.FloralWhite;
            cb.Text = "Новостворений чекбокс";
            cb.Size = new Size(157, 43);
            this.Controls.Add(cb);
        }

        private void button5_Click(object sender, EventArgs e)
        {
            label1.Text = "Солом'яний Ярослав Сергійович, 2П-18, час розробки: 23:05, 06.06.2021";
        }
    }
}
