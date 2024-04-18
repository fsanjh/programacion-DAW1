Algoritmo cuenta
	Repetir
		Escribir "¿Quiere crear una cuenta?[S/n]"
		Leer sn
		Si sn <> "n" y sn <> "N" y sn <> "S" y sn <> "s" Entonces
			Escribir "No es una respuesta válida"
			Escribir "---------------------------"
		FinSi
	Hasta Que sn= "S" o sn= "s" o sn= "N" o sn= "n"

	Si sn = "S" o sn= "s" Entonces
		Repetir
			Escribir "Nombre de usuario:"
			Leer user1
		Hasta Que user1 <> "" y user1 <> " "

		Repetir
			Escribir "Contraseña:"
			Leer pass1
		Hasta Que pass1 <> "" y pass1 <> " "
		
		Escribir "Cuenta creada con éxito, inicie sesión"

		acceso = falso
		
		Para i <- 3 Hasta 1 Hacer
			Escribir "Usuario:"
			Leer user2
			Escribir "Contraseña:"
			Leer pass2
			
			Si user2 = user1 y pass2 = pass1 entonces
				i = 1
				acceso = verdadero
			SiNo
				Escribir "Clave errónea, intentos restantes: " i - 1
				Si i = 1 Entonces
					Escribir "Número máximo de intentos alcanzado"
				FinSi
			FinSi
		FinPara
		
		Escribir "====================================================="
		
		Si acceso = Verdadero Entonces
			Escribir "Bienvenido " user2
			Repetir
				Escribir "¿Quiere cerrar sesión? [S/n]"
				Leer sn
				Si sn <> "n" y sn <> "N" y sn <> "S" y sn <> "s" Entonces
					Escribir "No es una respuesta válida"
					Escribir "---------------------------"
				FinSi
			Hasta Que sn = "s" o sn= "S"
		FinSi
		
	FinSi
	Escribir "Hasta luego " user2
FinAlgoritmo