package Experiments;

import java.util.Arrays;

public class CustomArrayList {
    private int []data;
    private int DEFALT_SIZE = 10;
    private int size = 0;

    CustomArrayList(){
        data = new int[DEFALT_SIZE];
    }

    public void add(int val){
        if(isFull()){
            resize();
        }
        data[size++]=val;
        System.out.println(" size = "+size);
    }

    private void resize() {
        int[] temp = new int[data.length*2];

        for(int i=0;i<data.length;i++)
            temp[i]=data[i];
        data = temp;
    }

    private boolean isFull() {
        return size==data.length;
    }

    public int removed(){
        int removed_element = data[size--];
        System.out.println("called in removed, after removing size = "+size);
        return removed_element;
    }

    public void set(int indx,int val){
        data[indx] = val;
    }

    public int get(int indx){
        return data[indx];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DEFALT_SIZE=" + DEFALT_SIZE +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList cs = new CustomArrayList();
        cs.add(42);
        cs.add(54);
        cs.removed();


    }



}
