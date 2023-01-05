package java8.f_string_joiner;

import java.util.StringJoiner;
import java.util.StringTokenizer;

/**
 * podemos dizer que a mesma é o oposto da String Tokenizer
 */
public class A_StringJoiner {

    public static void main(String[] args) {

        //String Tokenizer
        String nomes = " João, Pedro, Maria, Ana, Paulo";

        StringTokenizer st = new StringTokenizer(nomes, ",");
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        /**
         * String Joiner para juntar os elementos utilizando um delimitador
         */
        StringJoiner sj = new StringJoiner(", ");
        sj.add("João");
        sj.add("Pedro");
        sj.add("Maria");
        sj.add("Ana");
        sj.add("Paulo");

        System.out.println(sj);
    }
}
