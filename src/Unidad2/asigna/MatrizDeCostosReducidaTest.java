
package Unidad2.asigna;
import java.util.Scanner;

public class MatrizDeCostosReducidaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas (M): ");
        int M = scanner.nextInt();
        
        System.out.print("Ingrese el número de columnas (N): ");
        int N = scanner.nextInt();

        double[][] matriz = new double[M][N];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        MatrizDeCostosReducida asignacion = new MatrizDeCostosReducida(matriz);
        asignacion.reducirFilas();
        asignacion.reducirColumnas();

        asignacion.marcarCeros();
        while (!asignacion.esOptima()) {
            asignacion.pivotear();
            asignacion.marcarCeros();
        }

        double[][] resultado = asignacion.getMatrizReducida();
        System.out.println("\nMatriz de costos reducida:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%.0f ", resultado[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
