package src.DesignPatterns.Strategys;

import java.time.LocalTime;

/**
 * Created by Chelariu Andrei on 4/1/2023.
 * - SABLOANE COMPORTAMENTALE –
 */
public class MainStrategy {

    public static void main(String[] args) {
        DepositBags depoBags = new DepositBags();

        Bag bag1 = new Bag("1234AX", 45, LocalTime.of(1, 12));
        Bag bag2 = new Bag("1234DX", 10, LocalTime.of(1, 0));
        Bag bag3 = new Bag("1234CF", 20, LocalTime.of(2, 30));


        depoBags.addBag(bag1);
        depoBags.addBag(bag2);
        depoBags.addBag(bag3);

        //pay by cash
        depoBags.pay(new CashStrategy(45));
        System.out.println(depoBags.calculateTotal());

//        //pay by credit card
        depoBags.pay(new CreditCardStrategy("Marian Codin", "1234567890123456", "786", "12/23"));
    }
}
