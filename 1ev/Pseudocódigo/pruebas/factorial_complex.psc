 Algoritmo factorial
	Repetir
		Limpiar Pantalla
		Repetir
			Escribir "Dime un número para calcular su factorial " Sin Saltar ; Leer num
			flag = Verdadero //Permite continuar
			//Comprueba que el número introducido NO tiene decimales
			num2 <- trunc(num) //trunc(2.5) = 2
			Si num < 0 Entonces
				Escribir "No se puede calcular el factorial de " num
				Escribir "---------------------------------------------"
				flag = Falso //No permite continuar
			FinSi
			Si (num - num2)>0 y (num - num2)<1 Entonces //(2.5 - 2) = 0.5, 0.5 > 0 y 0.5 < 1
				Escribir "No se puede calcular el factorial de " num
				Escribir "---------------------------------------------"
				flag = Falso //No permite continuar
			FinSi
		Hasta Que flag = Verdadero
		Si num = 1 o num = 0 Entonces //Si es 1 o 0 la respuesta es la misma, además evita errores en el Para
			Si num = 1 Entonces
				Escribir "1 x 1 = 1"
			SiNo
				Escribir "0 x _= 1"
			FinSi
			Escribir "El factorial es 1"
		Sino
			Para i<- num - 1 hasta 1 Hacer //i<- num - 1 para que la primera operación sea 5*4 y no sea 5*5
				Escribir num " x " i "= " num * i
				Esperar 70 Milisegundos
				num= num * i
			FinPara
			Escribir "______________________________________________"
			Escribir "El factorial es " num
		FinSi
		Repetir
			Escribir "¿Quiere repetir con otro número? [S/n] " Sin Saltar ; Leer res
			res <- Minusculas(res) //Transforma la respuesta a Minusculas, N -> n
			//Si se responde con algo distinto de S/s o N/n muestra error y vuelve a preguntar
			Si res <> "s" y res <> "n" Entonces
				Escribir "ERROR: respuesta no válida"
				Escribir "---------------------------------------------"
			FinSi
		Hasta Que res = "s" o res = "n"
	Hasta Que res = "n"
	Escribir "FIN"
FinAlgoritmo