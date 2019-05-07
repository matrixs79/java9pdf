package zadanieLaptop;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("ASUS", 8));
        laptops.add(new Laptop("ACER", 40));
        laptops.add(new Laptop("Toshiba", 32));
        laptops.add(new Laptop("DELL", 12));

        for (Laptop lap: laptops) {
            lap.introduce();
        }

        for (int i = 0; i < laptops.size(); i++) {
            if(laptops.get(i).getGrade() > 20) {
                System.out.println(
                        laptops.get(i).getName() + " is rated " + laptops.get(i).getGrade() + "."
                );
            }
        }

    }


}
