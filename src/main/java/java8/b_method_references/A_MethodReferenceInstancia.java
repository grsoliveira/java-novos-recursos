package java8.b_method_references;

interface A_Figura2D{
    void desenha(Double largura, Double altura);
}

class A_Retangulo {
    public void desenhaRetangulo(Double largura, Double altura) {
        System.out.println("Desenha retangulo largura: "+ largura + " e altura: " + altura);
    }
}

public class A_MethodReferenceInstancia {

    public static void main(String[] args) {
        //utilizando lambda expression
        A_Figura2D fig1 = (l, a) -> System.out.println("Desenha retangulo largura: "+ l + " e altura: " + a);
        fig1.desenha(8.0, 1.5);

        /**
         * utilizando methodo reference
         * classe/objeto :: método referenciado
         * precisamos então de um objeto que tenha um metodo de desenho com 2 argumentos (semelhante ao da figura2D)
         *
         * o método desenha (de figura2d) será referenciado por um metodo de instancia de um objeto particular (ret)
         * neste caso, o texto exibido será o conteúdo de desenhaRetangulo(...) devido à referência
         */
        A_Retangulo ret = new A_Retangulo();
        A_Figura2D fig2 = ret::desenhaRetangulo;
        fig2.desenha(10.5, 7.0);
    }
}
