package CandyBox;

import Sweets.Sweets;

import java.util.ArrayList;

public class CandyBox implements CandyBoxInterface {

    private ArrayList<Sweets> candyBox;

    public CandyBox() {
        candyBox = new ArrayList<>();
    }

    @Override
    public void addCandy(Sweets candy) {
        candyBox.add(candy);
    }

    @Override
    public void deleteCandy() {
        candyBox.remove(candyBox.size()-1);
    }

    @Override
    public double getCandyBoxWeight() {
        double totalWeight = 0;
        for (Sweets candy :
                candyBox) {
            totalWeight+=candy.getWeight();
        }
        return totalWeight;
    }

    @Override
    public double getCandyBoxPrice() {
        double totalPrice = 0;
        for (Sweets candy :
                candyBox) {
            totalPrice+=candy.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String getAllSweetsInfo() {
        StringBuilder info = new StringBuilder("");
        info.append("Information about candies in Candy Box:\n");
        for (Sweets candy :
                candyBox) {
            info.append(String.format("Candy № %d name: %s, weight: %f, price: %f", candyBox.indexOf(candy)+1, candy.getName(), candy.getWeight(), candy.getPrice()));
            if(candy.getManufacturer()!=null) info.append(String.format(", manufacturer: \n"));
            else info.append("\n");
        }
        return info.toString();
    }
}
