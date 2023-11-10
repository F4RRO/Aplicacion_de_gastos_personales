# Aplicacion_de_gastos_personales
Introducción:
En esta práctica se evaluarán vuestros conocimientos en programación 
orientada a objetos. Leed bien el enunciado ya que debéis crear las clases 
y las funciones con los nombres que se indican en este documento.
La práctica consiste en crear una aplicación de gestión de gastos 
personales. A través de un menú interactivo por la consola, introducir 
ingresos y gastos para así poder llevar un pequeño control de nuestra 
economía.
El siguiente diagrama de clases representa la estructura que debéis 
realizar (OBLIGATORIO SEGUIR LA ESPECIFICACIONES):

![image](https://github.com/F4RRO/Aplicacion_de_gastos_personales/assets/73024019/c2a19ad8-8221-4388-a4bc-adcfc8166fb5)

Importante: Recordad que es obligatorio que todas las funciones y 
métodos tengan el mismo nombre y parámetros que se indican en el 
diagrama de clases anterior. Estas clases no se pueden añadir ni más 
métodos ni más atributos, ya que no se puede modificar el diagrama de 
clases.

Clase Usuario
Esta clase será la encargada de gestionar un único usuario. Éste se 
creará al inicio del programa leyendo datos por el teclado.
Ejemplo de datos correctos:
Nombre: Alberto
Edad: 23
El DNI deberá tener un formato concreto, está comprobación la 
realizará en la función setter, la cual devolverá un booleano conforme 
es correcto o no. Si el DNI es correcto quedará asignado. Es obligatorio 
utilizar una expresión regular para la comprobación del DNI.
Formato correcto:
✓ Los primeros 8 caracteres solo podrán ser numéricos.
✓ El ultimo caracteres deberá ser una letra MINÚSCULA entre 
la a y la z.
✓ El guion entre los números y la letra es opcional, 
admitiendo ambas posibilidades.
✓ DNI: 78844112m
✓ DNI: 78844112-m
Tendrá una función toString con la que devolver su contenido.
En la clase Usuario no está permitido el uso de ningún import.

Clases Gasto e Ingreso:
Las clases Gasto e Ingreso heredarán de Dinero y tendrán un único 
constructor en el que se inicializarán los valores recibidos por 
parámetros.
Además, tendrán una función toString con la que devolver su contenido.
En la clase Gasto e Ingreso no está permitido el uso de ningún import.

Clase Cuenta:
Clase donde se gestionarán todos los movimientos de dinero tanto 
ingresos como gastos.
Inicialmente (en el constructor) se recibirá el usuario que es dueño de la 
cuenta y el saldo inicial será de 0€.
Al añadir un nuevo ingreso se sumará al saldo de la cuenta teniendo en 
esta variable nuestro dinero real, la función devolverá el saldo de la 
cuenta.
Al añadir un nuevo gasto se debe comprobar si se dispone de saldo 
suficiente, en caso contrario se deberá lanzar una nueva excepción del 
tipo GastoException(), pero el programa no debe finalizar. Si se dispone 
de saldo suficiente se restará el importe del gasto y se devolverá el saldo 
de la cuenta.
Las funciones getGastos y getIngresos nos devolverán todos los 
movimientos de un tipo u otro.
La clase Cuenta tendrá una función toString con la que devolverá el usuario y 
su saldo.
En la clase Cuenta, solo está permitido importar la clase List; y la clase 
que hayamos elegido para esa List. No está permitido el uso de ningún 
otro import.

Main:
La clase Main será la que se ejecute al iniciar el programa, se valorará la 
organización y comprensibilidad del código; tendrá seguirá unos pasos 
definidos:
1. Creación del usuario y sus datos, el DNI no se establecerá hasta que se 
introduzca uno correcto, el orden de los datos será:
a. Nombre
b. Edad
c. DNI
2. Creación de la cuenta
3. Visualización del menú con las instrucciones tal y como se muestra en 
la siguiente figura (NO se permite notación “”” ”””):

![image](https://github.com/F4RRO/Aplicacion_de_gastos_personales/assets/73024019/50f64f19-e96b-49be-acc1-c1e8c8ba1abc)

4. Cada acción realizará una operación donde se deberán de solicitar los 
datos si los necesitase.
5. Los Valores Double con coma en lugar de punto para parte decimal; 
siguiendo la notación europea: 1000,35€ (para mostrarlos por consola). 
No es posible hacer import, en ninguna clase.
6. Al finalizar la aplicación se deberá mostrar el mensaje (importante que 
sea igual al que se indica):
Fin del programa.
Gracias por utilizar la aplicación de M03B en el curso 1s2324.
✓ En la clase Main, solo se puede importar la clase Scanner; no está 
permitido el uso de ningún otro import.
✓ En la clase Main, se recomienda generar métodos propios, para 
mejorar la comprensibilidad y la organización del código; pero NO
está permitido crear métodos que ya existan en el diagrama de 
clases; lo que conllevaría una penalización.

