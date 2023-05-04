
public class TesteVeiculo {
    public static void main(String [] args)
    {   System.out.println("Criando um veiculo com carga maxima de (10000.0) ");
        Veiculo veiculo = new Veiculo(10000.0);
        veiculo.carga = veiculo.carga + 100;
        System.out.println("Adicionando carga de (" + veiculo.carga+")");
        veiculo.carga = veiculo.carga + 400;
        System.out.println("Adicionando carga de (400)");
        veiculo.carga = veiculo.carga + 4000;
        System.out.println("Adicionando carga de (4000)");
        System.out.println("Carga do veículo: (" +  veiculo.carga+")");
    }
}
