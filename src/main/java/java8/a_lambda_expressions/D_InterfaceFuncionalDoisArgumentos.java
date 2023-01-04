package java8.a_lambda_expressions;

import java.util.ArrayList;
import java.util.List;

class D_Produto {
    private String nome;
    private Double preco;

    D_Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

public class D_InterfaceFuncionalDoisArgumentos {

    public static void main(String[] args) {
        List<D_Produto> lista = new ArrayList<>();

        lista.add(new D_Produto("TV", 200.0));
        lista.add(new D_Produto("DVD", 120.0));
        lista.add(new D_Produto("Home", 340.0));
        lista.add(new D_Produto("Alexa", 360.0));

        //exemplo com 1 argumento
        lista.forEach((p) -> System.out.println(p.getNome() + " - " + p.getPreco()));

        /**
         * o método sort da lista recebe como parametro uma interface Comparator
         * a documentação informa que a Comparator é uma interface funcional
         * o único método abstrato de Comparator é o compare(T o1, T o2)
         */
        lista.sort( (p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

        //imrpimindo a lista novamente
        lista.forEach((p) -> System.out.println(p.getNome() + " - " + p.getPreco()));
    }
}
