package StringJoiner;

import java.util.*;

public class NameJoiner {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        StringJoiner joiner = new StringJoiner(", ", "{", "}");
        names.forEach(joiner::add);

        System.out.println(joiner.toString());
    }
}
