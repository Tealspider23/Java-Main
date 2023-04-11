import java.util.Arrays;
import java.util.Scanner;

public class Functions {
 
    public static void main(String[] args) {
      /* 
        String personalised = myGreet("Amit");
        System.out.println(personalised);
        
    }

    private static String myGreet(String name) {
        String message = ("Hello this is "+name);
        return message;
    }
}
*/
// Showing how variable value can be changed while using functions

//Swapping two numbers just by assignment
//int a = 20;
//int b = 30;
 //int temp = b;
 //b=a;
 //a= temp;

// This doesnot swap the numbers in actual . Passing is need to be learnt

//loop scoping , Block Scope , Shadowing done refer notes

//Variable Arguments

/* 
    
    fun(1, 2, 3, 4, 5 ,5, 6, 7, 8);
}
 static void fun(int...v)
{
    System.out.println(Arrays.toString(v));
}


    }
*/

// Questions
// #q.1 Check whether prime or not .

Scanner in = new Scanner(System.in);
int n = in.nextInt();
System.out.println(isprime(n));
    }

static boolean isprime(int n){
    if (n<=1){ 
    return false;
}
 int c = 2;
 while(c*c<=n){
    if(n%c==0){
        return false;
    }
    c++;
}
 return (c*c>n);

 }




    }
