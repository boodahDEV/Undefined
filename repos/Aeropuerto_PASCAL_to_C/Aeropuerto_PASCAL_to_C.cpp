#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void function_verificar_puesto(int[],int,char []);//prototipo
int  function_impresion(int[]);
void reserva_no_fumador(int,int[],char []);
void reserva_fumador(int,int[],char []);
main(){
	
	int v[10]={0};//inicia un arreglo en 0
	int n,i,a,p;
	char res[10],c[10],VerPues[50];
    int opcion;
	 do {
	 			system("cls");
	        	printf("\n\n        Menu        \n");
	 	     	printf("      1.Reservar en el area no fumador     \n ");
	 			printf("     2.Reservar en el area de fumadores     \n ");
	 			printf("     3.Impresion de reservas    \n ");
	 			printf("     4.Finalizar reservas    \n ");
	 			printf("   ================= Elija una opcion ================    \n");
	 		    scanf("%d",&opcion);
	 		    switch(opcion){
	 		    case 1: {
	 		    		printf(" Cuantas reservaciones va hacer  (MAX 5):   ");scanf("%d",&n);
	 		    		if(n>=1 && n<=5){
	 		    			reserva_no_fumador(n,v,VerPues);
						 }else{
						printf("ERROR!!,   INGRESE DATOS DENTRO DEL RANGO ADMITIDO!!\n");
						system("pause");
							break;
						 }
					 	
	 		    		
						break;
					 }
				 
	 			case 2: {
	 		    		printf(" Cuantas reservaciones va hacer (MAX 5):   ");scanf("%d",&n);
	 		    		if(n>=1 && n<=5){
	 		    			reserva_fumador(n,v,VerPues);
						 }else{
						printf("ERROR!!,   INGRESE DATOS DENTRO DEL RANGO ADMITIDO!!\n");
						system("pause");
							break;
						 }
					 	
	 		    		
						break;
					 }
				 
				 case 3: {
				 	p=function_impresion(v);
	 		    			printf(" CANTIDAD DE PUESTOS RESERVADOS    ");system("pause");
	 		    		
						break;
					 }
				 
	 			default: printf("Saliendo del entorno...");system("pause");
	 	}
	 }while(opcion != 4 && opcion < 4);
	 
	 	
	}
void function_verificar_puesto(int v[],int puesto, char VerPues[] ){
 	if(v[puesto] == 1){
 	 	strcpy(VerPues,"OCUPADO");
	 }else{
	 	strcpy(VerPues,"DESOCUPADO");//funcion  de copiar.
	 }
 }
int  function_impresion(int v[]){
	int x,y;
	system("cls");
	printf("\n IMPRESION DE RESERVA AREA NO FUMAR ");
	printf("\n   PUESTO DEL 1 AL 5 \n");
	//printf("\n                  PUESTO            CONDICION ");
	for(x=0 ;x<5 ;x++){
			if(v[x] == 0){
 	 	printf("  			%d DESOCUPADO \n",x+1);//le quite el +1
	 }else{
	 	y=y+1;
	 	printf("  			%d OCUPADO \n",x+1);//le quite el +1
	 }	
	}
		system("pause");
		
			
	for(x=5 ;x<10 ;x++){
			if(v[x] == 0){
 	 	printf("  			%d DESOCUPADO\n",x+1);//le quite el +1
	 }else{
	 y=y+1;
	 	printf("  			%d OCUPADO\n",x+1);//le quite el +1
	 }
	 // system("pause");
//	return(y);
	}
	
}
void reserva_no_fumador(int n, int v[],char VerPues[]){
	int puesto;
	int x;
	char resp;
	for(x=0 ;x< n ;x++){
		system("cls");
		printf("\n\n");
		printf(" Modulo de reserva area no fumador ");
			printf("\n\n");
				printf("Dame un puesto para reservar (Puestos del 1-5 solamente): ");
				scanf("%d",&puesto);
				puesto=puesto-1;//siempre resto 1
				function_verificar_puesto(v,puesto,VerPues);
			printf("\nEl puesto a reservar esta %s",VerPues,"\n");	
		while(strcmp(VerPues,"OCUPADO") == 0){
			printf("\n\n");
			printf("CORRIJA EL PUESTO A RESERVAR: ");
			scanf("%d",&puesto);
			puesto=puesto-1;
			function_verificar_puesto(v,puesto,VerPues);
			printf("El puesto a reservar esta %s",VerPues,"\n");	
			system("pause");
		}
		v[puesto]=1;
		printf("\n\nSe reservo el puesto  %d  ",(puesto+ 1),"\n");
		system("pause");	
	}
	
} 
 void reserva_fumador(int n, int v[],char VerPues[]){
 	
	int puesto;
	int x;
	char resp;
	for(x=0 ;x< n ;x++){
		system("cls");
		printf("\n\n");
		printf("Modulo de reserva area fumador");
			printf("\n\n");
				printf("Dame un puesto para reservar (Puestos del 6-10 solamente): ");
				scanf("%d",&puesto);
				puesto=puesto-1;//siempre resto 1
				function_verificar_puesto(v,puesto,VerPues);
			printf("\nEl puesto a reservar esta %s",VerPues,"\n");	
		while(strcmp(VerPues,"OCUPADO") == 0){
			printf("\n\n");
			printf("CORRIJA EL PUESTO A RESERVAR: ");
			scanf("%d",&puesto);
			puesto=puesto-1;
			function_verificar_puesto(v,puesto,VerPues);
			printf("El puesto a reservar esta %s",VerPues,"\n");	
			system("pause");
		}
		v[puesto]=1;
		printf("\n\nSe reservo el puesto  %d  ",(puesto+1),"\n");
		system("pause");	
	}
}
		
	

