package xyz.zby.singleton;


// 饿汉式：创建对象实例的时候，直接初始化化。
public class SingLetonOne {

    private SingLetonOne() {

    }

    private static SingLetonOne instance = new SingLetonOne();

    public static SingLetonOne getInstance() {
        return instance;
    }
}
