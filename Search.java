package HomeTask8_1;

/**
 * Created by Taras_Oliinyk on 9/23/2015.
 */
public class Search {

    private int power;
    private int price;
    private String name;

    public Search(int power, int price, String name) {
        this.power = power;
        this.price = price;
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}
