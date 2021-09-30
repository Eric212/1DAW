Proceso EjercicioDos
	Definir ecuacion Como Caracter;
	Definir a Como Entero;
	Definir b Como Entero;
	Definir c Como Entero;
	Definir resultadoUno Como Real;
	Definir resultadoDos Como Real;
	Escribir "Introduce el primer coeficiente";
	Leer a;
	Escribir "Introduce el segundo coeficiente";
	Leer b;
	Escribir "Introduce el tercer coeficiente";
	Leer c;
	resultadoUno<-(-b+(RC(b^2-(4*a*c))))/(2*a);
	resultadoDos<-(-b-(RC(b^2-(4*a*c))))/(2*a);
	si resultadoUno<0 Y resultadoDos<0 Entonces
		Escribir "No tiene solucion";
	SiNo
		Escribir "La solucion de x=((-b)+(RC(b^2-4*a*c)))/(2*a) es ",resultadoUno;
		Escribir "La solucion de x=((-b)-(RC(b^2-4*a*c)))/(2*a) es ",resultadoDos;
	FinSi
FinProceso