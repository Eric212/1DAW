Proceso EjercicioSeis
	Definir contador como Entero;
	Definir tabla como Entero;
	Definir numero como Entero;
	Definir decision como Entero;
	Repetir
		Escribir "Bienvenido a las tablas del 1 al 10";
		Escribir "¿Que tabla quieres mostrar?:";
		Escribir "Selecciona de la tabla 1 hasta la 10";
		Leer tabla;
		Mientras tabla<1 O tabla>10 Hacer
			Escribir "Introduce un numero valido entre 1 y 10";
			Leer tabla;
		FinMientras
		Escribir "Tabla del ",tabla;
		Para contador<-1 hasta 10 Hacer
			numero<-contador*tabla;
			Escribir numero;
		FinPara
		Escribir "¿Desea visualizar alguna tabla mas?";
		Escribir "1:Si                         2:No";
		Leer decision;
		Mientras decision<1 O decision>2 Hacer
			Escribir "Introduce un numero valido, 1 o 2";
			Leer decision;
		FinMientras
	Hasta Que decision=2;
FinProceso
