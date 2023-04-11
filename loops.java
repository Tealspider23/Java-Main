import java.util.Scanner;

public class loops {

public static void main(String[] args) {
    /*
     syntax of if statements :
     if(boolean expression T or F){
        //body
     }else{
        //do this
     }
     }
     *//*   
    int salary = 400;
    if(salary>10000){
        salary+=2000;
    }else{
        salary +=1000;
    }
    System.out.println(salary);

*/
/* 
//multiple if-else same as C
int ans = 0;
System.out.println("Enter your operation :");


                            //CALCULATOR
Scanner in = new Scanner(System.in);
//Take input from user till user doesnt press X or x
while(true){
    //take character as input

    char op = in.next().trim().charAt(0);
    if ( op =='+' || op =='-' || op =='*' || op == '/' || op == '%'){
        // input two numbers
        System.out.println("Enter the two numbers you want to perform operation at :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        if(op == '+'){
            ans = ( num1 + num2);
        }
        if(op == '-'){
            ans = ( num1 - num2);
        }
        if(op == '*'){
         ans = ( num1 * num2);
            }
        if(op == '/'){
            if (num2 !=0)
         ans = ( num1 / num2);
                }
        if(op == '%'){
        ans = ( num1 % num2);
             }
            }
             else if(op == 'X' || op == 'x')
             break;
             else
             System.out.println("Invalid operator");
             System.out.println(ans);
    
}

}
*/




}
    

