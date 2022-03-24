package como.ericsospedra.Tema08.Ejercicio7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class PrincipalPaciente {
    static String respuesta;
    static LocalDate fechaActula = LocalDate.now();
    static LocalDateTime horaActual = LocalDateTime.now();
    static Scanner lector = new Scanner(System.in);
    static Paciente[] baseDatos = new Paciente[1], auxPerson, historicoMensual;
    static Paciente paciente;
    static int opcion, comodin, pacientesIndexados = 0, pacientesAtendidos = 0;
    static Queue<Float> preRev = new LinkedList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        do {
            System.out.print("*************************\n*****   URGENCIAS   *****\n*************************\n" +
                    "1. Nuevo paciente ...\n2. Atender paciente ...\n3. Consultas  ...\n4. Alta médica ...\n" +
                    "--------------------------\n0. Salir\nOpcion: ");
            opcion = Integer.parseInt(lector.nextLine());
            switch (opcion) {
                case 1:
                    nuevoPaciente();
                    break;
                case 2:
                    atenderPaciente();
                    break;
                case 3:
                    consultas();
                    break;
                case 4:
                    //altaPaciente();
                    break;
                default:
                    break;
            }
        }
        while (opcion != 0);
    }

    public static void nuevoPaciente() {
        comprobarEspacioPersonas();
        paciente = new Paciente(0, null, ' ', null, null,
                0, null, preRev, null, null, " ", false);
        baseDatos[pacientesIndexados] = paciente;
        System.out.print("Introduce el SIP del paciente\nSIP: ");
        comprobarSip(Integer.parseInt(lector.nextLine()));
        if (comodin == 1) {
            return;
        }
        System.out.print("Introduzca el nombre del nuevo paciente Ej(\"Eric Sospedra Salort\")\nNombre: ");
        comprobarNombre(lector.nextLine());
        System.out.print("Introduzca el sexo\n1:Varon\n2:Mujer\nSexo: ");
        comprobarSexo(Integer.parseInt(lector.nextLine()));
        System.out.print("Introduzca la edad del paciente\nEdad: ");
        edad(Integer.parseInt(lector.nextLine()));
        System.out.print("Introduzca la sintomatologia del paciente\nSintomatologia: ");
        paciente.setSintomatologia(lector.nextLine());
        paciente.setFechaDeEntrada(fechaActula);
        paciente.setHoraDeEntrada(horaActual);
        pacientesIndexados++;
    }

    public static void atenderPaciente() {
        System.out.print("Introduce el SIP del paciente\nSIP: ");
        buscarSip(Integer.parseInt(lector.nextLine()));
    }

    public static void comprobarEspacioPersonas() {
        if (pacientesIndexados >= baseDatos.length) {
            auxPerson = new Paciente[baseDatos.length];
            System.arraycopy(baseDatos, 0, auxPerson, 0, baseDatos.length);
            System.arraycopy(auxPerson, 0, baseDatos = new Paciente[auxPerson.length + 1], 0, auxPerson.length);
        }
    }

    public static void consultas() {
        historicoMensual = new Paciente[baseDatos.length];
        Calendar hoy = new GregorianCalendar();
        for (int j = 0; j < baseDatos.length; j++) {
            if (baseDatos[j].getFechaDeEntrada().getMonthValue() == hoy.get(Calendar.MONTH)) {
                historicoMensual[j] = baseDatos[j];
            }
        }
        System.out.print("***************\n** CONSULTAS **\n***************\n1. Por Sip ...\n" +
                "2. Por fechas ...\n3. Estadísticas\n4. Mostrar histórico mensual\n--------------------------------\n" +
                "0. Volver al menú principal\nOpcion: ");
        switch (Integer.parseInt(lector.nextLine())) {
            case 1:
                int sip;
                System.out.print("Introduce el SIP que desea buscar\nSIP:");
                sip = Integer.parseInt(lector.nextLine());
                for (int j = 0; j < baseDatos.length; j++) {
                    if (baseDatos[j].getSip() == sip) {
                        Object[] preRevArray = baseDatos[j].getPreRev().toArray();
                        System.out.printf("%7s" + "%20s" + "%20s" + "%25s" + "%25s" + "%10s" + "%25s"
                                        + "%10s" + "%10s" + "%10s" + "%10s" + "%20s" + "%20s" + "%20s\n"
                                        + "-------------------------------------------------------------"
                                        + "--------------------------------------------------------------"
                                        + "--------------------------------------------------------------"
                                        + "-------------------------------------------------------------\n"
                                        + "%10d" + "%25s" + "%11s" + "%15td-%tm-%tY" + "%23tR" + "%14d" + "%20s" + "%16.1f" + "%10.0f"
                                        + "%10.0f" + "%12.0f" + "%15td-%tm-%tY" + "%23tR" + "%20s\n"
                                , "SIP", "Nombre", "Sexo", "Fecha de entrada", "Hora de entrada", "Edad", "Sintomatologia", "Temp", "Ppm"
                                , "Ten Sis", "Ten Dias", "Fecha de alta", "Hora de alta", "Motivo de alta"
                                , baseDatos[j].getSip(), baseDatos[j].getNombre()
                                , baseDatos[j].getSexo(), baseDatos[j].getFechaDeEntrada()
                                , baseDatos[j].getHoraDeEntrada(), baseDatos[j].getHoraDeEntrada()
                                , baseDatos[j].getHoraDeEntrada(), baseDatos[j].getEdad()
                                , baseDatos[j].getSintomatologia(), preRevArray[0], preRevArray[1], preRevArray[2]
                                , preRevArray[3], baseDatos[j].getFechaAlta()
                                , baseDatos[j].getFechaAlta(), baseDatos[j].getFechaAlta()
                                , baseDatos[j].getFechaAlta(), baseDatos[j].getHoraDeAlta()
                                , baseDatos[j].getMotivoDeAlta());
                    }
                }
            case 2:
                LocalDate fecha;
                String[] a;
                System.out.print("Introduce el dia que desea buscar Ej.(dd/mm/yyyy)\nDia:");
                a = lector.nextLine().split("/");
                fecha = LocalDate.of(Integer.parseInt(a[2]), Integer.parseInt(a[1]), Integer.parseInt(a[0]));
                for (int j = 0; j < baseDatos.length; j++) {
                    if (baseDatos[j].getFechaDeEntrada() == fecha) {
                        Object[] preRevArray = baseDatos[j].getPreRev().toArray();
                        System.out.printf("%7s" + "%20s" + "%20s" + "%25s" + "%25s" + "%10s" + "%25s"
                                        + "%10s" + "%10s" + "%10s" + "%10s" + "%20s" + "%20s" + "%20s\n"
                                        + "-------------------------------------------------------------"
                                        + "--------------------------------------------------------------"
                                        + "--------------------------------------------------------------"
                                        + "-------------------------------------------------------------\n"
                                        + "%10d" + "%25s" + "%11s" + "%15td-%tm-%tY" + "%23tR" + "%14d" + "%20s" + "%16.1f" + "%10.0f"
                                        + "%10.0f" + "%12.0f" + "%15td-%tm-%tY" + "%23tR" + "%20s\n"
                                , "SIP", "Nombre", "Sexo", "Fecha de entrada", "Hora de entrada", "Edad", "Sintomatologia", "Temp", "Ppm"
                                , "Ten Sis", "Ten Dias", "Fecha de alta", "Hora de alta", "Motivo de alta"
                                , baseDatos[j].getSip(), baseDatos[j].getNombre()
                                , baseDatos[j].getSexo(), baseDatos[j].getFechaDeEntrada()
                                , baseDatos[j].getHoraDeEntrada(), baseDatos[j].getHoraDeEntrada()
                                , baseDatos[j].getHoraDeEntrada(), baseDatos[j].getEdad()
                                , baseDatos[j].getSintomatologia(), preRevArray[0], preRevArray[1], preRevArray[2]
                                , preRevArray[3], baseDatos[j].getFechaAlta()
                                , baseDatos[j].getFechaAlta(), baseDatos[j].getFechaAlta()
                                , baseDatos[j].getFechaAlta(), baseDatos[j].getHoraDeAlta()
                                , baseDatos[j].getMotivoDeAlta());
                    }
                }
        }
    }

    public static void comprobarSip(int sip) {
        do {
            System.out.print(sip + " es correcto Si/No?\nRespuesta: ");
            respuesta = lector.nextLine();
            comprobarRespuesta(respuesta);
            if (respuesta.equalsIgnoreCase("Si")) {
                sip = validacionSip(sip);
                for (int j = 0; j < baseDatos.length; j++) {
                    if (sip == baseDatos[j].getSip()) {
                        if (comprobarAlta(sip)) {
                            return;
                        }
                    } else {
                        paciente.setSip(sip);
                    }
                }
            } else {
                System.out.print("Introduce el SIP del paciente\nSIP: ");
                sip = Integer.parseInt(lector.nextLine());
            }
        }
        while (!respuesta.equalsIgnoreCase("Si"));
    }

    public static int validacionSip(int sip) {
        int res, div = 10, cont = 0;
        do {
            do {
                res = sip / div;
                cont++;
                div *= 10;
            }
            while (res >= 1);
            if (cont < 8) {
                System.out.print("El numero SIP no es valido, faltan digitos\nSIP: ");
                sip = Integer.parseInt(lector.nextLine());
            } else if (cont > 8) {
                System.out.print("El numero SIP no es valido, sobran digitos\nSIP: ");
                sip = Integer.parseInt(lector.nextLine());
            }
        }
        while (cont < 8);
        return sip;
    }

    public static void comprobarNombre(String nombre) {
        do {
            System.out.print(nombre + " es correcto Si/No?\nRespuesta: ");
            respuesta = lector.nextLine();
            comprobarRespuesta(respuesta);
            if (respuesta.equalsIgnoreCase("Si")) {
                paciente.setNombre(nombre);
            } else {
                System.out.print("Introduzca el nombre del nuevo paciente Ej(\"Eric Sospedra Salort\")\nNombre: ");
                nombre = lector.nextLine();
            }
        }
        while (!respuesta.equalsIgnoreCase("Si"));
    }

    public static void edad(int edad) {
        do {
            System.out.print(edad + " es correcto Si/No?\nRespuesta: ");
            respuesta = lector.nextLine();
            comprobarRespuesta(respuesta);
            if (respuesta.equalsIgnoreCase("Si")) {
                while (edad < 0) {
                    System.out.print("Introduce una edad valida\nEdad:");
                    edad = Integer.parseInt(lector.nextLine());
                }
                if (edad <= 12) {
                    System.out.print("El paciente es menor de una año\nSi/No: ");
                    if (comprobarRespuesta(lector.nextLine()).equalsIgnoreCase("Si")) {
                        paciente.setMenorDeUnAnyo(true);
                    }
                }
                paciente.setEdad(edad);
            } else {
                System.out.print("Introduzca la edad del paciente\nEdad: ");
                edad(Integer.parseInt(lector.nextLine()));
            }
        }
        while (!respuesta.equalsIgnoreCase("Si"));
    }

    public static String comprobarRespuesta(String respuesta) {
        while (!respuesta.equalsIgnoreCase("Si") && !respuesta.equalsIgnoreCase("No")) {
            System.out.print("Introduce Si o No\nRespuesta: ");
            respuesta = lector.nextLine();
        }
        return respuesta;
    }

    public static void comprobarSexo(int sexo) {
        do {
            while (sexo < 1 || sexo > 2) {
                System.out.print("Introduce una opcion valida, 1 o 2\nOpcion: ");
                sexo = lector.nextInt();
                lector.nextLine();
            }
            if (sexo == 1) {
                System.out.print("El sexo del paciente es Varon, Si/No\nRespuesta: ");
                respuesta = lector.nextLine();
                if (respuesta.equalsIgnoreCase("Si")) {
                    paciente.setSexo('V');
                }
            } else {
                System.out.print("El sexo del paciente es Mujer, Si/No\nRespuesta: ");
                respuesta = lector.nextLine();
                if (respuesta.equalsIgnoreCase("Si")) {
                    paciente.setSexo('M');
                }
            }
            if (respuesta.equalsIgnoreCase("No")) {
                System.out.print("Introduzca el sexo\n1:Varon\n2:Mujer\nSexo: ");
                sexo = Integer.parseInt(lector.nextLine());
            }
        }
        while (!respuesta.equalsIgnoreCase("Si"));
    }

    public static boolean comprobarAlta(int sip) {
        int cont = 1;
        boolean control = false;
        for (int j = 0; j < baseDatos.length; j++) {
            if (sip == baseDatos[j].getSip() && baseDatos[j].getMotivoDeAlta().equalsIgnoreCase(" ")) {
                cont++;
                if (cont > 1) {
                    System.out.print("El paciente no puede ser registrado con mas de un registro sin motivo de alta\n");
                    control = true;
                    comodin = 1;
                    break;
                }
            }
        }
        return control;
    }

    public static void buscarSip(int sip) {
        for (int j = 0; j < baseDatos.length; j++) {
            if (baseDatos == null) {
                break;
            } else {
                if (sip == baseDatos[j].getSip() && !baseDatos[j].getAtendido()) {
                    baseDatos[j].setAtendido(true);
                    mostrarPaciente();
                    System.out.print("Presione enter para continuar ....\n");
                    lector.nextLine();
                    System.out.print("Introduce la temperatura del paciente\nTemperatura: ");
                    temperatura(lector.nextFloat());
                    lector.nextLine();
                    System.out.print("Introduzca la pulsaciones por minuto del paciente\nPulsaciones: ");
                    pulsaciones(lector.nextFloat());
                    lector.nextLine();
                    System.out.print("Introduce la tension minima del paciente\nTension Minima: ");
                    tensionMinima(lector.nextFloat());
                    lector.nextLine();
                    System.out.print("Introduce la tension maxima del paciente\nTension Maxima: ");
                    tensionMaxima(lector.nextFloat());
                    lector.nextLine();
                    paciente.setPreRev(preRev);
                    pacientesAtendidos++;
                    break;
                } else {
                    System.out.print("El paciente no esta registrado en el sistema\nPulse enter para salir\n");
                    lector.nextLine();
                    comodin = 1;
                    break;
                }
            }
        }
    }

    public static void mostrarPaciente() {
        System.out.printf("%7s" + "%20s" + "%20s" + "%25s" + "%25s" + "%10s" + "%25s\n"
                        + "-------------------------------------------------------------"
                        + "-----------------------------------------------------------------------\n"
                        + "%10d" + "%25s" + "%11s" + "%15td-%tm-%tY" + "%23tR" + "%14d" + "%20s\n"
                , "SIP", "Nombre", "Sexo", "Fecha de entrada", "Hora de entrada", "Edad", "Sintomatologia"
                , baseDatos[pacientesAtendidos].getSip(), baseDatos[pacientesAtendidos].getNombre()
                , baseDatos[pacientesAtendidos].getSexo(), baseDatos[pacientesAtendidos].getFechaDeEntrada()
                , baseDatos[pacientesAtendidos].getHoraDeEntrada(), baseDatos[pacientesAtendidos].getHoraDeEntrada()
                , baseDatos[pacientesAtendidos].getHoraDeEntrada(), baseDatos[pacientesAtendidos].getEdad()
                , baseDatos[pacientesAtendidos].getSintomatologia());
    }

    public static void temperatura(float temperatura) {
        if (temperatura <= 35f) {
            System.out.print("La temperatura es muy baja\n");
        } else if (temperatura >= 40f) {
            System.out.print("La temperatura es muy alta\n");
        }
        preRev.add(temperatura);
    }

    public static void pulsaciones(float pulsaciones) {
        if (baseDatos[pacientesAtendidos].getEdad() <= 1 && baseDatos[pacientesAtendidos].getMenorDeUnAnyo()) {
            if (pulsaciones < 70) {
                System.out.println("Las pulsaciones son muy bajas\n");
            } else if (pulsaciones > 190) {
                System.out.println("Las pulsaciones son muy altas\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() > 1 && baseDatos[pacientesAtendidos].getEdad() < 11 && baseDatos[pacientesAtendidos].getMenorDeUnAnyo()) {
            if (pulsaciones < 80) {
                System.out.println("Las pulsaciones son muy bajas\n");
            } else if (pulsaciones > 160) {
                System.out.println("Las pulsaciones son muy altas\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 1 && baseDatos[pacientesAtendidos].getEdad() <= 2) {
            if (pulsaciones < 80) {
                System.out.println("Las pulsaciones son muy bajas\n");
            } else if (pulsaciones > 130) {
                System.out.println("Las pulsaciones son muy altas\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 3 && baseDatos[pacientesAtendidos].getEdad() <= 4) {
            if (pulsaciones < 80) {
                System.out.println("Las pulsaciones son muy bajas\n");
            } else if (pulsaciones > 120) {
                System.out.println("Las pulsaciones son muy altas\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 5 && baseDatos[pacientesAtendidos].getEdad() <= 6) {
            if (pulsaciones < 80) {
                System.out.println("Las pulsaciones son muy bajas\n");
            } else if (pulsaciones > 115) {
                System.out.println("Las pulsaciones son muy altas\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 7 && baseDatos[pacientesAtendidos].getEdad() <= 9) {
            if (pulsaciones < 80) {
                System.out.println("Las pulsaciones son muy bajas\n");
            } else if (pulsaciones > 110) {
                System.out.println("Las pulsaciones son muy altas\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 10) {
            if (pulsaciones < 80) {
                System.out.println("Las pulsaciones son bajas\n");
            } else if (pulsaciones > 100) {
                System.out.println("Las pulsaciones son altas\n");
            }
        }
        preRev.add(pulsaciones);
    }

    public static void tensionMinima(float tensionMinima) {
        if (baseDatos[pacientesAtendidos].getEdad() <= 1 && baseDatos[pacientesAtendidos].getMenorDeUnAnyo() && baseDatos[pacientesAtendidos].getEdad() <= 12) {
            if (tensionMinima <= 50) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 75) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 1 && baseDatos[pacientesAtendidos].getEdad() < 5) {
            if (tensionMinima <= 55) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 79) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 6 && baseDatos[pacientesAtendidos].getEdad() < 13) {
            if (tensionMinima <= 60) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 80) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 14 && baseDatos[pacientesAtendidos].getEdad() < 19) {
            if (tensionMinima <= 73) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 81) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 20 && baseDatos[pacientesAtendidos].getEdad() < 24) {
            if (tensionMinima <= 75) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 83) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 25 && baseDatos[pacientesAtendidos].getEdad() < 29) {
            if (tensionMinima <= 76) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 84) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 30 && baseDatos[pacientesAtendidos].getEdad() < 34) {
            if (tensionMinima <= 77) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 85) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 35 && baseDatos[pacientesAtendidos].getEdad() < 39) {
            if (tensionMinima <= 78) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 86) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 40 && baseDatos[pacientesAtendidos].getEdad() < 44) {
            if (tensionMinima <= 79) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 87) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 44 && baseDatos[pacientesAtendidos].getEdad() < 49) {
            if (tensionMinima <= 80) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 88) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 50 && baseDatos[pacientesAtendidos].getEdad() < 54) {
            if (tensionMinima <= 81) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 89) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 55 && baseDatos[pacientesAtendidos].getEdad() < 59) {
            if (tensionMinima <= 82) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 90) {
                System.out.println("La tension minima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 60) {
            if (tensionMinima <= 83) {
                System.out.println("La tension minima es baja\n");
            } else if (tensionMinima >= 91) {
                System.out.println("La tension minima es alta\n");
            }
        }
        preRev.add(tensionMinima);
    }

    public static void tensionMaxima(float tensionMaxima) {
        if (baseDatos[pacientesAtendidos].getEdad() <= 1 && baseDatos[pacientesAtendidos].getMenorDeUnAnyo() && baseDatos[pacientesAtendidos].getEdad() <= 12) {
            if (tensionMaxima <= 75) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 100) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 1 && baseDatos[pacientesAtendidos].getEdad() < 5) {
            if (tensionMaxima <= 80) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 110) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 6 && baseDatos[pacientesAtendidos].getEdad() < 13) {
            if (tensionMaxima <= 90) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 115) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 14 && baseDatos[pacientesAtendidos].getEdad() < 19) {
            if (tensionMaxima <= 105) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 120) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 20 && baseDatos[pacientesAtendidos].getEdad() < 24) {
            if (tensionMaxima <= 108) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 132) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 25 && baseDatos[pacientesAtendidos].getEdad() < 29) {
            if (tensionMaxima <= 109) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 133) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 30 && baseDatos[pacientesAtendidos].getEdad() < 34) {
            if (tensionMaxima <= 110) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 134) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 35 && baseDatos[pacientesAtendidos].getEdad() < 39) {
            if (tensionMaxima <= 111) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 135) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 40 && baseDatos[pacientesAtendidos].getEdad() < 44) {
            if (tensionMaxima <= 112) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 137) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 44 && baseDatos[pacientesAtendidos].getEdad() < 49) {
            if (tensionMaxima <= 115) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 139) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 50 && baseDatos[pacientesAtendidos].getEdad() < 54) {
            if (tensionMaxima <= 116) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 142) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 55 && baseDatos[pacientesAtendidos].getEdad() < 59) {
            if (tensionMaxima <= 118) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 144) {
                System.out.println("La tension maxima es alta\n");
            }
        } else if (baseDatos[pacientesAtendidos].getEdad() >= 60) {
            if (tensionMaxima <= 121) {
                System.out.println("La tension maxima es baja\n");
            } else if (tensionMaxima >= 147) {
                System.out.println("La tension maxima es alta\n");
            }
        }
        preRev.add(tensionMaxima);
    }
}