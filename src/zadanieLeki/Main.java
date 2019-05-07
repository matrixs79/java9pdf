package zadanieLeki;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static void main(String[] args) {
        Map<Integer, MedicamentNote> medicaments = new HashMap<>();


        //todo - dodac obiekty i klucze do mapy
        medicaments.put(1, new MedicamentNote("polopiryna", 2, 11.80));
        medicaments.put(4, new MedicamentNote("gripex", 1, 14.10));
        medicaments.put(7, new MedicamentNote("aspiryna", 3, 9.20));


        //todo - iteracja po mapie
        for(Map.Entry<Integer, MedicamentNote> entry: medicaments.entrySet()) {

        //todo - warunek jezeli > 10
            if(entry.getValue().getCostPerUnit() > 10) {
                System.out.println(entry.getValue().getName());
            }
        }

        //todo - wyswilt. wszystkich dni mc
        for(Map.Entry<Integer, MedicamentNote> entry: medicaments.entrySet()) {
            System.out.println(entry.getKey());
        }

        //todo - suma rok - koszt roczny lekow
        double sum = 0;
        for(Map.Entry<Integer, MedicamentNote> entry: medicaments.entrySet()) {
            sum += (entry.getValue().getUnit() * entry.getValue().getCostPerUnit()) * 12;
        }

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);

        System.out.println(df.format(sum));
    }
}
