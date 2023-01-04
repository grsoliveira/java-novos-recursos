package java8.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

class E_Produto {
    private String nome;
    private Double preco;

    E_Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}

public class E_LambdaComMultiplasAcoes {

    public static void main(String[] args) {
        List<E_Produto> lista = new ArrayList<>();

        lista.add(new E_Produto("TV", 200.0));
        lista.add(new E_Produto("DVD", 120.0));
        lista.add(new E_Produto("Home", 340.0));
        lista.add(new E_Produto("Alexa", 360.0));

        //exemplo com 1 argumento
        lista.forEach((p) -> System.out.println(p.getNome() + " - " + p.getPreco()));

        //exemplo com 2 argumentos
        lista.sort((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()));

        /**
         * imprimindo a lista novamente utilizando o bloco delimitado por chaves
         * para ser possível utiizar mais de uma instrução no lambda
         */
        lista.forEach((p) -> {
            System.out.println(p.getNome());
            System.out.println(p.getPreco());
        });
    }
}

