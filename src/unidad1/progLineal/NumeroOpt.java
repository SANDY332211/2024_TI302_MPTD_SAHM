  // da el idice del numero mas negativo
package unidad1.progLineal;
/**
 * ITESS-TICS
 * AGO-DIC 2024
 * ESTRUCTURA Y ORGANIZACIÓN DE EDATOS
 * DOCENTE: FRANCISCO JAVIER MONTECILLO
 * PROGARMADOR: ING EN TICS SANDRA ARACELI HERNANDEZ 
 * DESCRIPCCION: Poblema de la clase de matematicas 
 * FECHA;13/SEP/24
 */
public class NumeroOpt {
     private int [] arreglo;

    public NumeroOpt(int[] arreglo) {
        this.arreglo = arreglo;
    }


    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    public int Calcular(){
        int min= arreglo[0]; 
        int index=0;
        
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i]< min){
                index = i;
                min = arreglo[i];
            }
        }
        return min >= 0 ? -1 : index;
    }
}
