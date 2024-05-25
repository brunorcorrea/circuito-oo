package test;

import main.DesenvolvedorFrontEnd;
import main.Funcionario;

import java.util.ArrayList;
import java.util.List;

public class TesteDevFrontEnd {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario devFrontEnd = new DesenvolvedorFrontEnd("Nicolas", "65478968954", "12/12/2004", 99, 887);
        funcionarios.add(devFrontEnd);

        for (Funcionario funcionario : funcionarios) {
            funcionario.saudacao();
            System.out.println("Você recebe: R$" + funcionario.getSalario() + " de salário por mês, e: R$" + funcionario.getBonusAnual() + " de bonus anual!");
        }
    }
}
