package main.java;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {

    List<T> list = new ArrayList<T>();

    public void add(T something) {
        list.add(something);
    }

    public List<T> getList() {
        return list;
    }

    public T largest() {
        T value = getList().get(0);
        for (int i = 1; i < getList().size(); i++) {
            if (getList().get(i).doubleValue() > value.doubleValue()) {
                value = getList().get(i);
            }
        }
        return value;
    }

    public T smallest() {
        T value = getList().get(0);
        for (int i = 1; i < getList().size(); i++) {
            if (getList().get(i).doubleValue() < value.doubleValue()) {
                value = getList().get(i);
            }
        }
        return value;
    }
}