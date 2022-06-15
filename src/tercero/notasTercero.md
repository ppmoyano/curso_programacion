# POO - Programacion Orientada a Objetos

## Objects
En un principio dijimos que tenemos dos tipos de variables: las primitivas y las referencia a un objeto.
Entonces todo lo que nos es una variable primitiva es un objeto. 

Cada objeto es la instancia de una clase. Por ejemplo cuando creamos un objeto del tipo String.
```
String palabra = new String();
```
Estamos creando un nuevo objeto del tipo String. Y cada objeto tiene sus propiedades y sus metodos, que los vemos dentro de la clase.

La manera mas facil de entenderlo es comparandolo con nuestra vida cotidiana.
Todo lo podemos "digitalizar" en objetos. Por ejemplo:
Un objeto perro, las propiedades que tiene son el nombre, la edad, el peso, la raza, el tamaño (solo para decir algunas). Y tambien tiene sus metodos: ladrar, cagar, olfatear, comer.


```
public class Perro{
    int edad;
    int peso;
    String raza;
    String nombre;
    int tamano;
    
    public void ladrar() {
    System.out.println("Guau");
    }
    
    public void cagar() {
    System.out.println("Cara de perro haciendo caca");
    peso = peso - 100;
    }
    
    public Perro() {}
    
    public Perro(String nombre) {
      this.nombre = nombre;
    }

}
```

cuando hacemos String palabra = new String(); estamos llamando al constructor.
Un construtor no es un metodo (aunque es muy parecido) es un constructor. Nos construye nuestro objeto.

Si no hacemos un constructor java nos crea un constructor por defecto (igual al constructor vacio del perro), pero una clase puede tener varios constructores
por ejemplo para perro tenemos un constructor que recibe por parametro un nombre, y a ese parametro se lo asigna al campo nombre de la instancia.

Si hacemos:

```
Perro miPrimerPerro = new Perro("firulais); nos crea un Objeto del tipo Perro que va a tener de nombre firulais 
```

Para acceder a las propiedas tenemos dos tipos de metodos SETTERS - para asignar un valor a la propiedad -  y GETTERS - para obtener el valor de la propiedad.
```
public void setNombre(String nombre) {
    this.nombre = nombre;  //como las dos variables se llaman igual hay que usar la palabra this para aclarar que pertenece a la clase
}

public String getNombre() {
 return nombre;
}
```
