public class Venda extends Casa{
    private float valorVenda;

    Venda(int numPortas, int numJanelas, String endereco, float valorVenda){
        super(numPortas, numJanelas, endereco);
        this.valorVenda = valorVenda;
    }

    public float getValorVenda(){
        return valorVenda;
    }

    public void setValorVenda(float valorVenda){
        this.valorVenda = valorVenda;
    }
}
