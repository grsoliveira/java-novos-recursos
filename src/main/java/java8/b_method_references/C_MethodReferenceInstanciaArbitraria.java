package java8.b_method_references;

import java.util.ArrayList;
import java.util.List;

class C_Produto {
    private String nome;
    private Double preco;

    C_Produto(String nome, Double preco) {
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

    public void imprime() {
        System.out.println(this.nome + " - " + this.preco);
    }
}

public class C_MethodReferenceInstanciaArbitraria {

    public static void main(String[] args) {
        List<C_Produto> lista = new ArrayList<>();

        lista.add(new C_Produto("TV", 200.0));
        lista.add(new C_Produto("DVD", 120.0));
        lista.add(new C_Produto("Home", 340.0));
        lista.add(new C_Produto("Alexa", 360.0));

        /**
         * fazendo referencia de método a partir do objeto do tipo produto
         */
        lista.forEach( C_Produto::imprime );
    }
}

