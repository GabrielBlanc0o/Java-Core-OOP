# ByteStream en Java

Estos se encargan de leer y escribir datos como videos, imagenes y texto

## Sus clases

* InputStream = Es una clase abstracta, sirve como una super clase para todas las calases que leen los bytes de datos.
* OutputStream = Tambien es una clase abstracta que representa la salida de Bytes , tambien sirve como superclases para todas las clases que necesiten escribir bytes de datos

## Sus SubClases

* FileInputStream = Lee bytes de una archivo , ejemplo ReadBytes.java
* FileOutputStream = Escribe Bytes a un archivo
* BufferedInputStream y BufferedOutputStream = Hacen lo mismo de las clases pero optimizado
