
/**
 * Write a description of class NumeroDecremento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumeroDecremento
{
    public boolean esDecremento(int num){
        boolean res = true;
        if(calcDigitos(num) == 2){
            res = num/10 >= num%10;
        }else{
            res = esDecremento(num/10) && ((num%100)/10 >= num%10);
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
