Modelul de strategy este utilizat atunci când avem mai mulți algoritmi pentru o anumită sarcină
și clientul decide implementarea reală care urmează să fie utilizată în timpul execuției.

Solutia optima pentru sablonul Strategy consta in respectarea urmatorilor pasi:
   
   1.Se defineste cate o interfata pentru fiecare familie de algoritmi
       
     - Metoda pay din interfata PaymentStrategy va fi implementata de clasele concrete,CreditCardStrategy si CashStrategy.
Acestea vor avea ca paramentul un Integer de tip amount care reprezinta cantitatea de plata pentru depozitare.
   
    - Se creeaza cate o clasa CreditCardStrategy, CashStrategy pentru fiecare metoda de plata (pay) care for fi
    implementate din interfata Payment Strategy

Diagrama de clase rezultata prin aplicarea sablonului Strategy este prezentata mai jos.!!


Comentarii privind solutia

 -Alegerea metodei de pay se poate face la run-time.
 -Agaugarea unei noi modalitati de plata sau calcul pentru un clasa bagaje se poate face fara modificari
 in aplicatie;
 -Clasa Bagaje este mai „usor de inteles” (coeziunea este mai buna) deoarece nu mai implementeaza
 cate o metoda pentru fiecare metoda de plata;

