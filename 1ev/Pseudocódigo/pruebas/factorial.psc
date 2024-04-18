Algoritmo factorial
	Repetir
		Limpiar Pantalla
		Repetir
			Escribir "Dime un número para calcular su factorial"
			Leer num
			Si num < 0 Entonces
				Escribir "No se puede calcular el factorial de " num
				Escribir "---------------------------------------------"
			FinSi
		Hasta Que num >= 0
		Si num = 1 o num = 0 Entonces
			Escribir "El factorial es 1"
		Sino
			Para i<- num - 1 hasta 2 Hacer
				num= num * i
			FinPara
			Escribir "El factorial es " num
		FinSi
		Repetir
			Escribir "¿Quiere continuar? [S/n]"
			Leer res
			Si res <> "s" y res <> "S" y res <> "n" y res <> "N" Entonces
				Escribir res " no es una respuesta válida"
				Escribir "---------------------------------------------"
			FinSi
		Hasta Que res = "s" o res = "S" o res = "n" o res = "N"
	Hasta Que res = "n" o res = "N"
	Escribir "FIN"
FinAlgoritmo