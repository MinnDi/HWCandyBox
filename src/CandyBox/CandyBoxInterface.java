package CandyBox;

import Sweets.Sweets;

public interface CandyBoxInterface {
    void addCandy(Sweets candy);
    void deleteCandy();
    double getCandyBoxWeight();
    double getCandyBoxPrice();
    String getAllSweetsInfo();
    Sweets getMinWeightCandy();
    Sweets getMinPriceCandy();
    void deleteMinPWCandy();
}
