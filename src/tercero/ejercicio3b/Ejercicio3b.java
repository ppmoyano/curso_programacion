package tercero.ejercicio3b;
/*
Realice un programa que maneje los clientes de un banco.
El banco tiene dos tipos de clientes Standard y clientes Vip
Al inicio del programa se encuentra un menu (ver ejemplo de ejecuciones) donde podemos Registrar un nuevo cliente - Ingresar a Cliente - o Salir
Los clientes se registran Nombre Apellido DNI y Tipo de Cliente y CuentaCorriente,
si es cliente VIP Tambien se registra el lugar de trabajo y ademas una CuentaEnDolares.
Los clientes vip pueden comprar dolares desde su cuenta corriente a cuentaEnDolares con un valor de 100$ un 1$
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3b {
    static List<Clientes> clientes = new ArrayList<>();

    public static void main(String[] args) {
        mostrarMenuBienvenida();
    }

    private static void mostrarMenuBienvenida() {
        Scanner teclado = new Scanner(System.in);

        int opcion = menuBienvenida();
        switch (opcion) {
            case 1:
                cargarClientes();
            case 2:
                ingresarAOpcionesDeClientes();
            case 3:
                int clienteBuscado = bucarPorDNI();
                clientes.get(clienteBuscado).mostrarClientes();
                mostrarMenuBienvenida();
            case 0:
                System.out.println("BANCO CAIXA LE DESEA UN BUEN DIA." +
                        "  FIN DE EJECUCION");
        }

    }

    private static int bucarPorDNI() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese DNI del Cliente");
        int dni = teclado.nextInt();
        int clienteBuscado = 0;
        for (int i = 0; i < clientes.size(); i++) {
            if (dni == clientes.get(i).getDni()) {
                i = clienteBuscado;
            }
        }

        return clienteBuscado;
    }

    private static void ingresarAOpcionesDeClientes() {
        Scanner teclado = new Scanner(System.in);
        int dni = 0;
        System.out.println("Ingrese DNI del Cliente");
        dni = teclado.nextInt();
        for (int i = 0; i < clientes.size(); i++) {
            if (dni == clientes.get(i).getDni()) {
                System.out.println("BIENVENIDO  " + clientes.get(i).getNombre());
                System.out.println("QUE OPERACION DESEA REALIZAR? : ");
                int opcionAcciones;
                int clienteBuscado = i;
                do {
                    opcionAcciones = clientes.get(clienteBuscado).menuAcciones();
                    switch (opcionAcciones) {
                        case 1:
                            clientes.get(i).setCuentaCorriente(clientes.get(i).getCuentaCorriente() + ingresarDinero());
                            clientes.get(clienteBuscado).mostrarClientes();

                        case 2:
                            clientes.get(i).setCuentaCorriente(clientes.get(i).getCuentaCorriente() - retirarDinero());
                            clientes.get(clienteBuscado).mostrarClientes();

                        case 3:
                            clientes.get(clienteBuscado).mostrarClientes();

                        case 4:
                            int montoComprado = comprarDolares();
                            if (montoComprado * 100 <= clientes.get(i).cuentaCorriente) {
                                ((ClienteVIP) clientes.get(i)).setCuentaDolares(
                                        ((ClienteVIP) clientes.get(i)).getCuentaDolares() + montoComprado);
                                clientes.get(i).setCuentaCorriente(clientes.get(i).getCuentaCorriente() -
                                        (montoComprado * 100));
                                System.out.println("COMPRA REALIZADA");
                            } else {
                                System.out.println("SALDO INSUFICIENTE");
                            }
                            clientes.get(clienteBuscado).mostrarClientes();

                        case 0:
                            mostrarMenuBienvenida();

                    }
                    System.out.println("DESEA REALIZAR OTRA OPERACION? : ");
                } while (opcionAcciones != 0);
            }
        }
    }

    private static int comprarDolares() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dolares que desea comprar (100 pesos = 1 dolar):  ");
        int montoComprado = teclado.nextInt();
        return montoComprado;

    }

    private static int retirarDinero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto q desea retirar : ");
        int retiraMonto = teclado.nextInt();
        System.out.println("MONTO ACTUALIZADO");

        return retiraMonto;
    }

    private static int ingresarDinero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el monto q desea ingresar : ");
        int nuevoMonto = teclado.nextInt();
        System.out.println("MONTO ACTUALIZADO");

        return nuevoMonto;
    }

    private static int menuBienvenida() {
        Scanner teclado = new Scanner(System.in);

        int opcion = 0;
        System.out.println("BIENVENIDO AL BANCO CAIXA BANK, QUE OPERACIÓN DESEA REALIZAR: " +
                "1- REGISTRAR NUEVO CLIENTE   2- INGRESAR A OPCIONES DE CLIENTE  3- MOSTRAR CLIENTE  0- SALIR");
        opcion = teclado.nextInt();

        return opcion;
    }

    private static void cargarClientes() {
        Clientes datosCliente = null;
        System.out.println("Seleccione tipo de datosCliente: 1-Standar   2-VIP");
        Scanner teclado = new Scanner(System.in);
        int respuesta = teclado.nextInt();
        if (respuesta == 1) {
            datosCliente = new Clientes();
        } else {
            datosCliente = new ClienteVIP();
        }
        datosCliente.cargar();
        System.out.println("CLIENTE REGISTRADO");
        datosCliente.mostrarClientes();
        clientes.add(datosCliente);
        mostrarMenuBienvenida();
    }
}



/*
EJEMPLO DE EJECUCION 1:
BIENVENIDO AL BANCO CadaUnoElijaUnNombre, QUE OPERACION DESEA REALIZAR:
1 - REGISTRAR NUEVO CLIENTE 2 - INGRESAR A CLIENTE 3 - MOSTRAR CLIENTE 0 - SALIR
1
EL CLIENTE SERA STANDARD O VIP? 1 - STANDARD 2 - VIP
1
INGRESE EL NOMBRE:
Raul
INGRESE EL APELLIDO:
Rodriguez
INGRESE EL DNI:
31321322
CLIENTE REGISTRADO
Raul Rodriguez - Standard - DNI: 31321322 - Cuenta Corriente: $0
BIENVENIDO AL BANCO CadaUnoElijaUnNombre, QUE OPERACION DESEA REALIZAR:
1 - REGISTRAR NUEVO CLIENTE 2 - INGRESAR A CLIENTE 3 - MOSTRAR CLIENTE 0 - SALIR
2
INGRESE EL DNI DEL CLIENTE:
31321322
BIENVENIDO RAUL, QUE OPERACION DESEA REALIZAR?
1- Ingresar Dinero 2- Retirar Dinero 3- Consultar Montons 0 - Volver
1
INGRESE EL MONTO QUE DESEA INGRESAR:
50000
MONTO ACTUALIZADO
Raul Rodriguez - Standard - DNI: 31321322 - Cuenta Corriente: $50000
DESEA REALIZAR ALGUNA OTRA OPERACION:
1- Ingresar Dinero 2- Retirar Dinero 3- Consultar Montons 0 - Volver
2
INGRESE MONTO A RETIRAR:
700
MONTO ACTUALIZADO
Raul Rodriguez - Standard - DNI: 31321322 - Cuenta Corriente: $49300
DESEA REALIZAR ALGUNA OTRA OPERACION:
1- Ingresar Dinero 2- Retirar Dinero 3- Consultar Montons 0 - Volver
0
BIENVENIDO AL BANCO CadaUnoElijaUnNombre, QUE OPERACION DESEA REALIZAR:
1 - REGISTRAR NUEVO CLIENTE 2 - INGRESAR A CLIENTE 3 - MOSTRAR CLIENTE 0 - SALIR
1
EL CLIENTE SERA STANDARD O VIP? 1 - STANDARD 2 - VIP
2
INGRESE EL NOMBRE:
Sandra
INGRESE EL APELLIDO:
Angelini
INGRESE EL DNI:
31111111
INGRESE SU LUGAR DE TRABAJO:
Fiat
CLIENTE REGISTRADO
Sandra Angelini - VIP - DNI: 31111111 - Cuenta Corriente: $0 Cuenta en dolares: $0
BIENVENIDO AL BANCO CadaUnoElijaUnNombre, QUE OPERACION DESEA REALIZAR:
1 - REGISTRAR NUEVO CLIENTE 2 - INGRESAR A CLIENTE 3 - MOSTRAR CLIENTE 0 - SALIR
2
INGRESE EL DNI DEL CLIENTE:
31111111
BIENVENIDO SANDRA, QUE OPERACION DESEA REALIZAR?
1- Ingresar Dinero 2- Retirar Dinero 3- Consultar Montons 4- COMPRAR DOLARES 0 - Volver
1
INGRESE EL MONTO QUE DESEA INGRESAR:
50000
MONTO ACTUALIZADO
Sandra Angelini - VIP - DNI: 31111111 - Cuenta Corriente: $50000 Cuenta en dolares: $0
DESEA REALIZAR ALGUNA OTRA OPERACION:
1- Ingresar Dinero 2- Retirar Dinero 3- Consultar Montons 4- COMPRAR DOLARES 0 - Volver
2
INGRESE MONTO A RETIRAR:
1000
MONTO ACTUALIZADO
Sandra Angelini - VIP - DNI: 31111111 - Cuenta Corriente: $49000 Cuenta en dolares: $0
DESEA REALIZAR ALGUNA OTRA OPERACION:
1- Ingresar Dinero 2- Retirar Dinero 3- Consultar Montons 4- COMPRAR DOLARES 0 - Volver
4
CUANTOS DOLARES DESEA COMPRAR?
500
MONTO EN CUENTA CORRIENTE INSUFICIENTE
DESEA REALIZAR ALGUNA OTRA OPERACION:
1- Ingresar Dinero 2- Retirar Dinero 3- Consultar Montons 4- COMPRAR DOLARES 0 - Volver
4
CUANTOS DOLARES DESEA COMPRAR?
100
COMPRA REALIZADA
Sandra Angelini - VIP - DNI: 31111111 - Cuenta Corriente: $39000 Cuenta en dolares: $100
DESEA REALIZAR ALGUNA OTRA OPERACION:
1- Ingresar Dinero 2- Retirar Dinero 3- Consultar Montons 4- COMPRAR DOLARES 0 - Volver
0
BIENVENIDO AL BANCO CadaUnoElijaUnNombre, QUE OPERACION DESEA REALIZAR:
1 - REGISTRAR NUEVO CLIENTE 2 - INGRESAR A CLIENTE 3 - MOSTRAR CLIENTE 0 - SALIR
3
INGRESE DNI DE CLIENTE
31321322
Raul Rodriguez - Standard - DNI: 31321322 - Cuenta Corriente: $49300
BIENVENIDO AL BANCO CadaUnoElijaUnNombre, QUE OPERACION DESEA REALIZAR:
1 - REGISTRAR NUEVO CLIENTE 2 - INGRESAR A CLIENTE 3 - MOSTRAR CLIENTE 0 - SALIR
0
BANCO CadaUnoElijaUnNombe LE DESEA UN BUEN DIA.
FIN DE EJECUCION
 */