package com.akash.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human akash = new Human(34, "akash Kushwaha");
//        Human twin = new Human(akash);

        Human twin = (Human)akash.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(akash.arr));
    }
}
