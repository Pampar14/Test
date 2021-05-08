using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Test01
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Send_Click(object sender, RoutedEventArgs e)
        {
            if (System.Text.RegularExpressions.Regex.IsMatch(numero1.Text, "[^0-9]") || System.Text.RegularExpressions.Regex.IsMatch(numero2.Text, "[^0-9]"))
            {
                MessageBox.Show("Please enter only numbers.");
                //numero1.Text = numero1.Text.Remove(numero1.Text.Length - 1);
            }
            int a = Int32.Parse(numero1.Text);
            int b = Int32.Parse(numero2.Text);
            MessageBox.Show("Il massimo comune divisore è : " + MassimoComunDivisore(a, b));
        }
        public int MassimoComunDivisore(int a, int b)
        {
            int resto;
            while (b != 0)
            {
                resto = a % b;
                a = b;
                b = resto;
            }
            return a;
        }
    }
}
