import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) throws FileNotFoundException{
        File file  = new File("F:\\a_example");
        Scanner sc =  new Scanner(file);
        System.out.println(sc.nextLine());
    }
}
