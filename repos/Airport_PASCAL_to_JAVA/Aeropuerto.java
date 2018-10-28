package utils;

/**
*
* @author boodah
*/
import java.util.Scanner;
public class Aeropuerto{
	static Scanner input = new Scanner(System.in);
	
   public static int function_verificar_puesto(int[] v, int puesto, String VerPues) {
		if (v[puesto] == 1) {  
                   System.out.println("\t\t\t\t\t\t    El puesto a reservar esta: OCUPADO "+"\n");
		 return 1;
		}else
		 {  
                   System.out.println("\t\t\t\t\t\t    El puesto a reservar esta: DESOCUPADO "+"\n");
		return 0; 
		} 
	    }
   public static int function_impresion(int[] v)
	    {
int x;
		int y = 0;
		    System.out.print("\n\t\t\t\t\t\t *----------------------------------------------------------------------------------------------*");
		    System.out.print("\n\t\t\t\t\t\t  ***IMPRESION DE RESERVA AREA DE NO FUMADORES*** ");
		    System.out.print("\n\t\t\t\t\t\t  ***PUESTO DEL 1 AL 5 \n"+"\n");
		for(x=0; x<5; x++)
               {
		if (v[x]==0)
               {
	            System.out.println("\t\t\t\t\t\t  "+ (x + 1) + ") DESOCUPADO \n");			
		}else
                {   y=y-1;
		    System.out.println("\t\t\t\t\t\t  "+ (x + 1) + ") OCUPADO \n"); 
		 }
           }
                   System.out.print("\n\t\t\t\t\t\t  ***IMPRESION DE RESERVA AREA DE NO FUMADORES*** ");
		    System.out.print("\n\t\t\t\t\t\t  ***PUESTO DEL 6 AL 10 \n"+"\n");
		for (x = 5; x < 10; x++){
		if (v[x] == 0)
		{
		    System.out.println("\t\t\t\t\t\t  "+ (x + 1) + ") DESOCUPADO \n");
		}else
		 {
		    y = y - 1;
		    System.out.println("\t\t\t\t\t\t  "+ (x + 1) + ") OCUPADO \n"); 
                }
	    }     
                   System.out.print("\n\t\t\t\t\t\t *----------------------------------------------------------------------------------------------*");
 		return y;
           }
       
	public static void reserva_no_fumador(int n, int[] v) {
		int puesto = 0; String VerPues = null;
		int x, ver;
		for (x = 0 ;x < n ;x++){ 
               System.out.println("\n\n");
		System.out.println("\t\t\t\t\t\t    ***Modulo de reserva area no fumador*** ");
		System.out.println("\n");
		System.out.println("\t\t\t\t\t\t    ***Dame un puesto para reservar (Puestos del 1-5 solamente): ");
		String tempVar = input.next();
		if (tempVar != null)
		{
		    puesto = Integer.parseInt(tempVar);
		}
		    puesto = puesto - 1; 
		ver = function_verificar_puesto(v, puesto, VerPues);
               while (ver == 1) {
		System.out.println("\n");
		System.out.println("\n\n\t\t\t\t  ****CORRIJA EL PUESTO A RESERVAR: ");
               String tempVar2 = input.next();
		if (tempVar2 != null) {
		puesto = Integer.parseInt(tempVar2);
		}
		puesto = puesto - 1;
		ver = function_verificar_puesto(v, puesto,VerPues);
               
		}
		    v[puesto] = 1;
		System.out.println("\t\t\t\t\t\t    Se reservo el puesto:"+ (puesto + 1)+"\n");
        
		}
           }
	public static void reserva_fumador(int n, int[] v) {  
               int puesto = 0; String VerPues = null;
	        int x, ver;
for (x = 0 ;x < n ;x++){ 
               System.out.println("\n\n");
		System.out.println("\t\t\t\t\t\t    ***Modulo de reserva de area fumadores***");
	        System.out.println("\n");
		System.out.println("\t\t\t\t\t\t    ***Dame un puesto para reservar (Puestos del 6-10 solamente):");
		String tempVar = input.next();
		if (tempVar != null){
		puesto = Integer.parseInt(tempVar);
		}
		    puesto = puesto - 1;
		ver = function_verificar_puesto(v, puesto,VerPues);
		while (ver == 1){
		System.out.println("\n");
               System.out.println("\n\n\t\t\t\t  ****CORRIJA EL PUESTO A RESERVAR: ");
               String tempVar2 = input.next();
		if (tempVar2 != null)
		{
		    puesto = Integer.parseInt(tempVar2);
		}
		    puesto = puesto - 1;
		ver = function_verificar_puesto(v, puesto,VerPues);
			  
		}
		    v[puesto] = 1;
		System.out.println("\t\t\t\t\t\t    Se reservo el puesto:"+ (puesto + 1)+"\n");	        }
	    }
	public static void main(String args[])
	    {
       int[] v = new int[10];
		int n = 0;
			int opcion = 0;
		do{
	   	System.out.println("\n\n");			 
		System.out.println("\t\t\t\t\t\t      ===============  MENU   ==============   \n");
		System.out.println("\t\t\t\t\t\t      1.Reservar en el area no fumador \n ");
		System.out.println("\t\t\t\t\t\t      2.Reservar en el area de fumadores \n ");
		System.out.println("\t\t\t\t\t\t      3.Impresion de reservas \n ");
		System.out.println("\t\t\t\t\t\t      4.Finalizar reservas \n ");
		System.out.println("\t\t\t\t\t\t      ============ Elija una opcion ========  ");
	        String tempVar = input.next();			
		if (tempVar != null){
		opcion = Integer.parseInt(tempVar);
		}
		switch (opcion){
		case 1:{
               System.out.println("\t\t\t\t\t\t    ***Cuantas reservaciones va hacer  (MAX 5):   ");
		String tempVar2 = input.next();
		if (tempVar2 != null)
		{
		n = Integer.parseInt(tempVar2);
		}
		if (n >= 1 && n <= 5)
		{
		reserva_no_fumador(n, v);
		}
		else
		{
		System.out.println("\t\t\t\t\t\t     ERROR!!,----INGRESE DATOS DENTRO DEL RANGO ADMITIDO!!\n");
		break;
		}
               break;
		}
               case 2:
		{
		System.out.println("\t\t\t\t\t\t    ***Cuantas reservaciones va hacer (MAX 5):   ");
	        String tempVar3 = input.next();
		if (tempVar3 != null)
		{
		 n = Integer.parseInt(tempVar3);
		}
		if (n >= 1 && n <= 5){
		reserva_fumador(n, v);
		}
		else
		{
		System.out.println("\t\t\t\t\t\t     ERROR!!,----INGRESE DATOS DENTRO DEL RANGO ADMITIDO!!\n");
		break;
               }
               break;
		}
               case 3:
		{
		function_impresion(v);
		break;
		}
               default:

		System.out.println("\t\t\t\t\t     Saliendo del entorno...");
		}
		}while (opcion != 4 && opcion < 4);
               }
} // End class