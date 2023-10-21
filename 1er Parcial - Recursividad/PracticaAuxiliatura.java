import java.util.ArrayList;

public class PracticaAuxiliatura{
    
    //Ejercicios de números primos
    
    public boolean esPrimo(int n){
        return esPrimo(n,n/2);
    }
    
    private boolean esPrimo(int n, int i){
        boolean res = true;
        if(i == 1 || n == 1){
            res = true;
        }else{
            if(n%i == 0){
                res = false;
            }else{
                res = esPrimo(n, i-1);
            }
        }
        return res;
    }
    
    public int primerPrimo(int n){
        return primerPrimo(n,2);
    }
    
    private int primerPrimo(int n, int i){
        int res = n;
        if(i<=n/2){
            if(n%i == 0 && esPrimo(i)){
                res = i;
            }else{
                res = primerPrimo(n,i+1);
            }
        }
        return res;
    }
    
    private ArrayList<Integer> encontrarFactores(int num){
        ArrayList<Integer> factores  = new ArrayList<Integer>();
        encontrarFactores(num,factores);
        return factores;
    }
    
    private void encontrarFactores(int num, ArrayList<Integer> lista){
        int pp = primerPrimo(num); 
        if(esPrimo(num)){ 
            lista.add(num); 
        }else{ 
            int n = num/pp; 
            lista.add(pp); 
            encontrarFactores(n,lista);
        }
    }
    
    //Sumar primos de una secuencia, ej 13
    
    public int sumarPrimos(int[] sec){
        return sumarPrimos(sec, 0, sec.length-1);
    }
    
    private int sumarPrimos(int[]sec,int i, int f){
        int suma = 0;
        if(f == 0){
            suma = 0;
        }else{
            suma = sumarPrimos(sec, i, f-1) + sumarONo(sec[f]);
        }
        return suma;
    }
    private int sumarONo(int n){
        int res = 0;
        if(esPrimo(n)){
            res = n;
        }
        return res;
    }
    
    //Promedio ejercicio 18
    
    private int contarCifras(int n){
        int cont = 0;
        if(n<10){
            cont = 1;
        }else{
            cont += contarCifras(n/10) + 1;
        }
        return cont;
    }
    
    public int promedio(int n){
        int prom = 0;
        if(contarCifras(n) == 2){
            prom = -(n/10) + (n%10);
        }else{
            if(contarCifras(n)%2 == 0){
                prom += promedio(n/10)+(n%10);
            }else{
                prom += promedio(n/10)-(n%10);
            }
        }
        return prom;
    }
}
