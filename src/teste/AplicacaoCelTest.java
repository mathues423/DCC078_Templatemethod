package teste;

import main.AplicacaoCel;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicacaoCelTest {
    @Test
    void deveRetonarAprovado() {
        AplicacaoCel inter = new AplicacaoCel();
        inter.setEntrada("home");
        assertEquals("C_templete com varios botões", inter.verificarEntrada());
    }

    @Test
    void deveRetonarReprovado() {
        AplicacaoCel inter = new AplicacaoCel();
        inter.setEntrada("homes");
        assertEquals("Templete invalido", inter.verificarEntrada());
    }

    @Test
    void deveRetornarInformacoes() {
        AplicacaoCel inter = new AplicacaoCel();
        inter.setEntrada("home");
        inter.setInter("Tela home");
        assertEquals("Aplicação Celular: entrada=home, interface=Tela home, entrada tratada=C_templete com varios botões", inter.getInformacao());
    }
}