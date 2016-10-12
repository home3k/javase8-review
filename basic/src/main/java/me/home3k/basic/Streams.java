package me.home3k.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author home3k
 */
public class Streams {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a0", "a1", "a2", "a3", "b0", "b1", "b2", "b3", "c0", "c1", "d0", "d1", "e0", "f1");
        // basic stream.
        // intermediate: filter map sorted
        // terminal: forEach
        list.stream().filter(s -> s.contains("1")).map(String::toUpperCase).sorted((s1, s2) -> -1 * s1.compareTo(s2)).forEach(System.out::println);

        Stream.of("a0", "b1", "c0").findFirst().ifPresent(System.out::println);

        IntStream.range(0, 100).filter(i -> i % 3 == 0).forEach(System.out::println);

        Stream.of("a0", "b1", "c3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);

        System.out.println(list.stream().filter(s -> s.startsWith("a")).map(String::toLowerCase).sorted().reduce((s1, s2) -> s1 + "___" + s2).orElse(""));

        sort();

    }

    public static void sort() {

        int len = 10000;
        List<String> list = new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            list.add(UUID.randomUUID().toString());
        }

        long start = System.nanoTime();

        list.stream().sorted().count();

        System.out.printf("sequential sort %d\n", (System.nanoTime() - start));

        start = System.nanoTime();

        list.parallelStream().sorted().count();

        System.out.printf("parallel sort %d\n", (System.nanoTime() - start));
    }
}
