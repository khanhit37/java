import java.util.Scanner;

public class ConcatenateWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tu ;
        String chu = "";

        do {
            System.out.print("Nhap tu: ");
            tu = input.next();

            chu += tu ;
        } while (!tu.equals("."));

        System.out.println("Chuoi la: " + chu);
    }
}