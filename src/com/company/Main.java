package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("listA: ");
        for (int i = 0; i < 5; i++) {
            listA.add(scan.nextLine());
        }
        System.out.println(listA);


        System.out.println("listB: ");
        for (int i = 0; i < 5; i++) {
            listB.add(scan.nextLine());
        }
        System.out.println(listB);
        System.out.println("_______________________________________");

        Collections.reverse(listB);
       // System.out.println(listB);
        int x = 0;         //e)  Объединить Список А со Списком Б в новый список С следующим образом {A1,B5,А2,Б4,А3,Б3,А4,Б2,А5,Б1}
        while (listC.size() < listA.size()+ listB.size()) {
            listC.add(listA.get(x));
            listC.add(listB.get(x));
            x++;
        }
        System.out.println(listC);

        System.out.println("_______________________________________");


        /*listC.sort(Comparator.comparing(String::length));
        Collections.reverse(listC);
        System.out.println(listC);

        System.out.println("_______________________________________");*/

        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(listC);



/*        ArrayList<String> listC = (ArrayList<String>) Stream.of(listA, listB)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(listC);*/

/*        ArrayList<String> listC = new ArrayList<>(listA);
        listC.addAll(listB);
        System.out.println(listC);*/




/*        listA.addAll(listB);
        System.out.println(listA);*/


        //listC.sort(Comparator.comparing());





/*        Iterator<String> iterator = listA.iterator();
        while (iterator.hasNext()){

        }*/
    }
}
