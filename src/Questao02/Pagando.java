package Questao02;

import java.util.ArrayList;
import java.util.List;

public class Pagando {
    public static void main(String[] args) {

        Empresa funcionario1 = new CLT("Alice", false);
        Empresa funcionario2 = new CLT("Bruno", true);
        Empresa funcionario3 = new PJ("Carlos", true, 160, 25.0,"APi Online");
        Empresa funcionario4 = new PJ("Diana", true, 120, 40.0, "Calculadora de Frotas");


        List<Empresa> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(funcionario1);
        listaFuncionarios.add(funcionario2);
        listaFuncionarios.add(funcionario3);
        listaFuncionarios.add(funcionario4);


        for (int i = 0; i < 1; i++) {
            System.out.println("💰 Mês de Pagamento #" + (i + 1));
            for (Empresa funcionario : listaFuncionarios) {
                funcionario.realizarPagamento();
            }
        }

    }
}
