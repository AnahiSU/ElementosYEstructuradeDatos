
/**
 * Write a description of class InversoSimple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InversoSimple
{
    public String invertirSimple(String cadena){
        String res = "";
        String cadenaAux = limpiaCadenas(cadena,1); 
        res = invertirCad(cadenaAux);
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

    private String limpiaCadenas(String cadena, int i){
        String res = "";
        if(i < cadena.length()-1){
            if(i == 1 || cadena.charAt(i-1) != cadena.charAt(i)|| cadena.charAt(i+1) != cadena.charAt(i) 
                && estaDentro(res,cadena.charAt(i),0)){
                res = res + cadena.charAt(i) + limpiaCadenas(cadena,i+1);
            }else{
                res = limpiaCadenas(cadena,i+1);
            }
        }
        return res;  
    }

    private boolean estaDentro(String cadena, char x, int i){
        boolean res = true;
        if(cadena.length() != 0 && cadena.length() != i){
            if(cadena.charAt(i) != x){
                res = estaDentro(cadena,x,i+1);
            }
        }else{
            res = false;
        }
        return res;
    }
}
