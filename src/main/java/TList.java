package main.java;

public class TList {
    public void print() {

        MyList<Integer> listBag = new MyList<>();

        listBag.add(2);
        listBag.add(24);
        listBag.add(350);
        listBag.add(44);
        listBag.add(12);
        listBag.add(55);
        listBag.add(1200);

        System.out.println("Largest:" + listBag.largest());
        System.out.println("Smallest:" + listBag.smallest());
    }
}