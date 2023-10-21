
/**
 * Write a description of class NumeroIncremento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumeroIncremento
{
    public boolean esIncremento(int num){
        boolean res = true;
        if(calcDigitos(num) == 2){
            res = num/10 <= num%10;
        }else{
            res = esIncremento(num/10) && ((num%100)/10 <= num%10);
        }
        return res;
    }
    private int calcDigitos(int n){
        int res;
        if(n/10==0){
            res = 1;
        } else{
            res = calcDigitos(n/10) + 1;
        }
        return res;
    }
}
