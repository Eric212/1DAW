Proceso EjercicioTres
	Definir numUno Como Entero;
	Definir numDos Como Entero;
	Definir contador Como Entero;
	Definir resultado Como Entero;
	resultado <- 0;
	Escribir 'Escribe dos numeros que quieras multiplicar';
	Leer numUno;
	Leer numDos;
	Para contador<-1 Hasta numDos Hacer
		Si numUno=1 Entonces
			resultado <- numDos;
		SiNo
			Si numDos=1 Entonces
				resultado <- numUno;
			SiNo
				resultado <- resultado+numUno;
			FinSi
		FinSi
	FinPara
	Escribir resultado;
FinProceso
