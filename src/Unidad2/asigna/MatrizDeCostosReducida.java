
package Unidad2.asigna;
public class MatrizDeCostosReducida {

    private double[][] matriz;
    private boolean[][] lineas;

    public MatrizDeCostosReducida(double[][] matriz) {
        this.matriz = matriz;
        this.lineas = new boolean[matriz.length][matriz[0].length];
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

    public double[][] getMatrizReducida() {
        return matriz;
    }
}
