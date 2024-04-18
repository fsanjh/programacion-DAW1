Algoritmo NumerosPrimos
	// Le pedimos al usuario que establezca el rango de números menor y mayor
	Repetir
		Escribir "Establece el rango a mostrar de números primos"
		Escribir "Primer rango"
		Leer num
		Escribir "Segundo rango"
		Leer num2
		flag = Verdadero
		//Compruebo que los valores son mayores que 0
		Si num<0 o num2<0 Entonces
			Limpiar Pantalla
			Escribir " ERROR: Los valores deben ser mayores o iguales que cero"
			Escribir "---------------------------------------------------------"
			flag = Falso
		FinSi
	Hasta Que flag = Verdadero
	// Creo el contador de números primos
	cont = 0
	// Ciclo para iterar a través de los números en el rango, dependiendo del orden a la hora de introducir los valores i aumenta o disminuye
	Para i <- num Hasta num2 Hacer
		// Inicializamos una variable para contar los divisores
		divisores = 0
		// Verificamos si el número actual i es divisible por j y j se va disminuyendo/aumentando en cada vuelta, se suma 1 al numero de divisores que tiene.
		Para j <- 1 Hasta i Hacer
			Si j <> 0 y i % j = 0 Entonces
				divisores = divisores + 1
			FinSi
		FinPara
		// Si solo tiene 2 divisores (1 y él mismo), es primo. También guarda el número primo y lo concatena con el anterior. Convierto a texto "i" para que sea cadena y se pueda concatenar
		Si divisores = 2 Entonces
			cont = cont + 1
			nums = ConvertirATexto(i) + " " + nums
		FinSi
	FinPara
	//Escribe el resultado junto al rango dado
	Escribir "En el rango de " num " a " num2 " hay " cont " número/s primo/s"
	//Si se diera el rango 0 hasta 1 por ejemplo, no hay numeros primos y no se mostraría el siguiente mensaje
	Si cont > 0 Entonces
		Escribir "Estos números son: " nums
	FinSi
FinAlgoritmo