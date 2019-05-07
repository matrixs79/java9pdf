package zadanieKantor;

public class Main {

    public static void main(String[] args) {
        ExchangeOffice exchangeOffice = new ExchangeOffice(1000);
        exchangeOffice.showFunds();
        exchangeOffice.exchange(1500, Currency.CUP, Currency.PLN);
        exchangeOffice.showFunds();
    }

    //zadanie domowe poz. 1
    //dopisz klase, ktora bedzie rejestorowala kazda transakcje w ArrayList
    //dopisz metode sprawdzajaca transakcje na koniec dnia.

    //zadanie domowe poz. 2
    //dopisz klase, ktora bedzie rejestorowala kazda transakcje w pliku tekstowym
    //napisz metode, ktora odczytuje transakcje na koniec dnia z pliku tekstowego.


}
