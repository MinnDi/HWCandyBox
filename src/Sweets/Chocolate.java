package Sweets;

import Sweets.Sweets;

public class Chocolate extends Sweets {
    public Chocolate(String name, double weight, double price, String manufacturer) {
        super(name, weight, price, manufacturer);
    }

    public Chocolate(String name, double weight, double price) {
        super(name, weight, price);
    }
}
