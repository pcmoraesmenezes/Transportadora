public class Veiculo {//uma classe publica com duas variaveis de instancia e quatro metodos
    public double carga;
    public double cargaMaxima;

    public Veiculo(double cargaMaxima)
    {
        this.cargaMaxima = cargaMaxima;
    }
    public double getCarga() //Metodo para retornar a carga atual do veiculo
    {
        return carga;
    }
    public void setCarga(double carga) //define a carga atual do veiuclo
    {
        this.carga = carga;
    }
    public double getCargaMaxima() //retorna a capacidade maxima de carga do veiculo
    {
        return cargaMaxima;
    }
    public void setCargaMaxima(double cargaMaxima) //define a capacidade maxima de carga do veiculo
    {
        this.cargaMaxima = cargaMaxima;
    }
}
