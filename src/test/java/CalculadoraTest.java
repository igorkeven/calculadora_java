import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteirosTest() {
        double valor1 = 2;
        double valor2 = 2;
        double resultadoEsperado = 4;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.soma(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }



    @Test
    public void deveSubtrairCorretamenteQuandoOsValoresForemInteirosTest() {
        double valor1 = 5;
        double valor2 = 2;
        double resultadoEsperado = 3;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.subtracao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }




    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteirosTest() {
        double valor1 = 6;
        double valor2 = 2;
        double resultadoEsperado = 3;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.divisao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteirosTest() {
        double valor1 = 3;
        double valor2 = 2;
        double resultadoEsperado = 6;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.multiplicacao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantesTest() {
        double valor1 = 6.5;
        double valor2 = 2.5;
        double resultadoEsperado = 2.6;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.divisao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemNegativosTest() {
        double valor1 = -3;
        double valor2 = -2;
        double resultadoEsperado = -5;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.soma(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveSubtrairCorretamenteQuandoOsValoresForemNegativosTest() {
        double valor1 = -5;
        double valor2 = -2;
        double resultadoEsperado = -3;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.subtracao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoOsValoresForemNegativosTest() {
        double valor1 = -3;
        double valor2 = -2;
        double resultadoEsperado = 6;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.multiplicacao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoOsValoresForemNegativosTest() {
        double valor1 = -6;
        double valor2 = -2;
        double resultadoEsperado = 3;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.divisao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemPontosFlutuantesTest() {
        double valor1 = 2.5;
        double valor2 = 2.5;
        double resultadoEsperado = 5;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.soma(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveSubtrairCorretamenteQuandoOsValoresForemPontosFlutuantesTest() {
        double valor1 = 5.5;
        double valor2 = 2.5;
        double resultadoEsperado = 3;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.subtracao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoOsValoresForemPontosFlutuantesTest() {
        double valor1 = 3.5;
        double valor2 = 2.5;
        double resultadoEsperado = 8.75;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.multiplicacao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoOsValoresForemPontosFlutuantesTest() {
        double valor1 = 6.5;
        double valor2 = 2.5;
        double resultadoEsperado = 2.6;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.divisao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }
    @Test(expected = IllegalArgumentException.class)
    public void deveLancarExcecaoAoDividirPorZeroTest() {
        double valor1 = 6;
        double valor2 = 0;
        Calculadora calculadora = new Calculadora();

        calculadora.divisao(valor1, valor2);


    }

    @Test
    public void deveSomarCorretamenteQuandoOsValoresForemInteiros() {
        double valor1 = 2;
        double valor2 = 2;
        double resultadoEsperado = 4;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.soma(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosForemInteiros() {
        double valor1 = 6;
        double valor2 = 2;
        double resultadoEsperado = 3;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.divisao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveMultiplicarCorretamenteQuandoNumerosForemInteiros() {
        double valor1 = 3;
        double valor2 = 2;
        double resultadoEsperado = 6;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.multiplicacao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }

    @Test
    public void deveDividirCorretamenteQuandoNumerosPossuemPontosFlutuantes() {
        double valor1 = 6.5;
        double valor2 = 2.5;
        double resultadoEsperado = 2.6;
        Calculadora calculadora = new Calculadora();

        double valorCalculado = calculadora.divisao(valor1, valor2);

        Assert.assertEquals(resultadoEsperado, valorCalculado, 0.01);
    }


}
