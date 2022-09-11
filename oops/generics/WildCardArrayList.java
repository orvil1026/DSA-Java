package com.oops.generics;

import java.util.Arrays;

public class WildCardArrayList<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    WildCardArrayList(){
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }

        data[size] = num;
        size ++;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize(){

        Object[] temp = new Object[data.length * 2];

        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    public T remove(){
        T removed = (T) data[size];
        size --;
        return removed;
    }

    public T get(int index){
        return (T) data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, T val){
        data[index] = val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildCardArrayList<Number> list = new WildCardArrayList();

        list.add(23);
        list.add(14);
        list.add(35);
        list.add(80);

        System.out.println(list);
    }

}
