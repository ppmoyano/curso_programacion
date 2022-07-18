package tercero.ejercicio3b;

import java.util.Scanner;

public class Cliente {
    String nombre;
    String apellido;
    int dni;
    int cc;


    public void cargarCliente() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE:");
        this.setNombre(teclado.nextLine());
        System.out.println("INGRESE EL APELLIDO:");
        this.setApellido(teclado.nextLine());
        System.out.println("INGRESE EL DNI:");
        this.setDni(teclado.nextInt());
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }
    public void setCC(int cc) {
        this.cc = cc;
    }

    public int getCC() {
        return cc;
    }

    public String cargaClienteInicial() {
        System.out.println(this.nombre + " " + this.apellido + " - " + "Standard" + " - " + "Cuenta Corriente: $0" + this.dni);
        return null;
    }

    public String cargaClienteInicialVip() {
        System.out.println(this.nombre + " " + this.apellido + " - " + "VIP" + " - " + "Cuenta Corriente: $0");
        return null;
    }

    public String mostrarCliente() {
        System.out.println(this.nombre + " " + this.apellido + " - " + "Standard" + " - " + "Cuenta Corriente: $0");
        return null;
    }
}