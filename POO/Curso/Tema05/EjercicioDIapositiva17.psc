Proceso Diapositiva17
	Definir base Como Entero;
	Definir altura Como Entero;
	Definir perimetro Como Entero;
	Definir area Como Entero;
	Escribir "Escriba la base y altura";
	Leer base;
	Leer altura;
	Si base > 0 Y altura > 0 Entonces
		area<-base*altura;
		perimetro<-2*base+2*altura;
		Escribir "El area es: ",area," el perimetro es: ",perimetro;
	SiNo
		Escribir "Introduce datos validos";
	FinSi
FinProceso
