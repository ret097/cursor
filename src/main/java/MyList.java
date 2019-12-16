package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Number & Comparable<? super T>> {

   private List<T> list = new ArrayList<>();

    public void add(T something) {
        getList().add(something);
    }

    public List<T> getList() {
        return this.list;
    }

    public T getLargestValue() {
        return Collections.max(list);
    }

    public T getSmallestValue() {
        return Collections.min(list);
    }
}