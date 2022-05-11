package xyz.zby.test;

import xyz.zby.singleton.SingLetonOne;

public class Test {
    public static void main(String[] args) {
        SingLetonOne one = SingLetonOne.getInstance();
        SingLetonOne two = SingLetonOne.getInstance();
        System.out.println(one == two);
    }
}
