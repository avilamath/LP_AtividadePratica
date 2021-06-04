import java.util.Scanner; // Importar o pacote do comando de entrada.

public class exercicio05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Criação do buffer para armazenar os dados do teclado.

        // Declaração das variáveis.
        char resposta = 's';
        int contador = 0;
        double temperatura, media, maior = 0, menor = 99999, acumulador = 0; 

        System.out.println("Seja bem-vindo(a)!"); // Inicialização de boas vindas.

        do { // Primeira etapa da criação do laço de repetição e suas instruções.
            System.out.println("Digite a temperatura: ");
            temperatura = entrada.nextDouble();

            System.out.println("Deseja inserir outra temperatura? (s/n): ");
            resposta = entrada.next().charAt(0); 

            if ( temperatura > maior ) { // Condição para localizar a maior temperatura digitada.
                maior = temperatura; // Armazenar a maior temperatura.
            } 
            
            if ( temperatura < menor ) { // Condição para localizar a menor temperatura digitada.
                menor = temperatura; // Armazenar a menor temperatura.
            } 

            acumulador = acumulador + temperatura; // Guardar os números das temperaturas.
            contador++; // Incremento do contador para contar quantas temperaturas serão digitadas.

        } while ( resposta == 's' ); // Última etapa da condição da resposta em char: 's' , para continuar ou finalizar o programa.
            media = acumulador / contador;  // Conta para localizar a média final das temperaturas,    

        System.out.println("A maior temperatura e: " + maior + "."); // Irá imprimir o resultado da maior temperatura.
        System.out.println("A menor temperatura e: " + menor + "."); // Irá imprimir o resultado da menor temperatura.
        System.out.println("A media das temperaturas e: " + media + "."); // Irá imprimir o resultado da média das temperaturas.
    }
}