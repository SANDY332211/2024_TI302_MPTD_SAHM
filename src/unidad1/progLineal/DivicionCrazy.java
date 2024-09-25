/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1.progLineal;
/**
 * ITESS-TICS
 * AGO-DIC 2024
 * ESTRUCTURA Y ORGANIZACIÓN DE EDATOS
 * DOCENTE: FRANCISCO JAVIER MONTECILLO
 * PROGARMADOR: ING EN TICS SANDRA ARACELI HERNANDEZ 
 * DESCRIPCCION: tarea de 
 * FECHA;19/SEP/24
 */
public class DivicionCrazy {
    private double columna1[];
    private double columna2[];
    private double divicion[];

    public DivicionCrazy(double[] columna1, double[] columna2) {
        this.columna1 = columna1;
        this.columna2 = columna2;
        
        this.divicion = new double [columna1.length];
        
    }
    public int resolver(){
        for(int i=1; i< columna1.length; i++){
            divicion [i] = columna2[i] / columna1[i];
        }
        return 0;
    }
    
    public void print(){
         for(int i=0 ; i< divicion.length; i++){
             System.out.println("div" + i + ":" + divicion[i]);
        }
    }
    
    
}
