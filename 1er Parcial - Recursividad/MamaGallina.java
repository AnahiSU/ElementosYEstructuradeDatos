import java.util.ArrayList;
public class MamaGallina
{
    public ArrayList<int[]> encontrarSillas(char[][]sillas, int x, int y, int i){
        ArrayList<int[]> res = new ArrayList();
        int [] posi = new int[2];
        if(esValido(x,y,sillas) && i < 7){
            if(sillas[x][y] != 'O' && tieneAdyascencias(sillas,x,y)){
                sillas[x][y] = 'l';
                posi[0] = x;
                posi[1] = y;
                res.add(posi);
                res.addAll(encontrarSillas(sillas,x,y+1,i+1));
                res.addAll(encontrarSillas(sillas,x+1,y,i+1));
                res.addAll(encontrarSillas(sillas,x,y-1,i+1));
                res.addAll(encontrarSillas(sillas,x-1,y,i+1));
            }else{
                res.addAll(encontrarSillas(sillas,x,y+1,i+1));
                res.addAll(encontrarSillas(sillas,x+1,y,i+1));
                res.addAll(encontrarSillas(sillas,x,y-1,i+1));
                res.addAll(encontrarSillas(sillas,x-1,y,i+1));
            }
        }
        return res;
    }
    
    public boolean tieneAdyascencias(char[][]sillas,int x,int y){
        boolean res = false;
        if(esValido(x+1,y,sillas) && sillas[x][y] == sillas[x+1][y]){
            res = true;
        }else{
            if(esValido(x+1,y,sillas) && sillas[x][y] == sillas[x][y+1]){
                res = true;
            }else{
                if(esValido(x+1,y,sillas) && sillas[x][y] == sillas[x-1][y]){
                    res = true;
                }else{
                    if(esValido(x+1,y,sillas) && sillas[x][y] == sillas[x][y-1]){
                        res = true;
                    }
                }
            }
        }
        return res; 
    }
    public boolean esValido(int x, int y, char[][]mat){
        return x >= 0 && y >= 0 && x < mat.length && y < mat[0].length;
    }
}
