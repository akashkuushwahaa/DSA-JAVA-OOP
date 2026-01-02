public class Comparison {
    public static void main(String[] args) {
        String a = "Akash";
        String b = "Akash";
        String c = a;

        String name1 = new String("Akash");
        String name2 = new String("Akash");

        System.out.println(name1 == name2);

        System.out.println(name1.equals(name2));

    }
}
