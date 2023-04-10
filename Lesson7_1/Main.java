/**
 * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат, 
 * содержащий в себе методы getProductsByname и getProductsByPrice
 */

package Lesson7_1;

public class Main {
    public static void main(String[] args) throws Exception {

        VendingMachine m = new VendingMachine();
        m.addProduct("Coca-cola", 100);
        m.addProduct("Snickers", 50);
        System.out.println(m.getProductByPrice(50).toString());
        System.out.println(m.getProductByName("Coca-cola").toString());

    }
}
