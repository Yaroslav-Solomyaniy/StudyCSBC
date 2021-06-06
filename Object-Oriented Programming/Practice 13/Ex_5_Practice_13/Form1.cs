using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ex_5_Practice_13
{
    public partial class Form1 : Form
    {
        String name = "";
        public Form1()
        {
            InitializeComponent();
            textBox1.TextChanged += textBox1_TextChanged;
        }
        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            label3.Text = textBox1.Lines.Length.ToString();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            OpenFileDialog openFile1 = new OpenFileDialog();
            openFile1.Filter = "Text files(*.txt)|*.txt|All files(*.*)|*.*";
            if (openFile1.ShowDialog() == DialogResult.Cancel)
                return;
            string FileName = openFile1.FileName;
            string FileText = System.IO.File.ReadAllText(FileName);
            textBox1.Text = FileText;
            name = FileName;
            FileInfo fileInfo = new FileInfo(FileName);
            label4.Text = fileInfo.Length.ToString();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            SaveFileDialog saveFile1 = new SaveFileDialog();
            saveFile1.Filter = "Text files(*.txt)|*.txt|All files(*.*)|*.*";
            if (saveFile1.ShowDialog() == DialogResult.Cancel)
                return;
            string FileName = saveFile1.FileName;
            System.IO.File.WriteAllText(saveFile1.FileName, textBox1.Text);
            name = FileName;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            if (name.Length != 0)
            {
                File.Delete(name);
                textBox1.Text = "";
                MessageBox.Show("Файл видалено!");
                name = "";
            }
            else
            {
                MessageBox.Show("Файл не обрано!");
            }
        }

        private void button4_Click(object sender, EventArgs e)
        {
            textBox1.Text = "";
            name = "";
        }
    }
}