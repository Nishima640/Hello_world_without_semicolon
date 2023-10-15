import com.sun.source.tree.LiteralTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Iterator<Integer> it = Arrays.asList(1,2,3,4,5).iterator();
        List<Integer> list = new ArrayList<>();
        while (it.hasNext()){
            list.add(it.next());
        }
        System.out.println(list);

    }

}