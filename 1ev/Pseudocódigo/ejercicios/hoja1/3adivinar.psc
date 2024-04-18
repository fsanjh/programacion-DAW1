Algoritmo adivinar
	//Crea un numero al azar fuera del bucle, para que no cambie con cada fallo, al poner azar(99+1) los numeros van desde 1 a 100, si pusiera azar(100) estos irían de 0 a 100
	num2 = azar(99 + 1)
	//Repite hasta acertar
	Repetir
		Repetir
			Escribir "Adivina el número aleatorio [1-100]"
			Leer num1
			//Si se introduce un número no comprendido entre 1 y 100
			Si num1 > 100 o num1 < 1 Entonces
				Limpiar Pantalla
				Escribir " ERROR: El número debe ser entre 1 y 100, ambos incluidos"
				Escribir "----------------------------------------------------------"
			FinSi
		Hasta Que num1 <= 100 y num1 >= 1
		//Variable que permitirá al programar finalizar al acertar
		acierto = Falso
		//Contador de intentos
		intentos = intentos + 1
		//Si acierta, termina el programa con la variable "acierto"
		Si num1 = num2 Entonces
			Escribir "============================================================="
			Escribir "¡FELICIDADES! Acertaste el número en " intentos " intentos"
			Escribir "============================================================="
			acierto = Verdadero
		//y si falla...
		SiNo
			Escribir " "
			Escribir "Fallaste, prueba otra vez"
			//Pistas dependiendo de si es mayor o menor
			Si num1 < num2 Entonces
				Escribir "Pista: el número que buscas es MAYOR"
				Escribir "------------------------------------"
			SiNo
				Escribir "Pista: el número que buscas es MENOR"
				Escribir "------------------------------------"
			FinSi
		FinSi
	Hasta Que acierto= Verdadero
FinAlgoritmo