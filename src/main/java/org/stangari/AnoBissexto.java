package org.stangari;

import java.util.Scanner;

public class AnoBissexto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int ano = scanner.nextInt();



        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 ==0 ) {
            System.out.println("Ano bissexto");

        }

    }

}