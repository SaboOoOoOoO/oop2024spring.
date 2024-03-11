import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Please, provide two numbers and press ENTER:");

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
    if(a>b){
        System.out.println("a is more than b");
    }   else{
        System.out.println("b is more than a");;
    }

    }

}