Algoritmo sin_titulo
	Repetir
		Escribir "Secuencia fibonacci:"
		Leer cant
	Hasta Que cant > 0
	num = 0
	num2 = 1
	Para i <- 1 Hasta cant Hacer	
		f = f + ConvertirATexto(num) + ", "
		
		numG = num + num2
		num = num2
		num2 = numG
	FinPara
	
	Escribir SubCadena(f,0,Longitud(f)-2) "..."
FinAlgoritmo
