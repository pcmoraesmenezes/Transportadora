

public class Veiculo2 {
    private double carga; //Note que agora as variaveis de instancia estão "encapsuladas" - ou seja estão protegidas pelo fato de estarem privadas
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
/*
Foi adicionado tambem nessa versão uma verificação de se é possivel ou não adicionar mais caixas ao veiculo
esse metodo em caso de ser possivel adicionar mais caixas ao veiculo retornara verdadeiro, caso contrario
retornara falso e não irá adicionar a caixa ao veiculo
 */
    public boolean adicionarCaixa(double peso) {
        double temp = this.carga + peso; //criação de uma variavel temporaria que receberá a carga atual do veiculo + a carga que se deseja adicionar
        if (temp > this.cargaMaxima) //Verificando se a carga que se deseja adicionar é maior que a carga maxima
            return false; //Se a carga ultrapassar o limite, não irá adicionar mais caixas
        this.carga+= peso; //senão ira adicionar a caixa
        return true;// e retornará verdadeiro
    }
}
