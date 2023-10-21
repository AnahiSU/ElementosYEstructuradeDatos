import java.util.ArrayList;

public class InvertirPalabras
{
    public ArrayList<String> invertirPalabras(String frase){
        ArrayList<String> palabras = separarPalabras(frase);
        invertirPalabras(frase,0,palabras);
        return palabras;
    }
    
    private ArrayList<String> invertirPalabras(String frase, int i, ArrayList<String> pal){
        if(i<pal.size()){
            pal.set(i,invertir(pal.get(i),pal.get(i).length()-1));
            pal = invertirPalabras(frase,i+1,pal);
        }
        return pal;
    }
    
    private String invertir(String palabra,int i){
        String res = "";
        if(i>=0){
            res = res + palabra.charAt(i)+ invertir(palabra, i-1);
        }
        return res;
    }
    
    private ArrayList<String> separarPalabras(String frase){
        ArrayList <String> res = new ArrayList();
        res = separarPalabras(frase,0,0,res);
        return res;
    }
    
    private ArrayList <String> separarPalabras(String frase, int i, int f, ArrayList <String> res){
        if(f < frase.length()){
            if(frase.charAt(f) == ' ' || f == frase.length()-1){
                if(f == frase.length()-1){
                    res.add(frase.substring(i,f+1));
                    res =  separarPalabras(frase,f+1,f+1,res);
                }else{
                    res.add(frase.substring(i,f));
                    res =  separarPalabras(frase,f+1,f+1,res);
                }
            }else{
                res = separarPalabras(frase,i,f+1,res);
            }
        }
        return res;
    }
}
