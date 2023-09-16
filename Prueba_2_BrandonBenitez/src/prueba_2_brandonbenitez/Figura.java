package prueba_2_brandonbenitez;

public class Figura {

    private int largo, alto, ancho, figura;

    public Figura(int largo, int ancho, int alto, int figura) {
        this.largo = largo;
        this.alto = alto;
        this.ancho = ancho;
        this.figura = figura;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getFigura() {
        return figura;
    }

    public void setFigura(int figura) {
        this.figura = figura;
    }

    

    @Override
    public String toString() {

        String tipoF = "";

        if (figura == 1) {
            tipoF = "Cuadrado";
        } else if (figura == 2) {
            tipoF = "Triángulo";
        } else {
            tipoF = "Rectángulo";
        }

        return "Tipo: " + tipoF + "\nLargo: " + largo + "\nAncho: " + ancho + "\nAlto: " + alto
                + "\nÁrea: " + areaFiguras() + "\nVolumen: " + volumenFiguras();
    }

    public int areaFiguras() {

        int area = 0;

        switch (figura) {

            case 1:

                area = largo * largo;

                break;

            case 2:

                area = (largo * alto) / 2;

                break;

            case 3:

                area = largo * ancho;

                break;

            default:
                System.out.println("¡Opción Invalida!");

        }

        return area;
    }

    public double volumenFiguras() {

        double volumen = 0;

        switch (figura) {

            case 1:

                volumen = largo * largo * largo;

                break;

            case 2:

                volumen =  ((largo * ancho) * alto)/3;

                break;

            case 3:

                volumen = largo * ancho * alto;

                break;

            default:
                System.out.println("¡Opción Invalida!");
        }

        return volumen;
    }

}
