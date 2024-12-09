public class TreeShopMain {
    public static void main(String[] args) {
        TreeShop shop = new TreeShop();
        shop.addProduct(new TreeProduct("Apple", 10, 5));
        shop.addProduct(new TreeProduct("Banana", 5, 10));
        shop.addProduct(new TreeProduct("Apple", 10, 2));
        shop.addProduct(new TreeProduct("Orange", 8, 7));

        shop.printSoldProducts();

        System.out.println("\nTotal Sales: " + shop.calculateTotalSales());

        shop.getMostPopularProduct();
    }
}
