
/**
 * Write a description of class CaracteresEnCadena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CaracterEnCadena
{
    public int cuantasVecesEsta(String cadena, char buscado){
        int res = 0;
        if(cadena.length() != 0){
            if(cadena.charAt(0) == buscado){
                res += cuantasVecesEsta(cadena.substring(1), buscado) + 1;
            }else{
                res = res + cuantasVecesEsta(cadena.substring(1), buscado);
            }
        }
        return res;
    }
    
    public String invertirCad(String cad){
        String res = "";
        if(cad.length() == 1){
            res = cad;
        }else{
            res = cad.charAt(cad.length()-1) + invertirCad(cad.substring(0,cad.length()-1))  ;
        }
        return res;
    }
    
    public int cuantasVocales(String cadena){
        int res = 0;
        if(cadena.length() != 0){
            if(esVocal(cadena.charAt(cadena.length()-1))){
                res = cuantasVocales(cadena.substring(0,cadena.length()-1)) + 1 ;
            }else{
                res = cuantasVocales(cadena.substring(0,cadena.length()-1));
            }
            
        }
        return res;
    }
    
    private boolean esVocal(char a){
        boolean res = false;
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'){
            res = true;
        }
        return res;
    }
}
