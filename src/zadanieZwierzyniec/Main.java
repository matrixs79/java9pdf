package zadanieZwierzyniec;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Small dog", "woof", false));
        animals.add(new Animal("Big dog", "woooof!", true));
        animals.add(new Animal("Cow", "muuu", true));
        animals.add(new Animal("Cat", "miaaał", false));

        Random random = new Random();
        System.out.println("Loud animals");
        for(Animal a: animals) {
            if(a.isLoud()) {
                System.out.print(a.getName() + " : ");
                a.speak(random.nextInt(4) + 1);
            }
        }

        System.out.println("Silent animals");
        for(Animal a: animals) {
            if(!a.isLoud()) {
                System.out.print(a.getName() + " : ");
                a.speak(random.nextInt(4) + 1);
            }
        }
    }
}
