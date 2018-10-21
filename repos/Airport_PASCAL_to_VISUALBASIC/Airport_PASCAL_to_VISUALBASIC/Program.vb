Imports Microsoft.VisualBasic
Imports System.Linq
Imports System.Text

Module Module1
    Public Sub reserva_no_fumador(n As Integer, v As Integer())
        Console.Clear() 'Limpiar pantalla
        Dim puesto As Integer = 0
        Dim x As Integer
        Dim verifica As Integer
        For x = 0 To n - 1
            Console.Clear()
            Console.WriteLine("*-----------------------------------------------------------------------------------------------------*")
            Console.Write(vbLf & vbLf)
            Console.Write(" ***Modulo de reserva area no fumador*** ")
            Console.Write(vbLf & vbLf)
            Console.Write("***Dame un puesto para reservar (Puestos del 1-5 solamente): " & vbLf)
            Dim tempVar As String = Console.ReadLine()
            puesto = Convert.ToInt32(tempVar)
            puesto = puesto - 1
            verifica = function_verificar_puesto(v, puesto)
            While (verifica = 1)
                Console.Write(vbLf & vbLf)
                Console.Write("***CORRIJA EL PUESTO A RESERVAR: ")
                Dim tempVar2 As String = Console.ReadLine()
                puesto = Convert.ToInt32(tempVar2)
                puesto = puesto - 1
                verifica = function_verificar_puesto(v, puesto)
            End While
            v(puesto) = 1
            Console.Write(vbLf & vbLf & "Se reservo el puesto:  " & (puesto + 1) & vbLf)
            Console.Write("Presione una tecla para continuar")
            Console.ReadLine()
        Next 'termina el for despues de la primera vuelta 
    End Sub  'termina  reserva_no_fumador 

    Public Sub reserva_fumador(n As Integer, v As Integer())
        Console.Clear()
        Dim puesto As Integer = 0
        Dim x As Integer
        Dim verifica As Integer
        For x = 0 To n - 1
            Console.Clear()
            Console.WriteLine("*-----------------------------------------------------------------------------------------------------*")
            Console.Write(vbLf & vbLf)
            Console.Write("***Modulo de reserva area fumador***")
            Console.Write(vbLf & vbLf)
            Console.Write("***Dame un puesto para reservar (Puestos del 6-10 solamente): " & vbLf)
            Dim tempVar As String = Console.ReadLine()
            puesto = Convert.ToInt32(tempVar)
            puesto = puesto - 1
            verifica = function_verificar_puesto(v, puesto)
            While (verifica = 1)
                Console.Write(vbLf & vbLf)
                Console.Write("***CORRIJA EL PUESTO A RESERVAR: ")
                Dim tempVar2 As String = Console.ReadLine()
                puesto = Convert.ToInt32(tempVar2)
                puesto = puesto - 1
                verifica = function_verificar_puesto(v, puesto)
            End While
            v(puesto) = 1
            Console.Write(vbLf & vbLf & "Se reservo el puesto:  " & (puesto + 1) & vbLf)
            Console.Write("Presione una tecla para continuar")
            Console.ReadLine()

        Next 'termina el for despues de la primera vuelta 

    End Sub 'termina reserva_fumador 

    Public Function function_impresion(v As Integer()) As Integer
        Dim x As Integer
        Dim y As Integer = 0
        Console.Clear()
        Console.WriteLine("*-----------------------------------------------------------------------------------------------------------------" & vbLf & "*")
        Console.Write(vbLf & " ***IMPRESION DE RESERVA DE AREA DE NO FUMADORES*** " & vbLf)
        Console.Write(vbLf & " ***PUESTO DEL 1 AL 5 " & vbLf)
        For x = 0 To 4
            If v(x) = 0 Then
                Console.Write("  " & vbTab & vbTab & vbTab & " " & (x + 1) & ")  DESOCUPADO " & vbLf)
            Else
                y = y - 1
                Console.Write("  " & vbTab & vbTab & vbTab & " " & (x + 1) & ")  OCUPADO    " & vbLf)
            End If
        Next 'termina el for despues de la primera vuelta 
        Console.ReadLine()
        Console.Write(vbLf & " ***IMPRESION DE RESERVA DE AREA DE FUMADORES*** " & vbLf)
        Console.Write(vbLf & "   PUESTO DEL 6 AL 10 " & vbLf)

        For x = 5 To 9
            If v(x) = 0 Then
                Console.Write("  " & vbTab & vbTab & vbTab & " " & (x + 1) & ")  DESOCUPADO " & vbLf)
            Else
                y = y + 1
                Console.Write("  " & vbTab & vbTab & vbTab & " " & (x + 1) & ")  OCUPADO  " & vbLf)
            End If
        Next 'termina el for despues de la primera vuelta 
        Return y

    End Function 'termina la funcion impresion

    Public Function function_verificar_puesto(v As Integer(), puesto As Integer)
        If v(puesto) = 1 Then
            Console.Write("El puesto a reservar esta: OCUPADO") ' & vbLf
            Return 1
        Else
            Console.Write("El puesto a reservar esta: DESOCUPADO") '& vbLf
            Return 0
        End If
    End Function 'termina la funcion verifica_puesto

    Sub main()

        Dim v(9) As Integer
        Dim n As Integer = 0
        Dim p As Integer
        Dim opcion As Integer = 0
        Do
            Console.Clear()
            Console.Write(vbLf & "   ===============      MENU        =============   " & vbLf)
            Console.Write(vbLf & "      1.Reservar en el area de no fumadores     ")
            Console.Write(vbLf & "      2.Reservar en el area de fumadores     ")
            Console.Write(vbLf & "      3.Impresion de reservas    ")
            Console.Write(vbLf & "      4.Finalizar reservas    " & vbLf)
            Console.Write(vbLf & "   =============== Elija una opcion =============    " & vbLf)
            Dim tempVar4 As String = Console.ReadLine()
            opcion = Convert.ToInt32(tempVar4)
            Select Case opcion
                Case 1
                    If True Then
                        Console.Write(" ***Cuantas reservaciones va hacer  (MAX 5):   ")
                        Dim tempVar2 As String = Console.ReadLine()
                        n = Convert.ToInt32(tempVar2)
                        If n >= 1 AndAlso n <= 5 Then
                            reserva_no_fumador(n, v)
                            Console.Write("presione una tecla para regresar al menu...")
                            Console.ReadLine()
                        Else
                            Console.Write("ERROR!!, ---INGRESE DATOS DENTRO DEL RANGO ADMITIDO---!!" & vbLf)
                            Console.Write("presione una tecla para regresar al menu...")
                            Console.ReadLine()
                            Exit Select
                        End If
                        Exit Select
                    End If

                Case 2
                    If True Then
                        Console.Write(" ***Cuantas reservaciones va hacer (MAX 5):   ")
                        Dim tempVar3 As String = Console.ReadLine()
                        n = Convert.ToInt32(tempVar3)
                        If n >= 1 AndAlso n <= 5 Then
                            reserva_fumador(n, v)
                            Console.Write("presione una tecla para regresar al menu...")
                            Console.ReadLine()
                        Else
                            Console.Write("ERROR!!, ---INGRESE DATOS DENTRO DEL RANGO ADMITIDO!!" & vbLf)
                            Console.Write("presione una tecla para regresar al menu...")
                            Console.ReadLine()
                            Exit Select
                        End If
                        Exit Select
                    End If

                Case 3
                    If True Then
                        p = function_impresion(v)
                        Console.Write("presione una tecla para regresar al menu...")
                        Console.ReadLine()
                        Exit Select
                    End If
                Case Else
                    Console.Write("Saliendo del entorno...")
                    Console.ReadLine()
            End Select
        Loop While opcion <> 4 AndAlso opcion < 4
    End Sub  ' termina el main
End Module   ' termina el modulo