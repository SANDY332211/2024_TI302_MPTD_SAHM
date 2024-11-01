/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad2.asigna;
import java.util.Scanner;

public class LineasOptimasTest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la matriz (M x M): ");
        int M = scanner.nextInt();

        double[][] matriz = new double[M][M];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }
        LineasOptimas asignacion = new LineasOptimas(matriz);
        asignacion.reducirFilas();
        asignacion.reducirColumnas();
        asignacion.cubrirCerosConLineas();
        int numeroDeLineas = asignacion.obtenerNumeroDeLineas();
        System.out.println(numeroDeLineas);
        System.out.print("R ");
        for (int fila : asignacion.getFilasMarcadas()) {
            System.out.print(fila + " ");
        }
        System.out.println();
        System.out.print("C ");
        for (int columna : asignacion.getColumnasMarcadas()) {
            System.out.print(columna + " ");
        }
        System.out.println();

        scanner.close();
    }
}
