
package unidad1.progLineal;


public class NumeroOpTest {
    public static void main(String[] args) {
        int [] arr = { 1, -3, -6, 9, 0, 1, -2};
        int [] arr2 = { 1, 2, 3};
        
        NumeroOpt nop = new NumeroOpt(arr);
        System.out.println("nop: "+ nop.Calcular());
        
        nop.setArreglo(arr2);
        System.out.println("nop: "+ nop.Calcular());
    }
}
