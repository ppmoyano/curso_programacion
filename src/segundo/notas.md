# Segunda parte

## Arrays
Un array -*en español arreglo*- es una especie de *"cajon"* donde podemos guardar
muchos elementos del mismo tipo.

Por ejemplo, un array donde guardamos muchos elementos del tipo int:

```
1) int[] variosNumeros = new int[5]; // Aqui creamos un array que puede tener dentro 5 elementos del tipo int
2) String[] paises = {"Argentina","Chile","Brasil","Ecuador"}; //Aqui creamos un array del stipo String y ya lo cargamos
```
Para usar arrays, tenemos que declarar el tamaño en un principio, o cargarlo desde el principio. 

Cada  elemento del array tiene una posicion. Que va desde el 0 hasta el ultimo elemento. 
Usando el segundo ejemplo seria:
```
paises.get(0); // esto devuelve Argentina
paises.get(1); // esto devuelve Chile
paises.get(2); // esto devuelve Brasil
paises.get(3); // esto devuelve Ecuador
paises.get(4); // esto devuelve una exception ArrayOutOfBonus. o algo asi 
```
Un aray puede tener varias dimensiones, similar a una planilla de excel.
por ejemplo:
```
int[][] notasPorMateria = new[5][2]; //tengo 5 materias y cada materia tiene dos notas
```

Cuando queremos realizar una tarea repetidas veces tenemos distintos loops:
## LOOP FOR 
```
for (desde; mientras; paso) {
  ... codigo
}

for (int veces = 0; veces <= 5; veces++) { //veces = veces +1;
  System.out.println(veces);
}

```
For lo utilizamos cuando queremos realizar algo (*una accion*) y sabemos cuantas veces queremos realizarla.
En el ejemplo , se va a imprimir los numeros: 0, 1, 2, 3, 4 y 5. Usando solo 3 lineas de codigo.

## DO WHILE
Este loop es para cuando queremos hacer algo al menos una vez, pero no sabemos cuantas veces queremos que se haga
do - hacer-. while - hasta.

```
do{
hagamos esto;
}while(hasta que se cumpla esto);

por ejemplo:
int opcion;
do {
System.out.println("desea continuar?1-si 2-no");
opcion = teclado.nextInt();
}while(opcion!=2);
```

## METODOS

Los metodos son fragmentos de codigos que se llaman cuando el metodo es invocado.
Pueden ser metodos que devuelvan un objeto o un valor. O pueden ser metodos que no devuelvan nada.
Pueden recibir informacion.

```
VISIBILIDAD DEVOLUCION NOMBREDEMETODO(PARAMETROS) {
codigo...
}

public void mostrarMenu() {
System.out.println("BIENVENIDO");
System.out.println("1 - Extraer Dinero");
System.out.println("2 - Ingresar Dinero");
System.out.println("3 - Salir");
}

public int suma(int a, int b) {
return a+b; //return DEVOLVER 
}

```