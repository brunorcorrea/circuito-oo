package main;

public class RelatorioGastos {
    private double totalSalarios = 0.0;
    private double totalBonusAnual = 0.0;

    public void atualizarGastos(Funcionario funcionario) {
        totalSalarios += funcionario.getSalario();
        totalBonusAnual += funcionario.getBonusAnual();
    }

    public double obterTotalSalarios() {
        return totalSalarios;
    }

    public double obterTotalBonusAnual() {
        return totalBonusAnual;
    }
}
