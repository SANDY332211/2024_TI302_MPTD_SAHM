
package Unidad2.asigna;
import java.util.Scanner;

public class MatrizDeCostosReducidaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer las dimensiones de la matriz
        System.out.print("Ingrese el número de filas (M): ");
        int M = scanner.nextInt();
        
        System.out.print("Ingrese el número de columnas (N): ");
        int N = scanner.nextInt();

        // Crear y llenar la matriz de costos
        double[][] matriz = new double[M][N];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // Crear instancia de AsignacionHungaro
        MatrizDeCostosReducida asignacion = new MatrizDeCostosReducida4(444matriz);

        // Calcular la matriz de costos reducida
        asignacion.reducirFilas();
        asignacion.reducirColumnas();

        // Aplicar el método húngaro
        asignacion.marcarCeros();
        while (!asignacion.esOptima()) {
            asignacion.pivotear();
            asignacion.marcarCeros();
        }

        // Obtener e imprimir la matriz de costos reducida
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
