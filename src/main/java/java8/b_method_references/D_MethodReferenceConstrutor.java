package java8.b_method_references;

interface D_Figura2D{
    D_Retangulo desenha(Double largura, Double altura);
}

class D_Retangulo {
    public D_Retangulo(Double largura, Double altura) {
        System.out.println("Desenha retangulo largura: "+ largura + " e altura: " + altura);
    }
}

public class D_MethodReferenceConstrutor {

    public static void main(String[] args) {

        /**
         * fazendo referencia ao construtor da classe usando a palavra new
         * (aplicação típica: em padrões do tipo Factory -> FactoryMethod)
         */
        D_Figura2D fig1 = D_Retangulo::new;

        fig1.desenha(10.0, 2.5);
    }
}
