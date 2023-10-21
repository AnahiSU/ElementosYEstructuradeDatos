
/**
 * Write a description of class ordenamientos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Merge {

   private void fill(int [] lista, int [] res, int ini, int fin, int iterador){
      //{1,2,3,4,5}
      if(iterador == res.length-1){
         res[iterador] = lista[ini];
      }else{
         res[iterador] = lista[ini];
         fill(lista, res, ini+1, fin, iterador+1);
      }
   }

   public int [] sort(int [] coleccion){
      sort(coleccion, coleccion.length);
      return coleccion;
   }

   private void sort(int [] coleccion, int n){
      //int [] ordenado = new int[n];
      int [] sub1;
      int [] sub2;

      if(n > 1){
         //division de arreglos
         sub1 = new int[n/2];
         if(n%2 == 0){
             sub2 = new int[n/2];
         }else{
             sub2 = new int[n - (n/2)];
         }
         fill(coleccion,sub1,0,n/2,0);
         fill(coleccion,sub2,(n/2),n,0);
         
         sort(sub1,sub1.length);
         sort(sub2,sub2.length);

         fill(merge(sub1, sub2), coleccion, 0, n, 0);
      }
   }

   public int [] mainsito(int [] lista){
      int [] res = new int[3];
      fill(lista, res, 2,5,0);
      return res;
      
   }

   public int[] merge(int [] s1, int[]s2) {
      int [] res = new int[s1.length + s2.length];

      merge(s1, s2, res, 0, 0, 0);

      return res;
   }

   private void merge(int [] s1, int[]s2, int[] res, int iterador, int i, int j){
      if (i == s1.length || j == s2.length) {
         if (i == s1.length) {
            fill(s2, res, j, s2.length, iterador);
         } else {
            fill(s1, res, i, s1.length, iterador);
         }
      } else {
         if (s1[i] > s2[j]) {
            res[iterador] = s2[j];
            merge(s1, s2, res, iterador + 1, i, j + 1);
         } else {
            res[iterador] = s1[i];
            merge(s1, s2, res, iterador + 1, i + 1, j);
         }
      }
   }

}
