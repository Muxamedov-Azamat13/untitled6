package main.drugstore;

import main.drugstore.components.Water;

import java.util.*;

public class Drugmain {
    public static void main(String[] args) {
//        Component water = new Water("water",10D,1);
//        Component azitronite = new Water("azitronite",1D,14);
//        Component penicillin = new Water("penicillin",1.6D,6);
//
//        PharmacyTwo p1 = new PharmacyTwo();
//        p1.addComponents(water, azitronite);
//
//
//        PharmacyTwo p2 = new PharmacyTwo();
//        p2.addComponents(penicillin,water);
//
//        PharmacyTwo p3 = new PharmacyTwo();
//        p3.addComponents(azitronite,penicillin);
//
//        List<Component> components = new ArrayList<>();
//        components.add(azitronite);
//        components.add(water);
//        components.add(penicillin);
//
//        System.out.println(components);
//
//        Collections.sort(components, Comparator.reverseOrder());
//        System.out.println(components);
//        for (Component c : p2){
//            System.out.println(c);
//        }
        List<Pharmacy> pharmacy = new ArrayList<>();
        Pharmacy mukaltin = new Pharmacy("Mukaltin",9.0,32.5);
        Pharmacy immudon = new Pharmacy("Immudon",5.5,13.7);
        Pharmacy paracetamol = new Pharmacy("Paracetamol",7.5,45.0);

        pharmacy.add(mukaltin);
        pharmacy.add(immudon);
        pharmacy.add(paracetamol);

        System.out.println(pharmacy);

        // Здесь я исползоваль лямбда функции по сортировке и по цене и по весам
        Collections.sort(pharmacy, Comparator.reverseOrder());
        System.out.println(pharmacy);


        // Здесь я исползоваль лямбда функции по сортировке имени по алфавитному порядку
        Collections.sort(pharmacy, Comparator.comparing(Pharmacy::getName));
        System.out.println(pharmacy);


    }
}
