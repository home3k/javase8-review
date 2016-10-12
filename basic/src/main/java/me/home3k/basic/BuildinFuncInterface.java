package me.home3k.basic;

import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author home3k
 */
public class BuildinFuncInterface {
    public static void main(String[] args) {

        /* Predicates are boolean-valued functions of one argument */
        Predicate<String> predicate = (str) -> str.length() > 0 && str.indexOf(0) == 'a';
        System.out.println("abc:" + predicate.test("abc"));
        System.out.println(":" + predicate.test(""));
        System.out.println("bc:" + predicate.test("bc"));

        Predicate<String> predicateObjectNull = Objects::isNull;
        // negation.
        Predicate<String> predicateObjectNotNull = predicateObjectNull.negate();

        System.out.println("notnull:" + predicateObjectNull.test("notnull"));
        System.out.println("null:" + predicateObjectNull.test(null));

        System.out.println("notnull:" + predicateObjectNotNull.test("notnull"));
        System.out.println("null:" + predicateObjectNotNull.test(null));

        /* Functions accept one argument and produce a result */
        Function<String, Integer> converter = Integer::valueOf;
        converter.apply("1234");

        /* Suppliers produce a result of a given generic type. Suppliers don't accept arguments.*/
        Supplier<Goods> goodsFactory = Goods::new;
        Goods goods = goodsFactory.get();
        goodsFactory = () -> new Goods();
        goods = goodsFactory.get();

        /* Consumers represent operations to be performed on a single input argument.*/
        Consumer<Goods> consumer = (g) -> {
            g.setName("name");
            g.setNo(12);
        };
        consumer.accept(goods);

    }
}

class Goods {

    int no;
    String name;


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}