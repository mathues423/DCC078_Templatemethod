package teste;

import main.AplicacaoCel;
import main.AplicacaoWin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AplicacaoWinTest {
    @Test
    void deveRetonarAprovado() {
        AplicacaoWin inter = new AplicacaoWin();
        inter.setEntrada("home");
        assertEquals("W_templete", inter.verificarEntrada());
    }

    @Test
    void deveRetonarReprovado() {
        AplicacaoWin inter = new AplicacaoWin();
        inter.setEntrada("homes");
        assertEquals("Templete invalido", inter.verificarEntrada());
    }

    @Test
    void deveRetornarInformacoes() {
        AplicacaoWin inter = new AplicacaoWin();
        inter.setEntrada("home");
        inter.setInter("Tela home");
        assertEquals("Aplicação Windows: entrada=home, interface=Tela home, entrada tratada=W_templete", inter.getInformacao());
    }
}