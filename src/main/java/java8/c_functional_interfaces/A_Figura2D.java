package java8.c_functional_interfaces;

/**
 * Interfaces funcionais são aquelas que possuem apenas 1 método abstrato
 * Anotamos as mesmas com @FunctionalInterface para evitar implementarmos outros métodos
 *
 * Caso uma interface anotada receba a implementação de outros métodos abstratos, um erro de compilação ocorre
 */
@FunctionalInterface
public interface A_Figura2D {

    void desenha(Double largura, Double altura);
}
