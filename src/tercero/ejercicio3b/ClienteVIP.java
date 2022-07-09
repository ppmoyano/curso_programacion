package tercero.ejercicio3b;

import java.util.Scanner;

public class ClienteVIP extends Clientes{
    String lugarDeTrabajo;
    int cuentaDolares;

    public void cargarClientesVIP() {
    }

    @Override
    public void cargar() {
        super.cargar();

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese lugar de trabajo:");
        this.lugarDeTrabajo = teclado.next();
        this.cuentaDolares = 0;

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
