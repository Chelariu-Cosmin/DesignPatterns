package src.DesignPatterns.Singleton;

/**
 * Created by Chelariu Andrei on 4/1/2023.
 * - SABLOANE CREATIONALE –
 */
public class Main {

    public static void main(String[] args) {
        /**
         * Cod pentru testarea aplicatiei
         */
        System.out.println("\n---Testing SINGLETON---" +"\n");
        Singleton salvat =Singleton.getUniqueInstance();
        Singleton nesalvat =Singleton.getUniqueInstance();

        String message = salvat==nesalvat ? "salvat" : "nesalvat";

        System.out.println("Responsabilul a fost " + message + " cu succes!");

        System.out.println("\n---End SINGLETON---" +"\n");

        /**
         *  Principiu GRASP: High Cohesion
         *  Clasa Single este concentrata pe ceea ce ar trebui sa faca, prin metodele sale.
         *  Responsabilitatea este una specifica ceea ce inseamna ca se creeaza un obiect de tip savad/nesalvat
          */
    }
}
