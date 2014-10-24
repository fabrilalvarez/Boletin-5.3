package boletin.pkg5.pkg3;

public class Circulo {

    private double radio;
    static final double PI = 3.14169;

    //Builder
    public Circulo() {

    }

    public Circulo(double r) {
        this.radio = r;

    }

    //Method
    public void setRadio(double r) {
        this.radio = r;
    }

    public double calcularArea() {
        return PI * Math.pow(radio, 2);
    }

    public double calcularLongitud() {
        return 2 * PI * radio;
    }
}
