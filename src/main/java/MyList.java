package main.java;

import java.util.ArrayList;

public class MyList<T extends Number> {

    ArrayList<T> list = new ArrayList<T>();

    public void add(T something) {
        list.add(something);
    }

    public T largest() {
        T value = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() > value.doubleValue()) {
                value = list.get(i);
            }
        }
        return value;
    }

    public T smallest() {
        T value = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() < value.doubleValue()) {
                value = list.get(i);
            }
        }
        return value;
    }
}