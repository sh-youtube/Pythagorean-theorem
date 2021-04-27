using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication17
{
    class Program
    {
        static void Main(string[] args)
        {
            initier:
            Console.Write("Enter Side A[ctrl+c to quit]: ");
            double a = int.Parse(Console.ReadLine());
            Console.Write("Enter Side B[ctrl+c to quit]: ");
            double b = int.Parse(Console.ReadLine());
            double c = Math.Sqrt((Math.Pow(a, 2) + Math.Pow(b, 2)));
            Console.WriteLine("C side is: "+c+"\n");
            goto initier;
        }
    }
}
