package java8.d_stream;

import java.util.*;

class A_Produto {
    private Integer codigo;
    private String nome;
    private Double preco;

    public A_Produto(Integer codigo, String nome, Double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
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

class OrdenaProdudoPorPreco implements Comparator<A_Produto> {
    @Override
    public int compare(A_Produto p1, A_Produto p2) {
        return p1.getPreco().compareTo(p2.getPreco());
    }
}

public class A_Stream {

    public static void main(String[] args) {

        List<A_Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new A_Produto(1000, "Geladeira 470L", 2999.00));
        listaProdutos.add(new A_Produto(2000, "TV UHD 50''", 3500.00));
        listaProdutos.add(new A_Produto(1001, "TV UHD 65''", 5000.00));
        listaProdutos.add(new A_Produto(3000, "Microondas 20L", 399.00));
        listaProdutos.add(new A_Produto(1001, "Geladeira 120L", 900.00));
        listaProdutos.add(new A_Produto(4000, "Computador i5 4GB", 2429.00));
        listaProdutos.add(new A_Produto(1002, "Geladeira 500L", 3100.00));

        //1 - lista de geladeiras
        List<A_Produto> listaGeladeiras = new ArrayList<>();
        for(A_Produto p : listaProdutos) {
            if (p.getNome().contains("Geladeira")) {
                listaGeladeiras.add(p);
            }
        }

        //2 - ordena a lista de geladeiras
        Collections.sort(listaGeladeiras, new OrdenaProdudoPorPreco());

        //3 - lista de nomes das geladeiras
        List<String> listaNomesGeladeiras = new ArrayList<>();
        for(A_Produto p : listaGeladeiras) {
            listaNomesGeladeiras.add(p.getNome().toUpperCase(Locale.ROOT));
        }

        //4 - imprime a lista de nomes das geladeiras
        for(String nome : listaNomesGeladeiras) {
            System.out.println(nome);
        }

        /**
         * resolvendo o mesmo problema utilizando pipelines (saída de um passo é entrada do próximo)
         * para isso precisamos de um fluxo de dados (stream)
         * como listaDeProdutos herda de Collections, podemos simplesmente invocar o stream da lista
         * a interface stream oferece diversos métodos (para serem utilizados com method reference)
         *
         * 1 - filter recebe uma interface funcional Predicate (com metodo test())
         * 2 - sorted recebe uma interface funcional Comparator (com metodo compare(x, y))
         * 3 - map recebe uma interface funcional Function (com metodo aply(obj))
         * 4 - usando method reference para imprimir o resultado final usando forEach
         */
        listaProdutos.stream()
                .filter( p -> p.getNome().contains("Geladeira"))
                .sorted((p1, p2) -> p1.getPreco().compareTo(p2.getPreco()))
                .map(p -> p.getNome().toUpperCase())
                .forEach(System.out::println);
    }
}
