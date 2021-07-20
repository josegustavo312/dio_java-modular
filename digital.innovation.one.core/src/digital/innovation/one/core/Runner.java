package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;

public class Runner {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora");
        System.out.println("");

        System.out.println("Soma");
        System.out.println(calculadora.sum(9,3));
        System.out.println("");

        System.out.println("Subtração");
        System.out.println(calculadora.sub(9,3));
        System.out.println("");

        System.out.println("Multiplicação");
        System.out.println(calculadora.mult(9,3));
        System.out.println("");

        System.out.println("Divisão");
        System.out.println(calculadora.div(9,3));
        System.out.println("");

    }

}
