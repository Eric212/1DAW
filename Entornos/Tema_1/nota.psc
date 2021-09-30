Proceso Notas
	Definir nota Como Entero;
	Repetir
		Escribir 'Escribe tu nota';
		Leer nota;
		Si nota<4 Y nota>=0 Entonces
			nota<-4;
		SiNo
			Mientras nota<0 O nota>10 Hacer
				Escribir 'Escribe una nota valida entre 0 y 10';
				Leer nota;
			FinMientras
		FinSi
		Segun nota Hacer
			4:
				Si nota>=0 Y nota<=4 Entonces
					Escribir "Insuficiente";
				FinSi
			5:
				Si nota=5 Entonces
					Escribir "Suficiente";
				FinSi
			6:
				si nota>5 Y nota<7 Entonces
					Escribir "Notable bajo";
				FinSi
			7:
				si nota>6 Y nota<9 Entonces
					Escribir "Notable";
				FinSi
			9:
				si nota=9 Entonces
					Escribir "Notable Alto";
				FinSi;
			10:
				si nota=10 Entonces
					Escribir "Excelente";
				FinSi
		FinSegun
	Hasta Que nota>=0 Y nota<=10
FinProceso
