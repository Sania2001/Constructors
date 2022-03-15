package com.constr;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class DemoMain {
    public static void main(String[] args) {
        DemoSubclass demo = new DemoSubclass(190);
        System.out.println(demo.x);
    }

}
