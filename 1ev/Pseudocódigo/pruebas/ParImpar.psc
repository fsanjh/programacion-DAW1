Algoritmo ParImpar
	Escribir "Inserta un número entero [0/1/-1...]"
	//Los números negativos son números enteros como pide el enunciado y pueden ser pares o impares
	Leer Num
	//Si el número es 0
	Si Num = 0 Entonces
		Escribir "No es par ni impar"
	//Si el número no es 0
	Sino
		//Si el número es IMPAR
		Si (Num %2) = 1 o (Num %2) = -1 Entonces
			Escribir "Es impar"
		//Si el número NO es IMPAR
		Sino 
			Escribir "Es par"
		FinSi
	FinSi
FinAlgoritmo