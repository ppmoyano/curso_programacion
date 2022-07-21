package tercero.ejercicio3b;

import java.util.Scanner;

public class Vip extends Cliente {
    String trabajo;
    int ccdolares;


    public void cargarCliente() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE:");
        this.setNombre(teclado.nextLine());
        System.out.println("INGRESE EL APELLIDO:");
        this.setApellido(teclado.nextLine());
        System.out.println("INGRESE EL DNI:");
        this.setDni(teclado.nextInt());
        System.out.println("INGRESE EL TRABAJO:");
        this.setTrabajo(teclado.nextLine());
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public void setCcdolares(int ccdolares) {
        this.ccdolares = ccdolares;
    }

    public String cargaClienteInicialVip() {
        return this.nombre + " " + this.apellido + " - " + "VIP" + " - " + "Cuenta Corriente: " + this.cc + " Cuenta en dolares: " + this.ccdolares ;
    }

}

