package com.mycompany.repasojava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Apuntes {

    public static void main(String[] args) {

        int[] notasAlumnos = new int[4];

        for (int i = 0; i < 4; i++) {
            notasAlumnos[i] = 0;
        }

        int[][] mat = new int[3][4];

        for (int f = 0; f < mat.length; f++) {
            for (int c = 0; c < mat[f].length; c++) {
                mat[f][c] = (int) (Math.random() * 10 + 1);
            }
        }

        ArrayList lista = new ArrayList();
        lista.add("Lenguaje");
        lista.add("Bases de Datos");
        lista.add("Vamos a aprobarlas todas esta semana");

        lista.remove(1);

        Map<Integer, Character> mapa = new TreeMap<Integer, Character>();

        mapa.put(1, 'a');
        mapa.put(2, 'b');
        mapa.put(3, 'c');
        mapa.put(4, 'd');
        mapa.put(5, 'e');

        mapa.remove(4);

        for (int i = 0; i < mapa.size(); i++) {
            System.out.println(mapa.get(i + 1));
        }

        Iterator<String> iter = lista.iterator();

        while (iter.hasNext()) {
            String elemento = iter.next();
            System.out.println(elemento);
        }

    }

    public void sumaMatriz(int[][] s1, int[][] s2, int[][] res) {
        for (int f = 0; f < res.length; f++) {
            for (int c = 0; c < res[f].length; c++) {
                res[f][c] = s1[f][c] + s2[f][c];
            }
        }
    }

}
