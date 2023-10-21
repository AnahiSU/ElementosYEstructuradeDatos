
/**
 * Write a description of class NDigitos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NDigitos
{
    public int calcDigitos(int n){
        int res;
        if(n/10==0){
            res = 1;
        } else{
            res = calcDigitos(n/10) + 1;
        }
        return res;
    }
}
