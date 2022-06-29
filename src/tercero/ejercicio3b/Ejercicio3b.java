package tercero.ejercicio3b;
/*
Realice un programa que maneje los clientes de un banco.
El banco tiene dos tipos de clientes Standard y clientes Vip
Al inicio del programa se encuentra un menu (ver ejemplo de ejecuciones) donde podemos Registrar un nuevo cliente - Ingresar a Cliente - o Salir
Los clientes se registran Nombre Apellido DNI y Tipo de Cliente y CuentaCorriente,
si es cliente VIP Tambien se registra el lugar de trabajo y ademas una CuentaEnDolares.
Los clientes vip pueden comprar dolares desde su cuenta corriente a cuentaEnDolares con un valor de 100$ un 1$
 */


public class Ejercicio3b {

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