package Lesson12_3;

public class Main {
    //Код, который берем для рефакторинга здесь - https://github.com/stankv/GB_Java/tree/main/Lesson10_2

    public static void main(String[] args) {

        VendingMachine<DrinkProduct> drinkProducts = new VendingMachine<>();

        drinkProducts.addProduct(new DrinkProduct("Cola", 330, "cold", 10, 80.00f));
        drinkProducts.addProduct(new DrinkProduct("Coffe", 150, "hot", 75, 210.35f));
        drinkProducts.addProduct(new DrinkProduct("BottleOfWater", 250, "cold", 15, 35.90f));

        for (Drink product: drinkProducts.getProducts()) {
            System.out.println(product);
        }
        System.out.println("----------------------------------------------------------");

        VendingMachine<SnackProduct> snackProducts = new VendingMachine<>();

        snackProducts.addProduct(new SnackProduct("Chips", 200, false, 120.85f));
        snackProducts.addProduct(new SnackProduct("Mars", 50, true, 69.90f));
        snackProducts.addProduct(new SnackProduct("Croutons", 120, false, 49.99f));

        for (Snacks product: snackProducts.getProducts()) {
            System.out.println(product);
        }
    }
}
