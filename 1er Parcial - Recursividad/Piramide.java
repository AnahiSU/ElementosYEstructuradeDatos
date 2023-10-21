
/**
 * Write a description of class Piramide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Piramide
{
    public int construirNivel(int nivel){
        int res;
        if(nivel == 1){
            res = 1;
        }else{
            res = construirNivel(nivel-1)+(nivel* (int)Math.pow(10,nivel-1));
        }
        return res;
    }
    public void construirPiramide(int n){
        if(n>1){
            construirPiramide(n-1);
            System.out.println(construirNivel(n));
        }else{
            System.out.println(construirNivel(n));
        }
        
            
    }
}
