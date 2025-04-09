public class Nota {
    private double periodo1;
    private double periodo2;
    private double periodo3;

    public Nota(double periodo1, double periodo2, double periodo3) {
        this.periodo1 = periodo1;
        this.periodo2 = periodo2;
        this.periodo3 = periodo3;
    }

    public double getPeriodo1() {
        return periodo1;
    }

    public void setPeriodo1(double periodo1) {
        this.periodo1 = periodo1;
    }

    public double getPeriodo2() {
        return periodo2;
    }

    public void setPeriodo2(double periodo2) {
        this.periodo2 = periodo2;
    }

    public double getPeriodo3() {
        return periodo3;
    }

    public void setPeriodo3(double periodo3) {
        this.periodo3 = periodo3;
    }

    public double calcularNotaFinal() {
        return periodo1 + periodo2 + periodo3;
    }

    public double calcularPromedio() {
        return (periodo1 + periodo2 + periodo3) / 3.0;
    }
}
