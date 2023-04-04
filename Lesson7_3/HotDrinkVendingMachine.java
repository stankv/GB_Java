package Lesson7_3;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrinkProduct> products = new ArrayList<HotDrinkProduct>();

    public List<HotDrinkProduct> getProducts() {
        return products;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product.getName() == name) {
                return product;
            }
        }
        return null;
    }

    public Product getProductByCost(Double cost) {
        for (Product product : products) {
            if (product.getCost() == cost) {
                return product;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (product instanceof HotDrinkProduct)
            products.add((HotDrinkProduct) product);
    }

    HotDrinkProduct getProduct(Integer temperature) {
        for (HotDrinkProduct product : products) {
            if (temperature.equals(product.getTemperature()))
                return (HotDrinkProduct) product;
        }
        return null;
    }

    HotDrinkProduct getProduct(String name) {
        for (Product product : products) {
            if (name.equals(product.getName())) {
                return (HotDrinkProduct) product;
            }
        }
        return null;
    }

    HotDrinkProduct getProduct(Double volume) {
        for (HotDrinkProduct product : products) {
            if (volume.equals(product.getVolume()))
                return (HotDrinkProduct) product;
        }
        return null;
    }

}