package com.java.jovemaula.logica; //sempre é lido de tras para frente,e escreto ex:jovemaula.java.com

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EstruturaDeDecisao {
    public static void main(String[] args) throws ParseException {
            numeroPar();
            StringIgual();
            StringInicial();
            datas();
    }

	private static void numeroPar() {
		Integer numero = 4;

        if (numero % 2 != 0) {
          // executo aqui quando falso
            System.out.println("impar");
        } else {
           // executo codigo daqui verdadeiro
            System.out.println("par");
        }
    }


    private static void StringIgual(){
        String frase = "hoje é sexta feira";

        if (frase.contains("segunda feira")){
            if(frase.contains("seis da tarde")){
                System.out.println("hora de alegria");
        }
        }else if(
                frase.contains("sexta feira")
                ||
                frase.contains("sabado")
                ||
                frase.contains("domingo")
        ){
            System.out.println("dia de alegria");
        }else{
            System.out.println("dia normal");
        }
    }

    private static void StringInicial(){
        String palavra = "abacaxi";
        if (palavra.startsWith("a")){
            System.out.println("palavra iniciada em a");
        }else{
            System.out.println("palavra iniciada com outra letra");
        }
    }


    private static void datas() throws ParseException {
            Date data = new SimpleDateFormat("dd/mm/yyyy").parse("21/05/2223");
        if (data.before(new Date())){
            System.out.println("esse dia ja passou");
        }else{
            System.out.println("esse dia está por vir");
        }
    }
}


