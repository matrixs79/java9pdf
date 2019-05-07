package zadanieZwierzyniec;

import java.util.Collections;

public class Animal {
    private String name;
    private String sound;
    private boolean loud;

    public Animal(String name, String sound, boolean loud) {
        this.name = name;
        this.sound = sound;
        this.loud = loud;
    }

    public void speak(int times) {
        String rc = String.join(" ", Collections.nCopies(times, sound));

        //todo przejrzec metody Collections
        //todo rozbic zwierzeta na poliformizm, czyli dodcac klase potomne.
        if(loud) {
            rc = rc.toUpperCase();
        } else {
            rc = rc.toLowerCase();
        }

        System.out.println(rc);
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public boolean isLoud() {
        return loud;
    }
}
