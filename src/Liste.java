import java.util.*;

public class Liste {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(20);
        list.add(20);
        //list.remove(0);

       //System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (int a:list) {
            System.out.println(a);
        }


        List list1 = new LinkedList();
        list1.add("Pera");
        list1.add(true);
        list1.add(1321.23);
        list1.add('A');

        list1.addAll(list);

        for (Object s:list1) {
            System.out.println(s);
        }


        Set<Integer> set = new HashSet<>(list);
        System.out.println("Set:" + set);

        //set.clear();

        System.out.println("Set:" + set);

        if (set.isEmpty()){
            System.out.println("Prazan");
        }else {
            System.out.println("Nije prazan");
        }



/*
    Napraviti klasu Student sa 3 polja, ime, prezime i ocena.
- Napraviti klasu koja sadrzi Main metodu i u njoj napraviti minimum 4 studenta cije podatke treba uneti preko scanner-a: ime prezime i ocena.
- Ocene treba da budu 5,6,7 i 9.
- Kreirati dve liste.
- Kada se preko scanner-a unesu podaci za studenta, taj student treba da se doda u listu.
- Dodati sve studente u jednu listu, a nakon toga u drugu dodati samo one koji su polozili tj. koji imaju ocenu vecu od 5 u drugu listu.
- Potrebno je to uraditi u petlji gde ce unos podataka za studente biti omogucen sve dok se ne unese "quit".
- Kada se unese "quit", program se prekida i ispisuje sve unete studente preko scanner-a a nakon toga i one koji su polozili tj. koji imaju vecu ocenu od 5.
     */



    }




}
