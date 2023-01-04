package java8.a_lambda_expressions;

interface Figura {
    void desenha();
}

public class B_InterfaceFuncionalPropria {

    public static void main(String[] args) {

        /**
         * Implementação tradicional do java anterior ao 8, definindo o método desenha da interface
         */
        Figura fig1 = new Figura() {
            @Override
            public void desenha() {
                System.out.println("Desenha figura 1");
            }
        };
        fig1.desenha();

        /**
         * Implementação utilizando a interface funcional definida por nós mesmos
         * Lembrando que uma interface funcional deve contar apenas 1 método
         * (neste caso, sem receber nenhum parametro)
         */
        Figura fig2 = () -> System.out.println("Desenha figura 2");
        fig2.desenha();

    }

}
