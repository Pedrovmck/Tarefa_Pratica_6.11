import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {

        int[] vetor = {3,65,2,864,78,9,26,100};
        bubbleSortCresc(vetor);
        exibeVetor(vetor);

        Scanner scan = new Scanner(System.in);

        System.out.println("Escreva seu nome");
        String nome = scan.nextLine();
        int cont = 0;
        String c = "";

        for (int i = 0; i < nome.length(); i++) {
            c = String.valueOf(nome.charAt(i));
            String vogais = "aeiou";
            if (vogais.contains(c)){
                cont++;
            }
        }
        System.out.println("Seu nome tem "+cont+" vogais.");

    }


    public static void bubbleSortCresc(int[] lista){
        for (int k = 0; k < lista.length; k++) {
            for (int i = k; i < lista.length; i++) {

                if (lista[k] > lista[i]) {
                    int valorTemporario = lista[k];
                    lista[k] = lista[i];
                    lista[i] = valorTemporario ;
                }
            }
        }

    }

    public static void exibeVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}