package java8.method_references;

import java.util.ArrayList;
import java.util.List;

class B_Produto {
    private String nome;
    private Double preco;

    B_Produto(String nome, Double preco) {
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

class B_Impressora {
    public static void imprime(B_Produto p) {
        System.out.println(p.getNome() + " - " + p.getPreco());
    }
}

public class B_MethodReferenceEstatico {

    public static void main(String[] args) {
        List<B_Produto> lista = new ArrayList<>();

        lista.add(new B_Produto("TV", 200.0));
        lista.add(new B_Produto("DVD", 120.0));
        lista.add(new B_Produto("Home", 340.0));
        lista.add(new B_Produto("Alexa", 360.0));

        /**
         * fazendo referencia direta ao método estatico de B_Impressora
         */
        lista.forEach( B_Impressora::imprime );
    }
}

