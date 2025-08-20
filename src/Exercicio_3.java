import java.util.Scanner;

import static java.lang.Integer.reverse;

public class Exercicio_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite alguma frase:");
        String nome = scan.nextLine();

        StringBuilder teste = new StringBuilder(nome);
        String reversed = teste.reverse().toString();

        System.out.println("sua frase ao contrario fica assim '"+reversed+"'");

    }

}
