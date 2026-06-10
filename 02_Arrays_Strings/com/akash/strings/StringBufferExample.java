package com.akash.strings;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");        // Adds text at the end
        sb.insert(5, ",");          // Inserts comma after "Hello" -> "Hello, World"
        sb.replace(6, 11, "Java");  // Replaces " World" with "Java" -> "Hello,Java"
        sb.reverse();               // Reverses the string -> "avaJ,olleH"

        System.out.println("Result: " + sb);
    }
}
