package xyz.zby.singleton;


// 饿汉式：创建对象实例的时候，直接初始化化。
public class SingletonOne {

    private SingletonOne() {

    }

    private static SingletonOne instance = new SingletonOne();

    public static SingletonOne getInstance() {
        return instance;
    }
}
