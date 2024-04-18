//Algoritmo Alumnos
	//Escribir "Escribir la cantidad de alumnos que hay"
	//Pedir número de chicos
//	Leer chicos
	//Pedir número de chicas
//	Escribir "Escribir la cantidad de alumnas"
//	Leer chicas
	//Calcula el total y los porcentajes
//	T= chicos + chicas
//T1= chicos * 100 / T
	//Escribe el resultado
//	Escribir "Hay " T1 "% de chicos y " 100 - T1 "% de chicas"
//FinAlgoritmo

Algoritmo DescuentoMes
	Escribir "Total de compra"
	Leer C
	Escribir "Mes de la compra [Enero/enero...]"
	Leer M
	Si M="Octubre" o M="octubre" Entonces
		D=C*0.15
		Escribir "El importe a cobrar al cliente es de " C-D 
	SiNo
		Escribir "No hay descuento, el total es " C 
	FinSi
FinAlgoritmo
	