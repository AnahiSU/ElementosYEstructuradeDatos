
/**
 * Write a description of class Clausura2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;

public class Clausura2 {

    private ArrayList<ArrayList<Integer>> anadirFactor(ArrayList<ArrayList<Integer>> lista, int factor, int i) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        if (i == lista.size()) {
            return res;
        } else {
            ArrayList<Integer> tmp = lista.get(i);
            tmp.add(factor);

            res.add(tmp);
            res.addAll(anadirFactor(lista, factor, i + 1));
        }

        return res;
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

    
    
    public ArrayList<ArrayList<Integer>> clausura(ArrayList<Integer> lista) {
        return clausura(lista, lista.size());
    }

    
    
    private ArrayList<ArrayList<Integer>> clausura(ArrayList<Integer> lista, int n) {
        
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();

        if (n == 1) {
            res.add(new ArrayList<Integer>());
            res.add(lista);
        } else {
            res = clausura(sublista(lista, 0, n - 1), n - 1);
            res.addAll(anadirFactor(clausura(sublista(lista, 0, n - 1), n - 1), lista.get(n - 1), 0));
        }

        return res;
    }

    
    public ArrayList<ArrayList<Integer>> main(){
        int []  n = {1,2,3};
        ArrayList<Integer> nuevo = new ArrayList();
        nuevo.add(1);
        nuevo.add(2);
        nuevo.add(3);
        ArrayList <ArrayList <Integer>> nuevo2 = clausura(nuevo);
        return nuevo2;

        
    }
}
