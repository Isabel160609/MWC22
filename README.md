# MWC22

Este es un proyecto para participar en la fase clasificatoria del  Hacketon del mobile world congress de 2022.

## Background

El objetivo será crear una app CLI que permita a l@s developers acceder a la información del MWC y del resto de developers y profesionales tech que vayan a asistir al evento.

Los objetivos son:

✅ Task 1 → Crear un modelo de developer que contenga la siguiente información: Nombre, Correo, Categoría ( Front, Back, Mobile, Data), Teléfono, Días a asistir al mobile ( 28 Feb, 1 -3 Marzo)

✅ Task 2 → Insertar los datos del json en una base de datos 

✅ Task 3 → Generar un comando de CLI para que haga display de la información del MWC (Días que estará disponible)

✅ Task 4 → Generar un comando de CLI que haga display de la lista de developers.

     Se ha implementado el display de la lista completa asi como 3 filtros más por si se quiere filtrar por categoria,fecha y nombre.

       ✅Lista completa de developers
        
       ✅Lista filtrada por la categoria que se desee
        
       ✅Lista filtrada por la fecha que se desee
        
       ✅Lista filtrada por el nombre que se desee

✅ Task 5 → Generar un comando de CLI que permita añadir un nuevo developer y actualice la base de datos

## Installation

### Los requisitos para poner en marcha este proyecto son:

  - Tener JavaSE-16  En el caso de no tenerlo instalado podemos instalarlo pulsando el siguiente link: [JavaSE-16](https://www.oracle.com/java/technologies/javase/jdk16-archive-downloads.html)

  - Tener instalado el driver de JDBC. En el caso de no tenerlo instalado podemos instalarlo pulsando el siguiente link: [JDBC](https://docs.microsoft.com/en-us/sql/connect/jdbc/download-microsoft-jdbc-driver-for-sql-server?view=sql-server-ver15)

  - Tener instalado MySql En el caso de no tenerlo instalado podemos instalarlo pulsando el siguiente link: [MySql](https://dev.mysql.com/). Y como en cualquier otra instalación siguiente>siguiente… Seleccionamos la configuración por defecto y escribimos un user y una contraseña (opcional).

  - Crear la Base de Datos para conectarse. Esto lo hacemos pegando este codigo en MySql
      ```
      create database mwc;
      use mwc;

      CREATE TABLE `developer` (
        `id` int(11) NOT NULL AUTO_INCREMENT,
        `category` int(11), 
        `date` int(11), 
        `email` varchar(255), 
        `name` varchar(255), 
        `phone` varchar(255),
        PRIMARY KEY (`id`)
      )
      ```

 ### Puesta en marcha
  
    Poner en marcha la base de datos MySql donde previamente hemos creado la BBDD mwc con los siguientes valores.
    
      
         usuario = "root";

         contraseña = "";
       
    
      Si Java está en el path, puedes navegar hasta el directorio donde exportaste el fichero en una consola y escribir:

        
        java -jar MWC22.jar
      
        
  ## Roadmap and visuals
  
     Se han añadido 2 archivos json 
     
     data.jason con toda lainformacion del json del enlace que se hafacilitado
     
     test.json un json en el que estan los minimos registros que debe tener la base de datos para realizar el testing
     
  ## Contact info
  
  [Linkedin Isabel Domenech](https://www.linkedin.com/in/isabel-domenech-de-mena-157103124/)
  
  ## License 

  [MIT](https://opensource.org/licenses/MIT)
  
