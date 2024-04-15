import java.util.Random;
import java.util.Scanner;
import java.io.IOException;
public class Aposta {

    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        Random sorteiaNum = new Random();

        int tipoJogo;
        int cnt = 0;
        int sorteia = 0;




        do {

            System.out.println("Escolha um jogo para apostar: \n 1- Aposta de 0 à 100\n 2- Aposta de A à Z \n 3- Aposta Par ou Ímpar\n ");
            tipoJogo = escolha.nextInt();

            switch (tipoJogo) {
                case 1:
                    System.out.println("Aposta de 0 à 100 ");
                    sorteia = sorteiaNum.nextInt(101);

                    Scanner numZC = new Scanner(System.in);
                    System.out.println("Digite um numero de 0 a 100");
                    int num = numZC.nextInt();

                    if (num == sorteia){
                        System.out.println("Você ganhou R$ 1.000,00 reais" );
                    }else{
                        System.out.println("Que pena! Você errou! o número sorteado foi: " + sorteia);
                    }
                    break;
                case 2:
                    System.out.println("Aposta de A à Z ");
                     String letraPremiada = "P";

                     Scanner letra = new Scanner(System.in);
                    System.out.println("Digite uma letra de A à Z ");
                    String LetraDigita = letra.next();

                    if (Character.isLetter(LetraDigita.charAt(0)) && LetraDigita.length() == 1) {

                        char letraDigitadaChar = LetraDigita.charAt(0);
                        letraDigitadaChar = Character.toUpperCase(letraDigitadaChar);


                        if (letraPremiada.equals(String.valueOf(letraDigitadaChar))){
                            System.out.println("Você ganhou R$ 500,00 reais");
                        }else {
                            System.out.println("Que pena! A letra sorteada foi: " + letraPremiada);
                        }

                    } else {
                        System.out.println(LetraDigita + " não é uma letra.");

                    }

                    break;
                case 3:
                    System.out.println("Aposta Par ou Ímpar");

                    Scanner numDigitado = new Scanner(System.in);

                    System.out.println("Digite um número");
                    int numPI = numDigitado.nextInt();

                    if (numPI%2==0) {
                        System.out.println("Você ganhou R$ 100,00 reais.");
                    }else{
                            System.out.println("Que pena! O número digitado é ímpar e a premiação foi para números pares.");
                    }

                    break;

                default:
                    System.out.println("Opção de aposta incorreta");

            }
            cnt++;
        }while (cnt<100);

    }
}
