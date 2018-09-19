Program Airport;
uses crt;

type vector = array [1..10] of integer;

var v : vector;
    n,i,a,p : integer; 
    res, c : string[10]; 
    opcion : char;

function verificar_puesto(v : vector; puesto : integer) : string;
begin
     if(v[puesto] = 1 ) then
                verificar_puesto := 'OCUPADO'
     else
                verificar_puesto := 'DESOCUPADO'
 end;

 function impresion(v : vector) : integer;
 var x, y : integer;
 begin
   clrscr;
   y := 0;
   writeln;
   writeln ('   IMPRESION DE RESERVA ÁREA NO FUMADOR ');
   writeln ('           PUESTOS DEL 1 AL 5 ');
   writeln;
   writeln ('       PUESTO      CONDICION');
   for x:= 1 to 5 do
       if(v[x] = 0) then
          writeln ('        ',X,'        DESOCUPADO')
       else
          begin
          y := y + 1;
          writeln ('        ',X,'          OCUPADO');
          end;
   writeln (' PRESIONE ENTER PARA CONTINUAR '); readln;
   for x:= 6 to 10 do
       if(v[x] = 0) then
          writeln ('        ',X,'         DESOCUPADO')
       else
          begin
          y := y + 1;
          writeln ('        ',X,'          OCUPADO');
          end;
   impresion := y;
   writeln (' PRESIONE ENTER PARA FINALIZAR IMPRESION '); readln;
 end;




 procedure reserva_no_fumador ( n : integer ; var v : vector );

 var x, puesto : integer;
    res        : char;
 begin
 for x:= 1 to n do
 begin
   clrscr;
   writeln; writeln; writeln;
   writeln('      MODULO DE RESERVA ARFA NO FUMADOR ');
   writeln; writeln;
   writeln (' ELIJA UN PUESTO A RESERVAR ');
   readln(puesto);
      writeln (' EL PUESTO A RESERVAR ESTA ', verificar_puesto(v,puesto));
     while(verificar_puesto(v,puesto) = 'OCUPADO') do
      begin
        writeln; writeln;
        writeln (' CORRIJA PUESTO A RESERVAR ');
        readln(puesto);
        writeln (' EL PUESTO A RESERVAR ESTA ', verificar_puesto(v,puesto));
        writeln (' ENTER PARA CONTINUAR '); readln;
       end;
   v[puesto] := 1;
   writeln (' SE RESERVO EL PUESTO ', puesto,' - ENTER PARA CONTINUAR ');
   readln;
 end;
end;

procedure reserva_fumador ( n : integer ; var v : vector );

var x, puesto  : integer;
    res        : char;

begin
for x:= 1 to n do
 begin
   clrscr;
   writeln; writeln; writeln ;
   writeln ('    MODULO DE RESERVA ARFA FUMADOR ');
   writeln; writeln;
   writeln (' ELIJA UN PUESTO A RESERVAR ');
   readln(puesto);
   writeln (' EL PUESTO A RESERVAR ESTA ', verificar_puesto(v,puesto)) ;

     while(verificar_puesto(v,puesto) = 'OCUPADO') do
       begin
        writeln; writeln;
        writeln (' CORRIJA PUESTO A RESERVAR ');
        readln(puesto);
         writeln (' EL PUESTO A RESERVAR ESTA ', verificar_puesto(v,puesto));
        writeln (' ENTER PARA CONTINUAR '); readln;
       end;
   v[puesto] := 1;
   writeln (' SE RESERVO EL PUESTO - ENTER PARA CONTINUAR ',puesto);
   readln;
 end;
end;


begin
     a :=0; n :=0;
     for i:= 1 to 10 do
        v[i] :=0;
     repeat
       clrscr;
       writeln;writeln;writeln; writeln;
       writeln('                MENU            ');
       writeln;
       writeln('      1. RESERVA AREA NO FUMADOR');
       writeln('      2. RESERVA AREA DE FUMADOR');
       writeln('      3. IMPRESION DE RESERVAS  ');
       writeln('      4. FINALIZAR RESERVAS     ');
       writeln;
       writeln ('            ELIJA OPCION                  ');
    readln (opcion);


    case (opcion) of

    '1': begin
        writeln (' ESTABLEZCA NUMERO DE RESERVACIONES PUESTOS 1 - 5 ');
        readln (n);
        reserva_no_fumador(n,v);
        end;

    '2': begin
        writeln (' ESTABLEZCA NUMERO DE RESERVACIONES PUESTOS 6 - 10 ');
        readln (n);
        reserva_fumador(n,v);
        end;

    '3': begin
        p:=impresion(v);
        writeln ('  CANTIDAD DE PUESTOS RESERVADOS ', p);
        writeln ('    ENTER PARA CONTINUAR  '); 
        readln;
        end;

   '4': begin
        writeln ('   FINALIZARA EL PROGRAMA ' );
        writeln ('    ENTER PARA CONTINUAR ');
        readln;
        end;

    else
        begin
        writeln (' OPCION ERRADA - ELIJA UNA CORRECTA ');
        writeln ('   ENTER PARA CONTINUAR  ');
        readln;
        end
    end;

   until (opcion = '4');

end.
