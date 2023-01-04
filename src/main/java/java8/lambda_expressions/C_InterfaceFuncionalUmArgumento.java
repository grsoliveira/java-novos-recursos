package java8.lambda_expressions;

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

public class C_InterfaceFuncionalUmArgumento {

    public static void main(String[] args) {
        List<C_Produto> lista = new ArrayList<>();

        lista.add(new C_Produto("TV", 200.0));
        lista.add(new C_Produto("DVD", 120.0));
        lista.add(new C_Produto("Home", 340.0));
        lista.add(new C_Produto("Alexa", 360.0));

        /**
         * o método foreach da lista é oferecido pela interface Iterable
         * foreach recebe como parametro uma outra interface chamada Consumer
         * a documentação informa que Consumer é uma interface funcional
         * o único método de Consumer abstrato é o accept(T t)
         */
        lista.forEach((p) -> System.out.println(p.getNome() + " - " + p.getPreco()));
    }
}
