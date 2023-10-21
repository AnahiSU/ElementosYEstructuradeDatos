public class Ordenamientos
{
    //rellenar un arreglo a base de otro

    private void fill(int [] lista, int [] res, int ini, int fin, int iterador){
        //{1,2,3,4,5}
        if(iterador == res.length-1){
            res[iterador] = lista[ini]; 
        }else{
            res[iterador] = lista[ini];
            fill(lista, res, ini+1, fin, iterador+1);
        }
    }

    public int [] mergeSort(int [] coleccion){
        mergeSort(coleccion, coleccion.length);
        return coleccion;
    }

    public void mergeSort(int [] coleccion, int n){
        int [] ordenado = new int[n];
        int [] sub1;
        int [] sub2;

        if(n > 1){
            //division de arreglos
            sub1 = new int[n/2];
            sub2 = new int[n/2];
            fill(coleccion,sub1,0,n/2,0);
            fill(coleccion,sub2,n/2,n,0);
            mergeSort(sub1,sub1.length);
            mergeSort(sub2,sub2.length);
            ordenado = merge(sub1,sub2);

            //crear el metodo merge
        }

    }

    public int [] mainsito(int [] lista){
        int [] res = new int[3];
        fill(lista, res, 2,5,0);
        return res;
    }

    private int [] merge(int [] s1, int[]s2){
        int [] res = new int[s1.length + s2.length];
        //sepa judas como
        return res;
    }
}   

