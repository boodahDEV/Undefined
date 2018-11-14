#include <stdio.h>
#define MAX_COMMAND_IN_SYSTEM 2

main(int argc, char const *argv[]){
   //---=== DEFINO LA PRIMERA ESTRUCTURA PARA LA DEFINICION DE LISTAS DE PALABRAS RECERVADAS O COMANDOS===----          TODO PARA LA DEFINICION DEL ANALIZADOR LEXICO!
    struct{
        char command[2];
        char function_command[50];
        char command_name [20];
    }command[MAX_COMMAND_IN_SYSTEM];

    /* code */

    return 0;
}
