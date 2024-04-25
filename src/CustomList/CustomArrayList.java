package CustomList;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //at what indx do we need to insert the element

    public CustomArrayList() {
        data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num; //
    }

    private void resize() {
        int temp[] = new int[size*2];
        for(int i=0;i<size;i++)
            temp[i] = data[i];

        data = temp;
    }

    private boolean isFull() {
        return data.length==size;
    }

    public int remove(){
        int removed_elem = data[--size];
        return removed_elem;
    }

    public int get(int indx){
        return data[indx];
    }

    public int size(){
        return size;
    }

    public void set(int indx,int elem){
        if(indx<0 || indx>size)
            System.out.println("Please check the indx again");
        data[indx] = elem;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList arr = new ArrayList<>();
//        arr.add(45);
//        arr.add(55);
//        arr.add(85);
//        arr.add("Aswin");
//        arr.remove(0);
//        System.out.println(arr.get(2));
//        arr.set(0,57);
//        arr.size();
//        arr.isEmpty(); // whether the list is empty or not


        // O(1) .... on a large scale the avg. time complexity

        CustomArrayList arr = new CustomArrayList();
        for(int i=0;i<10;i++){
            arr.add(i);
        }
        System.out.println(arr);
        System.out.println(arr.size());
        arr.set(1,41);
        System.out.println(arr);
        arr.add(54);
        arr.add(64);
        System.out.println("New arra = "+arr);

        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList arr3 = new ArrayList();

        arr3.add(9.6);
        arr3.add(9);
        arr3.add("Aswin");
    }
}
