package com.java.jovemaula.logica;

import java.util.ArrayList;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        //listadePalavras();
        forClassico();
        inverterString();
    }

    private static void listadePalavras() {
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("victor");
        palavraList.add("mito");
        palavraList.add("utsuki");
        palavraList.add("saori");

        for(String palavras : palavraList) {
            System.out.println(palavraList);
        }
    }

    private static void forClassico() {
        ArrayList<String> palavraList = new ArrayList<>();

        palavraList.add("victor");
        palavraList.add("mito");
        palavraList.add("utsuki");
        palavraList.add("saori");

        for(int i = 0; i<palavraList.size(); i++) {
            System.out.println(palavraList.get(i));
        }
    }



    private static void inverterString() {
        String normal = "12345";

        String invertida = "";

        for(int posicao = normal.length() -1; posicao >= 0 ; posicao = posicao -1){
            invertida = invertida + normal.charAt(posicao);
        }
        System.out.println(invertida);
    }
}
