package tercero.ejercicio3b;

import java.util.Scanner;

public class Cliente {
    String nombre;
    String apellido;
    int dni;
    int cc;

    String tipoDeCliente;


    public void cargarCliente() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESE EL NOMBRE:");
        this.setNombre(teclado.nextLine());
        System.out.println("INGRESE EL APELLIDO:");
        this.setApellido(teclado.nextLine());
        System.out.println("INGRESE EL DNI:");
        this.setDni(teclado.nextInt());
        tipoDeCliente = "Standard";
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTipoDeCliente(String tipoDeCliente) { this.tipoDeCliente = tipoDeCliente; }

    public String getTipoDeCliente() {
        return tipoDeCliente;
    }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getApellido() {
        return apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }
    public void setCC() {
        this.cc = cc;
    }

    public int getCC() {
        return cc;
    }

    public String cargaClienteInicial() {
        return this.nombre + " " + this.apellido + " - " + this.tipoDeCliente + " - " + "Cuenta Corriente: " + this.cc;
    }



    public String mostrarCliente() {
        System.out.println(this.nombre + " " + this.apellido + " - " + "Standard" + " - " + "Cuenta Corriente: $0");
        return null;
    }
}