// Palindrome
// #include<stdio.h>
// #include<string.h>
// int isPalindrome(char str[]){
//     int len = strlen(str);
//     for(int i=0;i<len/2;i++){
//         if(str[i] !=str[len-i-1]){
//             return 0;
//         }
//     }
//     return 1;
// }
// int main(){
//     char input[100];
//     scanf("%s",input);
//     if(isPalindrome(input)){
//         printf("%s\n",input);
//         printf("the given string %s is palindrome",input);
//     }
//     else{
//         printf("%s\n",input);
//         printf("the given string %s is not palindrome",input);
//     }
  
// }


// Vowel Checker with sring concadination
// #include<stdio.h>
// #include<string.h>
// int main(){
//     char str1[40];
//     char str2[40];
//     scanf("%s",str1);
//     scanf("%s",str2);
//     strcat(str1,str2);
//     printf("%s",str1);
//     printf("\n");
//     for(int i = 0;str1[i] != '\0';i++){
//         if(str1[i]=='a' || str1[i]=='e' || str1[i]=='i'  ||  str1[i]=='o'  ||  str1[i]=='u'  ||  str1[i]=='A'  ||  str1[i]=='E'  ||  str1[i]=='I'  ||  str1[i]=='O'  ||  str1[i]=='U'){
//             printf("%c",str1[i]);
//         }
//     }
//     return 0;
// }


//Power using recursion
// 1)
// #include<stdio.h>
// int power(int a, int b){
// 	if(b==0) return 1;
// 	return a*power(a,b-1);
// }
// int main(){
// 	int a,b;
// 	scanf("%d",&a);
// 	scanf("%d",&b);
// 	int result=power(a,b);
// 	printf("%d",result);
// }#include <stdio.h>
// 2)
// #include<stdio.h>
// #include<math.h>
// int power(int a, int b){
// 	return pow(a,b);
// }
// int main(){
// 	int a,b;
// 	scanf("%d",&a);
// 	scanf("%d",&b);
// 	int result=power(a,b);
// 	printf("%d",result);
// }


//Matrix Transformation
// #include<stdio.h>
// int main(){
//   int m,n;
//   scanf("%d %d",&m,&n);
  
//   int a[m][n];

//   for(int i=0;i<m;i++){
//     for(int j=0;j<n;j++){
//       scanf("%d",&a[i][j]);
//     }
//   }
//     printf("\n");
//   for(int i=0;i<n;i++){
//     for(int j=0;j<m;j++){
//       printf("%d ",a[j][i]);
//     }
//     printf("\n");
//   }
//   return 0;
// }


// Fibonacci Series
// 1)#include <stdio.h>

// int main() {
//     int n, num1 = 0, num2 = 1, nextNum;

//     printf("Enter the number of Fibonacci numbers to generate: ");
//     scanf("%d", &n);

//     printf("Fibonacci Series: ");

//     for (int i = 1; i <= n; ++i) {
//         printf("%d, ", num1);
//         nextNum = num1 + num2;
//         num1 = num2;
//         num2 = nextNum;
//     }

//     return 0;
// }

//2)
// #include<stdio.h>
// int fibonacci(int n){
//   if(n==0||n==1){
//     return n;
//   }
//   return fibonacci(n-2)+fibonacci(n-1);
// }
// int main(){
//   int n;
//   scanf("%d",&n);
//   for(int i=0;i<n;i++) printf("%d ",fibonacci(i));
//   return 0;
// }


