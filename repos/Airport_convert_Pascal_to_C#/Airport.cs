using System;

public class Airport
{
    int[] vector = new int[1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
    vector v;
    int n, i, a, p;
    String res, c;
    char opc;
    public Airport()
    {
    }//end builder

     public String verificar_puesto(vector v, int puesto)
    {
        if (v[puesto] == 1)
        {
            return "OCUPADO";
        }
        else { return "DESOCUPADO"; }
    }//end verificar_puesto

    public int impresion(vector v)
    {
        int x, y;
        Console.Clear();
        Console.WriteLine();
        Console.WriteLine("\t\tIMPRESION DE RESERVA AEREA NO FUMADOR");
        Console.WriteLine("\t\t\t\tPUESTOS DEL 1/5")
    }
}//end class
