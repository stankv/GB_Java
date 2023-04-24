package Lesson10_2;

public class Main {
    
    public static void main(String[] args) {
        VendingMachine<Chips> vendingMachineForChips = new VendingMachine<>();
        VendingMachine<Cola> vendingMachineForCola = new VendingMachine<>();
        VendingMachine<Coffe> vendingMachineForCoffe = new VendingMachine<>();
        VendingMachine<BottleOfWater> vendingMachineForWater = new VendingMachine<>();

        vendingMachineForChips.addProduct((new Chips(200, "с луком")));
        vendingMachineForCola.addProduct(new Cola(250));
        vendingMachineForCoffe.addProduct(new Coffe(150));
        vendingMachineForWater.addProduct(new BottleOfWater(0.5f));

        System.out.println(vendingMachineForChips.getProducts().get(0).toString());
        System.out.println(vendingMachineForCola.getProducts().get(0).toString());
        System.out.println(vendingMachineForCoffe.getProducts().get(0).toString());
        System.out.println(vendingMachineForWater.getProducts().get(0).toString());
    }
}
