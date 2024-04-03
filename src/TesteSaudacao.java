import java.util.ArrayList;
import java.util.List;

public class TesteSaudacao {

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        Funcionario cientistaDados = new CientistaDados("Vinão", "54324332143", "03/03/2004", 1000.0, 45);
        funcionarios.add(cientistaDados);

        Funcionario gerenteTI = new GerenteTI("Bruno", "43564674564", "09/01/2004", 7666.45, 5, "12", "abc212");
        funcionarios.add(gerenteTI);

        Funcionario pessoaProgramadora = new PessoaProgramadora("Nicolas", "65478968954", "12/12/2004", 877.8, 99);
        funcionarios.add(pessoaProgramadora);

        Funcionario devFrontEnd = new DevFrontEnd("Nicolas", "65478968954", "12/12/2004", 877.8, 99, 675);
        funcionarios.add(devFrontEnd);

        for (Funcionario funcionario : funcionarios) {
            funcionario.saudacao();
        }
    }
}
