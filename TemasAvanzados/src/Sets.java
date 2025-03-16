import java.util.TreeSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Juan");
        conjunto.add("Pedro");
        conjunto.add("Marcos");
        System.out.println("Elementos del set: ");
        System.out.println(conjunto.toString());
        System.out.println("Remuevo Marcos");
        conjunto.remove("Marcos");
        System.out.println(conjunto.toString());

    }
}
