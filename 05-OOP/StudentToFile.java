
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudentToFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name");
        String name = sc.nextLine();

        System.out.println("Roll no: ");
        int roll = sc.nextInt();

        FileWriter fw = new FileWriter("emp.txt");
        fw.write("Name: " + name + "\n");
        fw.write("Name: " + roll + "\n");
        fw.close();

        System.out.println("Data written to emp.txt");


    }
}
