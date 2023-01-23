package projetoFinal.entidades;

import projetoFinal.interfaces.Cliente;

public class PessoaFisica extends Pessoa implements Cliente {

    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public double calcularDesconto(int dias) {
        if (dias >= 5) {
            porcentagemDesconto = 0.05;
        }
        return porcentagemDesconto = 0.0;
    }
}
