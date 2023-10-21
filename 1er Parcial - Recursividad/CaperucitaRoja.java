
public class CaperucitaRoja
{
    private char [][] tab;

    public CaperucitaRoja(char[][]tab){
        this.tab = tab;
    }

    public int caminar(char[][] campo, int x, int y){
        int res = 0;
        if(esValida(x, y)){
            if(campo[x][y] == 'A'){
                res = 0;
            }else{
                if(campo[x][y] != 'C' && campo[x][y] != '$' ){
                    if(campo[x][y] == 'F'){
                        res = res + 1;
                    }
                    campo[x][y] = '$';
                    int right = res + caminar(campo,x,y+1);
                    int down = right + caminar(campo,x+1,y);
                    int left = down + caminar(campo,x,y-1);
                    int up = left + caminar(campo,x-1,y);
                    
                    res = Math.max(up,Math.max(left,Math.max(right, down)));
                }
            }
        }
        return res;
    }

    private boolean esValida(int x, int y){
        return x < tab.length && y < tab[0].length && x >= 0 && y >= 0;
    }
}

