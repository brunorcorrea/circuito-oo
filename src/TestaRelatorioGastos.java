import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class TestaRelatorioGastos {

    public static void main(String[] args) {
        var relatorioGastos = new RelatorioGastos();

        Funcionario funcionario = new Funcionario("Mitsuo", "12331234232", "12/02/2004", 322.2);
        relatorioGastos.atualizaValores(funcionario);

        Funcionario cientistaDados = new CientistaDados("Vinão", "54324332143", "03/03/2004", 1000.0, 45);
        relatorioGastos.atualizaValores(cientistaDados);

        Funcionario gerenteTI = new GerenteTI("Bruno", "43564674564", "09/01/2004", 7666.45, 5, "12", "abc212");
        relatorioGastos.atualizaValores(gerenteTI);

        Funcionario pessoaProgramadora = new PessoaProgramadora("Nicolas", "65478968954", "12/12/2004", 877.8, 99);
        relatorioGastos.atualizaValores(pessoaProgramadora);

        System.out.printf("O valor total gasto em salários é: %.2f\n", relatorioGastos.getTotalSalario());
        System.out.printf("O valor total gasto em bonus é: %.2f\n", relatorioGastos.getTotalBonus());

        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(funcionario);
        listaFuncionarios.add(cientistaDados);
        listaFuncionarios.add(gerenteTI);
        listaFuncionarios.add(pessoaProgramadora);

        listaFuncionarios.forEach(func -> {
            if (func instanceof GerenteTI) {
                System.out.println("Seu tipo é Gerente TI");
            } else if (func instanceof CientistaDados) {
                System.out.println("Seu tipo é Cientista de Dados");
            } else if (func instanceof PessoaProgramadora) {
                System.out.println("Seu tipo é Pessoa Programada");
            } else {
                System.out.println("Seu tipo é Funcionário");
            }

//            System.out.println("Seu tipo é " + func.getClass());
            System.out.println("Bem vindo! " + func.getNome());
        });
    }
}
