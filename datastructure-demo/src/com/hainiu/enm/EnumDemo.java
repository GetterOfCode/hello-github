package com.hainiu.enm;

import java.lang.invoke.SwitchPoint;

public class EnumDemo {
    public static void main(String[] args) {
        State[] values = State.values();
        for (State value : values) {
            System.out.print(value+":"+value.getName()+" ");
        }
        System.out.println();
        State normal = State.valueOf("NORMAL");
        System.out.println(normal.getName());
    }
}
