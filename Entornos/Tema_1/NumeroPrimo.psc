Proceso NumeroPrimo
	Definir i Como Entero;
	Definir contador Como Entero;
	Definir x Como Entero;
	Definir tam Como Entero;
	Definir resultado Como Entero;
	Escribir 'Introudce el numero de primos que quieres visualizar';
	Leer tam;
	x <- 1;
	i <- 1;
	Para contador<-1 Hasta tam Hacer
		resultado<-trunc(i/x);
		Si resultado=1 Entonces
			Escribir i;
			i <- i+1;
		SiNo
			x <- x+1;
			contador<-contador-1;
			i<-i+1;
		FinSi
	FinPara
FinProceso
