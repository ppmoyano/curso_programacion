package tercero.ejemplo2;

class Principal {

    public static void main(String[] args) {
        Celular mobil = new Celular();
        mobil.llamar();
    }
}


public class Celular {
    String marca;
    String modelo;
    int size;
    String color;


    public void llamar() {
        System.out.println("Esta llamando al 911");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
