package tercero.ejercicio3b;

import java.util.Scanner;

public class Clientes {
    String nombre;
    String apellido;
    int dni;
    int tipoDeCliente;
    int cuentaCorriente;
    public void cargar() {
        {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese el nombre del cliente:");
            this.nombre = teclado.next();
            System.out.println("Ingrese el apellido del cliente:");
            this.apellido = teclado.next();
            System.out.println("Ingrese numero de dni:");
            this.dni = teclado.nextInt();
            this.cuentaCorriente = 0;
        }

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTipoDeCliente() {
        return tipoDeCliente;
    }

    public void setTipoDeCliente(int tipoDeCliente) {
        this.tipoDeCliente = tipoDeCliente;
    }

    public int getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(int cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }


    public void mostrarClientes() {

        System.out.println("CLIENTE STANDAR " + this.getNombre() + " " + this.getApellido() + " DNI: "  + this.getDni() + " Cuenta Corriente pesos $ " + this.getCuentaCorriente());
    }

    public int menuAcciones() {
        Scanner teclado = new Scanner(System.in);
        int opcionAcciones = 0;
        System.out.println("  1- Ingresar Dinero 2-" +
                " Retirar Dinero 3- Consultar Montos  0 - Volver");
        opcionAcciones = teclado.nextInt();
        return opcionAcciones;
    }



}
