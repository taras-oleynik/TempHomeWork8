package HomeTask8_1;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HomeAppliances implements Comparable <HomeAppliances> {

    public String getRoom() {
        return room;
    }

    private final String room;
    protected String name;
    protected int price;
    protected int size;
    protected int powerConsumption;

 public HomeAppliances(String name,int price, String room,int powerConsumption){

     this.name = name;
     this.price = price;
     this.room = room;
     this.powerConsumption = powerConsumption;
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public int compareTo(HomeAppliances o) {
        return 0;
    }


    public static int getPowerAllHomeAppliances(List<HomeAppliances> HomeAppliances) {
        int sumPower = 0;
        for(HomeAppliances device : HomeAppliances) {
            sumPower = sumPower + device.getPowerConsumption();
        }
        return sumPower;
    }


    public static  List<HomeAppliances> sortByPrice(List<HomeAppliances> HomeAppliances) {
        Collections.sort(HomeAppliances, new SortDivicesByPrice());
        return HomeAppliances;
    }


    public static class  SortDivicesByPrice implements Comparator<HomeAppliances> {
        @Override
        public int compare(HomeAppliances o1, HomeAppliances o2) {
            return o1.getPrice()-o2.getPrice();
        }
    }

    public static HomeAppliances search(List<HomeAppliances> HomeAppliances, Search search ) {

        String name = search.getName();
        int power = search.getPower();
        int price = search.getPrice();

        HomeAppliances foundDevice = null;
        for(HomeAppliances device : HomeAppliances) {
            String deviceName = device.getName();
            int powerDevice = device.getPowerConsumption();
            int priceDevice = device.getPrice();


            if(name.equals(deviceName) && power == powerDevice && price == priceDevice){
                foundDevice = device;
            }
        }

        return foundDevice;
    }
}
