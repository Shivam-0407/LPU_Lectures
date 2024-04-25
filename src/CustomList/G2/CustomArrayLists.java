package CustomList.G2;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayLists {

    private int []data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0 ; // telling the size,act as index at which the upcoming new element needs to be placed

    public CustomArrayLists() {
        this.data = new int[DEFAULT_SIZE];
    }

    public  void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return data.length==size;
    }

    private void resize() {
        int temp[] = new int[size*2]; // value of my size var = data.length
        for(int i=0;i<size;i++)
            temp[i] = data[i];

        data = temp;
    }

    public int remove(){
        int removed_elem = data[--size];
        return removed_elem;
    }


    public int get(int indx){
        if(indx<0||indx>size)
            return -1;
        return data[indx];
    }

    public int size(){
        return size;
    }

    public void set(int indx,int val){
        data[indx] = val;
    }

    @Override
    public String toString() {
        return "CustomArrayLists{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        ArrayList eg1 = new ArrayList();
        eg1.add(24);
        eg1.add("Strinnnng");
        eg1.add(32.66); /// type checking is missing

//        ArrayList<Integer> arr2 = new ArrayList<>();
//        arr2.add(54);
//        arr2.add(3);
//        arr2.add(36);
//        arr2.remove(1);
//        arr2.get(2);
//        arr2.set(1,68);
//        arr2.size();
//        arr2.isEmpty();



        CustomArrayLists arr3 = new CustomArrayLists();
        for(int i=0;i<10;i++){
            arr3.add(i);
        }
        System.out.println(arr3);
        arr3.add(57);
        arr3.add(58);
        arr3.add(53);
        System.out.println(arr3);
        arr3.remove(); // size is currently pointing to 12th index
        arr3.add(78); // over-writing the 12th index & inc. the value of the variable size;
        arr3.set(5,99);
        System.out.println(arr3);
        System.out.println(arr3.get(7));
        System.out.println(arr3.size());
        System.out.println(arr3.isFull());

    }


}
