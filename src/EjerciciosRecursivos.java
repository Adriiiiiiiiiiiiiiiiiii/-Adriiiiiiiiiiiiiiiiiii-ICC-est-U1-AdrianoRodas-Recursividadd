public class EjerciciosRecursivos {
    public int fibonacci(int n){
        if(n<=1){
            return n;
        }
        return fibonacci(-1)+fibonacci(n-2);
    }   
    public int sumaConsecutivos(int n){
        //if (n==1) return 1;
        //return n + sumaConsecutivos(-1);
        if (n==1){
            return 1;
        }
        int resultadoParcial=sumaConsecutivos(-1);
        int resultado=n+resultadoParcial;
        return resultado;
        }
    }

