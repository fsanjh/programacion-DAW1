Algoritmo cuenta
	Repetir
		Escribir "�Quiere crear una cuenta?[S/n]"
		Leer sn
		Si sn <> "n" y sn <> "N" y sn <> "S" y sn <> "s" Entonces
			Escribir "No es una respuesta v�lida"
			Escribir "---------------------------"
		FinSi
	Hasta Que sn= "S" o sn= "s" o sn= "N" o sn= "n"

	Si sn = "S" o sn= "s" Entonces
		Repetir
			Escribir "Nombre de usuario:"
			Leer user1
		Hasta Que user1 <> "" y user1 <> " "

		Repetir
			Escribir "Contrase�a:"
			Leer pass1
		Hasta Que pass1 <> "" y pass1 <> " "
		
		Escribir "Cuenta creada con �xito, inicie sesi�n"

		acceso = falso
		
		Para i <- 3 Hasta 1 Hacer
			Escribir "Usuario:"
			Leer user2
			Escribir "Contrase�a:"
			Leer pass2
			
			Si user2 = user1 y pass2 = pass1 entonces
				i = 1
				acceso = verdadero
			SiNo
				Escribir "Clave err�nea, intentos restantes: " i - 1
				Si i = 1 Entonces
					Escribir "N�mero m�ximo de intentos alcanzado"
				FinSi
			FinSi
		FinPara
		
		Escribir "====================================================="
		
		Si acceso = Verdadero Entonces
			Escribir "Bienvenido " user2
			Repetir
				Escribir "�Quiere cerrar sesi�n? [S/n]"
				Leer sn
				Si sn <> "n" y sn <> "N" y sn <> "S" y sn <> "s" Entonces
					Escribir "No es una respuesta v�lida"
					Escribir "---------------------------"
				FinSi
			Hasta Que sn = "s" o sn= "S"
		FinSi
		
	FinSi
	Escribir "Hasta luego " user2
FinAlgoritmo