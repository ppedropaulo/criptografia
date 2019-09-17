/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cifra.huffman;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class CifraHuffman {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        CifraCriptografia cifra = new CifraCriptografia();
        CodHuffman code = new CodHuffman();

        System.out.println("Insira o endereco do arquivo");
        String pathread = ler.next();

        String arqtxt = RwFiles.arqstring(pathread);

        System.out.println("Insira a chave para Cifra");
        int chave = ler.nextInt();
        String arqcript = CifraCriptografia.encriptar(chave, arqtxt);

        String arqHuff = CodHuffman.encode(arqcript);

        RwFiles.writestring(arqHuff, pathread);

        /**
         * DESCRIPTOGRAFIA
         *
         * System.out.println("Insira o endereco do arquivo"); String pathread =
         * ler.next();
         *
         * String arqtxt = RwFiles.arqstring(pathread);
         *
         * System.out.println("Insira a mesma chave para Cifra"); int chave =
         * ler.nextInt(); String arqHuff = CodHuffman.decode(arqtxt);
         *
         * String arqdescript = CifraCriptografia.descriptar(chave, arqHuff);
         *
         *
         *
         * RwFiles.writestring(arqdescript, pathread);
         *
         *
         */
        //System.out.println(CifraCriptografia.decriptar(chave,CodHuffman.decode(arqHuff)));
    }

}
