package Sweets;

import Sweets.Sweets;

public class BubbleGum extends Sweets {
    public BubbleGum(String name, double weight, double price, String manufacturer) {
        super(name, weight, price, manufacturer);
    }

    public BubbleGum(String name, double weight, double price) {
        super(name, weight, price);
    }
}
