import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double tempK;

        String conversao;
        float temp1;
        float tempConvertida;

        System.out.println("Digite qual a medida de partida(Celcius, Fahrenheit ou Kelvin)");
        String partida = entrada.nextLine();

        //Bloco partindo de Celcius
        if (partida.equals("Celcius")) {
            System.out.println("Digite a temperatura de partida(apenas número)");
            temp1 = entrada.nextFloat();
            entrada.nextLine();

            //Verificação do zero absoluto
            if (temp1 >= -273.15) {
                System.out.println("Digite para qual medida será feita a conversão");
                conversao = entrada.nextLine();

                //Conversão de Celcius para Fahrenheit F = (C X 9/5) + 32
                if (conversao.equals("Fahrenheit")) {
                    tempConvertida = (temp1 * 9 / 5) + 32;
                    System.out.printf("A temperatura convertida de Celcius para Fahrenheit é: %.2fºF", tempConvertida);
                }
                //Conversão de Celcius para Kelvin K = C + 273.15
                else if (conversao.equals("Kelvin")) {
                    tempK = temp1 + 273.15;
                    System.out.printf("A temperatura convertida de Celsius para Kelvin é: %.4fºK", tempK);
                }
                else {
                    System.out.println("Opção inválida!");
                }
            }
            else {
                System.out.println("Não é permitido valores abaixo do zero absoluto!");
            }
        } //Fim do bloco partindo de celcius

        //Bloco partindo de Fahrenheit
        else if (partida.equals("Fahrenheit")) {
            System.out.println("Digite a temperatura de partida(apenas número)");
            temp1 = entrada.nextFloat();
            entrada.nextLine();

            //Verificação do zero absoluto
            if (temp1 >= -459.67) {
                System.out.println("Digite para qual medida será feita a conversão");
                conversao = entrada.nextLine();

                //Conversão de Fahrenheit para Celcius C = (F x 5/9) - 32
                if (conversao.equals("Celcius")) {
                    tempConvertida = (temp1 / 5 * 9) - 32;
                    System.out.printf("A temperatura convertida de Fahrenheit para Celcius é: %.2fºC", tempConvertida);
                }
                //Conversão de Fahrenheit para Kelvin -> converte de Fahrenheit para Celcius e depois para Kelvin
                else if (conversao.equals("Kelvin")) {
                    tempConvertida = (temp1 / 5 * 9) - 32;
                    tempK = tempConvertida + 273.15;
                    System.out.printf("A temperatura convertida de Celsius para Kelvin é: %.4fºK", tempK); //Utilizei a variável tempK no lugar da tempConvertida pois ela ja foi declarada como double e não é possível realizar operações entre variáveis do tipo float e double
                }
                else {
                    System.out.println("Opção inválida!");
                }
            }
            else {
                System.out.println("Não é permitido valores abaixo do zero absoluto!");
            }
        } //Fim do bloco partindo de Fahrenheit

        //Bloco partindo de Kelvin
        else if (partida.equals("Kelvin")) {
            System.out.println("Digite a temperatura de partida(apenas número)");
            temp1 = entrada.nextFloat();
            entrada.nextLine();

            //Verificação do zero absoluto
            if (temp1 >= 0) {
                System.out.println("Digite para qual medida será feita a conversão");
                conversao = entrada.nextLine();

                //Conversão de Kelvin para Celcius C = K - 273.15
                if (conversao.equals("Celcius")) {
                    tempK = temp1 - 273.15;
                    System.out.printf("A temperatura convertida de Kelvin para CelciusC é: %.2fºF", tempK);
                }
                //Conversão de Kelvin para Fahrenheit -> converte para Celcius depois converte para Fahrenheit
                else if (conversao.equals("Fahrenheit")) {
                    tempK = temp1 - 273.15;
                    tempK = (tempK * 9/5) + 32;
                    System.out.printf("A temperatura convertida de Kelvin para Fahrenheit é: %.2fºC", tempK); //Reutilizei a variável tempK pois ela ja foi declarada como double e não é possível realizar operações entre variáveis do tipo float e double
                }
                else {
                    System.out.println("Opção inválida!");
                }
            }
            else {
                System.out.println("Não é permitido valores abaixo do zero absoluto!");
            }
        } //Fim do bloco partindo de Kelvin

        else {
            System.out.println("Medida de temperatura inválida!");
        }
    }
}