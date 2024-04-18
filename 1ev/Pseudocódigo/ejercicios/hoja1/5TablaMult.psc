Algoritmo TablaDeMultiplicar
	//Pide un numero
	Escribir "Escribe el numero de la tabla de multiplicar que quieres ver"
	Leer Num
	// Con "para" realiza un bucle de la operacion con los numeros del 1 al 10
	Para i<- 1 Hasta 10 Hacer
		Escribir num "*" i "=" num*i
		Esperar 50 Milisegundos
	Fin Para
FinAlgoritmo
