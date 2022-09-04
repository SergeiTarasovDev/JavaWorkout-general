package site.telion.oop.examclouds.task10_internetshop;

public class Basket {
    private Product[] purchasedProducts;

    public Basket(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }

    public Product[] getPurchasedProducts() {
        return purchasedProducts;
    }

    public void setPurchasedProducts(Product[] purchasedProducts) {
        this.purchasedProducts = purchasedProducts;
    }
}
