/**
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать 
 * перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, 
 * объему и температуре.
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе.
 * Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.
 */

package Lesson7_3;

public class Main {
    
    public static void main(String[] args) throws Exception {

        HotDrinkVendingMachine m = new HotDrinkVendingMachine();
        m.addProduct(new HotDrinkProduct("Coca-cola", 100.0, 15, 0.3));
        m.addProduct(new HotDrinkProduct("Milkshake", 200.0, 5, 0.35));
        m.addProduct(new HotDrinkProduct("Black tea", 110.0, 80, 0.25));
        m.addProduct(new HotDrinkProduct("Green tea", 110.0, 80, 0.25));
        m.addProduct(new HotDrinkProduct("Cappucino", 200.0, 65, 0.35));
        m.addProduct(new HotDrinkProduct("Americano", 150.0, 75, 0.25));
        m.addProduct(new HotDrinkProduct("Espresso", 150.0, 80, 0.15));
        
        for (HotDrinkProduct product : m.getProducts()) {
            System.out.println(product);
        }
        System.out.println();

        for (HotDrinkProduct product : m.getProducts()) {
            if((product.getName() == "Coca-cola") ||
               (product.getVolume() == 0.35) ||
               (product.getTemperature() == 80)) System.out.println(product); 
        }
            
        
        //System.out.println(m.getProduct("Coca-cola"));
        //System.out.println(m.getProduct(0.35));
        //System.out.println(m.getProduct(80));
    }
}