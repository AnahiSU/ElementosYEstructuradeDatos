
/**
 * Write a description of class Tupla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tupla
{
    private int a, b;
    
    public Tupla(int a1, int b1){
        a = a1;
        b = b1;
    }
    
    public String getTupla(){
        String res = "("+a+", "+b+")";
        return res;
        
    }
}
