import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva os números que irão representar A, B e C");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double delta = Math.pow(b, 2) - (4*a*c);
        // teste System.out.println(delta);
        double x1 = ((-b)+Math.sqrt(delta))/(2*a);
        System.out.println(x1);
        double x2 = ((-b)-Math.sqrt(delta))/(2*a);
        System.out.println(x2);
    }
}
