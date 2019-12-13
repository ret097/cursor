package main.java;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Number> {

   private List<T> list = new ArrayList<>();

    public void add(T something) {
        getList().add(something);
    }

    public List<T> getList() {
        return this.list;
    }

    public T getLargestValue() {
        T value = getList().get(0);
        for (int element = 1; element < getList().size(); element++) {
            if (getList().get(element).doubleValue() > value.doubleValue()) {
                value = getList().get(element);
            }
        }
        return value;
    }

    public T getSmallestValue() {
        T value = getList().get(0);
        for (int element = 1; element < getList().size(); element++) {
            if (getList().get(element).doubleValue() < value.doubleValue()) {
                value = getList().get(element);
            }
        }
        return value;
    }
}