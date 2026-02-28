package designPatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
//        SingletonExample example = SingletonExample.getInstance();
//        SingletonExample example2 = SingletonExample.getInstance();
//        System.out.println(example);
//        System.out.println(example2);
//        System.out.println(example == example2);

        Thread t1 = new Thread(SingletonExample::getInstance);
        Thread t2 = new Thread(SingletonExample::getInstance);

        t1.start();
        t2.start();

    }
}
