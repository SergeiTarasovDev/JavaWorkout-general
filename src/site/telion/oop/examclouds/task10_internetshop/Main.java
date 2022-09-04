package site.telion.oop.examclouds.task10_internetshop;

public class Main {
    public static void main(String[] args) {
        Product milk = new Product("Молоко", 50, 10);
        Product bread = new Product("Хлеб", 22, 7);
        Product sosisages = new Product("Сосиски", 170, 8);
        Category food = new Category("Еда", new Product[]{milk, bread, sosisages});

        Product shirt = new Product("Рубашка", 1700, 9);
        Product skirt = new Product("Юбка", 900, 5);
        Product pants = new Product("Брюки", 2200, 6);
        Category clothes = new Category("Одежда", new Product[]{shirt, skirt, pants});

        Basket ivanBasket = new Basket(new Product[]{milk, shirt, pants});
        User ivan = new User("ivashka", "123", ivanBasket);
    }
}
