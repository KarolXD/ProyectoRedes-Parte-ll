# Creación de un Servidor FTP


El Readme de este repositorio tendrá una descripción del software que se debe instalar
para ejecutar el proyecto y los pasos detallados. 



# Clonando el repositorio
Para empezar con la clonación del repositorio,
Usando el IDE Netbeans version 8.0

***Paso #1 Abre Netbeans

***Paso #2 Se dirige a la navegación #Team en ingles, en español #Equipo

Como podemos ver a continuación...
![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/team.PNG)


***Paso #3 Se dirige a la siguiente ruta Git/Clone/

Como podemos ver a continuación...
![]( https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/ruta.PNG)


***Paso #4  En la pantalla "Clone Repo"

1.1 Se le pedirá el link del repositorio, así como las credenciales 

1.2 Dirección o ruta donde se clonará  el repositorio.
Ambos datos deben ser editables por el Usuario
Cuando se llenen los datos, que dije anteriormente, se da click sobre el botón 'Next'
Como podemos ver a continuación...


![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/cloneteRepo.PNG)


***Paso #5  
Presionas sobre el botón Next
Como podemos ver a continuación...

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/next1.PNG)

Paso #6 Presionas sobre el botón Finish
Como podemos ver a continuación...

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/finist.PNG)


--Lista clonación del repositorio
Nota: El repositorio se clona con exito, sin embargo  se le mostrará algunas advetencias en el proyecto, esto es porque para este proyecto, se usa un conectar, para la comunicación del lenguaje con el gestor de base de datos, por tanto en el apartado ' Instalando' se detalla en qué ruta se encuentra el conector




# Restauración de la Base de datos

#Paso #1
Instalar gestor de base de datos Mysql

Paso #2 Configuración de Credenciales

Paso #3 Importar el script

Paso #3.1
Dirigirse a el apartado Data Import
Como podemos ver acontinuación

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/uno.png)

Paso #3.2
Seleccionar el back up, donde lo hayas guardado.
Como podemos ver a continuación

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/dos.png)




Nota: Tanto el backup como el script de la base de datos, han sido subidos al repositorio:

# Título del Proyecto
Creacion de un servidor FTP para conexion de N Clientes para transferencia de archivos


# Empezando

Estas instrucciones le proporcionarán una copia del proyecto en funcionamiento en su máquina local para fines de desarrollo y prueba. Consulte la implementación para obtener notas sobre cómo implementar el proyecto en un sistema en vivo.

# Prerrequisitos
Qué cosas necesita para instalar el software y cómo instalarlas

Necesito:
-Gestor de Base de datos

-IDE de desarrollo

-uso de conector de mysql 


#Para este demo, se desarrolló en  el ID Netbeans version 8.0

Como instalarlos?
Tanto El ID como el gestor de bases de datos se descargan de la web solo es cuestion de instalar,
para poder gestionar el programa se tiene que descargar java el cual se usa para la creacion del programa,
El conector mysql  se usa para la conexion a la BD, se descargan de la web y  los sockets  la cual nos permiten la transferencia de archivos


# Instalando
Una serie de ejemplos paso a paso que le indican cómo ejecutar un entorno de desarrollo

Vaya a la página de descargas de NetBeans IDE.
En la parte superior derecha de la página, seleccione el idioma y la plataforma en la lista desplegable. También puede optar por descargar y utilizar el archivo zip independiente de la plataforma.
Haga clic en el botón Download (Descargar) de la opción de descarga que desee instalar.
Guarde el archivo del instalador en el sistema.


Java

Ve a la pagina:
https://www.oracle.com/technetwork/es/java/javase/downloads/index.html
Para empezar a descargar el jdk que utiliza 
Descargar e instalar

MySql

Lo primero que tendremos que hacer por supuesto, es instalar la herramienta principal,
 el motor de bases de datos y también vamos a provechar para instalar el cliente para la gestión 
de las bases de datos. Para descargarlo tendremos que dirigirnos a su sitio web oficial,
 y en su página principal, pulsamos sobre “MySQL Comunnity Server”.

En cualquier caso, tendremos que dirigirnos a la zona inferior de la nueva página y
 seleccionar la plataforma en la que deseamos instar MySQL. Por supuesto, será en Windows.
 Luego, tendremos que pulsar sobre la opción principal de “MySQL Installer for Windows”

Conector mysql
Se dirige a la página oficial de mysql, y pueda buscar en la sección de conectores, la versión que se adapte a sus necesidades, para este proyecto de utilizó la 5.1

***Otra opción: En el presente proyecto, en la siguiente ruta \ProyectoRedes\Server\dist\lib podemos encontrar el conector que se utilizó para el presente proyecto.
Para utilizarlo, darás click sobre el proyecto/Resolve Project Problems

Como veremos a continuación

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/rp.PNG)


**Luego, darás click, sobre el botón 'Resolve' (imagen de la derecha) y buscas el conector(imagen derecha) Una vez que encuentres el conector, le darás click sobre el botón 'open'

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/conector.PNG)




# Ejecutando las pruebas
Se menciona cómo ejecutar las pruebas automatizadas para este sistema.

Autenticación de Clientes

Transferencia de archivos

Conexión Cliente-Servidor

# Desglosar en pruebas de extremo a extremo
Se explica qué prueban estas pruebas y por qué.

Prueban  que se pueda registrar "n" cliente para que puedan acceder a el servidor.
Prueban que se pueda autenticar un cliente en el sistema y que no entren personas que no estén autenticadas
Prueba que se  pueda transferir un archivo desde un lugar a otro

# Construido con
Java: Se utilizó como Lenguaje de Programación

Mysql: Se utilizó como Gestor de Base de datos

Git: Se utilizó como controlador de versiones y tareas

IDE: Se usó como entorno de desarrollo

conector mysql: Se utilizó para establecer la comunicación entre java y el gestor de la base de datos

# Versionado
Version jdk:8

Version Mysql: 8.0

Version IDE: 8.2

Version conectorMsql 5.1

# Autores
Jahanel Rivera Barboza

Karolina Montenegro Guzmán

# Licencia
Este proyecto no está licenciado bajo alguna  Licencia

# Expresiones de gratitud
A guide to java sockets cuyo código ha sido utilizado: https://www.baeldung.com/a-guide-to-java-sockets
Conectarse a un ftp con java cuyo código se ha utilizado : http://lineadecodigo.com/java/conectarse-a-un-ftp-con-java/

etc.

