package unidad1.progLineal;
/**
 * ITESS-TICS
 * AGO-DIC 2024
 * MATEMATICAS PARA LA TOMA DE DESIOSIONES
 * DOCENTE: FRANCISCO JAVIER MONTECILLO
 * PROGARMADOR: ING EN TICS SANDRA ARACELI HERNANDEZ 
 * DESCRIPCCION: PROBLEMAS DE LA TAREA 1
 * FECHA;13/SEP/24
 */
public class GaussRTest {
    public static void main(String[] args) {
        double pl [][]={
                {1.0,   -60.0,  -30.0,  -20.0,  0.0,    0.0,    0.0,    0.0,    0.0},
                {0.0,   8.0,    6.0,    1.0,    1.0,    0.0,    0.0,    0.0,    48.0},
                {0.0,   4.0,    2.0,    1.5,    0.0,    1.0,    0.0,    0.0,    20.0},
                {0.0,   2.0,    1.5,    0.5,    0.0,    0.0,    1.0,    0.0,    8.0 },
                {0.0,   0.0,    1.0,    0.0,    0.0,    0.0,    0.0,    1.0,    5.0}};
        
        int renglonPivote = 3;
        int columnaPivote = 1;
        GaussR gr = new GaussR(renglonPivote, columnaPivote, pl);
        gr.print();
        gr.pivoting();
        gr.print();
    }
}
