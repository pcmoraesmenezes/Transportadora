public class Veiculo3 {
    public class Veiculo2 {
        private double carga;
        private double cargaMaxima;

        /*
        Primeira mudança dessa versão para a anterior, aqui desejamos calcular os pesos em Newton das cargas
        Então para o metodo abaixo ao inves de apenas adicionarmos a carga maxima
        Chamamos um metodo que converte o peso da cargaMaxima de kg para Newtons
         */
        public Veiculo2(double cargaMaxima) {
            this.cargaMaxima = quilosParaNewtons(cargaMaxima);
        }
/*
O mesmo é valido para esse metodo, você converte a carga em kg para newtons
 */
        public double getCarga() {
            return newtonsParaQuilos(carga);
        }

        public void setCarga(double carga) {
            this.carga = quilosParaNewtons(carga);
        }

        public double getCargaMaxima() {
            return newtonsParaQuilos(cargaMaxima);
        }

        public void setCargaMaxima(double cargaMaxima) {
            this.cargaMaxima = quilosParaNewtons(cargaMaxima);
        }

        public boolean adicionarCaixa(double peso) {
            double pesoEmNewtons = quilosParaNewtons(peso);
            if (this.carga + pesoEmNewtons > this.cargaMaxima)
                return false;
            this.carga+= pesoEmNewtons;
            return true;
        }
/*
Esse metodo é responsavel por converter Newton para Kg
 */
        private double newtonsParaQuilos(double peso) {
            return peso / 9.8;
        }
/*
Metodo responsavel por converter KG para Newtons
 */
        private double quilosParaNewtons(double peso) {
            return peso * 9.8;
        }
    }

}
