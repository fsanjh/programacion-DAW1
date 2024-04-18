//Funcion PedirNum(A, B)
	//Escribir "Escribe dos numeros"
	//Leer A
//	Leer B
	
//Fin Funcion

Funcion MainMenu <- Root (Num)
	Segun Num Hacer
		1:
			Escribir "Escribe dos numeros"
			Leer A
			Leer B
			Escribir "La suma de los dos numeros es ", A+B
		2:
			Escribir "Escribe dos numeros"
			Leer A
			Leer B
			Escribir "La Resta de los dos numeros es ", A-B
		3:	
			Escribir "Escribe dos numeros"
			Leer A
			Leer B
			
			Escribir "La Multiplicacion de los dos numeros es ", A*B
		4:
			Escribir "Escribe dos numeros"
			Leer A
			Leer B
			
			Escribir "La Division de los dos numeros es ", A/B
		De Otro Modo:
			Limpiar Pantalla
			Escribir "Fin del menu"
	Fin Segun
Fin Funcion
Algoritmo Menu
	Escribir "Ingresa la opción que desees"
	Escribir "1. Suma"
	Escribir "2. Restar"
	Escribir "3. Multiplicar"
	Escribir "4. Dividir"
	Escribir "5. Salir"
	Leer Num 
	MainMenu<- Root(Num)
FinAlgoritmo
