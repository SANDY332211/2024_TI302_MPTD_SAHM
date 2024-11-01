//      for (int i=0; i< D.length; i++ ){
//          for (int j =0; j<O.length; j++){
//              if (O[i]< D[j] ){
//                  state[i][j]= D[j]- O[i];
//                  state [i][j]=M;
//                  O[i]=D[j]-M;
//                  if(O[i]==0)
//                      i++;
//              }else 
//                  state [i][j]=O[i]-D[j];
//                  state[i][j]=M;
//                  j++;
//          }
//      }  
package Unidad2_MetodoDeTransporte;

/**
 * Metodo de tranporte
 *
 * @author Sandra Araceli Hernandez Muñoz 18 octubre 2024
 */
public class ProblemaDeTransporte {

    private int M;
    private int N;
    private double[] O;
    private double[] D;
    private double[] C;
    private double state[][];
    private double solution[][];

    public ProblemaDeTransporte(int M, int N) {
        this.M = M;
        this.N = N;
    }

    public void setO(double[] O) {
        this.O = O;
    }

    public void setD(double[] D) {
        this.D = D;
    }

    public void setC(double[] C) {
        this.C = C;
    }

    public void Resolver() {

        int i = 0;
        int j = 0;
        double min = 0;
        boolean isO;
        while (i < M && j < M) {
            if (O[i] < D[i]) {
                min = O[i];
                isO = true;

            }else 
                min = D[i];
                isO= false;
        }
    }

    public double[][] getSolution() {
        return solution;
    }

}
