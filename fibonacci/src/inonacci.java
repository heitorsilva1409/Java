public class Main {
    public static void main(String[] args) {
        calculoFibonacci();
    }
    public static void calculoFibonacci() {

        int anterior;
        int atual = 1;
        int soma = 0;

        while (soma < 10) {
            System.out.println(soma);
            anterior = atual;
            atual = soma;
            soma = anterior + atual;
        }
    }
}