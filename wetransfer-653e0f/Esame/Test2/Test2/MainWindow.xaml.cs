using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
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

namespace Test2
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

        private void Button_Click(object sender, RoutedEventArgs e)
        {
            using (WebClient webClient = new WebClient())
            {
                string s = webClient.DownloadString(url.Text);

                Clipboard.SetText(s, TextDataFormat.Text);

                string[] lines = { s };
                System.IO.File.WriteAllLines(@"C:\Users\Mario\Desktop\source.txt", lines);

                MessageBox.Show( "Ok, check the file in the path!");
            }
        }
    }
}
