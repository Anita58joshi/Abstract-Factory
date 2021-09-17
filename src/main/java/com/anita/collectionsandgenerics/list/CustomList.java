package com.anita.collectionsandgenerics.list;

public interface CustomList<T>{

    boolean add(T element);

    int size();

    boolean hasNext();

    T next();
}
