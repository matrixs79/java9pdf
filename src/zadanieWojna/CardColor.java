package zadanieWojna;

public enum CardColor {

    CLUBS(1),
    DIMONDS(2),
    HEARTS(3),
    SPEADES(4);

    private  int value;

    CardColor(int values){

        this.value = values;

    }

    public int getValue(){
        return value;
    }


    //todo pole priv

    //todo konstruktor

    //todo metoda getValue

}
