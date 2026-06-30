## java.time Package

Listo entonces veamos.

Para el tiempo y temas relacionados a fechas usamos, java.time

* LocalDate: Date (año,mes,dia) sin la hora
* LocalTIme : Time (Hora,minutos,segundos) sin la fecha
* LocalDateTIme: Combina la fecha y el tiempo
* ZonedDateTime: Fecha y hora con la zona horaria

Como formateamos el patron de la fechapara q sea como queremos ?

veamoslo en el archivo DateFormattingExample.java

Veamos el flujo de un ejemplo en la vida real

Los pasos son los siguientes:

Obtener el input del usuario -> parsear el cumpleaños -> formatear el cumpleaños -> mostrar el resultado

Veamos su ejecucion en UserRegistration.java



Como funciona nuestro codigo?

Primero que todo importamos las librerias :

* time.LocalDate . time.format.DateTimeFormatter y Scanner

Instanciamos nuestra clase Scanner a crear un objeto como siempre

Luego una variable String que almacene el nombre

Luego otro String en variable q almacene la fecha de nacimiento del Usuario

Creamos un objeto de LocalDate q parseara la fecha de cumpleaños ingresada por el usuario con el metodo

.parse(cumpleañosUser)

Luego creamos un punto de referencia a la clase DateTimeFormatter q tendra el patron (EEEE , MMM dd, yyyy)

con el metodo .ofPattern(patronAqui)

luego juntamos las dos instancias de las clases en una sola variable String , con el string parseado y el metodo format (), el cual dentro va el patron q le vamos a exigir

y cerramos el scanner

Veamos las diferencia entre las clases de las fechas

La clase LocalDate es solo para fechas año mes dia

La Clase LocalTime solo es para horas minutos y segundos

La Clase DateTime es para fechas y horas osea las combina

La clase ZonedDateTime es lo mismo q la de arriba pero con zonas horarias distintas
