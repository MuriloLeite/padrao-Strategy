public class Cliente {
    private float preco;

    public float getPreco() {
        return preco;
    }

    public void pagarPix(float preco) {
        Pagamento pagamento = new Pagamento(preco);
        this.preco = pagamento.pagar(new Pix());
    }

    public void pagarBoleto(float preco) {
        Pagamento pagamento = new Pagamento(preco);
        this.preco = pagamento.pagar(new Boleto());
    }
    public void pagarCartao(float preco) {
        Pagamento pagamento = new Pagamento(preco);
        this.preco = pagamento.pagar(new Cartao());
    }
}
