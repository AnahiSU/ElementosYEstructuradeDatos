
/**
 * Write a description of class FlorTinta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlorTinta
{
    private double calcLado(int n){
        double res;
        if(n == 1){
            res = 1;
        }else{
            res = calcLado(n-1) + (0.5*(calcLado(n-1)));    
        }
        
        return res;
    }
    public double calcTinta(int nivel){
        double res;
            if(nivel == 1){
                res = 10.28;
            }else{
                res = calcTinta(nivel-1) + 4*calcLado(nivel)+2*(Math.PI*calcLado(nivel)); 
            }
        return res;
    }
}
