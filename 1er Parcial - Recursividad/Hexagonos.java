public class Hexagonos
{
    public int calcularNivel(int niv){
        int res;
        if(niv == 1){
            res = 6;
        }else{
            if(niv %2 == 0){
                res = calcularNivel(niv-1) + 6*4;
            }else{
                res = calcularNivel(niv-1) + 6*3 + 6*4;
            }
        }
        return res;
    }
}
