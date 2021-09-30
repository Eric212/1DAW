Proceso EjercicioCuatro
	Definir numero Como Entero;
	Definir contador Como Entero;
	Definir x Como Entero;
	x <- 0;
	Para contador<-1 Hasta 100 Hacer
		Si contador%2=0 Entonces
			numero <- contador;
			Escribir numero;
			x <- x+1;
		FinSi
	FinPara
	Escribir "Total de numeros pares: ",x;
FinProceso
