import java.util.HashSet;
import java.util.TreeSet;

public class Tree {
    public static void main(String[] args) {
        TreeSet names = new TreeSet();

        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");
        names.add("Kay");

        System.out.println(names);
    }
}
