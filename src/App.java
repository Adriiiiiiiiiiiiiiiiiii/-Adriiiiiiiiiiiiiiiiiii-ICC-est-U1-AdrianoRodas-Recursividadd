public class App {
    public static void main(String[] args) {
        // Crear una instancia de la clase para acceder a los métodos
        EjerciciosRecursivos er = new EjerciciosRecursivos();
        
        // Llamar y mostrar el resultado de fibonacci(5)
        int resultadoFibonacci = er.fibonacci(5);
        System.out.println("El resultado de fibonacci(5) es: " + resultadoFibonacci);
        
        // Llamar y mostrar el resultado de sumaConsecutivos(5)
        int resultadoSumaConsecutivos = er.sumaConsecutivos(5);
        System.out.println("El resultado de sumaConsecutivos(5) es: " + resultadoSumaConsecutivos);
    }
}    