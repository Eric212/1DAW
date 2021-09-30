# Sistemas informáticosUnidad 1
### 1. Accede a la página web del fabricante MSI y localiza la placa base MSI X220 RAIDER (https://es.msi.com/Motherboard/X299-RAIDER/Specification).
### Realiza los siguientes ejercicios:
- Descarga una imagen de la placa base y otra de los conectores externos del panel trasero.Señala aquellos elementos estudiados, indicando su nombre técnico.
![Placa base1](../Placa_Base1.png)
![Placa base2](../Placa_Base2.png)
- ¿Qué factor de forma tiene la placa base?
  - Tiene un formato ATX 
- Procesador.
  - ¿Qué tipo de socket de procesador tiene?
    - LGA2066 
  - ¿Con qué procesadores es compatible la placa base?
    - Skylake-X y Kaby Lake-X
- Memoria RAM.
  - ¿Qué módulos de memoria soporta?
    - DDR4 4500+(OC)/4400(OC)/4333(OC)/4266(OC)/4200(OC)/4133(OC)/4000(OC)/3866(OC)/3800(OC)/3733(OC)/3600(OC)/3466(OC)/3400(OC)/3333(OC)/3200(OC)/3000(OC)/2933(OC)/2800(OC)/2667/2400/2133 MHz
  - ¿Qué cantidad máxima de memoriaRAM se puede instalar?
    - 8 modulos de DDR4, con una caoacidad maxima 128GB
  - ¿Dispone de tecnología multicanal?
    - Quad Channel y Dual Channel
- Qué chipset monta la placa base?
  - Intel® X299 Chipset
- Indica las características del mismo mediante un diagrama o describiéndolo
![chipset](../chipset.png)
- Capacidad de expansión. ¿De cuántas ranuras de expansión dispone y de qué tipo?
  - Dispone de 5 ranuras de expansion PCIexpress
  - 4 ranuras de PCIexpress x16
  - 1 ranura de PCIexpress x1
- Conectores internos.
  - ¿De qué conectores internos dispone y cuál es su número?
    -  1 conector de alimentación principal ATX de 24 pines
    - 1 conector de alimentación ATX 12V de 8 pines
    - 8 conectores SATA 6Gb / s
    - 2 conectores USB 2.0 (admite 4 puertos USB 2.0 adicionales)
    - 2 conectores USB 3.1 Gen1 (admite 4 puertos USB 3.1 Gen1 adicionales)
    - 1 puerto USB 3.1 Gen2 tipo C
    - 1 conector de ventilador de CPU de 4 pines
    - 1 conector de bomba de agua de 4 pines
    - Conectores de ventilador del sistema de 4 x 4 pines
    - 2 conectores del panel frontal
    - 1 conector de audio del panel frontal
    - 1 conector de extensión LED
    - 1 conector de módulo TPM
    - 1 RAID virtual en el conector de la CPU
    - 1 conector de tarjeta adicional Thunderbolt
    - 2 ranuras M.2
- ¿La placa base permite resetear la memoria BIOS RAM-CMOS?
    - Si 
- ¿Si lo permite, puedes explicar cómo?
    - La placa incorpora dos sistemas para este fin, uno seria mediante la pulsacion del boton de la parte posterior de la placa base, y la otra seria mediante los jumpers JBAT 
- ¿Cuántos conectores de alimentación posee?
    - Posee 2 conectores de alimentacion
- ¿De qué tipo?
    - Uno de 24 pines y otro de 8 pines a 12V para la cpu 
- Indica el procedimiento para descargar los drivers de la placa base
    - Iriamos a la pagina oficial del fabricante, nos iriamos al apartado de soporte, donde buscariamos la placa base, y despues en la seccion de drivers especificariamos el sistema operativo que poseemos, y por ultimo descargariamos los drivers correspondientes
### 2. Realiza una comparativa teórica de las velocidades de transferencia de datos de los buses USB, SATA y Thunderbolt en sus versiones más actuales
| Caracteristicas| USB | SATA | Thunderbolt |
| :---: | :---: | :---: | :---: |
| Velocidades | 10 Gb/s (1.2 GB/s) | 16 Gb/s (2 GB/s) | 40 Gb/s (5 GB/s) |
### 3. Descarga la aplicación CPU-Z de la página web oficial: https://www.cpuid.com/downloads/cpu-z/cpu-z_1.94-en.exe.Instálala y ejecútala. Anota la información del equipo
- Procesador: nombre comercial, número de núcleos, frecuencias, tecnología de integración, voltaje, conjunto de instrucciones, caché y número de hilos
![cpu-x](../Cpu-X1.png)
- Placa base y chipset: fabricante y modelo de placa base, tipo de chipset, fabricante y modelo de BIOS
![cpu-x](../Cpu-X1.png)
- Memoria: tipos, tamaños, latencias y canales•Información en tiempo real del estado de todos los componentes: frecuencias, voltajes y temperaturas (ver en el BIOS)
![cpu-x](../Cpu-X1.png)

### 4. Sobre el mismo equipo y una vez recogida la información del punto anterior, descarga el manual de la placa base de la página oficial del fabricante y localiza los pines de reseteo de la memoria BIOS RAM-CMOS. Accede al BIOS Setup Utility y anota la prioridad del orden de arranque de los dispositivos de almacenamiento secundario. Cambia dichos parámetros a otros cualquiera. Apaga el equipo. Desconecta los cables de alimentación del equipo y de los dispositivos periféricos. Abre el equipo y resetea la BIOS RAM-CMOS.


![Pines](../Pines.png)


Vuelve a conectar los cables del equipo y comprueba que se ha reseteado la BIOS RAM-CMOS a sus valores originales de fábrica, volviendo a entrar en la BIOS Setup Utility. Modifica los valores de la BIOS RAM-CMOS a los valores previos al reseteo.

![Bios](Bios2.webp)
    
### 5. Busca al menos tres ejemplos para cada tipo de software
### 6. Vamos a analizar la segunda parte del proceso POST de nuestro equipo. Para ello, cuando aparezca una imagen como la de la figura 1.34 y, antes de que pase a la siguiente pantalla, analiza todas las líneas. Para detener la imagen y el proceso de arranque del equipo, pulsa la tecla ‘Pausa’ en el teclado
Explica cada una de las líneas.
1.  La primera linea nos dice el fabricante del software de la Bios 
2. La segunda nos dice la fecha y hora que almacena la bios y su version
3. La tercera nos comenta el tipo de maquina que es
4. La cuarta nos comenta la cpu que lleva el sistema y su velocida
5. La quinta nos comenta su velocidad base junto con sus nucleos
6. La sexta nos comenta la combinacion de teclas para entrar en la bios o utilizar un teclado remoto
7. La septima nos comenta la combinacion de teclas para arrancar desde tarjeta de red o utilizar un teclado remoto
8. La octava nos comenta la combinacion de teclas para acceder al menu de arranque o utilizar un teclado remoto
9. La novena carga la version correspondiente de Firewire
10. Y en la decima y ultima linea nos carga los drivers de los usb
Accede al BIOS Setup Utility:
 Obtén información de la temperatura del procesador, su voltaje y la velocidad de los ventiladores

![Bios](Bios1.webp)

- Anota el orden de los medios de arranque del sistema operativo. Guarda los cambios y reinicia el sistema. ¿Qué ocurre? Restáuralo a su orden anterior.
    -  Al cambiar el orden de arranque no inicia el sistema porque no encuentra la particion de activa de sistema, para cargar el sistema operativo
7. Pon dos ejemplos, buscando en internet, de los hipervisores nativos y otros dos alojados

| Nativos | Alojados |
| :---: | :---: |
| Hyper-V | VirtualBox|
|Parallels | VM-Ware |
8. Cita diez ejemplos de distribuciones GNU/Linux

| Distribuciones |
| :---: |
| LinuxMint |
| Ubuntu |
| Kali-Linux |
| RedHat |
| CentOS |
| Open-SUSE |
| Lliurex |
| ArchLinux |
| Debian |
| Manjaros|
9. Realiza el proceso de descarga e instalación de la última versión de Oracle VirtualBox. A continuación:
◦Crea una máquina virtual llamada Ubuntu MV para la futura instalación de Ubuntu Desktop con 4 Gb de memoria RAM y un disco duro reservado dinámicamente de 250 Gb
◦Crea una instantánea de cada una con el nombre de MV Limpia (Ubuntu / Windows)
◦Accede a la configuración de Windows MV y añade un segundo disco duro reservado dinámicamente de 200 Gb. En caso de duda, consulta la ayuda de VirtualBox.

![VirtualBox](VirtualBox1.png)
![VirtualBox](VirtualBox2.png)
![VirtualBox](VirtualBox3.png)
![VirtualBox](VirtualBox4.png)
![VirtualBox](VirtualBox5.png)
![VirtualBox](VirtualBox6.png)
![VirtualBox](VirtualBox7.png)
![VirtualBox](VirtualBox8.png)
![VirtualBox](VirtualBox9.png)
![VirtualBox](VirtualBox10.png)
![VirtualBox](VirtualBox11.png)


10.Descarga una versión de prueba de Vmware WorkStation Pro desde https://www.vmware.com/es/products/workstation-pro.html. Instala la aplicación y crea una máquina virtual de prueba.
![VM-Ware](VM-Ware.png)







