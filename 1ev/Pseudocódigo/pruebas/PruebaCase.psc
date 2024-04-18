Algoritmo PruebaCase
	Escribir "Inserta el nombre de un Mes (Enero/Febrero/Marzo...)"
	Leer mes
	Escribir "Inserta el importe a cobrar"
	Leer Imp
	Según mes hacer
		"Enero":
			Escribir "Importe a pagar " Imp
		"Febrero":
			Escribir "Importe a pagar " Imp
		"Marzo": 
			Escribir "Importe a pagar " Imp
		"Abril": 
			Escribir "Importe a pagar " Imp
		"Mayo": 
			Escribir "Importe a pagar " Imp
		"Junio": 
			Escribir "Importe a pagar " Imp
		"Julio": 
			Escribir "Importe a pagar " Imp
		"Agosto": 
			Escribir "Importe a pagar " Imp
		"Septiembre": 
			Escribir "Importe a pagar " Imp
		"Octubre": 
			D=Imp*0.85
			Escribir "EL importe a pagar es de " D
		"Noviembre": 
			Escribir "Importe a pagar " Imp
		"Diciembre": 
			Escribir "Importe a pagar " Imp
		De Otro Modo:
			Escribir "Ningun mes"
	FinSegun
	
FinAlgoritmo
