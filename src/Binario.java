import java.util.Scanner;

public class Binario {
    public class  Converter{
        public static String toBinary(int num){
            String binary = "";
            while(num > 0){
                binary = (num%2)+binary;
                num/= 2;
            }
            return binary;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(Converter.toBinary(x));
    }
}
