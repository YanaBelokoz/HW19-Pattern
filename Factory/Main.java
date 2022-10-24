package Factory;

import Factory.LaptopFactory;
import Factory.Laptop;
    public class Main {
        public static void main(String[] args) {
            Laptop Lenovo = LaptopFactory.getLaptop("Lenovo", "Tab 7", "Tab 4.8", "Yoga Tab 3 Pro", "Pad Pro 2021");
            Laptop ipad = LaptopFactory.getLaptop("Ipad", "iPad 5", "iPad Pro 9,7", "iPad mini 4", "iPad Pro 12,9");
            String lenovo = null;
            String s1 = "Factory Lenovo Config - " + lenovo;
            String s = "Factory iPad Config - " + ipad;
        }
    }

