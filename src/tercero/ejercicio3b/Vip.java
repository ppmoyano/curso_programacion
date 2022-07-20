package tercero.ejercicio3b;

import java.util.Scanner;

public class Vip extends Cliente {


    @Override
    public void cargaClienteStandart() {
        super.cargaClienteStandart();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el lugar de trabajo: ");
        this.setLugarTrabajo(teclado.nextLine());

    }


    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }


    String lugarTrabajo;

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public String mostrarCliente() {
        System.out.println(this.nombre + " " + this.apellido + " " + "Vip" + " " + this.dni + " " + "Cuenta corriente:$0" + this.lugarTrabajo);
        return null;
    }
}