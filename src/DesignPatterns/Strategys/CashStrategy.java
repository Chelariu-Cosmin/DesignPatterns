package src.DesignPatterns.Strategys;

/**
 * Created by Chelariu Andrei on 4/1/2023.
 * - SABLOANE COMPORTAMENTALE –
 */
public class CashStrategy implements PaymentStrategy{

    private int sumaAchitata;

    public int getSumaAchitata() {
        return sumaAchitata;
    }

    public void setSumaAchitata(int sumaAchitata) {
        this.sumaAchitata = sumaAchitata;
    }

    public CashStrategy(int sumaAchitata) {
        this.sumaAchitata = sumaAchitata;
    }

    public CashStrategy() {
    }

    @Override
    public void pay(int amount) {

        System.out.println("Platit cu succes prin cash suma de " + amount);
    }
}
