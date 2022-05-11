package xyz.zby.test;

import xyz.zby.singleton.SingletonOne;

public class Test {
    public static void main(String[] args) {
        SingletonOne one = SingletonOne.getInstance();
        SingletonOne two = SingletonOne.getInstance();
        System.out.println(one == two);
    }
}
