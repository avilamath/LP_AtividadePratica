import java.util.Scanner; // Importar o pacote do comando de entrada.

public class exercicio06 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // Criação do buffer para armazenar os dados do teclado.

        int contador = 0, numeroAluno, alunoMaior = 0, alunoMenor = 99999, altura, maior = 0, menor = 99999; // Declaração das variáveis e inicialização do contador.

        System.out.println("Seja bem-vindo novamente, professor!"); // Inicialização de boas vindas.

        do { // Primeira etapa da criação do laço de reptição e suas instruções.
            System.out.println("Digite o numero do aluno: ");
            numeroAluno = entrada.nextInt();
            entrada.nextLine();

            System.out.println("Digite a altura em centimetros do aluno: ");
            altura = entrada.nextInt();
            entrada.nextLine();

            if ( altura > maior ) { // Condição para localizar a maior altura digitada.
                maior = altura; // Armazenar a altura do maior aluno.
                alunoMaior = numeroAluno; // Armazenar o número do maior aluno.
            } 
            
            if ( altura < menor ) { // Condição para localizar a menor altura digitada.
                menor = altura; // Armazenar a altura do menor aluno.
                alunoMenor = numeroAluno; // Armazenar o número do menor aluno.
            } 

            contador++; // Incremento do contador para que seja possível contar de zero a dez.

        } while ( contador < 10 ); // Última etapa para definir qual será a condição, ou seja, a quantidade de vezes em que o contador repetirá todas as intruções acima.

        System.out.println("O aluno numero " + alunoMaior + " e o maior aluno da turma com " + maior + "cm."); // Irá imprimir o resultado do maior aluno.
        System.out.println("O aluno numero " + alunoMenor + " e o menor aluno da turma com " + menor + "cm."); // Irá imprimir o resultado do menor aluno.
    }
}