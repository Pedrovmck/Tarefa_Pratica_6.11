public class Exercicio_2 {
    public static void main(String[] args) {

        int[] vetor = {34,9,12,73,50};

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                vetor[i]*=2;
            }else {
                vetor[i] *= vetor[i];
            }
        }
        exibeVetor(vetor);

    }
    public static void exibeVetor(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}
