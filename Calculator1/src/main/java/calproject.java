import java.util.*;

public class calproject {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("1. Square root\n");
        System.out.println("2. Factorial\n");
        System.out.println("3. Natural log\n");
        System.out.println("4. Power\n");
        System.out.println("\n5. Enter your choice\n");
        int choice = scan.nextInt();

        if(choice == 1) {
            scan = new Scanner(System.in);
            System.out.println("Enter the number");
            double num = scan.nextDouble();
            System.out.println(Squareroot(num));
        }
        else if(choice==2) {
            scan = new Scanner(System.in);
            System.out.println("Enter the number");
            double num = scan.nextDouble();
            System.out.println(Factorial(num));
        }
        else if(choice==3) {
            scan = new Scanner(System.in);
            System.out.println("Enter the number");
            double num = scan.nextDouble();
            System.out.println(Logarithm(num));
        }
        else {
            scan = new Scanner(System.in);
            System.out.println("Enter the number and its power");
            double num = scan.nextDouble();
            double p = scan.nextDouble();
            System.out.println(Power(num, p));
        }


    }
    public static double Squareroot(double num){
        double ans = Math.sqrt(num);
        return ans;
    }

    public static double Factorial(double num){
        double ans=1;
        for(int i=2; i<=num;i++){
            ans=ans*i;
        }
        return ans;
    }

    public static double Logarithm(double num){

        double ans = Math.log(num);
        return ans;
    }

    public static double Power(double num,double p){

        double ans = Math.pow(num,p);
        return ans;
    }
}
