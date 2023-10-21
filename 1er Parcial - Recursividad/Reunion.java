
/**
 * Write a description of class Reunion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reunion
{
    public String reunionChinos(int niv){
        String res = "";
        res = reunionChinos(niv,1,res);
        return res;
    }
    private String reunionChinos(int niv, int cont, String res){
        if(niv == 1 || cont == (((niv + (niv -1)) / 2) + 1)){
            res = "(-.-)";
            if(cont != 1){
                res = res + reunionChinos(niv,cont+1,res);
            }
        }else{
            if(cont <= ((niv + (niv -1)))){
                if(cont <= (((niv + (niv -1))/2) + 1)){
                    res = "(-.";
                    res = res + reunionChinos(niv,cont+1,res);
                }else{
                    res = ".-)";
                    if(cont != ((niv + (niv -1)))){
                        res  = res + reunionChinos(niv,cont+1,res);  
                    }
                }
            }
        }
        return res;
    }
}
