package OptionalClass;

import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        String address = null;

        Optional<String> optAddress = Optional.ofNullable(address);

        System.out.println(optAddress.orElse("India"));
    }
}
