
/**
 * Write a description of class Palindromo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palindromo
{
    public boolean esPalindromo(String cad){
        boolean res = false;
        String invertido = invertirCad(cad);
        if(cad == invertido){
            res = true;
        }
        return res;
    }
    private String invertirCad(String cad){
        String res = "";
        if(cad.length() == 1){
            res = cad;
        }else{
            res = cad.charAt(cad.length()-1) + invertirCad(cad.substring(0,cad.length()-1))  ;
        }
        return res;
    }
}
