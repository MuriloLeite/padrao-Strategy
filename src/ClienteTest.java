import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void realizaPagamentoPix() {
        Cliente cliente = new Cliente();
        cliente.pagarPix(80.0f);
        assertEquals(80.0f, cliente.getPreco());
    }
    @Test
    void realizaPagaentoBoleto() {
        Cliente cliente = new Cliente();
        cliente.pagarBoleto(100.0f);
        assertEquals(105.0f, cliente.getPreco());
    }
    @Test
    void realizaPagaentoCartao() {
        Cliente cliente = new Cliente();
        cliente.pagarCartao(100.0f);
        assertEquals(110.0f, cliente.getPreco());
    }
}
