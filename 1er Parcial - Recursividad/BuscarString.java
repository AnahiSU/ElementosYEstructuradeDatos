
/**
 * Write a description of class BuscarString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BuscarString
{
    public boolean esIgual(String cad, String comp, int i, int j){
        boolean res = false;
        if(i < cad.length() && j < comp.length()){
            int charCad = cad.charAt(i);
            int charStr = comp.charAt(j);
            if(charCad == charStr && charCad <= 123 && charCad >= 97 && charStr <= 123 && charStr >= 97 ){
                res = true;
                res = esIgual(cad,comp,i+1,j+1);
            }else{
                if(j == comp.length()){
                    res = false;
                }
                if(!(charCad <= 123 && charCad >= 97)){
                    res = esIgual(cad, comp, i+1, j);
                }
                if(!(charCad <= 123 && charCad >= 97)){
                    res = esIgual(cad, comp, i, j+1);
                }
                res = esIgual(cad,comp,i+1,j);
            }
        }

        return res;
    }
}
