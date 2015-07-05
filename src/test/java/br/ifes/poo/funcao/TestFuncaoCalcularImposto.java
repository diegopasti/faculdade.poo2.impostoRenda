package br.ifes.poo.funcao;

import br.ifes.poo.ImpostoRenda;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Entao;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class TestFuncaoCalcularImposto {

    private ImpostoRenda calculadora;
    private Double salario;
    private int dependentes;
    

    @Dado("^que Eu ganho R\\$ ([0-9.]+)$")
    public void euGanho(Double valor) throws Throwable {
        salario = valor;
    }

    @E("^que Eu tenho (\\d+) Filhos$")
    public void euTenho(int numDependentes) throws Throwable {
        dependentes = numDependentes;
    }

    @Quando("^eu calcular$")
    public void calcular() throws Throwable {
    	calculadora = new ImpostoRenda();
    }
    
    @Entao("^o valor do imposto sera: R\\$ ([0-9.]+)$")
    public void imposto(Double valorEsperado) throws Throwable {	
        Double valorCalculado = calculadora.calcularImposto(salario, dependentes);
        assertThat(valorCalculado, is(0.0));
    }
}
