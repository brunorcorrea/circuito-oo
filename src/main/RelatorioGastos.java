package main;

public class RelatorioGastos {
    private double totalSalarios = 0.0;
    private double totalBonusAnual = 0.0;

    public void atualizaGastos(Funcionario funcionario) {
        totalSalarios += funcionario.getSalario();
        totalBonusAnual += funcionario.getBonusAnual();
    }

    public double getTotalSalarios() {
        return totalSalarios;
    }

    public double getTotalBonusAnual() {
        return totalBonusAnual;
    }
}
