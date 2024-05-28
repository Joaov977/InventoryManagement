import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Atualizar Quantidade");
            System.out.println("4. Exibir Estoque");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (choice) {
                case 1:
                    System.out.println("Digite o nome do produto:");
                    String productName = scanner.nextLine();
                    System.out.println("Digite a quantidade inicial:");
                    int initialQuantity = scanner.nextInt();
                    inventory.addProduct(productName, initialQuantity);
                    break;
                case 2:
                    System.out.println("Digite o nome do produto a ser removido:");
                    String productToRemove = scanner.nextLine();
                    inventory.removeProduct(productToRemove);
                    break;
                case 3:
                    System.out.println("Digite o nome do produto:");
                    String productToUpdate = scanner.nextLine();
                    System.out.println("Digite a nova quantidade:");
                    int newQuantity = scanner.nextInt();
                    inventory.updateQuantity(productToUpdate, newQuantity);
                    break;
                case 4:
                    inventory.displayInventory();
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
