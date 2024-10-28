public class Cartao implements FormaPagamento{
    public float pagar(float preco) {
        return (preco * 1.1f);
    }
}
