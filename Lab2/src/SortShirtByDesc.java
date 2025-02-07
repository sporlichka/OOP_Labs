import java.util.Comparator;

public class SortShirtByDesc implements Comparator<Shirt> {

    public int compare(Shirt s1, Shirt s2) {
        String desc1 = s1.getDescription();
        String desc2 = s2.getDescription();
        return desc1.compareTo(desc2);
    }
}
