
package Collection_Framwork.Set_interface;

import java.util.HashSet;

public class hashSets {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("A");
        hs.add("B");
        hs.add("SONU");
        hs.add("JAVA");
        for (String s1 : hs) {
            System.out.print(s1);
            System.out.print(s1.toLowerCase());
        }
    }
}
