
/**
 * Write a description of class SecuenciaPP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SecuenciaPP
{
    public int secuencia(int n){
        int res;
        if(n==1){
            res = 1;
        }else if(n==2){
            res = 3;
        }else{
            res = ((secuencia(n-1) + secuencia (n-2)) * 2);
        }
        return res;
    }
}
