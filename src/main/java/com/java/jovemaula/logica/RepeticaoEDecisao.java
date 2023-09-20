package com.java.jovemaula.logica;

import java.util.ArrayList;

public class RepeticaoEDecisao {
    public static void main(String[] args) {
        ArrayList<Integer> listaDeUmADez = new ArrayList<>();

        for(int posicao = 1; posicao <= 10 ; posicao = posicao + 1 ){
            listaDeUmADez.add(posicao);
        }
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numeroImpares = new ArrayList<>();

        for (Integer numero : listaDeUmADez){
            if (numero % 2 == 0 ) {
                numerosPares.add(numero);
            }else {
                numeroImpares.add(numero);
            }
        }
        for(Integer numeroPar : numerosPares) {
            System.out.println(numeroPar);
        }
        for(Integer numeroImpar : numeroImpares){
            System.out.println(numeroImpar);
        }
    }
}
