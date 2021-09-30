Proceso EjercicioCinco
	Definir contador como Entero;
	Definir totalPar como Entero;
	Definir totalImpar como Entero;
	Definir totalMultiplos como Entero;
	Definir i como Entero;
	Definir z como Entero;
	Definir x como Entero;
	totalImpar<-0;
	totalPar<-0;
	totalMultiplos<-0;
	i<-0;
	x<-0;
	z<-0;
	Para contador<-1 Hasta 100 Hacer
		Si contador%2=0 Entonces
			totalPar <- totalPar+contador;
			i <- i+1;
			Si contador%5=0 Entonces
				totalMultiplos <- totalMultiplos+contador;
				x <- x+1;
			FinSi
		SiNo
			totalImpar <- totalImpar+contador;
			z<-z+1;
			Si contador%5=0 Entonces
				totalMultiplos <- totalMultiplos+contador;
				x <- x+1;
			FinSi
		FinSi
	FinPara
	Escribir"Esta es la suma de todos los numeros Pares: ",totalPar;
	Escribir "Estos es el total de numeros pares que hay:",i;
	Escribir "Esta es la suma de todos los numeros Impares: ",totalImpar;
	Escribir"Estos es el total de numeros Impares que hay:",z;
	Escribir "Esta es la suma de todos los numeros multiplos de 5: ",totalMultiplos;
	Escribir "Estos es el total de numeros multiplos de 5 que hay:",x;
FinProceso
