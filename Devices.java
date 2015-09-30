//
//package HomeTask8_1;
//
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Devices {
//
//
//    public int getPowerAllDevices(List<Devices> devices) {
//            int sumPower = 0;
//            for(Devices device : devices) {
//                sumPower = sumPower + device.power();
//            }
//        return sumPower;
//    }
//
//    protected int power() {
//        return ;
//    }
//
//    public List<Devices> sortByPrice(List<Devices> devices) {
//        Collections.sort(devices, new SortDivicesByPrice());
//        return devices;
//    }
//
//
//    public class SortDivicesByPrice implements Comparator<Devices> {
//        @Override
//        public int compare(Devices o1, Devices o2) {
//            return o1.getPrice()-o2.getPrice();
//        }
//    }
//
//    public Devices search(List<Devices> devices, Search search ) {
//
//        String name = search.getName();
//        int power = search.getPower();
//        int price = search.getPrice();
//
//        Devices foundDevice = null;
//        for(Devices device : devices) {
//            String deviceName = device.getName();
//            int powerDevice = device.power();
//            int priceDevice = device.getPrice();
//
//
//            if(name.equals(deviceName) && power == powerDevice && price == priceDevice){
//                foundDevice = device;
//            }
//        }
//
//        return foundDevice;
//    }
//
//
//}
//
//
//boolean isTrunOn = false;
//
//    abstract boolean isTurnOn();
//
//    abstract int power();
//
//    public void turnOnTeepot() {
//        isTrunOn = true;
//    }
//
//    public void turnOffTeepot() {
//        isTrunOn = false;
//    }
//
//    abstract int getPrice();
//
//    abstract String getName();
