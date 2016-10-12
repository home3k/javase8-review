package me.home3k.lambda;

import java.util.*;

/**
 * @author home3k
 */
public class GenericUsage {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("l","a", "m","b", "d", "a");
        GenericUsage genericUsage = new GenericUsage();
        genericUsage.print(list);
        genericUsage.sortInJava7(list);
        genericUsage.print(list);
        genericUsage.sortInJava8(list);
        genericUsage.print(list);

    }

    private void sortInJava7(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private void sortInJava8(List<String> list) {
        Collections.sort(list, (o1, o2) -> (-1) * o1.compareTo(o2));
        list.sort((o1,o2) -> o1.compareTo(o2));
    }

    private void print(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();
    }
}
