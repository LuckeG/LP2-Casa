import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Casa casa1 = new Casa(4, 5, "Centro");
        casa1.exibirCasa();
        System.out.println();

        Casa casa2 = new Aluguel(10, 20, "Longe", 5000);
        casa2.exibirCasa();
    }
}
