using System;

namespace ELP_Program_1
{
    class Program
    {
        static void Main(string[] args)
        {
            int n;
          
                Console.WriteLine("\t\t TABLA DE MULTIPLICAR DE X NUMERO");
                Console.Write("\n Inserte el numero que decea conocer: ");
                n = Int32.Parse(Console.ReadLine());
                Console.WriteLine("\n\n");
                for (int i = 0; i <= 12; i++)
                {
                    Console.WriteLine(n + " * " + i + " = " + (n * i));
                }
            Console.Read();

        }
    }
}
