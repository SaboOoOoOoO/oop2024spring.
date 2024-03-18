import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Please, provide two numbers and press ENTER:");

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.println(a + b);
    if(a > b){
        System.out.println("a is more than b");
    }
        else if (a == b) {
            System.out.println("a is equal to b");
            }
    else{
            System.out.println("b is more than a");
        }

//        int i;
//    for(i=0; i < 100; i++){
//        System.out.println(i);
//    }
    }

}