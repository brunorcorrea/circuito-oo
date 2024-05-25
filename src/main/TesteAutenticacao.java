package main;

public class TesteAutenticacao {
    public static void main(String[] args) {
           CientistaDados C = new CientistaDados();
           C.setNome("Biro");
           C.setCPF("12345678900");
           C.setDataNascimento("05/06/2003");
           C.setCrcd(23);
           C.setSalario(12.23);

//           if(C.autentica("4567")) {
//               System.out.println("main.Funcionario autenticado com sucesso");
//           } else {
//               System.out.println("Falha ao autenticar, senha incorreta");
//           } Mudança de requisitos fez com que isso não funcione
    }
}