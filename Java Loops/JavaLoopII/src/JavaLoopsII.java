import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = 2;
        for(int i=0; i<t; i++){
            int a = 0;
            int b = 2;
            int n = 10;
            int calc = a;
            for(int j=0; j<n; j++){
                calc+=Math.pow(2,j)*b;
                System.out.print(calc + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
