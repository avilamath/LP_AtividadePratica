
import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

//declarando as variaveis e inserindo o peso da pesca    
        double pesoDePeixes, excesso, multa;
        System.out.println("Quantos quilos de peixe foram pescados hoje?");
        pesoDePeixes = entrada.nextDouble();

//calculando o valor da multa e do excesso
        excesso = (pesoDePeixes - 50);
        multa = (4 * excesso);
//aplicando as condicoes de acordo com o excesso
        if (pesoDePeixes <= 50) {
            System.out.println("Muito bem! A quantidade de peixes pescados esta dentro do regulamento de pesca do estado de Sao Paulo.");
        } else if (pesoDePeixes > 50) {
            System.out.println("Você excedeu a quantidade de peixes permitida em " + (excesso) + "kg.");
            System.out.println("Sua multa será de, aproximadamente, R$" + (multa));
        }
    }
}
