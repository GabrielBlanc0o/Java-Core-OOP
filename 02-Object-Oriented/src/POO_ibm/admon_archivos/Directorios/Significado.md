# Manejando directorios en Java

Podemos tomar de ejemplo un mueble con muchos folders desorganizados que pueden tener nombres de archivos y otros folders, gracias a los directorios podemos almacenar archivos y folders , y organizar asi los datos y tener una estructura facil de usar.

Por ejemplo las **APIs ** , Application Programming Interface , ayudan a los usuarios a crear, abrir, elminar directorios, y los directorios nos ayudan a organizar archivos, y los directorios nos ayudan a organizar archivos, haciendo que el acceso a los archivos sea mas facil de acceder, tambien asegura que las aplicaciones puedan sostener grandes cnatidades de datos sin confusion.

## Como se crean los Directorios en Java?

EJemplo en codigo , en el archivo CreateDirectory.java

creamos una variable de tipo texto que tiene la ruta del directorio a interacturar

luego instanciamos la clase file creando un nuevo objeto con la variable anterior

si no existe q lo cree con una variable boolean de estado, si esa variable  ya es true q imprima q ya se creo , si no q ocurrio un error, fuera del if anidado, si ya existe q imprima q ya existe.

## Como listar el contenido de un Directorio?

creamos la variable string igual que arriba para asignar que directorio vamos a interactuar, luego


un objeto nuevo de la clase File, para asignarle un punto para tomarlo de referencia a ese directorio,

creamos un array , junto al punto de referencia del objeto creado de la clase File, con el metodo .list()

si el array no esta vacio , con un for-each imprimimos todo uno por uno de lo que hay dentro.

el metodo list(), nos ayuda junto al arreglo a meter ahi todo el contenido del directorio.
