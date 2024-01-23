# CRUD-Java-JPA-Peluqueria-Canina
Proyecto CRUD con IGU haciendo uso de Java JPA, Maven, EclipseLink y MySQL.

# Contexto del Proyecto
Una peluquería canina necesita de un formulario para almacenar los datos de cada una de sus mascotas clientes. 

Para ello, solicita el desarrollo de una aplicación que sea capaz de registrar los siguientes datos de cada una de ellas y sus dueños:  

 - Mascota: numero de cliente, nombre, raza, color, alergico, atencion especial, observaciones.
 - Dueño: id, nombre, celular.

Para poder registrar de manera sencilla y que sea atractiva para el usuario, la duenia de la peluquería canina solicita una interfaz grafica.

Como los datos deben permanecer en el tiempo y a futuro los empleados de la peluquería van a poder acceder a ellos, se requiere que cada uno de los registros sean almacenados en una base de datos. 

A partir de éste relevamiento de requerimientos: 

 - Realizar el desarrollo de una aplicación de escritorio que sea capaz de registrar, en una base  de datos, los datos tanto de mascotas como dueños que se ingresen desde una interfaz gráfica de usuario. 
 - Los datos registrados deben poder editarse y eliminarse de forma sencilla por parte del usuario.
 - Para este desarrollo tener en cuenta los conceptos del MODELO DE CAPAS.

# Aplicación Desarrollada

> Al iniciar la aplicacion se muestra la siguiente pantalla de inicio:

![principal](https://github.com/diegoceballosdev/CRUD-Java-JPA-Peluqueria-Canina/assets/122060010/62168689-de97-4dec-9efe-8a16781589d5)

> Para realizar la carga de un registro a la base de datos, se debe seleccionar la opcion "Cargar Datos", la cual llevará a la siguiente ventana:

![carga](https://github.com/diegoceballosdev/CRUD-Java-JPA-Peluqueria-Canina/assets/122060010/32e23065-d262-41f4-9bca-b5c22e13be3e)

> Aqui se puedrán llenar los campos con los datos corespondientes y se tiene la opcion de guardar estos datos, limpiar los campos de texto o volver a la pantalla anterior.

> Ahora, volviendo a la pantalla de inicio, al seleccionar la opcion "Ver Datos" se muestra la siguiente ventana:

![visualizacion](https://github.com/diegoceballosdev/CRUD-Java-JPA-Peluqueria-Canina/assets/122060010/00214ab7-5753-4214-8f4b-7716b7ade652)

> En esta ventana puedes visualizar la informacion de cada registro de la base de datos, y tendras la opcion de regresar a la pantalla inicial, "Eliminar" un registro seleccionado o "Editarlo".

> En caso de seleccionar la opcion de "Editar" se abrira la siguiente ventana:

![edicion](https://github.com/diegoceballosdev/CRUD-Java-JPA-Peluqueria-Canina/assets/122060010/a8f82adc-1460-40c8-86f4-316201351164)

> Aqui podras nuevamente modificar los datos que desees actualizar o volver a la ventana anterior, ademas de tener la opcion de limpiar  campos de texto y dejarlos vacios.

> Por ultimo, si en la ventana inicial seleccionas la opcion "Salir", la ventana se cerrara y aplicacion finalizara por completo.

He tratado de resumir de forma simple y superficial los apartados de la apliación, sin embargo pueden observar los detalles en el propio codigo. Invito a todos aquellos que estan en su proceso de aprendizaje a implementar este CRUD, clonar este repositorio, leer y jugar con el código. 

Gracias por leer esta pequeña contribución!!!
