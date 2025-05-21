// using command line argument
// class abc
// {
//     public static void main(String args[])
//     {
//         int a,b,c;
//         String x,y;
//         x=args[0];
//         y=args[1];
//         a=Integer.parseInt(x);
//         b=Integer.parseInt(y);
//         c=a+b;
//         System.out.println("The sum is "+c);
//     }
// }
//
// using scanner class
// import java.util.Scanner;
// class abc

// {
//     public static void main(String args[])
//     {
//         int a,b,c;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter 1st No ");
//         a=sc.nextInt();
//         System.out.println("Enter 2nd No ");
//         b=sc.nextInt();
//         c=a+b;
//         System.out.println("The sum is "+c);
//     }
// }
//
//using buffer reader
// import java.io.*;
// class abc
// {
//     public static void main(String args[]) throws IOException
//     {
//         int a,b,c;
//         InputStreamReader read=new InputStreamReader(System.in);
//         BufferedReader in=new BufferedReader(read);
//         System.out.println("Enter 1st No ");
//         a=Integer.parseInt(in.readLine());
//         System.out.println("Enter 2nd No ");
//         b=Integer.parseInt(in.readLine());
//         c=a+b;
//         System.out.println("The sum is "+c);
//     }
// }
//
//using data input stream
// import java.io.*;
// class abc
// {
//     public static void main(String args[]) throws IOException
//     {
//         int a,b,c;
//         DataInputStream in = new DataInputStream(System.in);
//         System.out.println("Enter 1st No ");
//         a=Integer.parseInt(in.readLine());
//         System.out.println("Enter 2nd No ");
//         b=Integer.parseInt(in.readLine());
//         c=a+b;
//         System.out.println("The sum is "+c);
//     }
// }
//
//area and perimeter of rectangle
// import java.util.Scanner;
// class abc
// {
//     public static void main(String args[])
//     {
//         int a,b,p,q;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Length: ");
//         a=sc.nextInt();
//         System.out.println("Enter Breadth: ");
//         b=sc.nextInt();
//         p=2*(a+b);
//         q=a*b;
//         System.out.println("The Perimeter of Rectangle is "+p);
//         System.out.println("The Area of Rectangle is "+q);
//     }
// }
//
//diagonal of rectangle
// import java.util.Scanner;
// class abc
// {
//     public static void main(String args[])
//     {
//         int a,b,c;
//         double r,q;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Coefficient of X^2: ");
//         a=sc.nextInt();
//         System.out.println("Enter Coefficient of X: ");
//         b=sc.nextInt();
//         System.out.println("Enter Constant: ");
//         c=sc.nextInt();
//         r=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
//         q=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
//         System.out.println("The 1st root is "+r);
//         System.out.println("The 2nd root is "+q);
//     }
// }
//
//printing digits seperately
// import java.util.Scanner;
// class abc
// {
//     public static void main(String args[])
//     {
//         int a,fd,ld;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number: ");
//         a=sc.nextInt();
//         fd=a/10;
//         ld=a%10;
//         System.out.println("The 1st digit is "+fd);
//         System.out.println("The 2nd digit is "+ld);
//     }
// }
//
// swaping of digits
// import java.util.Scanner;
// class abc
// {
//     public static void main(String args[])
//     {
//         int a,b,t;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a");
//         a=sc.nextInt();
//         System.out.println("Enter b ");
//         b=sc.nextInt();
//         System.out.println("Before Swapping: "+a+" "+b);
//         t=a;
//         a=b;
//         b=t;
//         System.out.println("Before Swapping: "+a+" "+b);
//     }
// }
//
//
// Java program to convert days to years weeks and days
// import java.util.Scanner;
// public class abc{
//     public static void main(String[] args){
//         int enter_days,days,year,month; 
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of days: ");
//
//         enter_days = sc.nextInt();
// 
//         year = (enter_days / 365);
//         month = (enter_days % 365) / 30;
//         days  = (enter_days % 365) % 30;
//
//         System.out.println("Year/s = " + year);
//         System.out.println("Week/s = " + month);
//         System.out.println("Day/s  = " + days);
//     }
// }
//
//Java program to convert second into hour minutes and seconds
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//
//         System.out.println("Input seconds: ");
//         int seconds = in.nextInt();
//
//         int S = seconds % 60;
//         int H = seconds / 60;
//         int M = H % 60;
//         H = H / 60;
//
//         System.out.print(H + ":" + M + ":" + S);
//         System.out.print("\n");
//     }
// }
//
//Java program to convert money into no of notes
// import java.util.Scanner;
//
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the total sum of money: ");
//         int totalMoney = scanner.nextInt();
//
//         int notes500 = totalMoney / 500;
//         int remainingAfter500 = totalMoney % 500;
//
//         int notes200 = remainingAfter500 / 200;
//         int remainingAfter200 = remainingAfter500 % 200;
//
//         int notes100 = remainingAfter200 / 100;
//         int remainingAfter100 = remainingAfter200 % 100;
//
//         System.out.println("Total money: " + totalMoney);
//         System.out.println("500 notes: " + notes500);
//         System.out.println("200 notes: " + notes200);
//         System.out.println("100 notes: " + notes100);
//     }
// }
//
//
// import java.util.Scanner;
// class abc
// {
//     public static void main(String args[])
//     {
//         int A;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter A");
//         A=sc.nextInt();
//         if (A%2==0){
//             System.out.println("The number is Even");
//         }
//         else{
//             System.out.println("The number is Odd");
//         }
//     }
// }
//
//
//buzz number
// import java.util.Scanner;
// class abc
// {
//     public static void main(String args[])
//     {
//         int A;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter A");
//         A=sc.nextInt();
//         if (A%10==7 || A%7==0){
//             System.out.println("The number is Buzz Number");
//         }
//         else{
//             System.out.println("The number is not a Buzz Number");
//         }
//     }
// }
//
//
//positive or negative number
// import java.util.Scanner;
// class abc
// {
//     public static void main(String args[])
//     {
//         int A;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter A");
//         A=sc.nextInt();
//         if (A>0){
//             System.out.println("The number is Positive");
//         }
//         else if (A<0){
//             System.out.println("The number is Negative");
//         }
//         else{
//             System.out.println("The number is Zero");
//         }
//     }
// }
//
//
//triangle angle checker
// import java.util.Scanner;
// class abc
// {
//     public static void main(String args[])
//     {
//         int a,b,c;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a");
//         a=sc.nextInt();
//         System.out.println("Enter b");
//         b=sc.nextInt();
//         System.out.println("Enter c");
//         c=sc.nextInt();
//         if (a+b+c==180){
//             if(a>90 || b>90 || c>90){
//                 System.out.println("The triangle is obtuse angled triangle");
//             }
//             else if(a==90 || b==90 || c==90){
//                 System.out.println("The triangle is right angled triangle");
//             }
//             else {
//                 System.out.println("The triangle is acute angled triange");
//             }
//         }
//         else{
//             System.out.println("The triangle is not possible");
//         }
//     }
// }
//
//
//number equality checker
// import java.util.Scanner;
// class abc
// {
//     public static void main(String args[])
//     {
//         int a,b,c;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a");
//         a=sc.nextInt();
//         System.out.println("Enter b");
//         b=sc.nextInt();
//         System.out.println("Enter c");
//         c=sc.nextInt();
//         if (a==b && b==c){
//             System.out.println("The numbers are equal");
//         }
//         else{
//             if(a>b && a>c){
//                 System.out.println("a is the greatest");
//             }
//             else if(b>a && b>c){
//                 System.out.println("b is the greatest");
//             }
//             else {
//                 System.out.println("c is the greatest");
//             }    
//         }
//     }
// }
//
//
//switch case calculator
// import java.util.Scanner;
//
// public class abc {
//     public static void main(String[] args) {
//         double num1,num2,result;
//         int operator;
//         Scanner sc = new Scanner(System.in);
//
//         System.out.println("Choose an operator: \n1 for addition, \n2 for subtraction, \n3 for multiplication, \n4 for division");
//             operator = sc.nextInt();
//         System.out.println("Enter first number");
//             num1 = sc.nextInt();
//
//         System.out.println("Enter second number");
//             num2 = sc.nextInt();
//
//         switch (operator) {
//             case 1:
//                 result = num1 + num2;
//                 System.out.println(num1 + " + " + num2 + " = " + result);
//                 break;
//             case 2:
//                 result = num1 - num2;
//                 System.out.println(num1 + " - " + num2 + " = " + result);
//                 break;
//             case 3:
//                 result = num1 * num2;
//                 System.out.println(num1 + " * " + num2 + " = " + result);
//                 break;
//             case 4:
//                 result = num1 / num2;
//                 System.out.println(num1 + " / " + num2 + " = " + result);
//                 break;
//             default:
//                 System.out.println("Invalid operator");
//         }
//     }
// }
//
//
//print 1st 10 natural number
// public class abc {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 10; i++) {
//             System.out.println(i);
//         }
//     }
// }
//
//
//print 1 4 9 16 25 using loop
// public class abc {
//     public static void main(String[] args) {
//         for (int i=1;i<=5;i++){
//             System.out.print(i * i);
//         }
//     }    
// }
//
//
//print 2 5 10 17 using loop
// public class abc {
//     public static void main(String[] args) {
//         for (int i=1;i<=4;i++){
//             System.out.print((i * i)+1);
//         }
//     }    
// }
//
//
//print 1 2 4 7 11 16 using loop
// public class abc {
//     public static void main(String[] args) {
//         int k=1;
//         for (int i=0;i<=7;i++){
//             k=k+i;
//             System.out.print(k+" ");
//         }
//     }    
// }
//
//
// print 2 4 8 16 sequence using loop
// public class abc {
//     public static void main(String[] args) {
//         int k = 1;
//         for(int i = 1; i <= 4; i++) {
//             k = k * 2;
//             System.out.println(k);
//         }
//     }
//}
//
//
//fibonacci series
// class abc {
//     public static void main(String[] args) { 
//       int n = 10, firstTerm = 0, secondTerm = 1;
//       for (int i = 1; i <= n; ++i) {
//         System.out.print(firstTerm + " "); 
//         int nextTerm = firstTerm + secondTerm;
//         firstTerm = secondTerm;
//         secondTerm = nextTerm;
//       }
//     }
//   }
//
//
//input a number and count factors of a no
//   import java.util.Scanner;
//   public class abc {
//       public static void main(String[] args) {
//           Scanner scanner = new Scanner(System.in);
//           System.out.println("Enter a number:");
//           int n = scanner.nextInt();
//           for(int i = 1; i <= n; i++) {
//             if(n%i==0)
//             {
//               System.out.println("The factors are: "+ i);
//             }
//           }
//     }
// }
//
//
//sum of first 10 natural number
// public class abc {
//     public static void main(String[] args) {
//       int s;
//       s=0;
//         for (int i = 1; i <= 10; i++) {
//           s=s+i;
//         }
//         System.out.println(s);
//     }
// }
//
//
//sum of series 1+1/2+1/3+1/4+1/5....
// public class abc {
//   public static void main(String[] args) {
//       double sum = 0;
//       for (double i = 1; i <= 10; i++) {
//           sum += 1/i;
//       }
//       System.out.println("The sum of the series is: " + sum);
//   }
// }
//
//
//sum of series 1/2+2/3+3/4+4/5+5/6....
// public class abc {
//   public static void main(String[] args) {
//       double sum = 0;
//       for (double i = 1; i < 10; i++) {
//           sum += i/(i+1);
//       }
//       System.out.println("The sum of the series is: " + sum);
//   }
// }
//
//
//sum of series 1/3+2/5+3/7....
// public class abc {
//   public static void main(String[] args) {
//       double sum = 0;
//       for (double i = 1; i <= 10; i++) {
//           sum += i/(2*i+1);
//       }
//       System.out.println("The sum of the series is: " + sum);
//   }
// }
//
//
//sum of series 1-2+3-4+5-6+7-8+9-10....
// public class abc {
//   public static void main(String[] args) {
//       int sum = 0;
//       for (int i = 1; i <= 10; i++) {
//           if (i % 2 == 0) {
//               sum -= i;
//           } 
//           else {
//               sum += i;
//           }
//       }
//       System.out.println("The sum of the series is: " + sum);
//   }
// }
//
//
//sum of series 2-4+6-8+10-12....
// public class abc {
//   public static void main(String[] args) {
//       int sum = 0;
//       for (int i = 1; i <= 10; i++) {
//           if (i % 2 == 0) {
//               sum -= 2 * i;
//           } 
//           else {
//               sum += 2 * i;
//           }
//       }
//       System.out.println("The sum of the series is: " + sum);
//   }
// }
//
//
//factorial of a number
// public class abc {
//     public static void main(String[] args) {
//         int n = 5;
//         long factorial = 1;
//         for (int i = 1; i <= n; ++i) {
//             factorial *= i;
//         }

//         System.out.println("Factorial of " + n + " is " + factorial);
//     }
// }
//
//
//pronic number
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//           System.out.println("Enter a number:");
//           int n = scanner.nextInt();
//           int f=0, i;
//             for(i=1;i<=n;i++){
//                 if ((i*(i+1))==n){
//                     f=1;
//                     break;
//                 }
//             }
//             if(f==1){
//                 System.out.println("Number is pronic");   
//             }
//             else{
//                 System.out.println("Number is not pronic");
//             }
//         }
//     }


//prime number
// import java.util.Scanner;
// public class abc 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scanner = new Scanner(System.in);
//           System.out.println("Enter a number:");
//           int n = scanner.nextInt();
//           int f=0, i;
//             for (i = 2; i <= n; i++){
//                 if (n % i == 0) {
//                     f=1;
//                     break;
//                 }
//             }       
//             if (f==0)
//             {
//                 System.out.println(n + " is a prime number.");
//             }
//             else
//             {
//                 System.out.println(n + " is not a prime number.");
//             }
//     }
// }    
//
//
//niven number
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//           System.out.println("Enter a number:");
//           int n = scanner.nextInt();
//           int number = n;
//           int sum = 0;
//             while (n > 0) {
//                 int digit = n % 10;
//                 sum += digit;
//                 n/= 10;
//             }
//             if (number%sum==0){
//                 System.out.println("The number is niven");
//             }
//             else{
//                 System.out.println("The number is not niven");
//             }
//     }
// }
//
//
//neon number
// import java.util.Scanner;
// public class abc 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scanner = new Scanner(System.in);
//           System.out.println("Enter a number:");
//           int n = scanner.nextInt();
//           int f=0, i;
//             for (i = 0; i <= n; i++){
//                 if (i*i==n) {
//                     f=1;
//                     break;
//                 }
//             }       
//             if (f==1)
//             {
//                 System.out.println(n + " is a neon number.");
//             }
//             else
//             {
//                 System.out.println(n + " is not a neon number.");
//             }
//     }
// }
//
//
//automorphic number
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         int square = n * n;
//         int c = n;
//         int f = 0;

//         while (n > 0) {
//             int ldnum = n % 10;
//             int ldsquare = square % 10;

//             if (ldnum != ldsquare) {
//                 f = 1;
//                 break;
//             }

//             n = n / 10;
//             square = square / 10;
//         }

//         if (f == 0) {
//             System.out.println(c + " is an automorphic number.");
//         } else {
//             System.out.println(c + " is not an automorphic number.");
//         }
//     }
// }
//
//
//krishnamurty number
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         int sum = 0;
//         int original = n;
//
//         while (n > 0) {
//             int digit = n % 10;
//             int factorial = 1;
//             for (int i = 2; i <= digit; i++) {
//                 factorial *= i;
//             }
//             sum += factorial;
//             n /= 10;
//         }
//
//         if (sum == original) {
//             System.out.println(original + " is a Krishnamurthy number");
//         } else {
//             System.out.println(original + " is not a Krishnamurthy number");
//         }
//     }
// }
//
//
//duck number
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         int f = 0;

//         while (n > 0) {
//             int digit = n % 10;
//             if (digit == 0) {
//                 f = 1;
//                 break;
//             }
//                 n /= 10;
//         }
//         if (f == 1) {
//             System.out.println("The number is a duck number.");
//         } else {
//             System.out.println("The number is not a duck number.");
//         }
//     }
// }
//
//
//perfect number
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         int f = 0;
//         int sum = 0;

//         for (int i = 1; i < n; i++) {
//             if (n % i == 0) {
//                 sum += i;
//             }
//         }
//         if (sum == n) {
//             f = 1;
//         }
//         if (f == 1) {
//             System.out.println("The number is a perfect number.");
//         } else {
//             System.out.println("The number is not a perfect number.");
//         }
//     }
// }
//
//
//armstrong number
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         int sum = 0;
//         int original = n;

//         while (n > 0) {
//             int digit = n % 10;
//                 sum+=digit*digit*digit;
//             n /= 10;
//         }
//         if (sum == original) {
//             System.out.println(original + " is a Armstrong number");
//         } else {
//             System.out.println(original + " is not a Armstrong number");
//         }
//     }
// }   
//
//
//palindrome
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n = scanner.nextInt();
//         int r,sum=0,temp;     
//         temp=n;    
//         while(n>0){    
//             r=n%10;
//             sum=(sum*10)+r;    
//             n=n/10;    
//         }    
//         if(temp==sum) {   
//         System.out.println(temp + " is a palindrome number ");
//         }    
//         else{    
//         System.out.println(temp+ " is not palindrome number ");    
//         }
//    }
// }          
//
//
//gcd of two numbers
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a: ");
//         int a = scanner.nextInt();   
//         System.out.print("Enter b: ");
//         int b = scanner.nextInt();
//         int r,gcd;
//         while(a%b==0){   
//             r=a%b;
//             a=b;
//             b=r;     
//         }
//         gcd=b;      
//         System.out.println("The GCD is "+ gcd);

//    }
// }
//
//
//
//do-while loop
//
//input some number and check even or odd and terminate when 0 is entered
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n;

//         do {
//             System.out.print("Enter a number (0 to terminate): ");
//             n = scanner.nextInt();
//                 if (n % 2 == 0) {
//                     System.out.println(n + " is even.");
//                 } else 
//                 {
//                     System.out.println(n + " is odd.");
//                 }
//             }
//         while (n != 0);
//         System.out.println("Program is terminated");
//     }
// }
//
//
//input some numbers and get the sum and terminate using yes or no
// import java.io.*;
// class abc
// {
//     public static void main(String args[]) throws IOException
//     {
//         InputStreamReader read=new InputStreamReader(System.in);
//         BufferedReader in=new BufferedReader(read);
//         int n;
//         int sum=0;
//         char ch;
//         System.out.println("Enter numbers (enter 0 to finish):");
//         do{
//             n=Integer.parseInt(in.readLine());
//             sum += n;
//             System.out.println("Do you want to continue ?");
//             ch=in.readLine().charAt(0);
//         }
//         while (ch=='y'||ch=='Y');
//         System.out.println("The sum is" + sum);
//     }
// }
//
//
//input array and check the number are even or odd and print the even numbers only
// import java.util.Scanner;
// class abc
// {
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int a[]=new int[10];
//         int i;

//         for(i=0;i<10;i++){
//             System.out.println("Enter the numbers: ");
//             a[i]=sc.nextInt();
//         }
//         System.out.println("The even numbers are: ");
//         for(i=0;i<10;i++){
//             if(a[i]%2==0)
//             {
//                 System.out.println(a[i]);
//             }  
//         }
//     }
// }
//
//
//max number from an array
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] arr = new int[10];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < 10; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         int max = arr[0];
//         for (int i = 1; i < 10; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         System.out.println("The maximum number in the array is: " + max);
//     }
// }
//
//
//sum of all number of an array
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] arr = new int[10];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < 10; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         int sum = 0;

//         for (int i = 0; i < 10; i++) {
//             sum += arr[i];
//         }

//         System.out.println("The sum of numbers in the array is: " + sum);
//     }
// }
//
//
//searching of a number
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] arr = new int[10];

//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < 10; i++) {
//             arr[i] = scanner.nextInt();
//         }
//         System.out.print("Enter the number to search: ");
//         int searchNum = scanner.nextInt();

//         int i;
//         for (i = 0; i < 10; i++) {
//             if (arr[i] == searchNum) {
//                 System.out.println(searchNum + " is present in the array.");
//             }
//             else 
//             {
//                 System.out.println(searchNum + " is  not present in the array.");
//             }
//         }
//     }
// }
//
//
//prime number
//import java.util.Scanner;
// public class abc 
// {
//     public static void main(String[] args) 
//     {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int size = scanner.nextInt();
//         int[] arr = new int[size];

//         System.out.println("Enter the elements of the array:");
//           int f=0, i , n;
//             for (i = 2; i <= size; i++){
//             arr[i] = scanner.nextInt();
//                 if (arr[i] % i == 0) {
//                     f=1;
//                     break;
//                 }
//             }       
//             if (f==0)
//             {
//                 System.out.println(arr[i] + " is a prime number.");
//             }
//             else
//             {
//                 System.out.println(arr[i] + " is not a prime number.");
//             }
//     }
// }  
//
//
//right shift 
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int i;
//         int[] arr = new int[5];
//         System.out.println("Enter the elements of the array:");
//         for (i = 0; i < 5; i++) {
//             arr[i] = scanner.nextInt();
//         }
//
//         int x= arr[4];
//         for (i=4; i>=1 ; i--){
//             arr[i]=arr[i-1];
//         }
//         arr[0]=x;
//
//
//         for(i=0;i<=4;i++){
//         System.out.println(arr[i]);
//         }
//     }
// }
//
//
//adding of two arrays
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int i,j=0;
//         System.out.print("Enter the size of the 1st array: ");
//         int m = scanner.nextInt();
//         int[] a = new int[m];
//         for (i = 0; i < m; i++) {
//             a[i] = scanner.nextInt();
//         }
//         System.out.print("Enter the size of the 2nd array: ");
//         int n = scanner.nextInt();
//         int[] b = new int[n];
//         for (i = 0; i < n; i++) {
//             b[i] = scanner.nextInt();
//         }
//         int[] c = new int[m+n];
//         for(i=0;i<m+n;i++){
//             if(i<m){
//                 c[i]=a[i];
//             }
//             else{
//                 c[i]=b[j];
//                 j++;
//             }
//         }
//             System.out.println("The new array is :");
//             for(i=0;i<m+n;i++){
//             System.out.println(c[i]);
//             }
//     }
// }
//
//
//spliting 
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int i,j=0,n;
//         System.out.print("Enter the size of the array: ");
//         n = scanner.nextInt();
//         int c[] = new int[n];
//         for (i = 0; i < n; i++) {
//             c[i] = scanner.nextInt();
//         }
//         System.out.print("Enter the position : ");
//         int p = scanner.nextInt();
//         int[] a = new int[p];
//         int[] b = new int[n-p];

//         for(i=0;i<n;i++){
//             if(i<p)
//             {
//                 a[i]=c[i];
//             }
//             else{
//                 b[j]=c[i];
//                 j++;
//             }
//         }
//             System.out.println("The new array is :");
//             for(i=0;i<p;i++){
//             System.out.println(a[i]);
//             }
//             System.out.println("The new array is :");
//             for(i=0;i<n-p;i++){
//                 System.out.println(b[i]);
//             }
//     }
// }
//
//
//input 3x3 matrix and print
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a[][]=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 a[i][j]=scanner.nextInt();
//             }
//         }
//         System.out.println("The 3x3 matrix is:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//input 3x3 matrix and print sum of its elements
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int s=0;
//         int a[][]=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 a[i][j]=scanner.nextInt();
//             }
//         }
//         System.out.println("The 3x3 matrix is:");        
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(a[i][j] + " ");
//                 s+=a[i][j];
//             }
//             System.out.println();
//         }
//         System.out.print("The sum of all the elements is: " + s);
//     }
// }
//
//
//input 3x3 matrix and print sum of its rows
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int s=0;
//         int a[][]=new int[3][3];
//         for(int i=0;i<3;i++){
//             for(int j=0;j<3;j++){
//                 a[i][j]=scanner.nextInt();
//             }
//         }   
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 s+=a[i][j];
//             }
//                 System.out.print("\nThe sum of row"+ (i+1) + " is: " + s);
//         }   
//     }
// }
//
//
//
//input 3x3 matrix and print transpose
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements of 3x3 matrix: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Transpose of the matrix: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
//
//
//input 3x3 matrix ,transpose and print sum of column
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[][] matrix = new int[3][3];

//         System.out.println("Enter the elements of the 3x3 matrix:");

//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("The transpose of the matrix is:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 System.out.print(matrix[j][i] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println("The sum of each column is:");
//         for (int i = 0; i < 3; i++) {
//             int sum = 0;
//             for (int j = 0; j < 3; j++) {
//                 sum += matrix[j][i];
//             }
//             System.out.println("Sum of column " + (i+1) + " is: " + sum);
//         }

//         scanner.close();
//     }
// }
//
//
//diagonal of matrix
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[][] a = new int[3][3];

//         System.out.println("Enter the elements of the 3x3 matrix: ");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 a [i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("Left Diagonal: ");
//         for (int i = 0; i < 3; i++) {
//             System.out.println(a[i][i]);
//         }
//     }
// }
//
//
//
//sum of two matrix
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter the number of rows and columns of the matrices:");
//         int rows = scanner.nextInt();
//         int cols = scanner.nextInt();

//         int[][] matrix1 = new int[rows][cols];
//         int[][] matrix2 = new int[rows][cols];

//         System.out.println("Enter the elements of the first matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 matrix1[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("Enter the elements of the second matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 matrix2[i][j] = scanner.nextInt();
//             }
//         }

//         int[][] sum = new int[rows][cols];
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 sum[i][j] = matrix1[i][j] + matrix2[i][j];
//             }
//         }

//         System.out.println("The sum of the two matrices is:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 System.out.print(sum[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//matrix multiplication
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         int s=0;
//         Scanner input = new Scanner(System.in);
//         System.out.print("Enter number of rows and columns of first matrix: ");
//         int r1 = input.nextInt(), c1 = input.nextInt();
//         int[][] m1 = new int[r1][c1];
//         System.out.println("Enter first matrix:");
//         for(int i = 0; i < r1; i++)
//             for(int j = 0; j < c1; j++)
//                 m1[i][j] = input.nextInt();

//         System.out.print("Enter number of rows and columns of second matrix: ");
//         int r2 = input.nextInt(), c2 = input.nextInt();
//         if(c1 != r2) {
//             System.out.println("Multiplication not possible");
            
//         }
//         int[][] m2 = new int[r2][c2];
//         System.out.println("Enter second matrix:");
//         for(int i = 0; i < r2; i++)
//             for(int j = 0; j < c2; j++)
//                 m2[i][j] = input.nextInt();

//         int[][] product = new int[r1][c2];
//         for(int i = 0; i < r1; i++)
//         {
//             for(int j = 0; j < c2; j++)
//             {
//                 for(int k = 0; k < c1; k++)
//                 {
//                     s += m1[i][k] * m2[k][j];
//                 }
//                 product[i][j]=s;
//                 s=0;
//             }
//         }
//         System.out.println("Resulting Matrix:");
//         for(int i = 0; i < r1; i++) {
//             for(int j = 0; j < c2; j++) {
//             System.out.print(product[i][j] + " ");
//         }
//             System.out.println();
//         }        
//     }
// }
//
//
//identity matrix
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the size of the matrix:");
//         int n = scanner.nextInt();

//         int[][] a = new int[n][n];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == j) {
//                     a[i][j] = 1;
//                 } else {
//                     a[i][j] = 0;
//                 }
//             }
//         }

//         System.out.println("Identity Matrix :");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(a[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//left upper triangular half of matrix
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[][] a = new int[3][3];

//         System.out.println("Enter the elements of the matrix:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 a[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("Right upper triangular half of the matrix:");
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 if (i<=j) {
//                     System.out.print(a[i][j] + " ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//left lower triangular half of matrix
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the size of the matrix:");
//         int n = scanner.nextInt();
//         int[][] matrix = new int[n][n];

//         System.out.println("Enter the elements of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("Left upper triangular half of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (j <= i) {
//                     System.out.print(matrix[i][j] + " ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//right upper triangular half of matrix
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the size of the matrix:");
//         int n = scanner.nextInt();
//         int[][] matrix = new int[n][n];

//         System.out.println("Enter the elements of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("Left upper triangular half of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i+j<=2) {
//                     System.out.print(matrix[i][j] + " ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//right lower triangular half of matrix
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the size of the matrix:");
//         int n = scanner.nextInt();
//         int[][] matrix = new int[n][n];

//         System.out.println("Enter the elements of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }

//         System.out.println("Left upper triangular half of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (j+i>=2) {
//                     System.out.print(matrix[i][j] + " ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//sparse matrix        
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter total rows and columns: ");
//         int rows = scanner.nextInt();
//         int cols = scanner.nextInt();

//         int[][] matrix = new int[rows][cols];

//         System.out.println("Enter matrix:");
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }

//         int count = 0;
//         int size = rows * cols;

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (matrix[i][j] == 0) {
//                     count++;
//                 }
//             }
//         }

//         if (count > size / 2) {
//             System.out.println("The matrix is a sparse matrix");
//         } else {
//             System.out.println("The matrix is not a sparse matrix");
//         }
//     }
// } 
//
//
//check a matrix is identity or not
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter the size of the matrix:");
//         int f=0,i;
//         int n = scanner.nextInt();
//         int[][] matrix = new int[n][n];
        
//         System.out.println("Enter the elements of the matrix:");
//         for (i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 matrix[i][j] = scanner.nextInt();
//             }
//         }
//         for (i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (i == j && matrix[i][j] != 1) {
//                     f=1;
//                     break;
//                 }
//                 if (i != j && matrix[i][j] != 0) {
//                     f=1;
//                     break;   
//                 }
//             }
//         }
//         if (f==0) {
//             System.out.println("The matrix is an identity matrix.");
//         }
//         else
//         {
//             System.out.println("The matrix is not identity matrix."); 
//         }
//     }
// }
//
//
//patterns 1(1234-1234-1234-1234)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = 1; j <= 4; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 2(1111-2222-3333-4444)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = 1; j <= 4; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 3(123-456-789)
// public class abc {
//     public static void main(String[] args) {
//         int k=1;
//         for(int i = 1; i <= 3; i++) {
//             for(int j = 1; j <= 3 ; j++) {
//                 System.out.print(k);
//                 k++;
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 4(1-22-333-4444)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 5(1-12-123-1234)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 6(1-21-321-4321)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 7(4321-432-43-4)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = 4; j >= i; j--) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 8(4-43-432-4321)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 4; i >= 1; i--) {
//             for(int j = 4; j >= i; j--) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 9(4-34-234-1234)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 4; i >= 1; i--) {
//             for(int j = i; j <= 4; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 10(1234-123-12-1)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 4; i >= 1; i--) {
//             for(int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 11(1234-234-34-4)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = i; j <= 4; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 12(4321-321-21-1)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 4; i >= 1; i--) {
//             for(int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//using blank and k
//pattern 13(1-12-123-1234-left upper half blank)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = i; j <= 4; j++) {
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 14(1-21-321-4321 left up blank)
// public class abc {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 4; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = i; k >= 1; k--) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 15(4321-321-21-1 left lower blank)
// public class abc {
//     public static void main(String[] args) {
//         for (int i = 4; i >= 1; i--) {
//             for (int j = 4; j > i; j--) {
//                 System.out.print(" ");
//             }
//             for (int k = i; k >= 1; k--) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 16(1234-123-12-1 left lower half blank)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 4; i >= 1; i--) {
//             for(int j = i; j<=4 ; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 17(4-34-234-1234 left upper half blank)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 4; i >= 1; i--) {
//             for(int j = 1; j<= i ; j++){
//                 System.out.print(" ");
//             }
//             for(int k = i; k <= 4; k++) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 18(1234-123-12-1 left lower blank )
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 4; i >= 1; i--) {
//             for(int j = i; j<= 4 ; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 19(1234-234-34-4 left lower blank)    
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = 1; j<= i ; j++){
//                 System.out.print(" ");
//             }
//             for(int k = i; k <= 4; k++) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 20(4321-432-43-4 left lower blank)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = i; j>= 1 ; j--){
//                 System.out.print(" ");
//             }
//             for(int k = 4; k >= i; k--) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 21(1-10-101-1010)
// public class abc {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j % 2);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 22(1-01-101-0101)
// public class abc {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j % 2);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 23(*-*#-*#*-*#*#)
// public class abc {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = 1; j <= i; j++) {
//                 if (j % 2 == 1) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print("#");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 24(11-1221-123321-12344321 pyramid)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = i; j<= 4 ; j++){
//                 System.out.print(" ");
//             }
//             for(int k = 1; k <= i; k++) {
//                 System.out.print(k);
//             }
//             for(int l=i; l>=1; l--){
//                 System.out.print(l);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 25(11-2112-321123-43211234 pyramid)
// public class abc {
//     public static void main(String[] args) {
//         for(int i = 1; i <= 4; i++) {
//             for(int j = 4; j>= i ; j--){
//                 System.out.print(" ");
//             }
//             for(int k = i; k >= 1; k--) {
//                 System.out.print(k);
//             }
//             for(int l=1; l<=i; l++){
//                 System.out.print(l);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 26(1-121-12321-1234321 pyramid)
// public class abc {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 4; i++) {
//             for (int j = i; j < 4; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j);
//             }
//             for (int k = i - 1; k >= 1; k--) {
//                 System.out.print(k);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 27(1-212-32123-4321234 pyramid)
// public class abc {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 4; i++) {
//             for (int j = i; j < 4; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 28(square border pattern)
// public class abc {
//     public static void main(String[] args) {
        
//         for (int i = 0; i < 5; i++) {
//             for (int j = 0; j < 5; j++) {
//                 if (i == 0 || i == 4 || j == 0 || j == 4) {
//                     System.out.print(". ");
//                 } else {
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//pattern 29(Cross pattern)
// public class abc {
//     public static void main(String[] args) {
//         int n = 6;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (i == j || i + j == n + 1) {
//                     System.out.print(".");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//triangle pattern
// public class abc {
//     public static void main(String[] args) {
//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 4 - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 0; j < 2 * i + 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
//
//
//string
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         System.out.println("The text is " + a);
//     }
// }
//
//
//string functions
//string length
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         int l;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         l=a.length();
//         System.out.println("The text is " + a);
//         System.out.println("The length of the string is "+ l);
//     }
// }
//
//
//character finding
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         char l;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         l=a.charAt(3);
//         System.out.println("The text is " + a);
//         System.out.println("The letter at given index is "+l);
//     }
// }
//
//
//all character printing
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         char l;
//         int n;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         n=a.length();
//         for(int i=0;i<=n;i++){
//             l=a.charAt(i);
//         System.out.println("The letters are "+l);
//         }
//     }
// }
//
//
//vowels                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         char l;
//         int n;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         n=a.length();
//         System.out.println("The vowels are: ");
//         for(int i=0;i<n;i++){
//             l=a.charAt(i);
//             if( l=='a' || l=='e' || l=='i' || l=='o' || l=='u' || l=='A' ||l=='E' || l=='I' || l=='O' || l=='O'){
//                 System.out.println(l);
//             }
//         }
//     }
// }
//
//
//count words in a string
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         char l;
//         int n;
//         int c=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         n=a.length();
//         System.out.println("The number of words are: ");
//         for(int i=0;i<n;i++){
//             l=a.charAt(i);
//             if( l==' '){
//                 c=c+1;
//             }
//         }
//         System.out.println(c+1);
//     }
// }
//
//
//replace vowel with *
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         char l;
//         int n;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         n=a.length();
//         String s1=" ";
//         System.out.println("The vowels are: ");
//         for(int i=0;i<n;i++){
//             l=a.charAt(i);
//             if( l=='a' || l=='e' || l=='i' || l=='o' || l=='u' || l=='A' ||l=='E' || l=='I' || l=='O' || l=='O'){
//                 s1=s1+"*";    
//             }
//             else{
//                 s1=s1+l;
//             }
//         }
//         System.out.println(s1);
//     }
// }
//
//
//input string and print consecutive same character
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         char l;
//         int n;
//         int c=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         n=a.length();
//         for(int i=0;i<n-1;i++){
//             l=a.charAt(i);
//             if(a.charAt(i)==a.charAt(i+1)){
//                 c=c+1;
//             }
//         }
//         System.out.println(c);
//     }
// }
//
//
//print all initials of string
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         char l=0;
//         int n;
//         String s1=" ";
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         a=" "+a;
//         n=a.length();
//         for(int i=0;i<=n-1;i++){
//             l=a.charAt(i);
//             if(l==' '){
//                 s1=s1+a.charAt(i+1);
//             }
//         }
//         System.out.println("The letter is "+ s1);
//     }
// } 
//
//
//print all words from a string
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         char l=0;
//         int n;
//         String w=" ";
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         a=a+" ";
//         n=a.length();
//         for(int i=0;i<=n-1;i++){
//             l=a.charAt(i);
//             if(l==' '){
//                 System.out.println(w);
//                 w=" ";
//             }
//             else{
//                 w=w+l;
//             }
//         }
//     }
// } 
//
//
//reverse the characters of word and also the words
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String str = scanner.nextLine();

//         String reversedString = " ";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversedString += str.charAt(i);
//         }

//         System.out.println("The reversed string is: " + reversedString);
//     }
// }
//
//
//reverse the character word
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String str = scanner.nextLine();

//         String reverse = " ";
//         String word = "";
//         for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);
//             if (c != ' ') {
//                 word = c + word;
//             } else {
//                 reverse += word + " ";
//                 word = "";
//             }
//         }
//         reverse += word;

//         System.out.println("The string with reversed words is: " + reverse);
//     }
// }
//
//
//reverse the words
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String str = scanner.nextLine();

//         String reversed = " ";
//         String word = "";
//         for (int i = 0; i < str.length(); i++) {
//             char c = str.charAt(i);
//             if (c != ' ') {
//                 word += c;
//             } else {
//                 reversed = " " + word + reversed;
//                 word = "";
//             }
//         }
//         reversed = word + reversed;

//         System.out.println("The string with words in reverse order is: " + reversed);
//     }
// }
//
//
//longest string among all
// import java.util.Scanner;
// public class abc {
//     public static void main(String[] args) {
//         String a;
//         char l;
//         int max=0;
//         int l1;
//         int n=0;
//         String longest="";
//         String w="";
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         n=a.length();
//         for(int i=0;i<=n-1;i++){
//             l=a.charAt(i);
//             if(l==' '){
//                 l1=w.length();
//                 if(l1>max){
//                     max=l1;
//                     longest=w;
//                 }
//                 w="";
//             }
//             else{
//                 w=w+l;
//             }
//         }
//         System.out.println(longest);
//     }
// } 
//
//
//having most vowel
// import java.util.Scanner;

// public class abc {
//     public static void main(String[] args) {
//         String a;
//         char l=0;
//         int n;
//         String w=" ";
//         String max = "";
//         int maxvowel = 0;
//         int current = 0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter text");
//         a=sc.nextLine();
//         a=a+" ";
//         n=a.length();
//         for(int i=0;i<=n-1;i++){
//             l=a.charAt(i);
//             if(l==' '){
//                 if(current > maxvowel){
//                     maxvowel = current;
//                     max = w;
//                 }
//                 w=" ";
//                 current = 0;
//             }
//             else{
//                 w=w+l;
//                 if(l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u' ||
//                    l == 'A' || l == 'E' || l == 'I' || l == 'O' || l == 'U'){
//                     current++;
//                 }
//             }
//         }
//         System.out.println("The word with maximum vowels is: " + max);
//     }
// }
//
//
//classes and methods
// public class abc {
//     void show(){
//         System.out.println("class abc");
//     }
//     public static void main(String[] args) {
//         abc ob=new abc();
//         ob.show();
//     }
// }
//
//
//static method
// public class abc {
//     static void show(){
//         System.out.println("class abc");
//     }
//     public static void main(String[] args) {
//         show();
//     }
// }
//
//
//sum using static method
// public class abc {
//     static int sum(int num1, int num2) {
//         return num1 + num2;
//     }
//     public static void main(String[] args) {
//         int num1 = 5;
//         int num2 = 7;
//         int sum = sum(num1, num2);
//         System.out.println("Sum is "+ sum);
//     }
// }
//
//
//method overloading
//no return type with parameter
// public class abc {
//     public int sum(int a, int b) {
//         return a + b;
//     }
//     public int sum(int a, int b, int c) {
//         return a + b + c;
//     }
//     public int sum(int a, int b, int c, int d) {
//         return a + b + c + d;
//     }
//     public static void main(String[] args) {
//         abc ob=new abc();
//         int num1 = 5;
//         int num2 = 7;
//         int num3 = 9;
//         int num4 = 11;
//         int sum1 = ob.sum(num1, num2);
//         int sum2 = ob.sum(num1,num2,num3);
//         int sum3 = ob.sum(num1,num2,num3,num4);
//         System.out.println("Sum of 2 numbers "+sum1);
//         System.out.println("Sum of 3 numbers "+sum2);
//         System.out.println("Sum of 4 numbers "+sum3);
//     }
// }
//
//
//area of rectangle ,square and circle
// public class abc {
//     public int rectangle(int length, int width) {
//         return length * width;
//     }
//     public int square(int side) {
//         return side * side;
//     }
//     public double circle(double radius) {
//         return Math.PI * radius * radius;
//     }

//     public static void main(String[] args) {
//         abc ob = new abc();
//         int length = 7;
//         int breadth = 5;
//         double radius = 6;
//         int side = 5;
//         int rectangleArea = ob.rectangle(length,breadth);
//         int squareArea = ob.square(side);
//         double circleArea = ob.circle(radius);
        
//         System.out.println("Area of Rectangle: " + rectangleArea);
//         System.out.println("Area of Square: " + squareArea);
//         System.out.println("Area of Circle: " + circleArea);
//     }
// }
//
//
//volume of sphere,cylinder and sphere
// public class abc {
//     public double volume(double r) {
//         return (4.0 / 3.0) * (22.0 / 7.0) * r * r * r;
//     }

//     public double volume(double h, double r) {
//         return (22.0 / 7.0) * r * r * h;
//     }

//     public double volume(double l, double b, double h) {
//         return l * b * h;
//     }

//     public static void main(String[] args) {
//         abc calc = new abc();
//         double radius = 7;
//         double length = 6;
//         double breadth = 5;
//         double height = 3;

//         double sphere = calc.volume(radius);
//         double cylinder = calc.volume(height,radius);
//         double cuboid = calc.volume(length,breadth,height);

//         System.out.println("Volume of sphere: " + sphere);
//         System.out.println("Volume of cylinder: " + cylinder);
//         System.out.println("Volume of cuboid: " + cuboid);
//     }
// }
//
//
//sum of series
// public class abc {
//     public double series(double n) {
//         double sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum += 1.0 / i;
//         }
//         return sum;
//     }
//     public double series(double a, double n) {
//         double sum = 0;
//         for (int i = 0; i < n; i++) {
//             sum += 1.0 / (a + i * 3);
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         abc calc = new abc();
//         int n = 5;
//         int a = 2;
//         double sum1 = calc.series(n);
//         System.out.println("Sum of series with one argument: " + sum1);
//         double sum2 = calc.series(a,n);
//         System.out.println("Sum of series with two arguments: " + sum2);
//     }
// }
//
//
//compare of integer,character and string
// public class abc {
//     public void compare(int a, int b) {
//         if (a > b) {
//             System.out.println(a + " is greater than " + b);
//         } else if (b > a) {
//             System.out.println(b + " is greater than " + a);
//         } else {
//             System.out.println(a + " is equal to " + b);
//         }
//     }
//     public void compare(char c, char d) {
//         if (c > d) {
//             System.out.println(c + " has higher numeric value than " + d);
//         } else if (d > c) {
//             System.out.println(d + " has higher numeric value than " + c);
//         } else {
//             System.out.println("Both characters have the same numeric value: " + c);
//         }
//     }
//     public void compare(String str1, String str2) {
//         int len1 = str1.length();
//         int len2 = str2.length();
//         if (len1 > len2) {
//             System.out.println(str1 + " is longer than " + str2);
//         } else if (len2 > len1) {
//             System.out.println(str2 + " is longer than " + str1);
//         } else {
//             System.out.println("Both strings have the same length: " + len1);
//         }
//     }

//     public static void main(String[] args) {
//         abc comp = new abc();
//         int a = 5;
//         int b = 6;
//         int c = 'a';
//         int d = 'b';
//         String str1 = "Hello";
//         String str2 = "Apples";
//         comp.compare(a,b);
//         comp.compare(c,d);
//         comp.compare(str1,str2);
//     }
// }
//
//
//perimeter of sqaure rectangle and triangle
// public class abc {
//     public double calculate(int side) {
//         return 4 * side;
//     }
//     public double calculate(double length, double breadth) {
//         return 2 * (length + breadth);
//     }
//     public double calculate(double radius) {
//         return 2 * (22.0 / 7.0) * radius;
//     }

//     // Example usage
//     public static void main(String[] args) {
//         abc calculator = new abc();
//         int side = 5;
//         double length = 7;
//         double breadth = 5;
//         double radius = 3;
//         double square = calculator.calculate(side);
//         System.out.println("Perimeter of square: " + square);
//         double rectangle = calculator.calculate(length,breadth);
//         System.out.println("Perimeter of rectangle: " + rectangle);
//         double circle = calculator.calculate(radius);
//         System.out.println("Perimeter of circle: " + circle);
//     }
// }
//
//
//area of parallelogram,trap and rhombus
// public class abc {
//     public double calculate(int base, double height) {
//         return base * height;
//     }
//     public double calculate(double diagonal1, double diagonal2) {
//         return 0.5 * diagonal1 * diagonal2;
//     }
//     public double calculate(double parallelSide1, double parallelSide2, double height) {
//         return 0.5 * (parallelSide1 + parallelSide2) * height;
//     }
//     public static void main(String[] args) {
//         abc areaCalculator = new abc();
//         int base = 5;
//         double height = 8;
//         double diagonal1 = 5;
//         double diagonal2 = 9;
//         double parallelside1 = 4;
//         double parallelside2 = 6;
//         double parallelogram = areaCalculator.calculate(base,height);
//         System.out.println("Area of parallelogram: " + parallelogram);
//         double rhombus = areaCalculator.calculate(diagonal1,diagonal2);
//         System.out.println("Area of rhombus: " + rhombus);
//         double trapezium = areaCalculator.calculate(parallelside1,parallelside2,height);
//         System.out.println("Area of trapezium: " + trapezium);
//     }
// }
//
//
//void calculate(int m, char ch) with one integer argument and one character argument. It checks whether the integer argument is divisible by 7 or not, if ch is 's', otherwise, it checks whether the last digit of the integer argument is 7 or not.
// void calculate(int a, int b, char ch) with two integer arguments and one character argument. It displays the greater of integer arguments if ch is 'g' otherwise, it displays the smaller of integer arguments.
// public class abc {
//     void calculate(int m, char ch) {
//         if (ch == 's') {
//             if (m % 7 == 0) {
//                 System.out.println(m + " is divisible by 7");
//             } else {
//                 System.out.println(m + " is not divisible by 7");
//             }
//         } else {
//             int ld = m % 10;
//             if (ld == 7) {
//                 System.out.println(m + " has 7 as its last digit");
//             } else {
//                 System.out.println(m + " does not have 7 as its last digit");
//             }
//         }
//     }
//     void calculate(int a, int b, char ch) {
//         if (ch == 'g') {
//             if (a > b) {
//                 System.out.println(a + " is greater than " + b);
//             } else {
//                 System.out.println(b + " is greater than " + a);
//             }
//         } else {
//             if (a < b) {
//                 System.out.println(a + " is smaller than " + b);
//             } else {
//                 System.out.println(b + " is smaller than " + a);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         abc calc = new abc();
//         calc.calculate(35, 's');
//         calc.calculate(57, 's');
//         calc.calculate(123, 'l');
//         calc.calculate(127, 'l');
//         calc.calculate(10, 20, 'g'); 
//         calc.calculate(30, 20, 'l'); 
//     }
// }
//
//
//area calculation by giving choices
// import java.util.Scanner;

// public class abc {
//     public static double circle(double radius) {
//         return (22.0 / 7.0) * radius * radius;
//     }

//     public static double square(double side) {
//         return side * side;
//     }

//     public static double rectangle(double length, double breadth) {
//         return length * breadth;
//     }
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int choice;
//             System.out.println("Menu:");
//             System.out.println("1. Area of Circle");
//             System.out.println("2. Area of Square");
//             System.out.println("3. Area of Rectangle");
//             System.out.println("4. Exit");
//             System.out.print("Enter your choice: ");
//             choice = scanner.nextInt();
//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter radius of circle: ");
//                     double radius = scanner.nextDouble();
//                     System.out.println("Area of circle: " + circle(radius));
//                     break;
//                 case 2:
//                     System.out.print("Enter side of square: ");
//                     double side = scanner.nextDouble();
//                     System.out.println("Area of square: " + square(side));
//                     break;
//                 case 3:
//                     System.out.print("Enter length of rectangle: ");
//                     double length = scanner.nextDouble();
//                     System.out.print("Enter breadth of rectangle: ");
//                     double breadth = scanner.nextDouble();
//                     System.out.println("Area of rectangle: " + rectangle(length, breadth));
//                     break;
//                 case 4:
//                     System.out.println("Exiting program...");
//                     break;
//                 default:
//                     System.out.println("Invalid choice. Please enter a number between 1 and 4.");
//             }
//     }
// }
//
//
//discount program
// public class abc {
    
//     public static double Discount(int printedprice) {
//         double discountamount = printedprice * 0.1;
//         return printedprice - discountamount;
//     }
//     public static double Discount(int printedprice, int discount1) {
//         double discountedprice = printedprice - (printedprice * discount1 / 100.0);
//         return discountedprice;
//     }
//     public static double Discount(int printedprice, int discount1, int discount2) {
//         double discountedprice = Discount(printedprice, discount1);
//         discountedprice -= discountedprice * discount2 / 100.0;
//         return discountedprice;
//     }
    
//     public static void main(String[] args) {
//         int printedprice = 12000;
//         int discount1 = 10;
//         int discount2 = 8;

//         double discountedprice1 = Discount(printedprice);
//         System.out.println("Amount to be paid after single discount: " + discountedprice1);
        
//         double discountedprice2 = Discount(printedprice, discount1);
//         System.out.println("Amount to be paid after first discount: " + discountedprice2);
        
//         double discountedprice3 = Discount(printedprice, discount1, discount2);
//         System.out.println("Amount to be paid after successive discounts: " + discountedprice3);
//     }
// }
//
//
//void display(String str, int p) with one String argument and one integer argument. It displays all the uppercase characters if 'p' is 1 (one) otherwise, it displays all the lowercase characters.
//void display(String str, char chr) with one String argument and one character argument. It displays all the vowels if chr is 'v' otherwise, it displays all the alphabets.
// public class abc {
//     void display(String str, int p) {
//         if (p == 1) {
//             for (int i = 0; i < str.length(); i++) {
//                 char ch = str.charAt(i);
//                 if (Character.isUpperCase(ch)) {
//                     System.out.print(ch + " ");
//                 }
//             }
//         } else {
//             for (int i = 0; i < str.length(); i++) {
//                 char ch = str.charAt(i);
//                 if (Character.isLowerCase(ch)) {
//                     System.out.print(ch + " ");
//                 }
//             }
//         }
//         System.out.println();
//     }
//     void display(String str, char chr) {
//         if (chr == 'v') {
//             for (int i = 0; i < str.length(); i++) {
//                 char ch = Character.toLowerCase(str.charAt(i));
//                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                     System.out.print(ch + " ");
//                 }
//             }
//         } else {
//             for (int i = 0; i < str.length(); i++) {
//                 char ch = str.charAt(i);
//                 if (Character.isLetter(ch)) {
//                     System.out.print(ch + " ");
//                 }
//             }
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         abc display = new abc();

//         String input = "Hello World";
//         int p = 1;
//         char chr = 'v';

//         display.display(input, p);

//         display.display(input, chr);
//     }
// }
//
//
//types of variable
//create a class calculate having instance variable a,b,c member method void input() two input two number ,void sum to calculate sum of two number , void display to display sum 
// import java.util.Scanner;

// public class abc {
//     int a;
//     int b;
//     int c;

//     public void input() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         a = scanner.nextInt();
//         System.out.print("Enter second number: ");
//         b = scanner.nextInt();
//     }

//     public void sum() {
//         c = a + b;
//     }

//     public void display() {
//         System.out.println("Sum of " + a + " and " + b + " is: " + c);
//     }

//     public static void main(String[] args) {
//         abc calc = new abc();
//         calc.input();
//         calc.sum();
//         calc.display();
//     }
// }
//
//
//class name Employee,Data MembersPurposeint panTo store personal account numberString nameTo store namedouble taxincomeTo store annual taxable incomedouble taxTo store tax that is calculatedMember functionsPurposevoid input()Store the pan number, name, taxable incomevoid cal()Calculate tax on taxable incomevoid display()Output details of an employee
// import java.util.Scanner;
// public class abc {
//     int pan;
//     String name;
//     double income;
//     double tax;

//     public void input() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter PAN number: ");
//         pan = scanner.nextInt();
//         scanner.nextLine(); 
//         System.out.print("Enter name: ");
//         name = scanner.nextLine();
//         System.out.print("Enter annual taxable income: ");
//         income = scanner.nextDouble();
//     }

//     public void calculate() {
//         if (income <= 250000) {
//             tax = 0;
//         } else if (income <= 500000) {
//             tax = (income - 250000) * 0.1;
//         } else if (income <= 1000000) {
//             tax = 30000 + (income - 500000) * 0.2;
//         } else {
//             tax = 50000 + (income - 1000000) * 0.3;
//         }
//     }

//     public void display() {
//         System.out.println("PAN: " + pan);
//         System.out.println("Name: " + name);
//         System.out.println("Income: " + income);
//         System.out.println("Tax: " + tax);
//     }

//     public static void main(String[] args) {
//         abc employee = new abc();
//         employee.input();
//         employee.calculate();
//         employee.display();
//     }
// }
//
//
//Class name : Telephone Data MembersPurposeint prv, preto store the previous and present meter readingsint callto store the calls made (i.e. pre - prv)String nameto store name of the consumerdouble amtto store the amountdouble totalto store the total amount to be paidMember functionsPurposevoid input()Stores the previous reading, present reading and name of the consumervoid cal()Calculates the amount and total amount to be paidvoid display()Displays the name of the consumer, calls made, amount and total amount to be paid
// import java.util.Scanner;

// class abc {
//     int prv, pre, call;
//     String name;
//     double amt, total;

//     void input() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter consumer name: ");
//         name = scanner.nextLine();
//         System.out.print("Enter previous meter reading: ");
//         prv = scanner.nextInt();
//         System.out.print("Enter present meter reading: ");
//         pre = scanner.nextInt();
//         call = pre - prv;
//     }

//     void cal() {
//         if (call <= 100) {
//             amt = 0;
//         } else if (call <= 200) {
//             amt = (call - 100) * 0.90;
//         } else if (call <= 400) {
//             amt = 100 * 0.90 + (call - 200) * 0.80;
//         } else {
//             amt = 100 * 0.90 + 200 * 0.80 + (call - 400) * 0.70;
//         }
//         total = amt + 180;
//     }

//     void display() {
//         System.out.println("Consumer name: " + name);
//         System.out.println("Calls made: " + call);
//         System.out.println("Amount: " + amt);
//         System.out.println("Total amount to be paid: " + total);
//     }
//     public static void main(String[] args) {
//         abc telephone = new abc();
//         telephone.input();
//         telephone.cal();
//         telephone.display();
//     }
// }
//
//
//Class name — Stock,Data Members:,String title — Contains title of the book,String author — Contains author name,String pub — Contains publisher's name,int noc — Number of copies,Member Methods:,void getdata() — To accept title, author, publisher's name and the number of copies.,void purchase(int t, String a, String p, int n) — To check the existence of the book in the stock by comparing total, author's and publisher's name. Also check whether noc >n or not. If yes, maintain the balance as noc-n, otherwise display book is not available or stock is under flowing.
// import java.util.Scanner;
// class abc {
//     String title;
//     String author;
//     String pub;
//     int noc;

//     void getdata() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter title:");
//         title = scanner.nextLine();
//         System.out.println("Enter author:");
//         author = scanner.nextLine();
//         System.out.println("Enter publisher's name:");
//         pub = scanner.nextLine();
//         System.out.println("Enter number of copies:");
//         noc = scanner.nextInt();
//     }

//     void purchase(int t, String a, String p, int n) {
//         if (title.equals(t) && author.equals(a) && pub.equals(p)) {
//             if (noc >= n) {
//                 noc -= n;
//                 System.out.println("Purchase successful. Remaining copies: " + noc);
//             } else {
//                 System.out.println("Insufficient stock.");
//             }
//         } else {
//             System.out.println("Book not found in stock.");
//         }
//     }

//     public static void main(String[] args) {
//         abc book1 = new abc();
//         book1.getdata();
//         book1.purchase("Title", "Author", "Publisher", 2);
//     }
// }
//
//
//
//Data MembersPurposeString nameTo store the name of the studentint engTo store marks in Englishint hnTo store marks in Hindiint mtsTo store marks in Mathsdouble totalTo store total marksdouble avgTo store average marksMember MethodsPurposevoid accept()To input marks in English, Hindi and Mathsvoid compute()To calculate total marks and average of 3 subjectsvoid display()To show all the details viz. name, marks, total and average
// import java.util.Scanner;
// class abc {
//     String name;
//     int eng;
//     int hn;
//     int mts;
//     double total;
//     double avg;

//     void accept() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter name: ");
//         name = scanner.nextLine();
//         System.out.print("Enter marks in English: ");
//         eng = scanner.nextInt();
//         System.out.print("Enter marks in Hindi: ");
//         hn = scanner.nextInt();
//         System.out.print("Enter marks in Maths: ");
//         mts = scanner.nextInt();
//     }

//     void compute() {
//         total = eng + hn + mts;
//         avg = total / 3;
//     }

//     void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Marks in English: " + eng);
//         System.out.println("Marks in Hindi: " + hn);
//         System.out.println("Marks in Maths: " + mts);
//         System.out.println("Total Marks: " + total);
//         System.out.println("Average Marks: " + avg);
//     }
//     public static void main(String[] args) {
//         abc student = new abc();
//         student.accept();
//         student.compute();
//         student.display();
//     }
// }
//
//
//Data MembersPurposeint timeTime for which loan is sanctioneddouble principalAmount sanctioneddouble rateRate of interestdouble interestTo store the interestdouble amtAmount to pay after given timeMember MethodsPurposevoid getdata()To accept principal and timevoid calculate()To find interest and amount.
// import java.util.Scanner;
// class abc {
//     int time;
//     double principal;
//     double rate;
//     double interest;
//     double amt;

//     void getdata() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter principal amount: ");
//         principal = scanner.nextDouble();
//         System.out.print("Enter time (in years): ");
//         time = scanner.nextInt();
//     }

//     void calculate() {
//         if (time <= 5) {
//             rate = 15;
//         } else if (time <= 10) {
//             rate = 12;
//         } else {
//             rate = 10;
//         }

//         interest = (principal * rate * time) / 100;
//         amt = principal + interest;
//     }

//     void display() {
//         System.out.println("Principal Amount: " + principal);
//         System.out.println("Time (in years): " + time);
//         System.out.println("Rate of Interest: " + rate + "%");
//         System.out.println("Interest: " + interest);
//         System.out.println("Total Amount to Pay: " + amt);
//     }
//     public static void main(String[] args) {
//         abc loan = new abc();
//         loan.getdata();
//         loan.calculate();
//         loan.display();
//     }
// }
//
//
//
//Data MembersPurposeint pto store principal (sum)int rto store rateint tto store timedouble interestto store the interest to be paiddouble amtto store the amount to be paidMember functionsPurposevoid input()Stores the principal, rate, timevoid cal()Calculates the interest and amount to be paidvoid display()Displays the principal, interest and amount to be paid
// import java.util.Scanner;
// class abc {
//     int p;
//     int r;
//     int t;
//     double interest;
//     double amt;

//     void input() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter principal amount: ");
//         p = scanner.nextInt();
//         System.out.print("Enter time (in years): ");
//         t = scanner.nextInt();
//     }

//     void cal() {
//         if (t == 1) {
//             r = 6;
//         } else if (t == 2) {
//             r = 7;
//         } else if (t == 3) {
//             r = 8;
//         } else {
//             r = 9;
//         }

//         interest = (p * r * t) / 100.0;
//         amt = p + interest;
//     }

//     void display() {
//         System.out.println("Principal Amount: " + p);
//         System.out.println("Time (in years): " + t);
//         System.out.println("Rate of Interest: " + r + "%");
//         System.out.println("Interest: " + interest);
//         System.out.println("Total Amount to Pay: " + amt);
//     }
//     public static void main(String[] args) {
//         abc interest = new abc();
//         interest.input();
//         interest.cal();
//         interest.display();
//     }
// }
//
//
//constructor
//default constructor
// class abc
// {
//     int a;
//     abc(){
//         a=5;
//     }
//     void show(){
//         System.out.println("The value of a is "+a);
//     }
//     public static void main(String[] args){
//         abc ob = new abc();
//         ob.show();
//     }
// }
//
//
//parametrized constructor
// class abc{
//     int a;
//     abc(int x){
//         a=x;
//     }
//     void show(){
//         System.out.println("The value of a is "+a);
//     }
//     public static void main(String[] args) {
//         abc ob = new abc(5);
//         ob.show();
//     }
// }
//
//
//copy constructor 
// class abc{
//     int a;
//     abc(int x){
//         a=x;
//     }
//     abc(abc ob){
//         a=ob.a;
//     }
//     void show(){
//         System.out.println("The value of a is "+a);
//     }
//     public static void main(String[] args) {
//         abc ob = new abc(5);
//         abc ob1 = new abc(ob);
//         ob.show();
//         ob1.show();
//     }
// }
//
//
//class student having instance variable name roll class and create a constructor to initialize all data and create a member method to display all details
// public class abc {
//     String name;
//     int roll;
//     int cl;

//     public abc(String a, int x, int c) {
//         name=a;
//         roll=x;
//         cl=c;
//     }
//     public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Roll Number: " + roll);
//         System.out.println("Class: " + cl);
//     }
//     public static void main(String[] args) {
//         abc student1 = new abc("Alice", 10, 5);
//         student1.display();
//     }
// }
//
//
//Hcflcm(int x, int y) — constructor to initialize a=x and b=y ,void calculate( ) — to find and print hcf and lcm of both the numbers
// import java.util.Scanner;

// public class abc {
//     int a;
//     int b;

//     public abc(int x, int y) {
//         a = x;
//         b = y;
//     }

//     public void calculate() {
//         int x = a, y = b;
//         while (y != 0) {
//             int t = y;
//             y = x % y;
//             x = t;
//         }
//         int hcf = x;
//         int lcm = (a * b) / hcf;

//         System.out.println("HCF = " + hcf);
//         System.out.println("LCM = " + lcm);
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int x = in.nextInt();
//         System.out.print("Enter second number: ");
//         int y = in.nextInt();

//         abc obj = new abc(x, y);
//         obj.calculate();
//     }
// }
//
//
//Data members/instance variables:name,price,dis,amt.Member Methods:A parameterised constructor to initialize the data members,To accept the details (name of the customer and the price),To compute the discount,To display the name, discount and amount to be paid after discount
// import java.util.Scanner;
// public class abc {
//     String name;
//     int price;
//     double dis;
//     double amt;

//     public abc(String a, int b) {
//         name = a;
//         price = b;
//     }

//     public void discount() {
//         if (price <= 25000)
//             dis = price * 0.05;
//         else if (price <= 50000)
//             dis = price * 0.075;
//         else if (price <= 100000)
//             dis = price * 0.1;
//         else
//             dis = price * 0.15;

//         amt = price - dis;
//     }

//     public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Discount: " + dis);
//         System.out.println("Amount to be paid: " + amt);
//     }

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter Customer Name: ");
//         String a = in.nextLine();
//         System.out.print("Enter Price: ");
//         int b = in.nextInt();

//         abc obj = new abc(str, b);
//         obj.discount();
//         obj.display();
//     }
// }
//
//
//The population of a country in a particular year can be calculated by:p*(1+r/100) at the end of year 2000, where p is the initial population and r is the growth rate. Population(int a,int b) — Constructor to initialize p and r with a and b respectively ,void print() — to calculate and print the population of each year from 2001 to 2007.
// import java.util.Scanner;
// public class abc{
//     float p,r;
//     public abc(float a, float b)
//     {
//         p = a;
//         r = b;
//     }

//     public void print() {
//         float q = p;
//         for (int y = 2001; y <= 2007; y++) {
//             q = q * (1 + r / 100);
//             System.out.println("Population in " + y + ": " + q);
//         }
//     }
    
//     public static void main(String args[]) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter population in the year 2000: ");
//         float x = in.nextFloat();
//         System.out.print("Enter growth rate: ");
//         float y = in.nextFloat();
        
//         abc obj = new abc(x,y);
//         obj.print();
//     }
// }
//
//
//quad(int x,int y,int z) — to initialize a=x, b=y, c=z, d=0 ,void calculate() — Find d=b2-4ac If d < 0 then print "Roots not possible" otherwise find and print:r1 = (-b + √d) / 2a ,r2 = (-b - √d) / 2a.
// import java.util.Scanner;
// public class abc
// {
//     float a,b,c,d,r1,r2;

//     public abc(float x, float y, float z)
//     {
//         a = x;
//         b = y;
//         c = z;
//         d = 0;
//     }

//     public void calculate() {
//         d= (b * b) - (4 * a * c);
//         if (d > 0){
//             r1 = (float)((-b + Math.sqrt(d)) / (2 * a));
//             r2 = (float)((-b - Math.sqrt(d)) / (2 * a));
//             System.out.println("r1=" + r1);
//             System.out.println("r2=" + r2);        
//         }    
//         else {
//             System.out.println("Roots not possible");
//         }
//     }
    
//     public static void main(String args[]) {
        
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a: ");
//         float x = in.nextFloat();
//         System.out.print("Enter b: ");
//         float y = in.nextFloat();
//         System.out.print("Enter c: ");
//         float z = in.nextFloat();
        
//         abc obj = new abc(x,y,z);
//         obj.calculate();
//     }
// }
//
//
//FruitJuice()	constructor to initialize integer data members to 0 and string data members to " ",void input()	to input and store the product code, flavour, pack type, pack size and product price ,void discount()	to reduce the product price by 10 ,void display()	to display the product code, flavour, pack type, pack size and product price
// import java.util.Scanner;

// public class abc{
//     int product_code;
//     String flavour;
//     String pack_type;
//     int pack_size;
//     int product_price;
    
//     public abc() {
//         pack_type = "";
//         pack_size = 0;
//         product_price = 0;
//         product_code = 0;
//         flavour = "";
//     }
    
//     public void input() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter Flavour: ");
//         flavour = in.nextLine();
//         System.out.print("Enter Pack Type: ");
//         pack_type = in.nextLine();
//         System.out.print("Enter Product Code: ");
//         product_code = in.nextInt();
//         System.out.print("Enter Pack Size: ");
//         pack_size = in.nextInt();
//         System.out.print("Enter Product Price: ");
//         product_price = in.nextInt();
//     }
    
//     public void discount() {
//         product_price -= 10;
//     }
    
//     public void display() {
//         System.out.println("Product Code: " + product_code);
//         System.out.println("Flavour: " + flavour);
//         System.out.println("Pack Type: " + pack_type);
//         System.out.println("Pack Size: " + pack_size);
//         System.out.println("Product Price: " + product_price);
//     }
    
//     public static void main(String args[]) {
//         abc obj = new abc();
//         obj.input();
//         obj.discount();
//         obj.display();
//     }
// }
//
//
//Grade_Revision()	constructor to initialize all data members,void accept() to input name, basic and experience,void increment() to calculate increment based on experience as per the table given below,void display() to print all the details of an employee.
// import java.util.Scanner;
// public class abc{
//     String name;
//     int expn;
//     int bas;
//     double nbas;
//     double inc;
    
//     public abc() {
//         name = "";
//         bas = 0;
//         inc = 0.0;
//         nbas = 0.0;
//         expn = 0;
//     }
    
//     public void accept() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter name: ");
//         name = in.nextLine();
//         System.out.print("Enter basic: ");
//         bas = in.nextInt();
//         System.out.print("Enter experience: ");
//         expn = in.nextInt();
//     }
    
//     public void increment() {
//         if (expn <= 3)
//             inc = 1000 + (bas * 0.1);
//         else if (expn <= 5)
//             inc = 3000 + (bas * 0.12);
//         else if (expn <= 10)
//             inc = 5000 + (bas * 0.15);
//         else
//             inc = 8000 + (bas * 0.2);
            
//         nbas = bas + inc;
//     }
    
//     public void display() {
//         System.out.println("Name: " + name);
//         System.out.println("Basic: " + bas);
//         System.out.println("Experience: " + expn);
//         System.out.println("Increment: " + inc);
//         System.out.println("New Basic: " + nbas);
//     }
    
//     public static void main(String args[]) {
//         abc obj = new abc();
//         obj.accept();
//         obj.increment();
//         obj.display();
//     }
// }
//
//
//Student( ) parameterised constructor to initialize the data members by accepting the details of a student,check( ) to check the eligibility for course based on the table given below,void display() to print the eligibility by using check() function in nested form
// import java.util.Scanner;
// public class abc{
//     String name;
//     int mm;
//     int scm;
//     int comp;

//     public abc(String n, int m, int sc, int c) {
//         name = n;
//         mm = m;
//         scm = sc;
//         comp = c;
//     }

//     public String check() {
//         String course = "Not Eligible";
//         double avg = (mm + scm + comp) / 3.0;
        
//         if (mm >= 90 && scm >= 90 && comp >= 90)
//             course = "Science with Computer";
//         else if (avg >= 90)
//             course = "Bio-Science";
//         else if (avg >= 80)
//             course = "Science with Hindi";

//         return course;
//     }
//     public void display() {
//         String eligibility = check();
//         System.out.println("Eligibility: " + eligibility);
//     }
    
//     public static void main(String args[]) {
        
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter Name: ");
//         String n = in.nextLine();
//         System.out.print("Enter Marks in Maths: ");
//         int m = in.nextInt();
//         System.out.print("Enter Marks in Science: ");
//         int sc = in.nextInt();
//         System.out.print("Enter Marks in Computer: ");
//         int c = in.nextInt();
        
//         abc obj = new abc(n, m, sc, c);
//         obj.display();
//     }
// }
//
//
//Bill() constructor to initialize data members with default initial value,Bill(...)	parameterised constructor to accept billno, name and no. of calls consumed,Calculate()	to calculate the monthly telephone bill for a consumer as per the table given below,Display()	to display the details
// import java.util.Scanner;
// public class abc{
//     private int bno;
//     private String name;
//     private int call;
//     private double amt;
    
//     public abc() {
//         bno = 0;
//         name = "";
//         call = 0;
//         amt = 0.0;
//     }
    
//     public abc(int b, String n, int c) {
//         bno = b;
//         name = n;
//         call = c;
//     }
    
//     public void calculate() {
//         double charge;
//         if (call <= 100)
//             charge = call * 0.6;
//         else if (call <= 200)
//             charge = 60 + ((call - 100) * 0.8);
//         else if (call <= 300)
//             charge = 60 + 80 + ((call - 200) * 1.2);
//         else
//             charge = 60 + 80 + 120 + ((call - 300) * 1.5);
            
//         amt = charge + 125;
//     }
    
//     public void display() {
//         System.out.println("Bill No: " + bno);
//         System.out.println("Name: " + name);
//         System.out.println("Calls: " + call);
//         System.out.println("Amount Payable: " + amt);
//     }
    
//     public static void main(String args[]) {
        
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter Name: ");
//         String n = in.nextLine();
//         System.out.print("Enter Bill Number: ");
//         int b = in.nextInt();
//         System.out.print("Enter Calls: ");
//         int c = in.nextInt();
        
//         abc obj = new abc(b, n, c);
//         obj.calculate();
//         obj.display();
//     }
// }
//
//
//BookFair( ) Constructor to initialize data members,void input( ) To input and store the name and price of the book,void calculate( ) To calculate the price after discount. Discount is calculated as per the table given below,void display( )	To display the name and price of the book after discount
// import java.util.Scanner;
// public class abc{
//     private String bname;
//     private double price;
    
//     public abc() {
//         bname = "";
//         price = 0.0;
//     }
    
//     public void input() {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter name of the book: ");
//         bname = in.nextLine();
//         System.out.print("Enter price of the book: ");
//         price = in.nextDouble();
//     }
    
//     public void calculate() {
//         double disc;
//         if (price <= 1000)
//             disc = price * 0.02;
//         else if (price <= 3000)
//             disc = price * 0.1;
//         else
//             disc = price * 0.15;
            
//         price -= disc;
//     }
    
//     public void display() {
//         System.out.println("Book Name: " + bname);
//         System.out.println("Price after discount: " + price);
//     }
    
//     public static void main(String args[]) {
//         abc obj = new abc();
//         obj.input();
//         obj.calculate();
//         obj.display();
//     }
// }
//
//
//Calculate(int n) — to initialize num with n, f and rev with 0 (zero),int prime() — to return 1, if number is prime,int reverse() — to return reverse of the number,void display() — to check and print whether the number is a prime palindrome or not
// import java.util.Scanner;
// public class abc
// {
//     int num;
//     int f;
//     int reverse;

//     public abc(int n) {
//         num = n;
//         f = 0;
//         reverse = 0;
//     }
//     public int prime() {
//             for (int i = 2; i <num ; i++) {
//                 if (num % i == 0) {
//                     f = 1;
//                     break;
//                 }
//             }
//         return f;
//     }
//     public int reverse() {
//         int n;
//         n=num;
//         while (n != 0) {
//             int digit = n % 10;
//             reverse = reverse * 10 + digit;
//             n/= 10;
//         }
//         return reverse;
//     }
//     public void display() {
//         if (f == 0 && reverse == num)
//             System.out.println(num + " is prime palindrome");
//         else
//             System.out.println(num + " is not prime palindrome");
//     }
//     public static void main(String args[]) {
        
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter number: ");
//         int n = in.nextInt();
        
//         abc obj = new abc(n);
//         obj.prime();
//         obj.reverse();
//         obj.display();
//     }
// }
//
//
//A parameterised constructor to initialize the data member,To accept the word,To arrange all the alphabets of word in ascending order of their ASCII values without using the sorting technique,To display the arranged alphabets
// import java.util.Scanner;

// public class abc
// {
//     String str;
//     String s1;
//     int l;
//     char ch;
    
//     public abc(String s) {
//         str = s;
//         s1 = "";
//         l = s.length();
//         ch = 0;
//     }
    
//     public void rearrange() {
//         for (int i = 65; i <= 90; i++) {
//             for (int j = 0; j < l; j++) {
//                 ch = str.charAt(j);
//                 if ((int)i==ch || (int)(i+32)==ch){
//                     s1 += ch;
//                 }
//             }
//         }
//     }
    
//     public void display() {
//         System.out.println("Alphabets in ascending order:");
//         System.out.println(s1);
//     }
    
//     public static void main(String args[]) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a word: ");
//         String word = in.nextLine();
        
//         abc obj = new abc(word);
//         obj.rearrange();
//         obj.display();
//     }
// }
//
//
//Stringop() — to initialize str with NULL,void accept() — to input a sentence,void encode() — to replace and print each character of the string with the second next character in the ASCII table. For example, A with C, B with D and so on,void print() — to print each word of the String in a separate line
// import java.util.Scanner;
// public class abc
// {
//     String str;
//     String s1;
//     int l;
//     char ch;
//     char ch1;
    
//     public abc(String s) {
//         str = s;
//         s1 = "";
//         l = s.length();
//         ch = '\0';
//     }
    
//     public void rearrange() {
//         for (int i = 0; i < l; i++) {
//             ch = str.charAt(i);
//             if (ch == 'Z'){
//                 ch1 = 'B';
//             }
//             else if ( ch == 'Y'){
//                 ch1 = 'A';
//             }
//             if (ch == 'z'){
//                 ch1 = 'b';
//             }
//             else if ( ch == 'y'){
//                 ch1 = 'a';
//             }
//             else{
//                 ch1 = (char)((int)ch + 2);
//             }
//             s1+=ch1;
//         }
//     }  
//     public void display() {
//         System.out.println(s1);
//     }
    
//     public static void main(String args[]) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a word: ");
//         String word = in.nextLine();
        
//         abc obj = new abc(word);
//         obj.rearrange();
//         obj.display();
//     }
// }
//
//
//usage of this
// class A{
//     void showA(){
//         System.out.println("Class A");
//     }
// }
// class abc{
//      void showB(){
//         System.out.println("Class B");
//     }
//     void show()
//     {
//         this.showB();
//     }
//     public static void main(String[] args) {
//         A ob = new A();
//         abc ob1 = new abc();
//         ob.showA();
//         ob1.showB();
//     }
// }
//
//
//this to initialize-Problem
// class abc{
//     int a;
//     abc(){
//         System.out.println();  
//     }
//     abc(int x){
//         this();

//     }
//     void show(){
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         abc ob = new abc(6);
//         ob.show();
        
//     }
// }
//inheritance
//single
// class A{
//     void showA(){
//         System.out.println("Class A");
//     }
// }
// class B extends A{
//     void showB(){
//         System.out.println("Class B");
//     }
// }
// class abc{
//     public static void main(String args[]){
//         B ob = new B();
//         ob.showA();
//         ob.showB();
//     }
// }
//
//
//multiple
// class A{
//     void showA(){
//         System.out.println("Class A");
//     }
// }
// class B extends A{
//     void showB(){
//         System.out.println("Class B");
//     }
// }
// class C extends B{
//     void showC(){
//         System.out.println("Class C");
//     }
// }
// class abc{
//     public static void main(String args[]){
//         C ob = new C();
//         ob.showA();
//         ob.showB();
//         ob.showC();
//     }
// }
//
//
//heirchical
// class A{
//     void showA(){
//         System.out.println("Class A");
//     }
// }
// class B extends A{
//     void showB(){
//         System.out.println("Class B");
//     }
// }
// class C extends A{
//     void showC(){
//         System.out.println("Class C");
//     }
// }
// class abc{
//     public static void main(String args[]){
//         C ob = new C();
//         B ob1=new B();
//         ob.showA();
//         ob.showC();
//         ob1.showA();
//         ob1.showB();
//     }
// }
//
//
//hybrid
// class A{
//     void showA(){
//         System.out.println("Class A");
//     }
// }
// class B extends A{
//     void showB(){
//         System.out.println("Class B");
//     }
// }
// class C extends B{
//     void showC(){
//         System.out.println("Class C");
//     }
// }
// class D extends B{
//     void showD(){
//         System.out.println("Class D");
//     }
// }
// class abc{
//     public static void main(String args[]){
//         C ob = new C();
//         D ob2=new D();
//         ob.showA();
//         ob.showB();
//         ob.showC();
//         ob2.showA();
//         ob2.showB();
//         ob2.showD();
//     }
// }
//
//
//method overriding-
// class A{
//     void showA(){
//         System.out.println("Class A");
//     }
// }
// class B extends A{
//     void showA(){
//         System.out.println("Class B");
//     }
// }
// class abc{
//     public static void main(String args[]){
//         B ob = new B();
//         ob.showA();
//     }
// }
//
//
//abstract class 
// abstract class A{
//     abstract void show();
// }
// class B extends A{
//     void show()
//     {
//         System.out.println("Class B");
//     }
// }
// class abc{
//     public static void main(String args[]){
//         B ob = new B();
//         ob.show();
//     }
// }
//
//
//dynamic binding 
// class A{
//     void showA(){
//         System.out.println("Class A");
//     }
// }
// class B extends A{
//     void showA(){
//         System.out.println("Class B");
//     }
// }
// class abc{
//     public static void main(String args[]){
//         B ob1 = new A();
//         ob1.showA();
//     }
// }
//
//
//interface
// interface A{
//     void show();
// }
// class B implements A{
//     public void show(){
//         System.out.println("Class B");
//     }
// }
// class abc{
//     public static void main(String[] args) {
//         B ob = new B();
//         ob.show();
//     }
// }
//
//
//multiple inheritance
// class A{
//     void showA(){
//         System.out.println("Class A");
//     }
// }
// interface B{
//     void showB();
// }
// class C extends A implements B{
//     public void showB(){
//         System.out.println("Class B");
//     }
//     void showC(){
//         System.out.println("Class C");
//     }
// }

// class abc{
//     public static void main(String args[]){
//         C ob = new C();
//         ob.showA();
//         ob.showB();
//         ob.showC();
//     }
// }
//
//
//Account (int a, int b) — to initialize acno = a, balance = b,void withdraw(int w) — to maintain the balance with withdrawal (balance - w),void deposit(int d) — to maintain the balance with the deposit (balance + d).Use another class Calculate which inherits from class Account with the following specifications:,Data members — int r,t ; float si,amt;,Member Methods:,void accept(int x, int y) — to initialize r=x,t=y,amt=0,void compute() — to find simple interest and amount,si = (balance * r * t) / 100;,a = a + si;,void display() — to print account number, balance, interest and amount
// import java.util.Scanner;
// class Sale {
//     String title, author, publication;
//     double price;

//     void input() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter title of the book:");
//         title = scanner.nextLine();
//         System.out.println("Enter author of the book:");
//         author = scanner.nextLine();
//         System.out.println("Enter publication of the book:");
//         publication = scanner.nextLine();
//         System.out.println("Enter price of the book:");
//         price = scanner.nextDouble();
//     }

//     void display() {
//         System.out.println("Title: " + title);
//         System.out.println("Author: " + author);
//         System.out.println("Publication: " + publication);
//         System.out.println("Price: " + price);
//     }
// }

// class Purchase extends Sale {
//     int noc;
//     double amount;

//     void accept() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter number of copies purchased:");
//         noc = scanner.nextInt();
//     }

//     void calculate() {
//         amount = noc * price;
//     }

//     void show() {
//         display();
//         System.out.println("Number of copies purchased: " + noc);
//         System.out.println("Amount to be paid: " + amount);
//     }
// }
// class abc{
//     public static void main(String[] args) {
//         Purchase purchase = new Purchase();
//         purchase.input();
//         purchase.accept();
//         purchase.calculate();
//         purchase.show();
//         purchase.display();
//     }
// }
//
//
//void input() — to accept an integer number in n,void display() — to display the integer number input in n.Now, inherit class Number to another class Check,Data members/ Instance variables:int fact,int revnum,Member methods:void find() — to find and print factorial of the number used in base class,void palindrome() — to check and print whether the number used in base class is a palindrome number or not
// import java.util.Scanner;
// class Number {
//     int n;
//     void input() {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter number: ");
//         n = scanner.nextInt();
//     }
//     void display() {
//         System.out.println("Input number: " + n);
//     }
// }
// class Check extends Number {
//     int fact;
//     int rev;
//     void find() {
//         int factorial = 1;
//         for (int i = 1; i <= n; i++) {
//             factorial *= i;
//         }
//         fact = factorial;
//         System.out.println("Factorial of " + n + ": " + fact);
//     }
//     void palindrome() {
//         int original = n;
//         int reversed = 0;
//         while (original != 0) {
//             int digit = original % 10;
//             reversed = reversed * 10 + digit;
//             original /= 10;
//         }
//         rev = reversed;
//         if (n == rev) {
//             System.out.println(n + " is a palindrome number.");
//         } else {
//             System.out.println(n + " is not a palindrome number.");
//         }
//     }
// }
// public class abc {
//     public static void main(String[] args) {
//         Check check = new Check();
//         check.input();
//         check.display();
//         check.find();
//         check.palindrome();
//     }
// }
//
//
//
// class Account {
//     int acno;
//     float balance;
//     Account(int a, float b) {
//         acno = a;
//         balance = b;
//     }
//     void withdraw(int w) {
//         balance -= w;
//     }
//     void deposit(int d) {
//         balance += d;
//     }
// }
// class Calculate extends Account {
//     int r;
//     int t;
//     float si;
//     float amt;

//     Calculate(int x, int y) {
//         r = x;
//         t = y;
//         amt = 0;
//     }
//     void compute() {
//         si = (balance * r * t) / 100;
//         amt = balance + si;
//     }
//     void display() {
//         System.out.println("Account Number: " + acno);
//         System.out.println("Balance: $" + balance);
//         System.out.println("Interest Rate: " + r + "%");
//         System.out.println("Interest Amount: $" + si);
//         System.out.println("Total Amount: $" + amt);
//     }
// }
// public class abc {
//     public static void main(String[] args) {
//         Account myAccount = new Account(12345, 1000.0f);
//         Calculate calc = new Calculate(5, 2);
//         calc.balance = myAccount.balance;
//         calc.compute();
//         calc.display();
//     }
// }

