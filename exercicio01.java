import java.util.Scanner;
public class exercicio01 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//declaracao das variaveis
        double tamArea, qtdeLitros, qtdeLatas, precoFinal;
        int precoI, latasI;
//boas vindas e valor a partir do usuario
        System.out.println("Bem vindo ao comercio de tintas! Esse programa irá auxiliar a comprar a quantidade correta de tintas para sua reforma.");
        System.out.println("Insira o tamanho da area a ser pintada, em metros quadrados:");
        tamArea = input.nextDouble();
//calculando a quantidade de litros de acordo com a area informada
        qtdeLitros = Math.ceil(tamArea / 3);
//calculando a quantidade de latas a partir dos litros 
        qtdeLatas = Math.ceil(qtdeLitros / 18);
// calculando o valor final de acordo com a quantidade de latas
        precoFinal = (qtdeLatas * 80);
//convertendo resultados para inteiro, para melhor exibicao do resultado
        latasI = (int)qtdeLatas;
        precoI = (int)precoFinal;
// imprimindo as informacoes para o usuario
        System.out.println("A quantidade de latas a ser comprada é de: " + latasI + ".");
        System.out.println("O valor total da compra é de R$" + precoI + ",00");
    }
}
