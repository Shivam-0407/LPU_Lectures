package CustomList;

import java.util.Arrays;
import java.util.List;

// here T should be either Number or it's subclasses

public class WildCardEg<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //at what indx do we need to insert the element

    public WildCardEg() {

        data = new Object[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num; //
    }

    public void getList(List<? extends Number> list){
        // do something
    }

    private void resize() {
        Object temp[] = new Object[size*2];
        for(int i=0;i<size;i++)
            temp[i] = data[i];

        data = temp;
    }

    private boolean isFull() {
        return data.length==size;
    }

    public T remove(){
        T removed_elem = (T)(data[--size]); // Object type data > any data type
        return removed_elem;
    }

    public T get(int indx){
        return (T)(data[indx]);
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

        WildCardEg<Float> arr = new WildCardEg<>();
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

        WildCardEg<Integer> eg2 = new WildCardEg<>();


    }
}
