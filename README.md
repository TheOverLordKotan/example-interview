# example-interview

### Preguntas no resultas
* Que es una interfaz funcional:
Algunos lenguajes utilizan valores de funciones o objetos de funciones para representar expresiones lambda, aunque no el popular Java™. En vez de eso, Java utiliza interfaces funcionales para representar tipos de expresiones de lambda. Puede parecer extraño al principio, pero, de hecho, es una forma eficiente de asegurar la compatibilidad con versiones anteriores de Java.
Es decir, interfaces que sólo contienen un método abstracto, por ejemplo:
Runnable
### Tipos 
Interfaces funcionales incorporadas Ejemplo *Function<T, R>, Predicate<T> y Consumer<T>*
Interfaces funcionales personalizadas Ejemplo *Anotar la interfaz con @FunctionalInterface, que es la convención de Java 8 para interfaces funcionales personalizadas*

* ¿Qué es un stream?:
Es una interfaz desde Java 8 usada para procesar datos de forma eficiente:
*Eficiente significa que se paraleliza el uso de las CPUs, sin problemas de concurrencia, porque los streams NO albergan datos y como regla se supone que no deberíamos usarlos para modificar datos*

* ¿Diferencia entre un git merge y un git rebase?:
rebase unifica las ramas dejando un arbol lineal
El rebase unifica las ramas perdiendo el historial de los commit y el merge no.
EL Comando rebase dejar perder el historial, monta los commit encima de la otra rama sin importar la cronología





### Case
Elaborar un servicio de tipo REST, que recibe comop parámetros  2 palabras y retorna un boolean dependiendo los siguientes ### stages:

* Las palabras deben  estar conformadas por  las mismas  letras y su longitud debe  ser la misma.

* Sensible a mayusulas minusculas

* El orden de los caracteres no es relevante.


E.G
### stage 0:

String: army
String: mary
Response: True

### stage 1:

String: Army
String: mary
Response: False

### stage 2:

String: Mary
String: lary
Response: False

### stage 3:

String: test
String: lary
Response: False

### stage 4:

String: testtest
String: mary
Response: False

### CRITERIOS DE EVALUACIÓN
* Implementación 100% del  ejercicio.
* Principios de diseño de software (SOLID).
* Dominio Spring Boot.
* Pruebas Unitarias
* Gitflow