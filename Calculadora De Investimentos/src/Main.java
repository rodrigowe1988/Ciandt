import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String contas[] = {"Rico", "Modal", "Clear", "Sicredi", "Nubank", "Santander", "Bradesco"};

        double totalDasContas = 0;
        double investimentosPorDia[] = {};

        //total investido no dia 06/03/2022
        double investimentos0[] = {85713.59, 73587.37, 24144.00, 7424.22, 293.25, 5177.64, 2594.00};

        //laço que recebe o nome das contas e o valor que há nelas (podendo inserir no console)
        /*
        for (int i=0; i< contas.length; i++) {
            System.out.printf("Digite o saldo da conta %s: \n", contas[i]);
            double valor = sc.nextDouble();
            totalDasContas += valor;
        }*/

        //total investido no dia 08/03/2022
        double investimentos1[] =  {85360.74, 73199.59, 23527.83, 7424.65, 184.41, 5177.64, 2594.08};

        //total investido no dia 09/03/2022
        double investimentos2[] =  {85232.18, 72922.69, 23997.05, 10514.65, 8.51, 5177.64, 2594.08};

        //total investido no dia 29/03/2022
        double investimentos3[] =  {85232.18, 72922.69, 23997.05, 10514.65, 8.51, 5177.64, 2594.08};

        //total investido no dia 07/04/2022
        double investimentos4[] = {86523.06, 74518.94, 25167.59, 10099.07, 238.65, 5179.64, 4531.81};

        //total investido no dia 17/04/2022
        double investimentos5[] = {87111.63, 74852.95, 24360.75, 10540.88, 107.19, 5179.64, 4531.81};

        //criando um array com todos os totais já salvos
        ArrayList<Double> todosOsTotais = new ArrayList<>();

        SomandoSaldoDeContas totalInvestido0 = new SomandoSaldoDeContas("06/03/2022");
        totalInvestido0.metodoSomar(investimentos0);
        todosOsTotais.add(totalInvestido0.totalInvestidoNoDia);

        SomandoSaldoDeContas totalInvestido1 = new SomandoSaldoDeContas("08/03/2022");
        totalInvestido1.metodoSomar(investimentos1);
        todosOsTotais.add(totalInvestido1.totalInvestidoNoDia);

        SomandoSaldoDeContas totalInvestido2 = new SomandoSaldoDeContas("09/03/2022");
        totalInvestido2.metodoSomar(investimentos2);
        todosOsTotais.add(totalInvestido2.totalInvestidoNoDia);

        SomandoSaldoDeContas totalInvestido3 = new SomandoSaldoDeContas("29/03/2022");
        totalInvestido3.metodoSomar(investimentos3);
        todosOsTotais.add(totalInvestido3.totalInvestidoNoDia);

        SomandoSaldoDeContas totalInvestido4 = new SomandoSaldoDeContas("07/04/2022");
        totalInvestido4.metodoSomar(investimentos4);
        todosOsTotais.add(totalInvestido4.totalInvestidoNoDia);

        SomandoSaldoDeContas totalInvestido5 = new SomandoSaldoDeContas("17/04/2022");
        totalInvestido5.metodoSomar(investimentos5);
        todosOsTotais.add(totalInvestido5.totalInvestidoNoDia);

        //System.out.println(todosOsTotais);

        CalculaVariacao calculadoraVariacao = new CalculaVariacao();
        calculadoraVariacao.calcularVariacao(todosOsTotais);

//        //Loop para calcular a variação a cada consulta
//        double teste[] = {1, 3.4, 6.8, 10, 15, 10};
//
//        for (int i = 0; i < teste.length-1; i++) {
//            double variacao = 0;
//            double testeUm = ( teste[i + 1] * 100 / teste[i] ) - 100;
//            System.out.printf("A variação (em porcentagem) foi de : %.2f.\n", testeUm);
//        }

//        //ler os items do array do último até o primeiro
//        for (int i = teste.length -1; i >= 0; i--) {
//        }





    }
}