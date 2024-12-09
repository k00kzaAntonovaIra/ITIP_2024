import java.util.TreeSet;

public class TreeShop {

    private TreeSet<TreeProduct> soldProducts;

    public TreeShop() {
        soldProducts = new TreeSet<>((p1, p2) -> {
            int quantityComparison = Integer.compare(p2.getQuantity(), p1.getQuantity());
            if (quantityComparison != 0) {
                return quantityComparison;
            }
            return p1.getName().compareTo(p2.getName());
        });
    }

    public void addProduct(TreeProduct product) {
        for (TreeProduct existingProduct : soldProducts) {
            if (existingProduct.getName().equals(product.getName())) {
                existingProduct.setQuantity(existingProduct.getQuantity() + product.getQuantity());
                soldProducts.remove(existingProduct);
                soldProducts.add(existingProduct);
                return;
            }
        }
        soldProducts.add(product);
    }

    public void printSoldProducts() {
        for (TreeProduct product : soldProducts) {
            System.out.println("[" + product.getName() + ", " + product.getPrice() + ", " + product.getQuantity() + "]");
        }
    }

    public int calculateTotalSales() {
        int totalSales = 0;
        for (TreeProduct product : soldProducts) {
            totalSales += product.getPrice() * product.getQuantity();
        }
        return totalSales;
    }

    public TreeProduct getMostPopularProduct() {
        if (soldProducts.isEmpty()) {
            return null;
        }
        TreeProduct mostPopular = soldProducts.first();
        System.out.println("Most Popular Product: [" + mostPopular.getName() + ", " + mostPopular.getPrice() + ", " + mostPopular.getQuantity() + "]");
        return mostPopular;
    }
}