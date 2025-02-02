package application;

import entities.Empregado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de funcionários:");
        int n = sc.nextInt();
        List<Empregado> lista = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Empregado #" + (i + 1)+":");
            sc.nextLine();
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            double salario = sc.nextDouble();
            System.out.println();
            lista.add(new Empregado(id, nome, salario));
        }

        System.out.println("Digite a ID do funcionário que terá seu salário aumentado:");
        int idAumento = sc.nextInt();
            Empregado emp = lista.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
        if (emp != null) {
            System.out.println("Qual a porcentagem do aumento?");
            double porcentagem = sc.nextDouble();
            emp.aumentarSalario(porcentagem);

        }
        else {
            System.out.println("Esse Id não foi encontrado!");
        }
        System.out.println();

            for (Empregado p : lista) {
                System.out.println(p);
            }

        sc.close();
    }

}
