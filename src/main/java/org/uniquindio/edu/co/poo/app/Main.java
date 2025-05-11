package org.uniquindio.edu.co.poo.app;

import org.uniquindio.edu.co.poo.model.Matriz;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int filas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas:"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas:"));
        int giros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de giros (90° a la derecha):"));

        // Crear matriz
        int[][] matriz = Matriz.crearMatriz(filas, columnas);

        // Mostrar matriz original
        JOptionPane.showMessageDialog(null, "Matriz original:\n" + Matriz.MostrarMatriz(matriz));

        // Girar matriz n veces
        for (int i = 0; i < giros; i++) {
            matriz = Matriz.girarMatrizDerecha(matriz);
        }

        // Mostrar matriz girada
        JOptionPane.showMessageDialog(null, "Matriz girada:\n" + Matriz.MostrarMatriz(matriz));
    }
}