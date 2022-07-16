package br.com.jaklyra.exercicios;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
    Resolva utilizando os métodos da implementação Linnked List

    1- CRIE UMA LISTA CHAMADA NOTAS 2 E COLOQUE TODOS OS ELEMENTOS DO ARRAYLIST NESSA NOVA LISTA;
    2 - MOSTRE A PRIMEIRA NOTA DA NOVA LISTA SEM REMOVE-LO;
    3 - MOSTRE A PRIMEIRA NOTA  DA NOVA LISTA REMOVENDO-O;


 */
public class Ex1_Lista {

    public static void main(String[] args){

        List<Double> notas = new ArrayList<Double>();

        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        System.out.println("Criando uma lista chamada notas2");
        List<Double> notas2 = new LinkedList<Double>();

        System.out.println("Recebendo os elementos da Lista notas na Lista notas2");
        notas2 = notas;
        System.out.println(notas2);
        System.out.println(" ");

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("O elemento em primeira posição: " + notas2.get(0));
        System.out.println(notas2);
        System.out.println(" ");

        System.out.println("Mostre a primeira nota da nova lista sem removendo-o: ");
        System.out.println("O elemento em primeira posição: " + notas2.get(0));
        notas2.remove(0);
        System.out.println("Lista com o primeiro elemento removido");
        System.out.println(notas2);
        System.out.println(" ");
    }
}
