package me.home3k.basic;

/**
 * @author home3k
 */
public class MethodReferences {

    public static void main(String[] args) {
        Converter<Integer, String> converter = Integer::valueOf;
        Integer value = converter.convert("124");
        System.out.println("value is integer");
        ItemFactory itemFactory = Item::new;
        System.out.println(itemFactory.create("method ref", 10));
    }

}

interface Converter<T, F> {

    T convert(F value);
}

class Item {
    final String name;
    final int count;

    public Item(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public String toString() {
        return "name: " + name + " , " + " count: " + count;
    }
}

interface ItemFactory {
    Item create(String name, int count);
}