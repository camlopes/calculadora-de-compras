import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item;
        double preco;
        int quantidade;
        double total;

        System.out.print("Qual item voce gostaria de comprar? ");
        item = scanner.nextLine();

        System.out.print("Qual é o preco de cada item? ");
        preco = scanner.nextDouble();

        System.out.print("Quantos itens voce esta comprando? ");
        quantidade = scanner.nextInt();

        total = quantidade * preco;

        System.out.println("\nVoce comprou " + quantidade + " " + item + "/s");
        System.out.println("Seu total R$" + total);

        scanner.close();
    }
}
