package StringJoiner;

import java.util.StringJoiner;

public class CityMerge {
    public static void main(String[] args) {
        
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Chennai").add("Mumbai");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Delhi").add("Kolkata");

       
        StringJoiner s1MergedToS2 = new StringJoiner("-");
        s1MergedToS2.merge(s2);
        s1MergedToS2.merge(s1);
        System.out.println("i) s1 merged to s2: " + s1MergedToS2);

       
        StringJoiner s2MergedToS1 = new StringJoiner("-");
        s2MergedToS1.merge(s1);
        s2MergedToS1.merge(s2);
        System.out.println("ii) s2 merged to s1: " + s2MergedToS1);
    }
}
