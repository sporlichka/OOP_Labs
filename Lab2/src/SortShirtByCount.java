import java.util.Comparator;

public class SortShirtByCount implements Comparator<Shirt> {
    public int compare(Shirt s1, Shirt s2) {
        Long count1 = s1.getCount(); // Автоупаковка long -> Long
        Long count2 = s2.getCount();
        return count1.compareTo(count2);
    }
}
