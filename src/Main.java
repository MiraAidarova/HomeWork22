import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 11, 23, 34, 51, 27, 89, 33, 93, 29, 58, 87,
                45, 67, 23, 49, 82, 83, 37, 36, 25, 43, 39, 81, 88, 99, 13, 17, 7, 3, 5, 8, 9, 44, 33, 77, 88, 99, 22, 33, 44,
                75, 95, 97, 31, 41, 74, 70, 30, 50));
        System.out.println("1ден 100го чейинки сандардын узундугу: " + arrayList.size());
        for (Integer integer : arrayList) {
            System.out.println("1ден 100го чейинки сандар: " + integer);
        }


        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21,
                23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 57, 59, 61, 63, 65, 67, 69, 71, 73,
                75, 77, 79, 81, 83, 85,87, 89, 91, 93, 95, 97, 99));
        System.out.println("Так сандардын узундугу:" + arrayList1.size());

        Iterator<Integer> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            System.out.println("Так сандар:" + iterator.next());

        }
        List<Integer> arrayList2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16, 18,
                20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74,
                76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100));
        System.out.println("Жуп сандардын узундугу: " + arrayList2.size());

        Iterator<Integer> iterator1 = arrayList2.iterator();
        while (iterator1.hasNext()) {
            System.out.println("Жуп сандар:" + iterator1.next());

        }
    }
}