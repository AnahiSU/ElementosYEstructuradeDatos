
/**
 * Write a description of class SumarMultiCuatro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SumarParesNoCuatro
{
    public int numeroPar(int n){
        int suma = 0 ;
        if(n == 1){
            suma = 2;
        }else{
            suma =  numeroPar(n-1) + 4;
        }
        return suma;
    }
    
    public int sumarParesNoCuatro(int n){
        int res = 0;
        if(n == 1){
            res = 2;
        }else{
            res = res + sumarParesNoCuatro(n-1) + numeroPar(n);
        }
        return res;
    }
}
