package br.com.jaklyra.exercicios;

/*
    Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e armazene-as
    //em uma lista

    Calcule a média semestral das temperaturas e mostre todas as temperaturas acima da média,
    e em que mês elas ocorreram ( mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro, etc)
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2_TemperaturaMedia {

    public static void main(String[] args){

         List<Double> temperatura = new ArrayList<Double>();

        System.out.println("CÁLCULO DE TEMPERATURA \n");

        System.out.println("Informe a tempetarura dos 6 primeiros meses do ano: \n");


        //RECEBENDO OS ELEMENTOS DA LISTA
        temperatura.add(1.5);
        temperatura.add(7.8);
        temperatura.add(25.0);
        temperatura.add(21.2);
        temperatura.add(17.8);
        temperatura.add(10.3);

        System.out.println("Temperaturas: ");
        System.out.println(temperatura);
        System.out.println(" ");

        //SOMANDO E CALCULANDO E MEDIA
        System.out.println("Média da temperatura do semeste: ");

        Iterator<Double> iterator = temperatura.iterator();

        double soma = 0d;

        while(iterator.hasNext()){
            Double next = iterator.next();
           soma += next;
        }

        double media = (soma / temperatura.size());

        System.out.println(media);
        System.out.println("");

        //EXIBINDO AS TEMPERATURAS ACIMA DA MÉDIA E O MÊS EM QUE OCORREU
        Iterator<Double> iterator1 = temperatura.iterator();

        double maioresTemperaturas = 0d;
        int mes = 0;

        while(iterator1.hasNext()){

            Double next = iterator1.next();
            mes++;

            System.out.println("Mêses com a temperatura acima da média: ");

            if(next > media) {
            }else if(mes == 1) {
                System.out.println("Janeiro");
                System.out.println(next);
                System.out.println(" ");
            }else if(mes == 2){
                System.out.println("Fevereiro");
                System.out.println(next);
                System.out.println(" ");
            }else if(mes==3){
                System.out.println("Março");
                System.out.println(next);
                System.out.println(" ");
            }else if(mes==4){
                System.out.println("Abril");
                System.out.println(next);
                System.out.println(" ");
            }else if(mes==5){
                System.out.println("Maio");
                System.out.println(next);
                System.out.println(" ");
            }else{
                System.out.println("Junho");
                System.out.println(next);
                System.out.println(" ");
            }



        }



    }






}
