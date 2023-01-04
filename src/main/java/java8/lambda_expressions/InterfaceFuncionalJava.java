package java8.lambda_expressions;

public class InterfaceFuncionalJava {

    public static void main(String[] args) {

        /**
         * Utilizando o modo tradicional do Java anterior ao 8
         */
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Primeira thread em execução");
            }
        });
        t1.start();

        /**
         * Utilizando a interface funcional definida pelo próprio Java (sem argumentos)
         */
        Thread t2 = new Thread( () -> System.out.println("Segunda thread em execução"));
        t2.start();

    }

}
