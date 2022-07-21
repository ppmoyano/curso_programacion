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
    public static void main(String args[]) {


        Scanner teclado = new Scanner(System.in);
        List <Cliente> clientes = new ArrayList<>();
        int i = 0;
        int opcion = 9;
        do {
            opcion = menuInicial();

            switch (opcion) {
                case 1:
                    clientes.add(registrarCliente(opcion));
                    break;
                case 2:
                    ingresarCliente(opcion, clientes);
                    break;
                    case 3:
                        break;
            }
        }
        while (opcion != 0);
    }

    private static void ingresarCliente(int opcion, List<Cliente>clientes) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        System.out.println("INGRESE EL DNI DEL CLIENTE:");
        int dniDelCliente = teclado.nextInt();
        boolean clienteEncontrado = false;
        //do { SACO EL DO PRQUE NO LO PUEDO FRENAR
        for (i = 0; i < clientes.size(); i++) {
            if (clientes.get(i) != null && clientes.get(i).getDni() == dniDelCliente) {
                System.out.println("BIENVENIDO " + clientes.get(i).getNombre() + " QUE OPERACION DESEA REALIZAR?");
                int opcionMenuCliente = menuCliente();
                accionesMenuCliente(opcionMenuCliente, clientes);
             //   clienteEncontrado = true;
            }
        }
        // }
        //      while (clienteEncontrado);
    }

    private static void accionesMenuCliente(int opcionMenuCliente, List<Cliente>clientes) {
        int i = 0;
        Scanner teclado = new Scanner(System.in);

        switch (opcionMenuCliente) {
            case 1:
                System.out.println("INGRESE EL MONTO QUE DESEA INGRESAR:");
                int ingresarDinero = teclado.nextInt();
                clientes.get(i).cc += ingresarDinero;
                System.out.println("MONTO ACTUALIZADO");
                break;
            case 2:
                System.out.println("INGRESE EL MONTO A RETIRAR:");
                int extraerDinero = teclado.nextInt();
                clientes.get(i).cc -= extraerDinero;
                System.out.println("MONTO ACTUALIZADO");
                break;
            case 3:
                System.out.println(clientes.get(i).cargaClienteInicial());
                break;
        }
    }

    private static Cliente registrarCliente(int opcion) {
        Scanner teclado = new Scanner(System.in);
        int vipONo = 0;
        int i = 0;
        Cliente cliente = new Cliente();

        switch (opcion) {
            case 1:
                System.out.println("EL CLIENTE SERA STANDARD O VIP? 1 - STANDARD 2 - VIP");
                vipONo = teclado.nextInt();
                break;
        }
        switch (vipONo) {
            case 1:
                cliente.cargarCliente();
                System.out.println("CLIENTE REGISTRADO");
                System.out.println(cliente.cargaClienteInicial());
                break;
            case 2: // NO PUEDO CARGAR EL TRABAJOOOOOOOOOOOOOOOOO
                cliente = new Vip();
                cliente.cargarCliente();
                System.out.println("CLIENTE REGISTRADO");
                System.out.println(((Vip) cliente).cargaClienteInicialVip());
                break;
        }
        return cliente;
    }

    private static int menuInicial() { //ESTO YA ESTA
        Scanner teclado = new Scanner(System.in);

        System.out.println("BIENVENIDO AL BANCO MOYANO, QUE OPERACION DESEA REALIZAR:");
        System.out.println("1 - REGISTRAR NUEVO CLIENTE 2 - INGRESAR A CLIENTE 3 - MOSTRAR CLIENTE 0 - SALIR");
        int opcion = teclado.nextInt();


        return opcion;
    }

    private static int menuCliente() { //ESTO YA ESTA
        Scanner teclado = new Scanner(System.in);

        System.out.println("1- Ingresar Dinero 2- Retirar Dinero 3- Consultar Montos 0 - Volver");
        int opcionMenuCliente = teclado.nextInt();


        return opcionMenuCliente;
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