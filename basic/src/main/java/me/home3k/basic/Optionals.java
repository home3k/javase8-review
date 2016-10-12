package me.home3k.basic;

import java.util.Optional;

/**
 * @author home3k
 */
public class Optionals {

    public static void main(String[] args) {

        Optional<String> str = Optional.of("abc");
        System.out.println(str.isPresent());
        System.out.println(str.get());
        str = Optional.empty();
        // return the value when present, otherwise return 'bcd'
        System.out.println(str.orElse("bcd"));
        str = Optional.of("new");
        // If a value is present, invoke the specified consumer with the value
        str.ifPresent((s) -> s = s + "_xxxxx");

    }

}
