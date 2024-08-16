package org.stangari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Crie uma função que retorne uma letra no alfabeto equivalante ao numero digitado, ex: 2, Output: A B
public class Alfabeto {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer nuser = scanner.nextInt();

        int min = 65;
        int max = 90;
        int soma = nuser + min;

        List<Character> resultSet = new ArrayList<>();

            if (soma <= max +1){

                for(int i= min; i <soma; i++){

                    char asc = (char)min++;
                    resultSet.add(asc);
                }

                System.out.println(resultSet);


        }
    }
}
