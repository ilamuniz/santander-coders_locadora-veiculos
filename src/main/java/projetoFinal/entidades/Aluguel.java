package projetoFinal.entidades;

import projetoFinal.interfaces.Cliente;

public class Aluguel {

    private Veiculo veiculo;
    private Cliente cliente;
    private int dias;

    public Aluguel(Veiculo veiculo, Cliente cliente, int dias) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.dias = dias;
    }

    public double calcularPrecoTotal() {
        return veiculo.getTipoVeiculo().getValor() * dias;
    }

    public double calcularTotalComDesconto() {
        return calcularPrecoTotal() * cliente.calcularDesconto(dias);
    }

    public void resultadoFinal() {
        double valorTotal = calcularPrecoTotal();
        double valorComDesconto = calcularTotalComDesconto();
        System.out.printf("---Extrato do Aluguel---" +
                "\nCliente: %s" +
                "\nVeículo: %s" +
                "\nQuantidade de dias: %d" +
                "\nPreço Total: " + valorTotal +
                "\nValor com desconto: " + valorComDesconto, cliente, veiculo, dias);
    }
}

