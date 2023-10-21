
/**
 * Write a description of class Exponente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exponente
{
    public int calcularPotencia(int a,int b){
        int res;
        if (b == 1){
            res = a;
        }else{
            res = calcularPotencia(a,b-1)*a;
        }
        return res;
    }
}
