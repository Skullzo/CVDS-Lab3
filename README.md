# CVDS3
Laboratorio 3 de la materia CVDS

## Crear un Proyecto con Maven

Se creó un proyecto con las especificaciones que daba el laboratorio

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/CrearProyectoMaven.PNG">

## Actualizar y crear dependencias en el proyecto

Buscamos en internet el repositorio central de Maven
Con este buscamos el artefacto JUnit y buscamos la versión que mejor le acomodaba a la version 8 de Java. Con esta información actualizamos el pom.xml en las siguientes partes

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/ActuYCrearDependencias.PNG">

## Compilar y Ejecutar

El comando que utilizamos para compilar y ejecutar fue el siguiente

```
mvn package
```
<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/CompilarYEjecutarPruebas.PNG">

Con el comando package se creó el AppTest

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/JavaTest.PNG">

Y la clase para utilizar las pruebas unitarias dentro de la prueba fue el siguiente

```
mvn test
```

## Ejercicio Registraduría

Se va a crear un proyecto base para un requerimiento de la registraduría en el cual se registrarán personas con intención de votar paras las próximas elecciones y se generarán los certificados electorales de aquellas personas cuyo voto sea válido.

Como dice el enunciado, creamos el esqueleto de las clases, donde teníamos dos enumeraciones, El género que podía ser 
1. **MALE**
2. **FEMALE**  
3. **UNIDENTIFIED**

Y el resultado del registro podrían ser
1. **VALID**
2. **INVALID_AGE**
3. **DUPLICATED**
4. **DEAD**
5. **UNDERAGE**

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/EsqueletoAplicacionClases.PNG">

También creamos el esqueleto de la aplicación en pruebas

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/EsqueletoAplicacionPruebas.PNG">

## Ejecutar Pruebas

Ejecutamos las pruebas con los dos comandos 

```
mvn test; mvn package
```

No encontramos diferencia, pero después de la explicación del profesor de la materia, Julián Velasco, entendimos que la diferencia es que el comando mvn test es más enfocado a las pruebas que se tengan, el package compila, pero no tiene en cuenta casi la participación de las pruebas

## Finalizar Ejercicio

Dentro del grupo sacamos 5 casos de equivalencia, donde ninguna de las condiciones se sobrepusiera, porque, si esto sucediera, no se obtendría el resultado que se espera

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/CasosDeEquivalenciaExcel.PNG">

Completamos la implementación del método registerVote y quedo de la siguiente manera

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/MetodoRegisterVote.PNG">

Y según el enunciado hicimos pruebas para cada uno de los casos

### Caso1
<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Test1.PNG">

### Caso2
<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Test2.PNG">

### Caso3
<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Test3.PNG">

### Caso4
<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Test4.PNG">

### Caso5
<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Test5.PNG">

Dando por terminado esta parte del laboratorio

## Ejercicio Descuento de Tarifas

## Realizar Diseño de Pruebas

Según las indicaciones del laboratorio resolvimos las preguntas pertinentes del pdf que se nos encomendó

### Pregunta 1
1. De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.

- <img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Excepciones.PNG">

2. En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una buena división del conjunto de datos de entrada de la función anterior:

- <img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Punto2.PNG">

3. Para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de entrada y resultados esperados.

- <img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Punto3.PNG">

4. A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o de frontera de estas.

- <img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Punto4.PNG">

5. Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos.

- <img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Punto5.PNG">

Al terminar de realizar la primera parte del Descuento de tarifas descargamos el archivo jar aerodescuentos y añadimos la dependencia a nuestro archivo pom.xml

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/DependenciaAero.PNG">

Creamos un archivo y realizamos las pruebas pertinentes para cumplir los casos que habíamos establecido

Primero establecimos las excepciones de nuestro programa

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Excepciones1.PNG">
<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/Excepciones2.PNG">

Y después un caso de prueba para cada uno de los 6 casos establecidos en el documento

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/TestAero.PNG">

Al utilizar el comando mvn package obtuvimos que todas las pruebas fueron correctas

<img  src="https://github.com/JuanMunozD/CVDS3/blob/master/img/TestFinal.PNG">
