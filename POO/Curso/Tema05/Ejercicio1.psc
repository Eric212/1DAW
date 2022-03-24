Proceso EjercicioUno
	Definir numero Como Entero;
	Definir contador Como Entero;
	Definir divisor Como Entero;
	divisor<-0;
	Escribir "Introduce un numero que quieras comprobar si es perfecto";
	Leer numero;
	contador<-numero-1;
	Si numero <= 0 Entonces
		Escribir numero,"No es un numero perfecto";
	SiNo
		Mientras contador>=1 Hacer
			Si numero%contador=0 Entonces
				divisor<-divisor+contador;
				Escribir contador;
			FinSi
			contador<-contador-1;
		FinMientras
	FinSi
	Si divisor=numero Entonces
		Escribir numero," Es un numero perfecto";
	SiNo
		Escribir numero," No es numero perfecto";
	FinSi
	
FinProceso
