public class Main {
    public static void main(String[] args) {
        // Creacion de una calculadora basica
        Calculator myCalculator = new Calculator();

        //prueba de suma
        System.out.println(myCalculator.add(5,7));

        //prueba de resta
        System.out.println(myCalculator.subtract(45,11));

        //prueba de multiplicacion
        System.out.println(myCalculator.multiply(4,8));

        //prueba de division
        System.out.println(myCalculator.divide(16,8));

        //prueba de modulo
        System.out.println(myCalculator.module(154,3));
    }
}
