package org.stangari;

// Retorne uma estrutura de escada com as dimensões do numero que foi inserido

import java.util.Scanner;

public class Escada {
    public static void main(String[] args) {
        int print = 0;
        Scanner scanner = new Scanner(System.in);
        int tamanho = scanner.nextInt();
        if (tamanho > 0 && tamanho < 8) {

            for (int v = 0; v > tamanho; v++) {

                for (int h = 0; h > tamanho; h++) {
                    if(tamanho - v - 2 < h) {
                        System.out.print("#");
                    }
                    else{
                        System.out.print("x");
                    }
                }
                System.out.println();
            }
        }
    }
}