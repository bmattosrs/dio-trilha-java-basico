import java.util.*;

public class ContaBanco {
    private String agenciaConta;
    private int numeroConta;
    private String nomeCliente;
    private float saldo = 0;

    //construtor
    public ContaBanco(String nomeCliente, int opcaoAgencia){
        this.nomeCliente = nomeCliente;
        this.agenciaConta = selecionaAgencia(opcaoAgencia);
        this.numeroConta = geradorConta();
    }

    //gera um número de conta de forma dinâmica
    private int geradorConta(){
        int aleatorio = new Random().nextInt(1,1000000)+ 1;
        return aleatorio;
    }

    //retorna um resumo geral de infos da conta
    public void getInformacoesConta(){
        System.out.printf("Obrigado por criar sua conta no ClaroBank. Segue dados bancários:\nTITULAR: %s - AG:%s - conta CC:%d.\nSeu saldo é de R$%.2f e já está disponível para saque.\n\n", nomeCliente, agenciaConta, numeroConta, saldo);
    }

    //lista agências - possível melhoria futura: transformar isso em um map, para ficar mais dinâmco
    public static void listaAgencias(){
        System.out.println("1. AG: 2121-0 Claro Norte - Amazonas, Roraima, Amapá, Pará, Tocantins, Rondônia, Acre\n2. AG: 2122-0 Claro Nordeste - Maranhão, Piauí, Ceará, Rio Grande do Norte, Pernambuco, Paraíba, Sergipe, Alagoas, Bahia\n3. AG: 2123-0 Claro Centro-Oeste - Mato Grosso, Mato Grosso do Sul, Goiás\n4. AG: 2124-0 Claro Sudeste - São Paulo, Rio de Janeiro, Espírito Santo, Minas Gerais\n5. AG: 2125-0 Claro Sul - Paraná, Rio Grande do Sul, Santa Catarina");
    }

    //retorna o número da agência baseado na opção numérica recebida do usuário - se implementada a melhoria da lista agências, essa função pode ser removida.
    private String selecionaAgencia(int opcaoAgencia){
        String agenciaSelecionada;

        switch (opcaoAgencia) {
            case 1:
                agenciaSelecionada = "2121-0";
                break;
            
            case 2:
                agenciaSelecionada = "2122-0";
                break;
        
            case 3:
                agenciaSelecionada = "2123-0";
                break;

            case 4:
                agenciaSelecionada = "2124-0";
                break;

            case 5:
                agenciaSelecionada = "2125-0";
                break;

            default:
                agenciaSelecionada = "0";
                break;
        }
        return agenciaSelecionada;
    }
}
