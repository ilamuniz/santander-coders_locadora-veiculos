package projetoFinal.entidades;

import projetoFinal.interfaces.TipoVeiculo;

public class Veiculo {

    private double valor;
    private TipoVeiculo tipoVeiculo;

    public Veiculo(double valor, String tipo) {
        this.valor = valor;
        this.tipoVeiculo = tipoVeiculo;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }
}
