import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Exceções (try-catch)

        // Bloco try
        // Contém o bloco de código que representa a execução normal do trecho de código que PODE gerar alguma exceção

        // Bloco catch
        // Contém o código que deve ser executado caso a exceção ocorra.
        // O tipo de exceção deve ser especificado (a prática de utilizar uma classe mais "genérica" de exceção que engloba outras
        // é chamada de UPCASTING e é muito comum seu uso).

        // Sintaxe:
        // try {
        //  código que deve ser executado normalmente }
        // catch (tipoExceção alias) {
        //  código para tratar a exceção caso ela ocorra }


        try {
        System.out.println("Exemplo simples de exceção: O índice que deveria ser um número terá valor de uma letra");
        System.out.println("Digite palavras separadas por espaço que serão adicionadas ao vetor");
        String[] vetor = sc.nextLine().split(" ");

        System.out.print("Digite o índice de palavra que deseja buscar: ");
        int indice = sc.nextInt();
        sc.nextLine();
        System.out.print("Palavra correspondente: " + vetor[indice] + "\n");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inexistente!");
        }
        catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        }

        System.out.println("Fim do programa");
        sc.close();
    }
}