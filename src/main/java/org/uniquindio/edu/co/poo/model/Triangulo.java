package org.uniquindio.edu.co.poo.model;

public  class Triangulo implements Figura {
    private double lado;

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado=" + lado +
                '}';
    }


    //Calcular el area de un triangulo eqilatero
    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }



}
