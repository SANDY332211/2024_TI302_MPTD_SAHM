
package Unidad2.asigna;
import java.util.ArrayList;
import java.util.List;

public class PivoteoAsignacion {
    private double[][] matriz;
    private boolean[] filasMarcadas;
    private boolean[] columnasMarcadas;

    public PivoteoAsignacion(double[][] matriz, boolean[] filasMarcadas, boolean[] columnasMarcadas) {
        this.matriz = matriz;
        this.filasMarcadas = filasMarcadas;
        this.columnasMarcadas = columnasMarcadas;
    }

    private double encontrarMinimoNoCubierto() {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != 0 && !filasMarcadas[i] && !columnasMarcadas[j]) {
                    min = Math.min(min, matriz[i][j]);
                }
            }
        }
        return min;
    }

    public void realizarPivoteo() {
        double k = encontrarMinimoNoCubierto();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!filasMarcadas[i] && !columnasMarcadas[j]) {
                    matriz[i][j] -= k;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (filasMarcadas[i] && columnasMarcadas[j]) {
                    matriz[i][j] += k;
                }
            }
        }
    }
    public double[][] getMatriz() {
        return matriz;
    }

    public int contarLineasMarcadas() {
        int lineas = 0;
        for (boolean fila : filasMarcadas) {
            if (fila) lineas++;
        }
        for (boolean columna : columnasMarcadas) {
            if (columna) lineas++;
        }
        return lineas;
    }
    public List<Integer> getFilasMarcadas() {
        List<Integer> filas = new ArrayList<>();
        for (int i = 0; i < filasMarcadas.length; i++) {
            if (filasMarcadas[i]) {
                filas.add(i + 1); 
            }
        }
        return filas;
    }
    public List<Integer> getColumnasMarcadas() {
        List<Integer> columnas = new ArrayList<>();
        for (int j = 0; j < columnasMarcadas.length; j++) {
            if (columnasMarcadas[j]) {
                columnas.add(j + 1); 
            }
        }
        return columnas;
    }
}
