>  # Creación de un Servidor FTP


* El Readme de este repositorio tendrá una descripción del software que se debe instalar
para ejecutar el proyecto y los pasos detallados. 





# Clonando el repositorio
Para empezar con la clonación del repositorio,
Usando el IDE Netbeans version 11.3

*  **Paso #1**

Abre Netbeans

* **Paso #2**

Se dirige a la navegación #Team en ingles, en español #Equipo

Como podemos ver a continuación...
![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/team.PNG)


* **Paso #3** 

Se dirige a la siguiente ruta Git/Clone/

Como podemos ver a continuación...

![]( https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/ruta.PNG)


* **Paso #4**

En la pantalla "Clone Repo"

* 1.1 Se le pedirá el link del repositorio, así como las credenciales 

* 1.2 Dirección o ruta donde se clonará  el repositorio.

Ambos campos deben ser editables por el Usuario
Cuando se llenen los datos, que dije anteriormente, se da click sobre el botón 'Next'
Como podemos ver a continuación...


![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/cloneteRepo.PNG)


* **Paso #5**  

Presionas sobre el botón Next
Como podemos ver a continuación...

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/next1.PNG)

* **Paso #6**

Presionas sobre el botón Finish
Como podemos ver a continuación...

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/finist.PNG)


--Lista clonación del repositorio

* **Nota:**
El repositorio se clona con exito, sin embargo  se le mostrará algunas advetencias en el proyecto, esto es porque para este proyecto, se usa un conector, para la comunicación del lenguaje con el gestor de base de datos, por tanto en el apartado ' Instalando' se detalla en qué ruta se encuentra el conector, y como se debe importa al proyecto.




# Restauración de la Base de datos

* **Paso #1**

Instalar gestor de base de datos Mysql

* **Paso #2** 

Configuración de Credenciales

* **Paso #3**

Importar el script

* **Paso #3.1**

Dirigirse a el apartado Data Import
Como podemos ver acontinuación

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/uno.png)

* **Paso #3.2**
Seleccionar el back up, donde lo hayas guardado.
Como podemos ver a continuación

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/dos.png)




**Nota:**
Tanto el backup como el script de la base de datos, han sido subidos al repositorio:

# Título del Proyecto
Creacion de un servidor FTP para conexion de N Clientes para transferencia de archivos


# Empezando

Estas instrucciones le proporcionarán una copia del proyecto en funcionamiento en su máquina local para fines de desarrollo y prueba. Consulte la implementación para obtener notas sobre cómo implementar el proyecto en un sistema en vivo.

# Prerrequisitos
En este apartado detalleremos que cosas se necesitan para instalar el software y cómo instalarlas

Necesito:
* Gestor de Base de datos

* IDE de desarrollo

* Conector de mysql 

* JDK



# Instalando
En este apartado, se brindan una serie de ejemplos paso a paso que le indican cómo ejecutar un entorno de desarrollo


* **IDE**

Vaya a la página de descargas de NetBeans IDE. (https://netbeans.org/downloads/8.2/rc/)
En la parte superior derecha de la página, seleccione el idioma y la plataforma en la lista desplegable. También puede optar por descargar y utilizar el archivo zip independiente de la plataforma.
Haga clic en el botón Download (Descargar) de la opción de descarga que desee instalar.
Guarde el archivo del instalador en el sistema.


* **JDK**

Ve a la pagina:
https://www.oracle.com/technetwork/es/java/javase/downloads/index.html
Para empezar a descargar el jdk que utiliza 
Descargar e instalar

* **MySql**

Lo primero que tendremos que hacer por supuesto, es descargar la herramienta en la página oficial (https://dev.mysql.com/downloads/workbench/)  y seguir los pasos para su instalación.

* **Conector mysql**
Se dirige a la página oficial de mysql, y pueda buscar en la sección de conectores, la versión que se adapte a sus necesidades, para este proyecto de utilizó la 5.1

**Otra opción:**
En el presente proyecto, en la siguiente ruta \ProyectoRedes\Server\dist\lib podemos encontrar el conector que se utilizó para el presente proyecto.

Para el conector, se deberá importar de la siguiente forma: darás click sobre el proyecto/Resolve Project Problems

Como veremos a continuación

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/rp.PNG)


**Luego, darás click, sobre el botón 'Resolve' (imagen de la derecha) y buscas el conector(imagen izquierda) Una vez que encuentres el conector, le darás click sobre el botón 'open'

![](https://github.com/KarolXD/ProyectoRedes-Parte-ll/blob/master/imagenes/conector.PNG)



# Construido con
* **Java:** Se utilizó como Lenguaje de Programación

* **Mysql:** Se utilizó como Gestor de Base de datos

* **Git:** Se utilizó como controlador de versiones y tareas

* **IDE:** Se usó como entorno de desarrollo

**Conector mysql:** Se utilizó para establecer la comunicación entre java y el gestor de la base de datos

# Versionado
*Version jdk: 8.0

* Version Mysql: 8.0

* Version IDE: 11.3

* Version conectorMsql 5.1

# Autores

* Jahanel Rivera Barboza

* Karolina Montenegro Guzmán

# Licencia
Este proyecto no está licenciado bajo alguna  Licencia

# Expresiones de gratitud
* A guide to java sockets cuyo código ha sido consulado: https://www.baeldung.com/a-guide-to-java-sockets

* Conectarse a un ftp con java cuyo código se ha consulado : http://lineadecodigo.com/java/conectarse-a-un-ftp-con-java/

etc.

