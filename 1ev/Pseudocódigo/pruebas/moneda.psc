Funcion res <- Conversion(num, tipo)
	Si tipo = "dolar" Entonces
		res = num * 0.94
	FinSi
	Si tipo = "yen" Entonces
		res = num * 0.006
	FinSi
	Si tipo = "libra" Entonces
		res = num * 1.16
	FinSi
FinFuncion
Algoritmo sin_titulo
	Escribir "Dime una cantidad de dinero: "
	Leer num
	Escribir "Dime el tipo de moneda [dolar/yen/libra]: "
	Leer tipo
	Escribir num " " tipo " serían igual a " Conversion(num, tipo) " Euros"
FinAlgoritmo