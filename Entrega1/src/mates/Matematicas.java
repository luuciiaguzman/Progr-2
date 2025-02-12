package mates;

public class Matematicas {
    public static double generarNumeroPiIterativo(long pasos){
        int dentro=0;
        for(int i=0; i<=pasos; i++){
            double x = Math.random();
            double y = Math.random();
            if(x*x+y*y<=1){ //Estos están dentro
                dentro++;
            }
        }
        return 4.0*dentro/pasos;
    }
}
