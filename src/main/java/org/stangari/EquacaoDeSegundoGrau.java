package org.stangari;

//Crie uma função que retorne o valor de uma equação de segundo grau

public class EquacaoDeSegundoGrau {
    public static void main(String[] args) {
        int a = 1;
        int b = -3;
        int c = -10;

        double delta = (b * b) - 4 * a * c;

        int raizA = (int) (-b + Math.sqrt(delta));
        int resultA = raizA / 2 * a;
        int raizB = (int) (-b - Math.sqrt(delta));
        int resultB = raizB / 2 * a;
        System.out.println(resultA +","+ resultB);
    }
}
