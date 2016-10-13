package me.home3k.lambda;

/**
 * @author home3k
 */
public class References {

    public void echo() {
        System.out.println("echo.");
    }
}

class ConcurrentReferences extends References {
    @Override
    public void echo() {
        // super::echo的方法引用 assign to Runnable函数接口。
        Thread thread = new Thread(super::echo);
        thread.start();
    }
}
