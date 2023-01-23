package projetoFinal.entidades;

import projetoFinal.interfaces.Cliente;

public class PessoaJuridica extends Pessoa implements Cliente {

    private String cnpj;

    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public double calcularDesconto(int dias) {
        if (dias >= 3) {
            porcentagemDesconto = 0.10;
        }
        return porcentagemDesconto = 0.0;
    }
}
