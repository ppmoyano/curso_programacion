package tercero.ejercicio3b;

import java.util.Scanner;

public class ClienteVIP extends Clientes{
    String lugarDeTrabajo;
    int cuentaDolares;

    @Override
    public void cargar() {
        super.cargar();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese lugar de trabajo:");
        this.lugarDeTrabajo = teclado.next();
        this.cuentaDolares = 0;
        this.tipoDeCliente = 2;

    }

    public int menuAcciones() {
        Scanner teclado = new Scanner(System.in);
        int opcionAcciones = 0;
        System.out.println("  1- Ingresar Dinero 2-" +
                " Retirar Dinero 3- Consultar Montos 4-Comprar Dolares 0 - Volver");
        opcionAcciones = teclado.nextInt();
        return opcionAcciones;
    }

    @Override
    public void mostrarClientes() {
        System.out.println("CLIENTE VIP " + this.getNombre() + " " + this.getApellido() +
                " DNI: "  + this.getDni() + " Lugar de trabajo:  " + this.getLugarDeTrabajo()+ "  Cuenta Corriente pesos $ "
                + this.getCuentaCorriente() + " Cuenta en Dolares: " + this.getCuentaDolares());
    }


        public String getLugarDeTrabajo() {
        return lugarDeTrabajo;
    }

    public void setLugarDeTrabajo(String lugarDeTrabajo) {
        this.lugarDeTrabajo = lugarDeTrabajo;
    }

    public int getCuentaDolares() {
        return cuentaDolares;
    }

    public void setCuentaDolares(int cuentaDolares) {
        this.cuentaDolares = cuentaDolares;
    }
}
