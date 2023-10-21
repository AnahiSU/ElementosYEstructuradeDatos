
/**
 * Write a description of class RotarMatriz here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RotarMatriz
{
    public int [][] rotarMatriz(int[][] mat,int n){
        int [][] matrizRot = new int [mat.length][mat[0].length];
        return rotarMatriz(mat, n, n,0, matrizRot, 0);
    }

    public int [][] rotarMatriz(int[][] mat, int n,int r, int iterador, int [][] matrizRot, int f){
        int [] filita = new int[mat[0].length];
        if(r>0){
            if(iterador == f){
                rotarFila(r,mat[iterador], filita);
                matrizRot[iterador] = filita;
                matrizRot = rotarMatriz(mat,n,r-1,iterador,matrizRot,f+1);
            }else{
                matrizRot = rotarMatriz(mat,n,r,iterador+1,matrizRot,f);
            }
        }
        return matrizRot;
    }

    private void rotarFila(int n, int[] mat, int[] aux){
        rotarFila(n,0,0,mat,aux);
    }

    private void rotarFila(int n, int i, int j, int [] mat, int [] aux){
        if(i < mat.length){
            if(i+n > mat.length-1){
                aux[j] = mat[i];
                rotarFila(n,i+1,j+1,mat,aux);
            }else{
                aux[i+n] = mat[i];
                rotarFila(n,i+1,j,mat, aux);
            }
        }

    }
}
