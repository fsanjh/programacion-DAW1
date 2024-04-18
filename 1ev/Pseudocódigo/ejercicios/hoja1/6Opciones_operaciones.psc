SubProceso PedirNumeros (num1 Por Referencia, num2 Por Referencia)
    Escribir "Escribe dos n�meros"
    Leer num1
    Leer num2
FinSubProceso

Algoritmo Menu
    // Menu de selecci�n de operaci�n, si se introduce un valor erroneo se repite la pregunta
    Repetir
        Escribir "Ingresa la opci�n que desees"
        Escribir "1. Suma"
        Escribir "2. Restar"
        Escribir "3. Multiplicar"
        Escribir "4. Dividir"
        Escribir "5. Salir"
        Leer Num
    Hasta Que Num >= 1 y Num <= 5
	
    // Segun el valor de num, llama al subproceso que pide numeros y los lee. En la division comprueba que el segundo valor sea 0 para evitar errores
    Segun Num Hacer
        1:
            PedirNumeros(A, B)
            Escribir "La suma de los dos n�meros es ", A + B
        2:
            PedirNumeros(A, B)
            Escribir "La Resta de los dos n�meros es ", A - B
        3:
            PedirNumeros(A, B)
            Escribir "La Multiplicaci�n de los dos n�meros es ", A * B
        4:
            PedirNumeros(A, B)
            Si B = 0 Entonces
                Escribir "No se puede dividir entre 0"
            SiNo
                Escribir "La Divisi�n de los dos n�meros es ", A / B
            FinSi
        De Otro Modo:
            Limpiar Pantalla
            Escribir "Fin del men�"
    Fin Segun
	
FinAlgoritmo
