package zadanieRabat;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Article article = new Article();

        List<Article> articles = Arrays.asList(
                new Article("Shower gel", 23.80f, 1.23f),
                new Article("Cream", 14.50f, 1.30f),
                new Article("Pasta", 8.40f, 1.45f)
        );

        for (Article a: articles) {
            for (int i = 0; i < article.getDiscounts().length; i++) {
                float priceWithMargin = a.getPrice() * a.getMargin();
                float discountValue = priceWithMargin * a.getDiscounts()[i];
                float finalPrice = priceWithMargin - discountValue;
                a.setPrice(finalPrice);
                System.out.println(a); //todo - formatowanie wlasciwe output'a wedle zadania.
            }
        }

    }
}
