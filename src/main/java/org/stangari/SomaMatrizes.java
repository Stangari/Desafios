package org.stangari;

import java.util.ArrayList;
import java.util.List;

// Crie uma função que retorne a soma de duas matrizes

public class SomaMatrizes {
    public static void main(String[] args) {

        List<Integer> matriz1 = new ArrayList<Integer>();
        List<Integer> matriz2 = new ArrayList<Integer>();
        List<Integer> resultmatriz = new ArrayList<Integer>();

        for(int i=0; i < 4; i++){
            matriz1.add(i);
            matriz2.add(i+3);

        }
        for(int i=0; i < matriz1.size() ; i++){
            resultmatriz.add(matriz1.get(i) + matriz2.get(i));
        }

        System.out.println(matriz1);
        System.out.println(matriz2);
        System.out.println("=================");
        System.out.println(resultmatriz);

    }
}
