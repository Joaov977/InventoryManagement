class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }

    public void addProduct(String name, int quantity) {
        if (products.containsKey(name)) {
            System.out.println("Produto já existente no estoque. Use a opção de atualizar quantidade.");
        } else {
            products.put(name, new Product(name, quantity));
            System.out.println("Produto adicionado com sucesso!");
        }
    }

    public void removeProduct(String name) {
        if (products.containsKey(name)) {
            products.remove(name);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    public void updateQuantity(String name, int quantity) {
        if (products.containsKey(name)) {
            products.get(name).setQuantity(quantity);
            System.out.println("Quantidade do produto atualizada com sucesso!");
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    public void displayInventory() {
        if (products.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            System.out.println("Estoque:");
            for (Product product : products.values()) {
                System.out.println(product.getName() + ": " + product.getQuantity());
            }
        }
    }
}