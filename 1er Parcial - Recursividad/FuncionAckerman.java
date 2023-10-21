
/**
 * Write a description of class FuncionAckerman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuncionAckerman
{
    public int funcionAckerman(int m, int n){
        int res;
        if(m == 0){
            res = n+1;
        }else if(n == 0){
            res = funcionAckerman(m-1,1) ;
        }else{
            res = funcionAckerman(m-1, funcionAckerman(m,n-1));
        }
        return res;
    }
}
