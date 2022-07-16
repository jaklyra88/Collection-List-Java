package br.com.jaklyra.exercicios;

/*
    Utilizando listas, faça um programa que faça 5 perguntas para uma
    pessoa sobre um crime. As perguntas são:

    *** Respostas como S ou N" ***

    1  - Telefonou para vitima?;
    2 - Esteve no local do crime?;
    3 - Mora perto da vítima?;
    4 - Devia para a vitima?;
    5 - Já trabalhou com a vítima?

    Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita" , entre 3 e 4
    "Cúmplice" e 5 como "Assassina". Caso contrário , ela será classificado como "Inocente".
 */

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex3_Perguntas {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //CRIANDO AS LISTAS DE PERGUNTAS E RESPOSTAS
        List<String> perguntas = new ArrayList<String>();
        List<String> respostas = new ArrayList<String>();

        //ADICIONANDO AS PERGUNTAS A LISTA DE PERGUNTAS
        perguntas.add("1  - Telefonou para vitima?");
        perguntas.add("2 - Esteve no local do crime?");
        perguntas.add("3 - Mora perto da vítima?");
        perguntas.add("4 - Devia para a vitima?");
        perguntas.add("5 - Já trabalhou com a vítima?");

        //CRIANDO O ITERATOR PARA EXIBIR AS PERGUNTAS E RECEBER OS ELEMENTOS DA LISTA RESPOSTAS
        Iterator<String> iterator = perguntas.iterator();

        while(iterator.hasNext()){

            String next = iterator.next();
            System.out.println(next);
            respostas.add(scanner.next().toUpperCase());
        }

        System.out.println(" ");

        //VERIFICANDO A LISTA DE RESPOSTAS
        Iterator<String> iterator1 = respostas.iterator();

        int sim = 0;

        while(iterator1.hasNext()){

            String next = iterator1.next();

            if(next.equals("S")){
                sim++;
            }
        }

        //RESULTADO DO STATUS DAS RESPOSTAS
        System.out.println("Você é ");

        if(sim == 2){
            System.out.println("um Suspeito");
        }else if(sim >= 3 && sim <= 4){
            System.out.println("o Cúmplice");
        }else if(sim == 5){
            System.out.println("o Assassino");
        }else{
            System.out.println("Inocente");
        }


    }
}
