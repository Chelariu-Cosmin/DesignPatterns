package src.DesignPatterns.Singleton;

/**
 * Created by Chelariu Andrei on 4/1/2023.
 * - SABLOANE CREATIONALE –
 */
public class Singleton {

    /**
     * Definirea unei clase care are o singură instanță și oferă un punct global de acces la ea. O clasa trebuie sa aiba
     * o singura instanta cu un singur obiect si poate fi folosit de toate celelalte clase.
     */
    //Problema:
    /**
     * Se dorește implementarea unei funcționalități în sistemul de management pentru gestiunea bagajelor
     *
     * Se doreste afisarea unui mesaj atunci cand administratorul adauga un nou responsabil.
     * Practic aceasta metoda  creeaza un nou obiect nou de tip responsabil in clasa responsabil.
     * Dupa salvarea responsabilului se va afisa un mesaj daca a fost salvat sau nu in baza de date.
     */
    //Solutia:
//    Clasa utilizată în crearea acestui pattern este denumită Singleton – care definește o
//    operație de instanță ce lasă clienții să ii acceseze instanța unică. Instanța este o operație în cadrul
//    clasei. Este responsabila pentru crearea și menținerea propriei instanțe unice

    private static Singleton uniqueInstance  = new Singleton();
    private Singleton() {
    }

    //In acesta metoda am utilizat Singleton Lazy, se creeaza un nou obiect doar atunci cand este nevoie,
    // pentru a creste performanta aplicatiei
    public static Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
