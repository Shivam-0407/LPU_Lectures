package TreeSet_Begining.G2;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Set<String> char_Set = new TreeSet<>((s1,s2)->{
            int res = s1.charAt(0)-s2.charAt(0);
            if(res==0){
                res = s1.compareTo(s2);
            }
            return res;
        });
        char_Set.add("ab");
        char_Set.add("abvv");
        char_Set.add("a");
        char_Set.add("ghi");

        List<String> duplicate_list = new ArrayList<>();
        duplicate_list.add("XDWW");
        duplicate_list.add("XDWA");
        duplicate_list.add("XDWW");
        duplicate_list.add("XDWA");

//  1st idea      Set<String> duplicate_set = new HashSet<>(duplicate_list);
        Set<String> duplicate_set = new HashSet<>();
        duplicate_set.addAll(duplicate_list);
        System.out.println("duplicate_set "+duplicate_set);
        //duplicate_set.clear();
        //System.out.println("After clear -> "+duplicate_set);
        //System.out.println(duplicate_set.contains("XDWW"));

        System.out.println(duplicate_set.containsAll(char_Set));

        System.out.println(duplicate_set.isEmpty());

        duplicate_set.remove("XDWW");
        System.out.println(duplicate_set.contains("XDWW"));

        System.out.println(char_Set.size());

        String[] arr = char_Set.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));
    }
}
