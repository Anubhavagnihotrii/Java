package designPatterns.creational.singleton;

public class SingletonExample {
        private static SingletonExample instance;

        private SingletonExample() {
            System.out.println("init");
        }

//        public static void getInstance() {
//            if(instance == null) {
//                instance = new SingletonExample();
//            }
//        }
        public synchronized static void getInstance() {
            if(instance == null) {
                instance = new SingletonExample();
            }
        }
}
