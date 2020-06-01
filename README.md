
# Evaluación Corta 2
----

## Problema a resolver

Los fotografos de la vieja escuela han tenido que mejorar sus tecnicas para la captura de esas imagenes que pasan a la historia. Los modelos de cámaras mas antiguos ofrecían la funcionalidad básica para capturar imagen. Hoy en día las cámaras de fabricantes como Cannon y Sony añaden nuevas funcionalidades que permiten configurar la saturación de imagen, contraste y brillo antes de capturar la imagen. Un fotografo de la vieja escuela podria decir que: “las cámaras actuales hacen lo mismo que las viejas solo que pueden ser ajustadas antes de tomar la foto”. Esta última aseveración es delicada debe tenerse en cuenta que cada fabricante es independiente de realizar los ajustes de acuerdo al hardware de cada equipo, sin embargo capturar la imagen es identico a como lo realizan las camaras de vieja data. Tomando en consideración esta situación plantear a través de un diagrama de clases indicando cuáles patrones de diseño pudieran ser implementados para solventar esta situación. Considere incorporar un diagrama de secuencias que muestre la interacción entre los objetos que formen parte de la solución propuesta

## Diagrama de Clases

<p align="center">
  <a target="blank"><img src="./src/documentation_resources/java.jpg" width="320" alt="Diagrama de Clases" /></a>
</p>

## Patrones Utilizados

### Decorador (Patrón de estructura)

Se eligio usar el patrón decorador, debido a que se menciona "capturar la imagen es identico a como lo realizan las camaras de vieja data", por lo que la función de tomar la foto siempre sera la misma, pero dependiendo del fabricante se tomaran ciertos ajustes, es decir, el comportamiento de tomar la foto sera decorado por los ajustes de cada fabricante. 

Aquí, podemos identificar los siguientes elementos en la implementación de un patrón decorador:

* Componente Concreto: **OldCamera**
* Componente Decorador: **CameraDecorator**
* Componente Genérico: **ICamara**

### Fabrica (Patrón de Creación)



## Diagrama de Secuencia

<p align="center">
  <a target="blank"><img src="./src/documentation_resources/java.jpg" width="320" alt="Diagrama de Secuencia" /></a>
</p>

## Principios SOLID 

### S (Single Responsibility Principle)

El principio de responsabilidad unica se cumple, ya que cada clase solo tiene una responsabilidad y la cumple bien.

### O (Open/Closed Principle)

El principio abierto/cerrado se cumple a medias. En una primera parte se cumple, ya que se usan interfaces y abstracciones en el patrón decorador, por lo que si en un momento se desean añadir otros decoradores o nuevos tipos de camara, solo seria necesario crear estas clases. Sin embargo, al añadirlas habria que realizar unas modificaciones minimas en la clase Fabrica.

### L (Liskov Substitution Principle)

El principio de substitución de Liskow se cumple, ya que se usan e implementan abtracciones, lo cual permitira que si en algún momento se crean nuevas categorias de camaras y nuevas funcionalidades, el camarogrado no deberia por quue preocuparse y podria usar su camara tranquilamente, aún así, si esta es cambiada por otro mas lujosa. Esto se debe a que en todo caso de que exista una expansión del sistema, las subclases no tendrían mas restricciones que las puerclases.

### I (Interface Segregation Principle)

El principio de segregación de interfaces se cumple, ya que la misma sencillez del sistema permite que existan pocas funcionalidades y por lo tanto interfaces muy ligeras.

### D (Dependency Inversion Principle)

El principio de inversión de dependencias se cumple, ya que los elementos de alto nivel dependen de interfaces al igual que los elementos de bajo nivel. Esto se puede observar en el diagrama de clases en donde nunca hay una relación directa entre dos elementos concretos, siempre hay una interfaz/abstracción de por medio.

## Lenguaje Utilizado

<p align="center">
  <a href="https://www.java.com/es/" target="blank"><img src="./src/documentation_resources/java.jpg" width="320" alt="Java Logo" /></a>
</p>

## Autores

- Anthony Rodriguez - [thonygrz](https://github.com/thonygrz)
- Luis Fuentes - [LuisRFuentes](https://github.com/LuisRFuentes)
- Gabriel Terán - [gtwenty4](https://github.com/gtwenty4)


