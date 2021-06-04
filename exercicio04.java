import java.util.Scanner; // Importar o pacote do comando de entrada.

public class exercicio04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Criação do buffer para armazenar os dados do teclado.

        // Declaração de variáveis. 
        char escolha_usuario;
        double qtd_litros, A_alcool, G_gasolina, desconto_alcool_1, desconto_alcool_2, desconto_gasolina_1, desconto_gasolina_2, gasolina_final_1, gasolina_final_2, alcool_final_1, alcool_final_2; 

        
        // Inicialização e menu de opções do programa.
        System.out.println("================ Escolha do usuario ================");
        System.out.println("               A - alcool = 1.90 litro              ");
        System.out.println("               G - gasolina = 2.50 litro            ");
        System.out.println("====================================================");
        escolha_usuario = entrada.next().charAt(0);

        // Declaração dos valores das variáveis. 
        A_alcool = 1.90;
        G_gasolina = 2.50;

        switch ( escolha_usuario ) { // Direcionamento de acordo com a opção digitada (A ou G).
            case 'A':
            System.out.println("Agora digite quantos litros deseja: ");
                qtd_litros = entrada.nextDouble();

            if ( qtd_litros <= 20 ) { // Desconto de 3% para até 20 litros de Álcool.
                desconto_alcool_1 = (qtd_litros * A_alcool) * 0.03;
                alcool_final_1 = (qtd_litros * A_alcool) - desconto_alcool_1;

                System.out.println("O valor a ser pago e: " + alcool_final_1);
                System.out.println("Agradecemos a preferencia, volte sempre! Se beber nao dirija.");
            }
            else if ( qtd_litros >= 20 ) { // Desconto superior a 20 litros de Álcool.
                desconto_alcool_2 = (qtd_litros * A_alcool) * 0.05;
                alcool_final_2 = (qtd_litros * A_alcool) - desconto_alcool_2;

                System.out.println("O valor a ser pago e: " + alcool_final_2);
                System.out.println("Agradecemos a preferencia, volte sempre! Se beber nao dirija.");
            }
            break;

            case 'G':
            System.out.println("Agora digite quantos litros deseja: ");
                qtd_litros = entrada.nextDouble();

            if ( qtd_litros <= 20 ) { // Desconto de até 20 litros de Gasolina.
                desconto_gasolina_1 =  (qtd_litros * G_gasolina) * 0.04;
                gasolina_final_1 = (qtd_litros * G_gasolina) - desconto_gasolina_1;

                System.out.println("o valor a ser pago e: " + gasolina_final_1);
                System.out.println("Agradecemos a preferencia, volte sempre! Se beber nao dirija.");
            }
            else if ( qtd_litros >= 20 ) { // Desconto superior a 20 litros de Gasolina.
                desconto_gasolina_2 = (qtd_litros * G_gasolina) * 0.06;
                gasolina_final_2 = (qtd_litros * G_gasolina) - desconto_gasolina_2;

                System.out.println("o valor a ser pago e: " + gasolina_final_2);
                System.out.println("Agradecemos a preferencia, volte sempre! Se beber nao dirija.");
            }
            break;
            default: // Finalizará o programa caso digite uma opção não existente.
            System.out.println("Opcao invalida! Reinicie e tente novamente.");
        }
    }
}