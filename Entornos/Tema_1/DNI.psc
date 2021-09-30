Proceso DNI
	Definir letra Como Caracter;
	Definir numero Como Entero;
	Definir i Como Entero;
	Definir arreglo Como Entero;
	Definir nif Como Entero;
	Dimension arreglo[9];
	Dimension letra[23];
	letra[0]<-'T';	letra[1]<-'R';	letra[2]<-'W';	letra[3]<-'A';	letra[4]<-'G';	letra[5]<-'M';	letra[6]<-'Y';	letra[7]<-'F';	letra[8]<-'P';	letra[9]<-'D';	letra[10]<-'X';letra[11]<-'B';letra[12]<-'N';letra[13]<-'J';letra[14]<-'Z';
	letra[15]<-'S';letra[16]<-'Q';letra[17]<-'V';letra[18]<-'H';letra[19]<-'L';letra[20]<-'C';letra[21]<-'K';letra[22]<-'E';
	Escribir "Introduce el numero de tu DNI uno a uno separandolos con Enter";
	Leer nif;		
	i<-nif%23;
	Escribir "Tu DNI es: ",nif,letra[i];
FinProceso
