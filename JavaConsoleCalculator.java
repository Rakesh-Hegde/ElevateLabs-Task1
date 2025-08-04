import java.util.*;
public class JavaConsoleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Select a operation:");
            char ch = sc.next().charAt(0);
            System.out.println("Enter the numbers:");
            double num1=sc.nextDouble();
            double num2 = sc.nextDouble();
            double res = 0;
            switch(ch){
                case '+': res =num1+num2;
                            System.out.println("Result of "+num1+ ch +num2+" : "+res);
                            break;
                case '-' :res = num1-num2;
                            System.out.println("Result of "+num1+ ch +num2+" : "+res);
                            break;
                case '*' :res = num1*num2;
                            System.out.println("Result of "+num1+ ch +num2+" : "+res);

                case '/' : if(num2 ==0)
                                System.out.println("Divide by zero error");
                            else {
                                   res = num1/num2;
                                   System.out.println("Result of "+num1+ ch +num2+" : "+res);
                            }
                            break;
                default:System.out.println("You have entered the invalid operation");
                        break;                
            }
        
        System.out.println("if you want to continue type \"Yes\" else type \"No\" ");
        String s= sc.next();
        if(s.equals("No"))
            return;
        }  
    }
}
