
package Unidad2.asigna;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LineasOptimas{
    private double[][] matriz;
    private boolean[] filasMarcadas;
    private boolean[] columnasMarcadas;
    private boolean[][] cerosCubiertos;
    public LineasOptimas(double[][] matriz) {
        this.matriz = matriz;
        this.filasMarcadas = new boolean[matriz.length];
        this.columnasMarcadas = new boolean[matriz[0].length];
        this.cerosCubiertos = new boolean[matriz.length][matriz[0].length];
    }
    public void reducirFilas() {
        for (int i = 0; i < matriz.length; i++) {
            double minRow = Double.MAX_VALUE;
            for (int j = 0; j < matriz[i].length; j++) {
                minRow = Math.min(minRow, matriz[i][j]);
            }
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] -= minRow;
            }
        }
    }
    public void reducirColumnas() {
        for (int j = 0; j < matriz[0].length; j++) {
            double minCol = Double.MAX_VALUE;
            for (int i = 0; i < matriz.length; i++) {
                minCol = Math.min(minCol, matriz[i][j]);
            }
            for (int i = 0; i < matriz.length; i++) {
                matriz[i][j] -= minCol;
            }
        }
    }
    public void cubrirCerosConLineas() {
        boolean[] filasCubiertas = new boolean[matriz.length];
        boolean[] columnasCubiertas = new boolean[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0 && !filasCubiertas[i] && !columnasCubiertas[j]) {
                    cerosCubiertos[i][j] = true;
                    filasCubiertas[i] = true;
                    columnasCubiertas[j] = true;
                }
            }
        }

        Arrays.fill(filasCubiertas, false);
        Arrays.fill(columnasCubiertas, false);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (cerosCubiertos[i][j] && !filasCubiertas[i]) {
                    filasCubiertas[i] = true;
                }
            }
        }
        
        for (int i = 0; i < matriz.length; i++) {
            filasMarcadas[i] = filasCubiertas[i];
        }
        for (int j = 0; j < matriz[0].length; j++) {
            columnasMarcadas[j] = columnasCubiertas[j];
        }
    }

    public int obtenerNumeroDeLineas() {
        int count = 0;
        for (boolean marcado : filasMarcadas) {
            if (marcado) count++;
        }
        for (boolean marcado : columnasMarcadas) {
            if (marcado) count++;
        }
        return count;
    }

    public List<Integer> getFilasMarcadas() {
        List<Integer> filas = new ArrayList<>();
        for (int i = 0; i < filasMarcadas.length; i++) {
            if (filasMarcadas[i]) {
                filas.add(i);
            }
        }
        return filas;
    }

    public List<Integer> getColumnasMarcadas() {
        List<Integer> columnas = new ArrayList<>();
        for (int j = 0; j < columnasMarcadas.length; j++) {
            if (columnasMarcadas[j]) {
                columnas.add(j);
            }
        }
        return columnas;
    }
}
