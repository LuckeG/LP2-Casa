public class Casa {
    private int numPortas;

    private int numJanelas;

    private String endereco;

    Casa(int numPortas, int numJanelas, String endereco){
        this.numPortas = numPortas;
        this.numJanelas = numJanelas;
        this.endereco = endereco;
    }
    Casa(String endereco){
        this.endereco = endereco;
    }
    public String retornaEndereco(){
        return endereco;
    }
    public  int retornaNumjanelas(){
        return numJanelas;
    }
    public int retornaNumportas(){
        return numPortas;
    }

    //Metodos acessadores: GET
    public int getNumPortas(){
        return numPortas;
    }

    public int getNumJanelas(){
        return numJanelas;
    }

    public String getEndereco() {
        return endereco;
    }

    //Metodos modificadores: SET

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void setNumJanelas(int numJanelas){
        this.numJanelas = numJanelas;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void exibirCasa(){
        System.out.println("Numero de Portas: "+numPortas);
        System.out.println("Numero de Janelas: "+numJanelas);
        System.out.println("Endereço: "+endereco);
    }
}


