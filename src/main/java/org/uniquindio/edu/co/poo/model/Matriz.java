package org.uniquindio.edu.co.poo.model;

public class Matriz {
    public static int[][] crearMatriz(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        int contador = 1;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = contador++;
            }
        }
        return matriz;
    }

    public static int[][] girarMatrizDerecha(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] girada = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                girada[j][filas - 1 - i] = matriz[i][j];
            }
        }
        return girada;
    }

    public static String MostrarMatriz(int[][] matriz) {
        StringBuilder sb = new StringBuilder();
        for (int[] fila : matriz) {
            for (int num : fila) {
                sb.append(num).append("\n");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

}
