package unidad1.progLineal;

public class Simplex {

    private double[][] pl;

    public Simplex(double[][] pl) {
        this.pl = pl;
    }

    public void resolver() {

    }

    public int NumeroOpt() {
        double min = pl[0][0];
        int index = 0;

        for (int i = 1; i < pl[0].length; i++) {
            if (pl[0][i] < min) {
                index = i;
                min = pl[0][i];
            }
        }
        return min >= 0 ? -1 : index;
    }

    public int DivCrazy(int cp){
        double div []= new double [pl.length];
        for(int i=1; i< pl[0].length; i++){
            div[i] = pl[i][pl[0].length - 1] / pl[i][cp];
        }
        
        
        return 0;
    }
    
    public void print() {
        System.out.println("--------------------------------");
        for (int i = 0; i < pl.length; i++) {
            for (int j = 0; j < pl[0].length; j++) {
                System.out.printf("%+6.3f   ", pl[i][j]);
            }
            System.out.println("");
        }
    }

}
