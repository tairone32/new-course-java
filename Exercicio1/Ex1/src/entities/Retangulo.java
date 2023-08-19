package entities;

public class Retangulo {

    public double largura;

    public double altura;

    public double areaDoRetagulo() {
        return altura * largura;
    }

    public double perimetroRetangulo() {
        return 2 * (altura + largura);
    }

    public double diagonalRetangulo() {
        double x = Math.pow(largura, 2) + Math.pow(altura, 2);
        return Math.sqrt(x);

    }

    public String toString() {
        return "Area: " + areaDoRetagulo() + " Perimetro: " + perimetroRetangulo() + " Diagonal: " + diagonalRetangulo();
    }
}


