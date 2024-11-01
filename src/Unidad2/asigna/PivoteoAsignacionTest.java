
package Unidad2.asigna;
import java.util.List;
import java.util.Scanner;

public class PivoteoAsignacionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño de la matriz (M): ");
        int M = scanner.nextInt();

        double[][] matriz = new double[M][M];
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = scanner.nextDouble();
            }
        }

        boolean[] filasMarcadas = new boolean[M];
        boolean[] columnasMarcadas = new boolean[M];

        filasMarcadas[1] = true; 
        filasMarcadas[3] = true; 
        columnasMarcadas[0] = true; 
        columnasMarcadas[3] = true; 
        PivoteoAsignacion pivoteo = new PivoteoAsignacion(matriz, filasMarcadas, columnasMarcadas);
        pivoteo.realizarPivoteo();

        System.out.println("Matriz después del pivoteo:");
        double[][] matrizResultante = pivoteo.getMatriz();
        for (double[] fila : matrizResultante) {
            for (double valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }

        System.out.println(pivoteo.contarLineasMarcadas());
        System.out.print("R ");
        List<Integer> filasMarcadasResultantes = pivoteo.getFilasMarcadas();
        for (int fila : filasMarcadasResultantes) {
            System.out.print(fila + " ");
        }
        System.out.println();

        System.out.print("C ");
        List<Integer> columnasMarcadasResultantes = pivoteo.getColumnasMarcadas();
        for (int columna : columnasMarcadasResultantes) {
            System.out.print(columna + " ");
        }
        System.out.println();

        scanner.close();
    }
}
