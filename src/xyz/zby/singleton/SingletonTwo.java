package xyz.zby.singleton;

public class SingletonTwo {
    private SingletonTwo() {

    }
    private static SingletonTwo instance = null;

    // 只有在使用的时候才会实例化。
    public static SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }
}
