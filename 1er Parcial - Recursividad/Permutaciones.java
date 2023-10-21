import java.util.ArrayList;
/**
 * Write a description of class Permutaciones here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Permutaciones
{
    public ArrayList<ArrayList<Integer>> permutar(ArrayList<Integer> lista){
        return permutar(lista, lista.size());    
    }
    private ArrayList<ArrayList<Integer>> permutar(ArrayList<Integer> lista, int size){
        ArrayList<ArrayList<Integer>> permutado = new ArrayList();
        if(size == 1){
            permutado.add(new ArrayList());
            permutado.add(lista);
        }else{
            int first = lista.get(0);
            ArrayList<Integer> aux = sublista(lista,1,size-1);
            permutado = anadirFactor(permutar(aux),first,0);
        }
        return permutado;
    }
    
    private ArrayList<Integer> sublista(ArrayList<Integer> lista, int i, int j) {
        ArrayList<Integer> res = new ArrayList<Integer>();

        if (i == j) {
            return res;
        } else {
            res.add(lista.get(i));
            res.addAll(sublista(lista, i + 1, j));
        }

        return res;
    }
    
    public ArrayList<ArrayList<Integer>> anadirFactor(ArrayList<ArrayList<Integer>> lista, int factor, int i) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        if (i == lista.size()) {
            return res;
        } else {
            ArrayList<Integer> tmp = lista.get(i);
            tmp.add(0,factor);

            res.add(tmp);
            res.addAll(anadirFactor(lista, factor, i + 1));
        }

        return res;
    }
    
    
}
