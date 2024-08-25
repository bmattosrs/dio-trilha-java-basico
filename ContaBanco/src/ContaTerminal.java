import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //iniciando o scanner
        Scanner scanner = new Scanner(System.in);
        
        //inicializando as variáveis pra usar mais tarde
        String nome;
        int agencia;

        System.out.println("Olá, seja bem-vindo ao ClaroBank - Você merece o novo! Para iniciarmos o processo de abertura da sua conta, digite seu nome:");
        nome = scanner.nextLine();
        
        //validação do nome
        while(nome.length() < 3){
            System.out.println("Não entendi seu nome. Digite novamente");
            nome = scanner.nextLine();
        }

        System.out.printf("\nPerfeito, %s. Agora é hora de escolher sua agência ClaroBank. Digite a opção escolhida:\n", nome);

        //busca a lista de agências lá no arquivo ContaBanco
        ContaBanco.listaAgencias();
        agencia = scanner.nextInt();
        
        //validação da agência
        while(agencia < 1 || agencia > 5){
            System.out.println("Não entendi a agência escolhida. Digite novamente");
            agencia = scanner.nextInt();
        }

        //timer
        System.out.println("\nEstamos gerando sua conta... Você + conectado com a inovação\n");
        Thread.sleep(1000);

        //geração da conta em si
        ContaBanco contaBanco = new ContaBanco(nome, agencia);

        //retorno dos dados gerados
        contaBanco.getInformacoesConta();
        
        //fechamento do scanner para evitar gasto de memória
        scanner.close();
    }
}
