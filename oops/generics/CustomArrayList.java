package com.oops.generics;

import java.util.Arrays;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomArrayList(){
        data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
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

        int[] temp = new int[data.length * 2];

        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }

        data = temp;
    }

    public int remove(){
        int removed = data[size];
        size --;
        return removed;
    }

    public int get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }

    public void set(int index, int val){
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
        CustomArrayList list = new CustomArrayList();

        for(int i=0; i<14; i++){
            list.add(i*2);
        }

        System.out.println(list);
    }
}
