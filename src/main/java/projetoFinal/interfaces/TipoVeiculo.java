package projetoFinal.interfaces;

public enum TipoVeiculo {
    PEQUENO(1, "Carro pequeno", 100.0),
    MEDIO(2, "Carro médio", 150.0),
    SUV(3, "SUV", 200.0);

    private int escolha;
    private String tipoVeiculo;
    private double valor;

    TipoVeiculo(int escolha, String tipo, double valor) {
        this.escolha = escolha;
        this.tipoVeiculo = tipo;
        this.valor = valor;
    }

    public int getEscolha() {
        return escolha;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public double getValor() {
        return valor;
    }
}

