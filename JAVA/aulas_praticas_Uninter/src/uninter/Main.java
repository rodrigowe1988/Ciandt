package uninter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        //System.out.printf("O IMC é de : %.2f.\n", Imc.calcularImc());
        //Espartanos.espartanos();
        //System.out.println(ReverseStrings.reverseStrings());

        // aula sobre médias
        /*
        Avaliacao aluno1 = new Avaliacao();
        Avaliacao aluno2 = new Avaliacao(5, 4, 10);

        aluno1.nota1 = 7;
        aluno1.nota2 = 4;
        aluno1.nota3 = 10;
        System.out.printf("Média Aritmética -> aluno 1: %.2f \n", aluno1.mediaAritmerica());
        System.out.printf("Média Ponderada -> aluno 1: %.2f\n", aluno1.mediaPonderada());
        System.out.printf("Média Aritmética -> aluno 2: %.2f \n", aluno2.mediaAritmerica());
        System.out.printf("Média Aritmética -> aluno 2: %.2f \n", aluno2.mediaPonderada());

        */

        //como criar a classe Aluno e atribuir a classe Avaliacao a ela
        /*
        Aluno a1 = new Aluno("Luigi", "Encanador", new Avaliacao(7, 4, 10));
        Aluno a2 = new Aluno("Mario", "Encanador", new Avaliacao(5, 7, 9));

        a1.info();
        a2.info();

        */

        //criar conta banco com os métodos sacar(), depositar() e info()
        /*
        Conta contaTeste = new Conta();
        Conta conta01 = new Conta();
        contaTeste.saldo = 30000;
        contaTeste.limite = 5000;
        contaTeste.titular = "Rodrigo";
        contaTeste.numero = 1111;
        contaTeste.info();
        contaTeste.sacar(3000);
        contaTeste.info();
        contaTeste.depositar(4025.5);
        contaTeste.info();
        */

        //métodos públicos usando getters e setters
        /*
        Nota aluno1 = new Nota();
        aluno1.setFaltas(5);
        aluno1.setNota1(4);
        aluno1.setNota2(70);
        aluno1.resultado();

        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*");
        Nota aluno2 = new Nota(70, 9, 5);
        aluno2.resultado();
        */

        //Criar classe Curso e AlunoNew para aplicar desconto do aluno na mensalidade do curso
        /*
        AlunoNew aluno1 = new AlunoNew("Rodrigo", 111, 0.15, new Curso("Engenharia", 1000));

        aluno1.info();
        */

        //exercício 04 - moeda e cofrinho
        /*
        Cofrinho cofre1 = new Cofrinho();

        cofre1.add(new Moeda("Euro", 0.5));
        cofre1.add(new Moeda("Euro", 0.1));
        cofre1.add(new Moeda("Euro", 1));
        cofre1.add(new Moeda("Euro", 0.05));

        System.out.println("O total do cofrinho é: " + cofre1.calcularTotal());
     */

        //exercício de herança com livros (físico, digital)


    }


}
