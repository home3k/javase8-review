package me.home3k.basic;

/**
 * @author home3k
 */
//@FunctionalInterface
/* 不加这个annotation也可以*/
interface DefaultMethod {

    void echo();

    default void usage() {
        System.out.println("this is a default method.");
    }
}

class App {
    public static void main(String[] args) {
        new DefaultMethod() {
            @Override
            public void echo() {
                System.out.println("begin echo");
                usage();
            }
        }.echo();

        DefaultMethod defaultMethod = () -> {
            System.out.println("begin echo in lambda");
            // Default methods cannot be accessed from within lambda expressions.
            // usage();
        };
        defaultMethod.echo();
        defaultMethod.usage();

    }

}
