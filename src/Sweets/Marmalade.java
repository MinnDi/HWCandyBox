package Sweets;

import Sweets.Sweets;

public class Marmalade extends Sweets {
    public Marmalade(String name, double weight, double price, String manufacturer) {
        super(name, weight, price, manufacturer);
    }

    public Marmalade(String name, double weight, double price) {
        super(name, weight, price);
    }
}
