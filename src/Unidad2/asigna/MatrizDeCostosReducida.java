
package Unidad2.asigna;
public class MatrizDeCostosReducida {

    private double[][] matriz;
    private boolean[][] lineas;

    // Constructor que recibe la matriz de costos inicial
    public MatrizDeCostosReducida(double[][] matriz) {
        this.matriz = matriz;
        this.lineas = new boolean[matriz.length][matriz[0].length];
    }

    // Reducción de filas
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

    // Reducción de columnas
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

    // Marcar ceros en la matriz para cubrirlos con el mínimo de líneas
    public void marcarCeros() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0 && !lineas[i][j]) {
                    lineas[i][j] = true;
                    break;
                }
            }
        }
    }

    // Verifica si la solución es óptima
    public boolean esOptima() {
        int count = 0;
        for (boolean[] linea : lineas) {
            for (boolean marcado : linea) {
                if (marcado) {
                    count++;
                    break;
                }
            }
        }
        return count >= matriz.length;
    }

    // Pivoteo si no se ha llegado a una solución óptima
    public void pivotear() {
        double minValor = Double.MAX_VALUE;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!lineas[i][j]) {
                    minValor = Math.min(minValor, matriz[i][j]);
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (!lineas[i][j]) {
                    matriz[i][j] -= minValor;
                } else if (lineas[i][j]) {
                    matriz[i][j] += minValor;
                }
            }
        }
    }

    // Retornar la matriz de costos reducida
    public double[][] getMatrizReducida() {
        return matriz;
    }
}
