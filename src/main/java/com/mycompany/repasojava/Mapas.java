package com.mycompany.repasojava;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {

    public static void main(String[] args) {
    
        ArrayList<String> hola = new ArrayList<String>();
        
        Map<Integer, String> Nombre = new TreeMap<Integer, String>();
        
        Nombre.put(1, "Hola1");
        Nombre.put(1, "Hola2 ");
        Nombre.put(1,"Hola3 ");
        
        for (int i = 0; i < Nombre.size(); i++) {
            System.out.println(Nombre.get(i+1));
        }
    }
}