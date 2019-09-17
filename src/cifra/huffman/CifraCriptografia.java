/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifra.huffman;

/**
 *
 * @author Pedro
 */
public class CifraCriptografia {

    /**
     * Metodo de criptografia
     *
     */
    public static String encriptar(int chave, String texto) {
        // Variavel que ira guardar o texto crifrado
        StringBuilder textoCifrado = new StringBuilder();
        // Variavel com tamanho do texto a ser encriptado
        int tamanhoTexto = texto.length();

        // Criptografa cada caracter por vez 
        for (int i = 0; i < tamanhoTexto; i++) {
            // Transforma o caracter em codigo ASCII e faz a criptografia
            int letraCifradaASCII = ((int) texto.charAt(i)) + chave;

            // Verifica se o codigo ASCII esta no limite dos caracteres imprimiveis
            while (letraCifradaASCII > 126) {
                letraCifradaASCII -= 94;
            }

            // Transforma codigo ASCII criptografado em caracter ao novo texto
            textoCifrado.append((char) letraCifradaASCII);
        }

        // Por fim retorna a mensagem criptografada por completo
        return textoCifrado.toString();
    }

    /**
     * Metodo que descriptografa um texto, utilizando a famosa cifra Cesar.
     */
    public static String decriptar(int chave, String textoCifrado) {
        // Variavel que ira guardar o texto decifrado
        StringBuilder texto = new StringBuilder();
        // Variavel com tamanho do texto a ser decriptado
        int tamanhoTexto = textoCifrado.length();

        // Descriptografa cada caracter por vez
        for (int i = 0; i < tamanhoTexto; i++) {
            // Transforma o caracter em codigo ASCII e faz a descriptografia
            int letraDecifradaASCII = ((int) textoCifrado.charAt(i)) - chave;

            // Verifica se o codigo ASCII esta no limite dos caracteres imprimiveis
            while (letraDecifradaASCII < 32) {
                letraDecifradaASCII += 94;
            }

            // Transforma codigo ASCII descriptografado em caracter ao novo texto
            texto.append((char) letraDecifradaASCII);
        }

        // Por fim retorna a mensagem descriptografada por completo
        return texto.toString();
    }

}
