package tercero.ejercicio3b;

import java.util.Scanner;

public class Cliente {
    String nombre;
    String apellido;
    int dni;

    String cuentaCorriente;

    public void cargaClienteStandart() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        this.setNombre(teclado.nextLine());
        System.out.println("Ingrese el apellido: ");
        this.setApellido(teclado.nextLine());
        System.out.println("Ingrese el DNI: ");
        this.setDni(teclado.nextInt());

    }


    public String mostrarCliente() {
        System.out.println(this.nombre + " " + this.apellido + " " + "Standart" + "Cuenta corriente $0");
        return null;
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



    public String getCuentaCorriente() {
        return cuentaCorriente;
    }

    public void setCuentaCorriente(String cuentaCorriente) {
        this.cuentaCorriente = cuentaCorriente;
    }


}
