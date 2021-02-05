package HomeWork4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        DataContainer<String> dataContainer =
                new DataContainer<>(new String[] {"АА", null, "крокодилы", "бегемоты",
                        null, null, "аа", "обезьяны", null, "кашалоты"});

        System.out.println("Data in collection");
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println("Get data by index 5");
        System.out.println(dataContainer.get(5));

        System.out.println("Trying add null...");
        System.out.println(dataContainer.add(null));

        System.out.println("Add element - haha - ");
        System.out.println(dataContainer.add("haha"));

        System.out.println("Deleting by index");
        System.out.println(dataContainer.delete(3));
        System.out.println("Data in collection after deleting");
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println("Deleting item by value");
        System.out.println(dataContainer.delete("АА"));
        System.out.println("Data in collection after deleting");
        System.out.println(Arrays.toString(dataContainer.getItems()));

        System.out.println("Data in collection output by method toString()");
        System.out.println(dataContainer.toString());

        System.out.println("Data sort");
//        Comparator<String> comparator = new Comparator<>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1 == null && o2 == null) {
//                    return 0;
//                }
//                if (o1 == null) {
//                    return -1;
//                }
//                if (o2 == null) {
//                    return 1;
//                }
//                return o1.compareTo(o2);
//            }
//        };
//        dataContainer.sortComparator(dataContainer, comparator);
        dataContainer.sortWithoutComparator(dataContainer);
        System.out.println(dataContainer.toString());
    }
}
