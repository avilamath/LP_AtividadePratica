
import java.util.Scanner;
import java.text.DecimalFormat;
public class exercicio03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
//declarando as variaveis
        double pesoMaca, pesoMorango, precoFinal, pesoTotal, precoMorango, precoMaca;

//boas vindas e definicao de valores a partir do usuario
        System.out.println("Bem vindo ao comercio de frutas! Informe as quantidades de cada produto e nós calcularemos o valor da sua compra.");
        System.out.println("Informe a quantidade de macas que deseja, em quilos:");
        pesoMaca = input.nextDouble();
        System.out.println("Informe a quantidade de morangos que deseja, em quilos:");
        pesoMorango = input.nextDouble();
               
//declarando os precos dos produtos, o preco final e o peso total
        precoMorango = (pesoMorango * 2.5);
        precoMaca = (pesoMaca * 1.8);
        pesoTotal = (pesoMorango + pesoMaca);
        precoFinal =(precoMaca + precoMorango);

//implementando as condicoes de acordo com o peso e valor total
        if (pesoMaca > 5) {
        precoMaca = (1.5 * pesoMaca);
        } else if (pesoMorango > 5) {
        precoMorango = (2.2 * pesoMorango);
        } if (pesoTotal > 8) {
        precoFinal = ((precoMorango + precoMaca) - (precoMorango + precoMaca) * 0.1);
        } else if (precoFinal > 25) {
        precoFinal = ((precoMorango + precoMaca) - (precoMorango + precoMaca) * 0.1);
        }
//exibindo o resultado 
        System.out.println("A quantidade de macas adquiridas é de: " + pesoMaca + "kg.");
        System.out.println("A quantidade de morangos adquiridos é de: " + pesoMorango + "kg.");
        System.out.println("O preco total da sua compra é de R$" + df.format(precoFinal) + ".");
    }
}

