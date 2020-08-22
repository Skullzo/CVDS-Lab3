# CVDS3
Laboratorio 3 de la materia CVDS

## Crear un Proyecto con Maven

Se creo un proyecto con las especificaciones que daba el laboratorio

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/CrearProyectoMaven.png">

## Actualizar y crear dependencias en el proyecto+

Buscamos en internet el repositorio central de Maven
Con este buscamos el artefacto JUnit y buscamos la versión que mejor le acomodaba a la version 8 de Java. Con esta información actualizamos el pom.xml en las siguientes partes

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/ActuYCrearDependencias.png">

## Compilar y Ejecutar

El comando que utilizamos para compilar y ejecutar fue el siguiente

```
mvn package
```
<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/CompilarYEjecutarPruebas.png">

Con el comando package se creo el AppTest

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/JavaTest.png">

Y la clase para utilizar las pruebas unitarias dentro del test fue el siguiente

```
mvn test
```

## Ejercicio Registraduria

Se va a crear un proyecto base para un requerimiento de la registraduría en el cual se registrarán personas con intención de votar paras las próximas elecciones y se generarán los certificados electorales de aquellas personas cuyo voto sea válido.

Como dice el enunciado, creamos el esqueleto de las clases, donde teniamos dos enumeraciones, El genero que podia ser 
1. **MALE**
2. **FEMALE**  
3. **UNIDENTIFIED**

Y el resultado del registro prodrian ser
1. **VALID**
2. **INVALID_AGE**
3. **DUPLICATED**
4. **DEAD**
5. **UNDERAGE**

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/EsqueletoAplicacionClases.png">

También creamos el esqueleto de la aplicacion en pruebas

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/EsqueletoAplicacionPruebas.png">

## Ejecutar Pruebas

Ejecutamos las pruebas con los dos comandos 

```
mvn test; mvn package
```

No encontramos diferencia, pero después de la explicación del profesor de la materia, Julian Velasco, entendimos que la diferencia es que el comando mvn test es más enfocado a las pruebas que se tengan, el package compila, pero no tiene en cuenta casi la participación de las pruebas

## Finalizar Ejercicio

Dentro del grupo sacamos 5 casos de equivalencia, donde ninguna de las condiciones se sobrepusiera, por que, si esto sucediera, no se obtendria el resultado que se espera

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/CasosDeEquivalenciaExcel.png">

Completamos la implementación del metodo registerVote y quedo de la siguiente manera

<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/MetodoRegisterVote.png">

Y según el enunciado  hicimos pruebas para cada uno de los casos

### Caso1
<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/Test1.png">

### Caso2
<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/Test2.png">

### Caso3
<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/Test3.png">

### Caso4
<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/Test4.png">

### Caso5
<img  src="https://github.com/JuanMunozD/CVDSLab02/blob/master/img/Test5.png">

Dando por terminado esta parte del laboratorio

## Ejercicio Descuento de Tarifas

## Realizar Diseño de Pruebas

Según las indicaciones del laboratorio resolvimos las preguntas pertinentes

### Pregunta 1
1. De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería  arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.

- 