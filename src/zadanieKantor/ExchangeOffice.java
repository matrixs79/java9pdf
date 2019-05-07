package zadanieKantor;

import java.util.HashMap;
import java.util.Map;

public class ExchangeOffice {

    private Map<Currency, Double> availableFunds;

    public ExchangeOffice(double startFunds) {
        this.availableFunds = new HashMap<>();
        for (Currency c : Currency.values()) {
            this.availableFunds.put(c, startFunds);
        }
    }

    public void showFunds() {
        System.out.print("Current funds: ");

        for(Map.Entry<Currency, Double> entry: availableFunds.entrySet()) {
            System.out.print(entry.getValue() + " " + entry.getKey().getName() + "   ");
        }
        System.out.println();
    }

    public void exchange(double amount, Currency from, Currency to) {
        double available = availableFunds.get(to);
        double needed = amount * 0.8 * CurrencyConverter.conver(from, to);

        if(available >= needed) {
            availableFunds.put(from, availableFunds.get(from) + amount);
            availableFunds.put(to, availableFunds.get(to) + - needed);
            System.out.println("Exchanging "
                    + amount
                    + " "
                    + from.getName()
                    + " to " + needed + " " + to.getName());
        } else {
            System.out.println("Cannot exchange " + + amount
                    + " "
                    + from.getName()
                    + " to " + needed + " " + to.getName() + " insufficient funds!");
        }
    }
}
