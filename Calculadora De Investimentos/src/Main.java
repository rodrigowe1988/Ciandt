import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

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

        //total investido no dia 24/04/2022
        double investimentos6[] = {87019.27, 74655.31, 23778.62, 6226.21, 4058.43, 4850.52, 4531.81};

        //total investido no dia 01/05/2022
        double investimentos7[] = {87116.42, 74586.01, 23289.27, 5914.83, 3715.43, 4390.79, 4531.81};

        //total investido no dia 08/05/2022
        double investimentos8[] = {86746.42, 74098.01, 22436.27, 12850.32, 10422.96};

        //total investido no dia 20/05/2022
        double investimentos9[] = {87144.94, 83761.99, 22304.26, 597.81, 41.57, 1336.01, 4170.01, 9362.28};

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

        SomandoSaldoDeContas totalInvestido6 = new SomandoSaldoDeContas("24/04/2022");
        totalInvestido6.metodoSomar(investimentos6);
        todosOsTotais.add(totalInvestido6.totalInvestidoNoDia);

        SomandoSaldoDeContas totalInvestido7 = new SomandoSaldoDeContas("01/05/2022");
        totalInvestido7.metodoSomar(investimentos7);
        todosOsTotais.add(totalInvestido7.totalInvestidoNoDia);

        SomandoSaldoDeContas totalInvestido8 = new SomandoSaldoDeContas("08/05/2022");
        totalInvestido8.metodoSomar(investimentos8);
        todosOsTotais.add(totalInvestido8.totalInvestidoNoDia);

        SomandoSaldoDeContas totalInvestido9 = new SomandoSaldoDeContas("20/05/2022");
        totalInvestido9.metodoSomar(investimentos9);
        todosOsTotais.add(totalInvestido9.totalInvestidoNoDia);

        CalculaVariacao calculadoraVariacao = new CalculaVariacao();
        calculadoraVariacao.calcularVariacao(todosOsTotais);




    }
}