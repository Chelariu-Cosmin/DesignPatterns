package src.DesignPatterns.Strategys;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chelariu Andrei on 4/1/2023.
 * - SABLOANE COMPORTAMENTALE –
 */
public class DepositBags {

    List<Bag> bags;

    public DepositBags(){
        this.bags=new ArrayList<Bag>();
    }

    public void addBag(Bag bag){
        this.bags.add(bag);
    }

    public void removeBag(Bag bag){
        this.bags.remove(bag);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Bag bag : bags){
            sum += bag.getPretDepozitare();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }

}
