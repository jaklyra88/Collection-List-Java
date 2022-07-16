package br.com.jaklyra.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args){


        //Dada uma lista com 7 notas de um aluno [ 7,8.5, 9.3, 5,7,0, 3.6], faça:

       //List notas = new ArrayList(); //antes do java 5
       //List<Double> notas = new ArrayList<>(); //Generics (jdk5) - diamont operator ( jdk7)
       //ArrayList<Double> notas = new ArrayList<>(); //Instanciando a lista  - NÃO RECOMENDADO
       //List<Double> notas = new ArrayList<> (Arrays, asList(7d,8.5, 9.3, 5d,7d,0d, 3.6)); - Instanciando o arrayLista e passando os elementos como argumento
       //List<Double> notas = Arrays.asList(7d,8.5, 9.3, 5d,7d,0d, 3.6); //limitada, não podemos adicionar ou remover itens da lista
       //notas.ass(10d);
       // System.out.println(notas);


        /*
        List<Double> notas = List.of(7d,8.5, 9.3, 5d,7d,0d, 3.6); //Cria uma lista que não podemos adicionar e nem remover
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);
         */


        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>(); //Iniciando a variável - Criando uma lista

        //ADICIONANDO OS ELEMENTOS NA LISTA
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5d);
        notas.add(7d);
        notas.add(0d);
        notas.add(3.6);

        //IMPRIMINDO OS ELEMENTOS DA LISTA
        System.out.println(notas + " ");
        System.out.println(notas.toString());
        System.out.println(" ");

        //MÉTODO PARA EXIBIR A POSIÇÃO DE UM ELEMENTO DENTRO DA LISTA
        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
        System.out.println(" ");

       //MÉTODO PARA ADICIONAR UM ELEMENTO EM UMA DETERMINADA POSIÇÃO NA LISTA
        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);
        System.out.println(" ");

        //MÉTODO PARA SUBSTITUIR ITENS DA LISTA EM DETERMINADA POSIÇÃO
        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);
        System.out.println(" ");

        //MÉTODO PARA VERIFICAR SE O ELEMENTO ESTÁ NA LISTA
        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
        System.out.println(" ");

        //PERCORRENDO E EXIBINDO OS ELEMENTOS DA LISTA NA ORDEM QUE FORAM INSERIDOS
        System.out.println("Exiba todas as notas na ordem em que foram inseridas: ");
        for (Double nota: notas) {
            System.out.println(nota);
        }
        System.out.println(" ");

        //EXIBINDO ITEM DA LISTA EM DETERMINADA POSIÇÃO
        System.out.println("Exiba a terceira nota adicionada " + notas.get(2));
        System.out.println(notas.toString());
        System.out.println(" ");

        //NÃO EXISTE MÉTODO NATIVO - UTILIZAMOS O COLLECTIONS PARA VERIFICAR A LISTA E RETORNAR O MENOR VALOR
        //UTILIZANDO O MÉTODO COMPARABLE
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println(" ");

        //NÃO EXISTE MÉTODO NATIVO - UTILIZAMOS O COLLECTIONS PARA VERIFICAR A LISTA E RETORNAR O MENOR VALOR
        //UTILIZANDO O MÉTODO COMPARABLE
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        System.out.println(" ");

        //NÃO EXISTE MÉTODO NATIVO - PODEMOS UTILIZAR O MÉTODO ITERATOR PARA ITERAR OS ELEMENTOS DA LIST
        //ITERANDO OS ELEMENTOS DA LISTA
        System.out.println("Exiba a soma dos valores: ");

        //CRIANDO UMA VARIÁVEL DO PADRÃO ITERATOR DO TIPO DOUBLE
        Iterator<Double> iterator = notas.iterator();

        //DECLARANDO E INICIALIZANDO A VARIÁVEL
        Double soma = 0d;

        //LAÇO QUE FAZ A LEITURA DOS ELEMENTOS DENTRO DA LISTA E RECEBE OS VALORES E ITERA DENTRO DA VARIÁVEL SOMA

        //HASNEXT ENTRA NO LAÇO SE HOUVER UM PRÓXIMO ELEMENTO QUANDO A RESPOSTA AO HASNEXT FOR TRUE
        //O CURSOR PERCORRE TODA A LISTA E RETORNA TRUE QUANDO HÁ UM ELEMENTO APÓS O PONTEIRO
        while(iterator.hasNext()){

           //A VATIÁVEL NEXT RECEBE UM ITEM DA LISTA
           Double next = iterator.next();

           //O ELEMENTO QUE ESTÁ NA VARIÁVEL NEXT É SOMADO AO QUE JÁ ESTÁ NA VARIÁVEL SOMA
           soma += next;

        }

        System.out.println("Soma dos elementos da Lista notas: " + soma);
        System.out.println(" ");

        //MÉTODO SIZE UTILIZADO PARA INFORMAR O TAMANHO DA LISTA - RETORNA UM INTEIRO QUE É A QUANTIDADE DE ELEMENTOS DA LISTA
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
        System.out.println(" ");

        //REMOVENDO ITENS DA LISTA UTILIZANDO O REMOVE - INFORMANDO O ELEMENTO QUE DESEJA EXCLUIR (O)
        System.out.println("Remova a nota 0");

        //REMOVENDO PELO ELEMENTO
        notas.remove(0d);

        System.out.println(notas);
        System.out.println(" ");

        //REMOVENDO ITENS DA LISTA UTILIZANDO O REMOVE - INFORMANDO O ELEMENTO PELO ÍNDICE (I)
        System.out.println("Remova a nota na posição 0: ");

        //REMOVENDO PELO ÍNDICE
        notas.remove(0);

        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

                Iterator<Double> iterator1 = notas.iterator();

                //FAZ A VARREDURA DA LIST ENQUANTO HOUVER ELEMENTOS NA LISTA
                while(iterator1.hasNext()){

                    //CRIANDO UMA VARIÁVEL PARA RECEBER OS ELEMENTOS
                    Double next = iterator1.next();

                    //CONDIÇÃO PARA ENTRAR NA CONDIÇÃO
                    if(next < 7){

                        //SE FOR VERDADEIRO ELE EXCLUI O ELEMENTO DA LISTA
                        iterator1.remove();
                    }
                }

        System.out.println(notas);
        System.out.println(" ");

        System.out.println("Apague toda a lista");

        //MÉTODO QUE EXCLUI TODOS OS ELEMENTOS DA LISTA
        notas.clear();
        System.out.println(notas);
        System.out.println(" ");

        //MÉTODO -BOOLEAN-  PARA VERIFICAÇÃO SE A LISTA ESTÁ VAZIA
        //RETORNA TRUE SE ESTIVER VAZIA E FALSE SE HOUVER ELGUM ELEMENTO
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}
