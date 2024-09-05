import java.util.Scanner;

public class JavaDataTypes {
    static String checkMyNumifFitted(String myNum) {
        String result = "";
        try{
            long num = Long.parseLong(myNum);
            result = myNum + " can be fitted in:\n";
            if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)) {
                result = result +  "* byte\n* short\n* int\n* long";
            } else if ((num<=Short.MAX_VALUE) && (num>=Short.MIN_VALUE)) {
                result = result + "* short\n* int\n* long";
            } else if ((num<=Integer.MAX_VALUE) && (num>=Integer.MIN_VALUE)) {
                result = result +  "* int\n* long";
            }else {
                result = result + "* long";
            }
        }catch (NumberFormatException e){
            result = myNum + " can't be fitted in:";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numFormInput = 5;
        scanner.nextLine();
        for(int i=0; i<numFormInput; i++) {
            String myNum = scanner.nextLine();
            System.out.println(checkMyNumifFitted(myNum));
        }
    }
}
