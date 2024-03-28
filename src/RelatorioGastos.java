public class RelatorioGastos {
    private double totalSalario = 0.0;
    private double totalBonus = 0.0;

    public void atualizaValores(Funcionario funcionario) {
        totalSalario += funcionario.getSalario();
        totalBonus += funcionario.getBonusAnual();
    }

    public double getTotalSalario() {
        return totalSalario;
    }

    public void setTotalSalario(double totalSalario) {
        this.totalSalario = totalSalario;
    }

    public double getTotalBonus() {
        return totalBonus;
    }

    public void setTotalBonus(double totalBonus) {
        this.totalBonus = totalBonus;
    }
}
