Proceso EjercicioSiete
	Definir contador Como Entero;
	Definir primerNumero Como Real;
	Definir segundoNumero Como Entero;
	Definir resultado Como Real;
	contador <- 0;
	Escribir 'Introduce el numero a elevar a base x(Introduce tambien la base)';
	Leer primerNumero,segundoNumero;
	Mientras contador<=segundoNumero Hacer
		Si contador=1 Entonces
			resultado <- primerNumero*primerNumero;
			contador <- contador+1;
			Si contador<segundoNumero Entonces
				resultado <- resultado*primerNumero;
				contador <- contador+1;
			FinSi
		SiNo
			contador <- contador+1;
		FinSi
	FinMientras
	Escribir "El resultado de elevar ",primerNumero," a base ",segundoNumero," es: ",resultado;
FinProceso
