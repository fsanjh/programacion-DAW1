Algoritmo factorial
	Repetir
		Si num<0 Entonces
			Escribir "ERROR: Debe ser un número mayor o igual que 0"
			Escribir "----------------------------------------------"
		FinSi
		// Se le pide al usuario un número y este, se guarda en una variable
		Escribir "Dime un número entero [0,1,2...]:"
		Leer num
	Hasta que num>=0
		//Se verifica que el numero sea mayor de 1
	si num>1 Entonces
	//Si num es 5, el bucle se hace a partir de 4 (num -1 ), para que la primera suma sea 5+4 y no 5+5
		Para i <- num - 1 hasta 1 Hacer
			//Muestro la operación, le asigno el nuevo valor a num y espero un poco para que quede mejor visualmente
			Escribir num " + " i "= " num + i
			num= num + i
			Esperar 50 Milisegundos
			//Si i = 1 significaría que ya se han sumado todos y se muestra el resultado final
			Si i = 1 Entonces
				Escribir "La suma de todos los numeros desde el 1 es: " num
			FinSi
		FinPara
	FinSi
		//Si num es 0 o 1 muestra directamente esta respuesta en vez de entrar al bucle
	si num<=1 Entonces
		Escribir "El resultado es igual al número dado: " num
	FinSi
FinAlgoritmo
