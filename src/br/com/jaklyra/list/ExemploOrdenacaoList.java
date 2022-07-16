package br.com.jaklyra.list;

/*
    Dados as seguintes informações sobre gatos, crie uma lista
    e ordene esta lista exibindo:
    (nome, idade, cor);

    Gato 1: nome: Jon , idade: 18 , cor: preto
    Gato 2: nome: Simba, idade: 6 , cor: tigrado
    Gato 3: nome: Jon, idade: 12 , cor: amarelo

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {

    public static void main(String[] args){


        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato ("Simba", 6,"tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
        }};


        //EXIBINDO OS ITENS PELA ORDEM DE INSERÇÃO - EM LIST OS ELEMENTOS FICAM NA ORDEM QUE FORAM ADICIONADOS
        System.out.println("--\t Ordem de Inserção\t---");
        System.out.println(gatos);
        System.out.println(" ");

        //NÃO EXISTE MÉTODO NATIVO - UTLIZAR O METODO SHUFFLE DA CLASSE COLLECTION
        System.out.println("--\t Ordem Aleatória\t---");
        Collections.shuffle(gatos);
        System.out.println(gatos);
        System.out.println(" ");

        //VAMOS
        System.out.println("--\t Ordem Natural (Nome)\t---");
        //SORT FAZ A COMPARAÇÃO DOS ELEMENTOS DA LISTA PARA ORGANIZAR
        //UTILIZADO O COLLECTIONS, POIS ELE FAZ A COMPARAÇÃO DE ELEMENTOS DA LISTA
        //PARA ISSO NECESSITA DA INTERFACE COMPARABLE
        Collections.sort(gatos);
        System.out.println(gatos);
        System.out.println(" ");


        System.out.println("--\t Ordem Idade\t---");
        Collections.sort(gatos,new ComparatorIdade());
        //gatos.sort(new ComparatorIdade());
        System.out.println(gatos);
        System.out.println(" ");

        System.out.println("--\t Ordem Cor\t---");
        //Collections.sort(gatos, new ComparatorCor ());
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);
        System.out.println(" ");

        System.out.println("--\t Ordem Nome/Cor/Idade\t---");
        Collections.sort(gatos, new ComparatorNomeCorIdade());
        //gatos.sort(new ComparatorNomeCorIdade());
        System.out.println(gatos);

    }
}

//INTERFACE COMPARABLE OBRIGADA A SOBRESCREVER A INTERFACE COMPARETO
class Gato implements Comparable<Gato>{

    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    //CRIADO PARA QUE APAREÇA O CONTEÚDO DA LISTA E NÃO A POSIÇÃO DE MEMÓRIA
    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    //INTERFACE COMPARABLE - RETORNA UM INT
    //TEM RETORNO BOOLEANO DE 0 PARA IGUAL,  1 PARA MAIOR E -1 PARA MENOR.
    //COMPARA OS ELEMENTOS PARA ORGANIZAR OS ELEMENTOS DA LISTA
    //compareToIgnoreCase - FAZ A COMPARAÇÃO
    @Override
    public int compareTo(Gato gato) {
        //UTILIZAMOS O THIS, POIS ESTAMOS DENTRO DA CLASSE GATO
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}
    //CRIADA A CLASSE , POIS JÁ UTILIZAMOS O COMPARABLE
    class ComparatorIdade implements Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            return Integer.compare(g1.getIdade(),g2.getIdade());
        }
    }

    class ComparatorCor implements  Comparator<Gato>{

        @Override
        public int compare(Gato g1, Gato g2) {
            //NÃO UTILIZAMOS O THIS, POIS ESTAMOS FORA DA CLASSE GATO
            return g1.getCor().compareToIgnoreCase(g2.getCor());
        }
    }

    class ComparatorNomeCorIdade implements Comparator<Gato>{

    //SOBRESCREVENDO O COMPARE
        @Override
        public int compare(Gato g1, Gato g2) {

            //SE OS NOMES FOREM DIFERENTES, ORDENAR PELO NOME
            int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if (nome != 0){
                return nome;
            }

            //SE OS NOMES FOREM IGAUSI E OS NOMES DIREFENTES , ORDENEM PELA COR
            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if (cor != 0){
                return cor;
            }

            //SE NOMES E CORES FOREM IGUAIS, ORDENAR POR IDADE
           return Integer.compare(g1.getIdade(), g2.getIdade());

        }
    }