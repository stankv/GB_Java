/**
 * Необходимо взять код из первого дз и переработать его с учетом обобщений т.е избавиться 
 * от классов под каждый тип продукта, заменив единым классом - торговым автоматом.
 */

package Lesson10_3;

public class Main {
    
    public static void main(String[] args) {
        VendingMachine<Chips> vendingMachineForChips = new VendingMachine<>();
        VendingMachine<Cola> vendingMachineForCola = new VendingMachine<>();
        VendingMachine<Coffe> vendingMachineForCoffe = new VendingMachine<>();
        VendingMachine<BottleOfWater> vendingMachineForWater = new VendingMachine<>();

        vendingMachineForChips.addProduct((new Chips(200, "с луком")));
        vendingMachineForCola.addProduct(new Cola(150));
        vendingMachineForCoffe.addProduct(new Coffe(150));
        vendingMachineForWater.addProduct(new BottleOfWater(0.5f));

        System.out.println(vendingMachineForChips.getProducts().get(0).toString());
        System.out.println(vendingMachineForCola.getProducts().get(0).toString());
        System.out.println(vendingMachineForCoffe.getProducts().get(0).toString());
        System.out.println(vendingMachineForWater.getProducts().get(0).toString());
    }
}
