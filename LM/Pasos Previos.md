#### 1.¿Cuando debemos  usar un solo archivo CSS para varios archivos HTML?
Cuando deseemos que todos los html modifiquen el estilo de las etiquetas especificadas en css, y asi podamos corregir un problema de estilo cambiandolo solo en un archivo en vez de tener que ir uno a uno
#### 2.¿Para qué sirve normalize.css?
Sirve para eliminar todos los parametros de css heredados de el navegador y la configuracion de este por parte del usuario.
#### 3.¿Para qué sirve modernizr.css?
Para que encaso de que un navegador no pueda interpretar atributos css el modernizr se encargara que el contenido se muestre como debe
#### 4.¿Para qué sirven los prefijos?
Sirven para que en caso de que un navegador no pueda interpretar directamente un atributo de css, con el prefijo pueda identificar el atributo y interpretarlo
#### 5.Enumera los prefijos de cada navegador.
> -moz-  Firefox
-webkit-	Safari y Chrome
-o-	Opera
-khtml-	Konqueror
-ms-	Internet Explorer
-chrome-	Google Chrome

#### 6.Pon un ejemplo que haga los mismo en firefox y safari.
 background-image: -webkit-linear-gradient(top, #F4FA58, #FF0000);
  background-image:    -moz-linear-gradient(top, #F4FA58, #FF0000); 
