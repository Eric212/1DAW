# Tema 3

##### 1.Escribir un programa que escriba por pantalla tu nombre completo en una línea y en la líneasiguiente tu fecha de nacimiento con formato dd/mm/yyyy

    public class Ejercicio1{
	    public static void main(String args[]){
		    System.out.println("Eric Sospedra Salort");
	    	System.out.println("29/09/2020");
	    }
    }

##### 2.Dados los siguientes identificadores que van a utilizarse en un programa escrito en Java, ¿cuálesde ellos son correctos y qué no? Explica porque.

> a)mi carta: __no seria correcto porque tiene un espacio en el nombre__
b)unacarta: __estaria bien, pero no sigue el convenio__
c)min2escritos: __estaria bien, pero no sigue el convenio__
d)4cientos: __estaria mal porque no puede empezar por un numero__
e)es_un_mensaje: __estaria bien, pero no sigue el convenio__
f)no\_vale nada: __estaria mal porque tiene un espacio__
g)\_\_\_\_\_\_ejemplo\_\_\_\_\_\_: __estaria bien, pero no sigue el convenio__
h)mi-programa: __estaria mal porque contiene un guión que es un operador__
i)¿Cu ántos?: __estaria mal porque tiene espacios el nombre, tilde y interrogantes__
j)el%Descontado: __estaria mal porque no se puede gastar el % ya que es un operador__
k)a150PORHORA: __estaria bien, pero no sigue el convenio__
l)TengoMUCHO$$$$$: __estaria bien, pero no sigue el convenio__
m)LOS400GOLPES: __estaria bien+, pero no sigue el convenion__
n)quieroUNAsolución: __estaria bien, pero no sigue el convenio__

##### 3. Escribe un programa que visualice cuánto nos costará comprar unos zapatos si su precio es de 85 €pero sabemos que tienen un 15% de descuento.

    public class Zapatos{
	    public static void main(String[] args){
	    	float zapatos=85f;
	    	float precioRebajado=zapatos - (zapatos * 0.15f);
	    	System.out.println("El precio de los zapatos es: " + precioRebajado + "€");
        }
    }

##### 4.Dadas las siguientes expresiones aritméticas, indica cuál será el resultado de evaluarlas. Después comprueba si es correcto haciendo un programa Java que muestro el resultado.

- 25 + 20 - 15= __30__
- 20 * 10 + 15 * 10= __350__
- 20 * 10 / 2 - 20 / 5 * 3= __88__
- 15 / 10 * 2 + 3 / 4 * 8= __9__

~~~
public class Ejercicio4{
	public static void main(String arg[]){
		int a=25 + 20 -10;
		System.out.println(a);
		int b=20 * 10 + 15 * 10;
		System.out.println(b);
		int c=20 * 10 / 2 - 20 / 5 * 3;
		System.out.println(c);
		float d=15f / 10f * 2f + 3f / 4f * 8f;
		int d2= (int) d;
		System.out.println(d2);
	}
}
~~~

##### 5.Escribe un programa que declare dos variables enteras para describir las longitudes de los lados deun rectángulo. El programa tiene que calcular y escribir por pantalla el perímetro y el área delrectángulo. (Supón que el rectángulo mide 15 cm de alto y 25 cm de ancho.)

~~~
public class Rectangulo{
	public static void main(String arg[]){
		int alto=15;
		int ancho=25;
		int area=ancho * alto;
		int perimetro=2 * alto + 2 * ancho;
		System.out.println("El área del rectangulo de alto " + alto + "y de ancho " + ancho + "es: " + area +"cm");
		System.out.println("El perímetro de rectangulo de de alto " + alto + "y de ancho " + ancho + "es: " + perimetro + "cm\u00b2");
	}
}
~~~

##### 6.Dadas las siguientes expresiones aritmético-lógicas calcula cuál es el resultado de evaluarlas.

- 25 > 20 && 13 > 5: __true__
- 10 + 4 < 15 – 3 || 2 * 5 + 1 > 14 – 2 * 2: __true__
- 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1: __true__
- 10 <= 2 * 5 && 3 < 4 || !(8 > 7) && 3 * 2 <= 4 * 2 - 1: __true__

##### 7.Dadas las siguientes declaraciones:

##### int A, B, C, D , salario, cuenta, M, SUMA, NOTA1, NOTA2, P;

##### String K, nombre;

##### ¿Cuáles de las siguientes asignaciones son incorrectas?:

- A + B = C +D : __Incorrecta porque le falta el cierre y no puedes operar fuera de la asignacion de varialbes ;__
- nombre = PEDRO; :__Incorrecto porque el texto tiene que estar entre doble comilla "PEDRO"__
- salario= salario+1; :__Correcto__
- cuenta = 45000; :__Correcto__
- k= k*4; :__Incorrecto porque a parte de tener que ser K, K es una variable String con lo cual no puede almacenar
  enteros__
- B = 18 -B; __Correcto__
- C= X-8; :__Incorrecto porque X no esta declarada como variable__
- SUMA = NOTA1 + nota2; :__Incorrecto porque la variable nota2 no existe, tendria que ser NOTA2__
- P+5 = 14; :__Incorrecto porque no se puede operar con una variable fuera de la asignación de valor__
- K= “Carlos”; :__Correcto__
- nombre= 'ana'; :__Incorrecto los String se delcaran con doble comilla "ana"__
- nombre= K; :__Correcto__
- nombre = “Juan” + K; :__Correcto__
- B= K; :__Incorrecto una variable int no puede almacenar un String__
- K = B; :__Incorrecto una variable String no puede almacenar un int__

##### 8.Escribe un programa que muestre por pantalla el número de días de vida que tiene una persona.Por simplicidad, no consideramos años bisiestos, asumiendo que un año tiene siempre 365 días. Las pautas para escribir lo programa son:

##### a)Declarar una variable de tipo entero para guardar la edad. Dale un nombre significativo.

##### b)Pedir al usuario que introduzca su edad e inicializar la variable anterior a dicho valor.

##### c)Crear una nueva variable para guardar el número de días que tiene esa persona.

##### d)Imprime un mensaje por pantalla. Por ejemplo para 23 años mostraríamos:Una persona de 23 años tiene 8395 días de vida.

~~~
import java.util.Scanner;
public class DiasPersona{
	public static void main(String arg[]){
		int edad;
		Scanner lector= new Scanner(System.in);
		System.out.println("Escribe tu edad y dale a enter");
		edad=lector.nextInt();
		lector.nextLine();
		int numeroDias= edad * 365;
		System.out.println("Una persona de " + edad + " años, tiene " + numeroDias + " dias");

	}
}
~~~

##### 9.Escribe un programa que defina un tipo de datos enumerado para representar los tres coloresbásicos empleados para representar los colores en una pantalla (RED, GREEN, BLUE). Después crea una variable de este tipo y asígnale el color BLUE. Por último muestra por pantalla un mensaje que indique de qué color se trata.

~~~
public class Colores{
	public enum pantalla{RED, BLUE, GREEN}
	public static void main(String arg[]){
		pantalla color=pantalla.BLUE;
		System.out.println(color);
	}
}
~~~

##### 10. Escribe un programa que represente los siguientes tipos enumerados:

##### a)Meses del año

##### b)Las notas musicales

##### c)Las calificaciones de un alumno

~~~
public class Ejercicio10{
	public enum meses{ENERO, FEBRERO, MARZO, ABRIL, MAYO, JUNIO, JULIO, AGOSTO, SEPTIEMBRE, OCTUBRE, NOVIEMBRE, DICIEMBRE}
	public enum notasMusicales{DO, RE, MI, FA, SOL, LA}
	public enum notasAlumno{INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE}
	public static void main(String arg[]){
		for(meses m: meses.values()){
			System.out.print(m.toString() + " - ");
		}
		System.out.println();
		for(notasMusicales nM: notasMusicales.values()){
			System.out.print(nM.toString() + " - ");
		}
		System.out.println();
		for(notasAlumno nA: notasAlumno.values()){
			System.out.print(nA.toString() + " - ");
		}
	}
}
~~~

##### 11.Escribe un programa que visualice por pantalla la resta de dos números. El programa deberá pedir los dos números (minuendo y sustraendo), hacer la resta y mostrar el resultado.

~~~
import java.util.Scanner;
public class Ejercicio11{
	public static void main(String arg[]){
		Scanner lector= new Scanner(System.in);
		double minuendo;
		double sustraendo;
		System.out.println("Introduce un numero que quieres restar");
		minuendo=lector.nextDouble();
		System.out.println("Introduce el numero que restaras al primero");
		sustraendo=lector.nextDouble();
		double resusltado=minuendo - sustraendo;
		System.out.println("La resta: " + minuendo + " - " + sustraendo + " da como resusltado = " + resusltado);

	}
}
~~~

##### 12.Escribe un programa que visualice por pantalla la división de dos números. El programa deberá pedir los dos números (dividendo y divisor), hacer la división y mostrar el resultado.

~~~
import java.util.Scanner;
public class Ejercicio12{
	public static void main(String arg[]){
		Scanner lector= new Scanner(System.in);
		double dividendo;
		double divisor;
		System.out.println("Introduce un numero que quieres divir");
		dividendo=lector.nextDouble();
		System.out.println("Introduce el numero que dividira al primero");
		divisor=lector.nextDouble();
		double resusltado=dividendo / divisor;
		System.out.println("La division: " + dividendo + " - " + divisor + " da como resusltado = " + resusltado);
		
	}
}
~~~

##### 13.Escribe un programa que solicite al usuario una cantidad de segundos y la convierta a días, horas, minutos y segundos

~~~
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio13{
	public static void main(String arg[]){
		Scanner lector=new Scanner(System.in);
		int datosIntroducidos;
		int segundos;
		boolean control=true;
		while(control){
			try{
			System.out.println("Introduce el nuemro de segundos que quieres convertir a Días, Horas y minutos");	
			datosIntroducidos=lector.nextInt();
			while (datosIntroducidos >= 2147483647 || datosIntroducidos < 0) {
							System.out.println("Introduce un numero valido");
							datosIntroducidos=lector.nextInt();
							lector.nextLine();
					}
				int minutos=datosIntroducidos / 60;
				segundos=datosIntroducidos % 60;
				int horas=minutos / 60;
				minutos=minutos % 60;
				int dias=horas / 24;
				horas=horas % 24;
				System.out.println(datosIntroducidos + " segundos equivale a " + dias + " días, " + horas + " horas, " + minutos + " minutos, y " + segundos +" segundos");
				control=false;
			}catch(InputMismatchException ex){
				System.out.println("\u26A0  \u26A0  \u26A0  \u26A0  Recuerda que solo se pueden numeros enteros y positivos  \u26A0  \u26A0  \u26A0  \u26A0");
				lector.nextLine();
				System.out.println();
			}
		}
	}
}
~~~

##### 14.Escribe un programa que solicite al usuario el radio de la circunferencia y calcule la longitud y el área de dicha circunferencia.

~~~
import java.util.Scanner;
public class Ejercicio14{
	public static void main(String arg[]){
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduce el radio del circulo, del cual se calculará la longitud y el área");
		final double PI=3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989;
		double radio=lector.nextDouble();
		double longitud=2 * PI * radio;
		double area=PI * (radio * radio);
		System.out.println("La longitud de un circulo de radio: " + radio + " es: " + longitud + "cm y el área es: " + area + "cm\u00b2");
	}
}
~~~

##### 15.Escribe un programa que solicite al usuario una temperatura en grados centígrados, haga la conversión a grados Kelvin y grados Fahrenheit y la muestre por pantalla.

##### Grados Kelvin = 273.15 + grados Celsius.

##### Grados Fahrenheit = grados Celsius * (9/ 5)  + 32.

~~~
import java.util.Scanner;
public class Ejercicio15{
	public static void main(String arg[]){
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduzca una temperatura en grados Celsius");
		double celsius=lector.nextDouble();
		double kelvin=273.15 + celsius;
		double fahrenheint=celsius * (9 / 5) + 32;
		System.out.println(celsius + "ºC equivale en Kelvin a: " + kelvin + "K y en Fahrenheint equivale a: " + fahrenheint + "ºF");
	}
}
~~~

##### 16.Escribe un programa que solicite una cantidad en Euros y muestre por pantalla su valor en: Dólares y Libras (buscar en Internet la cotización de las monedas).

~~~
import java.util.Scanner;
public class Ejercicio16{
	public static void main(String arg[]){
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduzca el importe de Euros que desea convertir a Dólares y Libras");
		float euros=lector.nextFloat();
		float dolares=euros * 1.17417f;
		float libras=euros * 0.91000f;
		System.out.println(euros + "€ equivale en Dólares a: " + dolares + "$ y equivale en Libras a: " + libras + "\u00A3");
	}
}
~~~

##### 17.Escribe un programa para calcular el consumo medio de un automóvil. Para ello, el programadebe solicitar información sobre las tres últimas veces que se repostó combustible.

##### a)De la primera solicitará el precio del litro del combustible, el total pagado al llenar el depósito y el número de kilómetros que marcaba el cuentakilómetros.

##### b)De la segunda vez solo solicitará el precio del litro de combustible y el total pagado al llenar el depósito.

##### c)De la tercera vez, solicitará el valor que indicaba el cuentakilómetros. Con estos datos, calcular el consumo por cada 100 km y el coste por kilómetro.

~~~~
import java.util.Scanner;
public class Ejercicio17{
	public static void main(String arg[]){
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduzca el precio por litro del combustible, el total al llenar el depósito y el kilometraje del cuentakilómetros del primer repostaje");
		float primerPrecioCombustible=lector.nextFloat();
		float primerPrecioDeposito=lector.nextFloat();
		float primerKilometraje=lector.nextFloat();
		System.out.println("Introduzca el precio por litro del combustible y el total al llenar el depósito del segundo repostaje");
		float segundoPrecioCombustible=lector.nextFloat();
		float segundoPrecioDeposito=lector.nextFloat();
		System.out.println("Introduzca el kilometraje del cuentakilómetros");
		float segundoKilometraje=lector.nextFloat();
		float consumoCombustible=(primerPrecioDeposito / primerPrecioCombustible) + (segundoPrecioDeposito / segundoPrecioCombustible);
		float recorrido=segundoKilometraje - primerKilometraje;
		float consumoFinal=(consumoCombustible * 100) / recorrido;
		float precioKilometro=(consumoCombustible * 1) / recorrido;
		System.out.println("El consumo medio de este viaje seria: " + consumoFinal + "L a los 100 Km y el kilometro le cuesta: " + precioKilometro + "€/L");
	}
}
~~~~
