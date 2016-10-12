## Java 8

---

#### Functional Interface

`@FunctionalInterface` 标识标注(informative annotation)

它标识的interface，只能有一个abstract method。

Functional interface的实例可以通过lambda expression，method references, constructor references创建。

约束：

- 这个annotation，只能作用在接口上
- 满足上面的要求（一个抽象方法）

```java
@FunctionalInterface
public interface Runnable {
    public abstract void run();
}
```

原生库，很多接口被打上@FunctionalInterface，天然支持Lambda Expression等

需要支持的是，满足上面约束的interface，即使，不打该annotation，同意支持lambda.


#### Lambda

Instead of creating anonymous object all day long, Java 8 comes with a much shorter syntax. `Lambda Expressions`

格式：

**Lambda parameter -> Lambda body**

例子：

- () -> {}
- () -> 10
- () -> null
- () -> { return 10;}
- () -> { System.out.print("hello");}
- () -> {
    if(true) return 10; else return 100;
}

- (int x) -> x+1
- (int x) -> {return x+1;}
- (x) -> x+1
- x -> x+1

- (String s) -> s.length
- s -> s.length
- (Thread t) -> {t.start();}
- t -> {t.start}

- (int x, int y) -> x+y
- (x, y) -> x+y

简化：

- minimizing brackets. one parameter.
- return keyword.

Scopes

1. local variable.  `Final`
2. instance variable. `OK`
3. static variable.  `OK`
4. default method.  `Default methods cannot be accessed from within lambda expressions.`

#### Method References. Constructor References.

Java 8 enables you to pass references of methods or constructors via the :: keyword.

assign to the functional interface.

#### Optionals

非functional interface，参照`guava`的optionals进行了实现。

#### Streams

Stream represents a sequence of elements on which one or more operations can be performed.

- no storage.  a pipeline
- functional.  not modify the source.
- laziness-seeking.
- possibly unbounded.
- consumable.

operations:

- intermediate return the streams itself
- terminal   return a result of a certain type.


Source  -> stream pipeline ->   terminal


Most stream operations accept some kind of lambda exp param, a functional interface.


- non-interfering     not modify the source
- stateless.   deterministic.

Source.

collections, file, etc.   stream(), parallelStream()

#### Maps

- putIfAbsent
- forEach
- computeIfAbsent

#### Date API

TODO

#### Annotations

TODO

#### JVM

TODO

