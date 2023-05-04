

public class Veiculo2 {
    private double carga;
    private double cargaMaxima;

    public Veiculo2(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public boolean adicionarCaixa(double peso) {
        double temp = this.carga + peso;
        if (temp > this.cargaMaxima)
            return false;
        this.carga+= peso;
        return true;
    }
}
