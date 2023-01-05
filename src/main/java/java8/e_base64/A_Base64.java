package java8.e_base64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * Base64 é util para transformar dados binários em strings para serem transmitidas pela rede
 * útil para transferir arquivos em formato json, por exemplo
 */
public class A_Base64 {

    public static void main(String[] args) {

        String texto = "A classe Base64 no Java8!";
        System.out.println("String original: " + texto);

        String textoCodificado = Base64.getEncoder().encodeToString(texto.getBytes(StandardCharsets.UTF_8));
        System.out.println("String Codificada: " + textoCodificado);

        String textoDecodificado = new String(Base64.getDecoder().decode(textoCodificado), StandardCharsets.UTF_8);
        System.out.println("String Decodificada: " + textoDecodificado);

        /**
         * atencao ao uso de getUrlEncoder/Decoder para urls
         * atencao ao uso de getMimeTypeEncoder/Decoder para arquivos
         */
    }
}
