import java.util.ArrayList;
/**
 * Write a description of class NumerosExplosivos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumerosExplosivos
{
    public ArrayList <Integer> numeroExplosivo(int n, int b){
        ArrayList <Integer> lista = new ArrayList();
        numeroExplosivo(n,b,lista);
        return lista;
    }
    public void numeroExplosivo(int n, int b, ArrayList<Integer> lista){
        if(n<=b){
            lista.add(n);
        }else{
            int n1 = n/b;
            int n2 = n - (n/b);
            numeroExplosivo(n1,b,lista);
            numeroExplosivo(n2,b,lista);
        }
    }
    
    public ArrayList<Integer> mainsito(int b, int n){
        ArrayList<Integer> lista = numeroExplosivo(n,b);
        return lista;
    }
}
