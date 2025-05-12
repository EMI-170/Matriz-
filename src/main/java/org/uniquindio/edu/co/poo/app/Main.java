package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.*;

import javax.swing.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(3.0));
        figuras.add(new Cuadrado(4.0));
        figuras.add(new Triangulo(5.0));

        for (Figura figuraAux : figuras) {
            System.out.println(figuraAux.toString());
            System.out.println("Área: " + figuraAux.calcularArea());
            System.out.println("Perímetro: " + figuraAux.calcularPerimetro());
            System.out.println("-----------");
        }
    }
}

