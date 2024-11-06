public class Aluguel extends Casa{

    private float valorDoAluguel;

    //Construtor

    Aluguel(int numPortas, int numJanelas, String endereco, float valorDoAluguel){
        super(numPortas, numJanelas, endereco);
        this.valorDoAluguel = valorDoAluguel;

    }

    //gets e sets

    public float getValorDoAluguel(){
        return valorDoAluguel;
    }

    public void setValorDoAluguel(float valorDoAluguel){
        this.valorDoAluguel = valorDoAluguel;
    }
    public void exibirCasa(){
        super.exibirCasa();
        System.out.println("Valor do Aluguel: "+valorDoAluguel);
    }
}
