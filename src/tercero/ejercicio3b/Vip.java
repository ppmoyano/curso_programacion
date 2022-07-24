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
        String trabajo = teclado.nextLine();
        this.setTrabajo(teclado.nextLine());
        tipoDeCliente = "VIP";
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public void setCcdolares(int ccdolares) {
        this.ccdolares = ccdolares;
    }

    public String cargaClienteInicialVip() {
        return this.nombre + " " + this.apellido + " - " + this.tipoDeCliente + " - " + "Lugar de Trabajo: " + this.trabajo + " - " + "Cuenta Corriente: " + this.cc + " Cuenta en dolares: " + this.ccdolares ;
    }
    public int getCcdolares() {
        return ccdolares;
    }

    public String cargaClienteInicial() {
        return this.nombre + " " + this.apellido + " - " + this.tipoDeCliente + " - " + "Cuenta Corriente: " + this.cc + " Cuenta en dolares: " + this.ccdolares ;
    }
}

