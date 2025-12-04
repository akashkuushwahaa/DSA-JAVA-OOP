public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");        // Adds text at the end
        sb.insert(5, ",");          // Inserts comma after "Hello"
        sb.replace(6, 11, "Java");  // Replaces " World" with "Java"
        sb.reverse();               // Reverses the string

        System.out.println("Result: " + sb);
    }
}
