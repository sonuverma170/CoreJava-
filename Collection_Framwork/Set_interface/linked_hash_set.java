package Collection_Framwork.Set_interface;

import java.util.LinkedHashSet;

public class linked_hash_set {
    public static void main(String[] args) {
        LinkedHashSet<String> lh = new LinkedHashSet();
        lh.add("Sonu");
        lh.add("Sonu");
        lh.add("Spkefn");
        lh.add("wetwr");
        lh.add("sdg");
        lh.add("sdgvsd");

        for (String s1 : lh) {
            System.out.println(s1);
        }
    }
}
