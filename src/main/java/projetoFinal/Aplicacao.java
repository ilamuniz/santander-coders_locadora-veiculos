package projetoFinal;

import projetoFinal.entidades.Aluguel;
import projetoFinal.entidades.PessoaFisica;
import projetoFinal.entidades.PessoaJuridica;
import projetoFinal.entidades.Veiculo;
import projetoFinal.interfaces.Cliente;
import projetoFinal.interfaces.TipoVeiculo;

/**
 * NullPointerException(Aplicacao.main:30) -> (Aluguel.resultadoFinal:26) -> (Aluguel.calcularPrecoTotal:18)
 * TODO: Verificar causa da exception
 */

public class Aplicacao {

    public static void main(String[] args) {
        // Veículos
        Veiculo veiculo1 = new Veiculo(100, TipoVeiculo.PEQUENO.getTipoVeiculo());
        Veiculo veiculo2 = new Veiculo(150, TipoVeiculo.MEDIO.getTipoVeiculo());
        Veiculo veiculo3 = new Veiculo(200, TipoVeiculo.SUV.getTipoVeiculo());

        // Clientes
        Cliente cliente1 = new PessoaFisica("Marina Oliveira", "436.361.460-92");
        Cliente cliente2 = new PessoaFisica("Mateus Silva", "482.647.900-03");
        Cliente cliente3 = new PessoaJuridica("Sorveteria Gelada", "39.133.349/0001-37");

        // Entrada
        Cliente cliente = cliente1;
        Veiculo veiculo = veiculo1;
        int dias = 11;

        //Aluguel
        Aluguel contratoAluguel = new Aluguel(veiculo, cliente, dias);
        contratoAluguel.resultadoFinal();
    }

}

