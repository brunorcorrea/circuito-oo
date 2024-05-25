package main;

public class TesteAutenticacavel {
    public static void main(String[] args) {
           AuditorRH auditorRH = new AuditorRH();
           auditorRH.setSenha("4567");

           if(auditorRH.autentica("4567")) {
               System.out.println("Auditor autenticado com sucesso");
           } else {
               System.out.println("Falha ao autenticar, senha incorreta");
           }
    }
}