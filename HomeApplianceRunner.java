package HomeTask8_1;

import java.util.ArrayList;
import java.util.List;

public class HomeApplianceRunner {

    public static void main(String [] arr) {


        List<HomeAppliances> homeAppliances = new ArrayList<>();

        homeAppliances.add(new HomeAppliances("Mower",3500,"Hall",2000));
        homeAppliances.add(new HomeAppliances("Teapot", 200,"Kitchen",150));
        homeAppliances.add(new HomeAppliances("Fridge",2500,"1stRoom",100));
        homeAppliances.add(new HomeAppliances("Hairdryer", 150,"Bathrrom", 70));

        System.out.println("ALL_POWER");
        int allPower = HomeAppliances.getPowerAllHomeAppliances(homeAppliances);
        System.out.println("allPower=" + allPower);

        System.out.println("SORT_BY_PRICE");
        List<HomeAppliances> sortedHomeAppliancesByPrice = HomeAppliances.sortByPrice(homeAppliances);
        for(HomeAppliances device : sortedHomeAppliancesByPrice ){
            System.out.println("price=" + device.getPrice());
        }

        HomeAppliances turnOnDecice = new HomeAppliances("Teapot", 200,"Kitchen",150);
        turnOnDecice.turnOn();
        System.out.println(turnOnDecice.getClass().getSimpleName() + " turned on " + turnOnDecice.isTurnOn());

        HomeAppliances turnOnDecice2 = new HomeAppliances();
        turnOnDecice2.turnOnTeepot();
        System.out.println(turnOnDecice2.getClass().getSimpleName() + " turned on " + turnOnDecice2.isTurnOn());

        System.out.println("SEARCH");

        Search search = new Search(350,20000,"Mower");

        HomeAppliances device = HomeAppliances.search(homeAppliances,search);

        System.out.println(device != null ? device.getName() : "not found");

    }


}
