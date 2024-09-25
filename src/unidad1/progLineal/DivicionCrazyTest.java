/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unidad1.progLineal;

/**
 *
 * @author Admi
 */
public class DivicionCrazyTest {
    public static void main (String ... args){
        double[] columna1= {1, 2, 0, 1, -3};
        double[] columna2= {1, 0, -6, 8, -4};
        
        DivicionCrazy dc = new DivicionCrazy(columna1, columna2);
        dc.resolver();
        dc.print();
    }
}
