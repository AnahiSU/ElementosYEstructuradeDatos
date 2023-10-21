import java.util.ArrayList;

public class Orbita
{
    public ArrayList<Integer> orbita(int n){
        ArrayList <Integer> orbita = new ArrayList();
        return orbita(n, orbita);
    }
    private ArrayList<Integer> orbita(int n, ArrayList <Integer> orbita ){
        if(n > 1){
            if(n %2 == 0){
                orbita.add(n/2);
                orbita(n/2,orbita);
            }else{
                orbita.add((3*n)+1);
                orbita((3*n)+1,orbita);
            }
        }
        return orbita;
    }
}
