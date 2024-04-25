package CustomList.G2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// T should either be Number or should be subclasses of Number
public class WildCardEG<T extends Number> {  //we're simply providing u a template in which "T" can be of any type

    private Object []data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0 ; // telling the size,act as index at which the upcoming new element needs to be placed

    public WildCardEG() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public  void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return data.length==size;
    }

    private void resize() {
        Object temp[] = new Object[size*2]; // value of my size var = data.length
        for(int i=0;i<size;i++)
            temp[i] = data[i];

        data = temp;
    }

    public T remove(){
        T removed_elem = (T)(data[--size]);
        return removed_elem;
    }

    public void getList(List<? extends Number> list){

    }

    public T get(int indx){

        return (T)(data[indx]);
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



        WildCardEG<Integer> arr3 = new WildCardEG<>();
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
