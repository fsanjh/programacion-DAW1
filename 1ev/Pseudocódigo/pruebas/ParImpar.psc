Algoritmo ParImpar
	Escribir "Inserta un n�mero entero [0/1/-1...]"
	//Los n�meros negativos son n�meros enteros como pide el enunciado y pueden ser pares o impares
	Leer Num
	//Si el n�mero es 0
	Si Num = 0 Entonces
		Escribir "No es par ni impar"
	//Si el n�mero no es 0
	Sino
		//Si el n�mero es IMPAR
		Si (Num %2) = 1 o (Num %2) = -1 Entonces
			Escribir "Es impar"
		//Si el n�mero NO es IMPAR
		Sino 
			Escribir "Es par"
		FinSi
	FinSi
FinAlgoritmo