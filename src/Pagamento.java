public class Pagamento {

    private float preco;

    public Pagamento(float preco){
        this.preco = preco;
    }

    public float pagar(FormaPagamento formaPagamento) {
        return formaPagamento.pagar(preco);
    }
}
