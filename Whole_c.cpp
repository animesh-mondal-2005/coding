//Recursion
//factorial 
//#include<stdio.h>  
//  
//int factorial(int n)  
//{  
//  if (n == 1)  
//    return 1;  
//  else  
//    return(n * factorial(n-1));  
//}  
//   
//int main()  
//{  
//  int number,fact;  
//  printf("Enter a number: ");  
//  scanf("%d", &number);   
//   
//  fact = factorial(number);  
//  printf("Factorial of %d is %ld\n", number, fact);  
//  return 0;  
//}  


//Fibonnacci Series
//#include<stdio.h>  
//  
//int fibo(int n)
//{
//	if (n==1)
//	{
//		return 0;
//	}
//	else if (n==2)
//	{
//		return 1;
//	}
//	else
//	{
//		return fibo(n-1)+fibo(n-2);
//	}
//}
//   
//int main()  
//{  
//  int n,f,i;  
//  printf("Enter a number: ");  
//  scanf("%d", &n);     
//  printf("The Fibonacci Series is \n");
//  for(i=1;i<=n;i++)
//  {
//  	f=fibo(i);
//  	printf("%d",f);
//	}  
//	return 0;
//}


//HCF of two numbers
//#include <stdio.h>
//int hcf(int n1, int n2) {
//    if (n2%n1==0)
//    {
//        return n1;
//	}
//	else
//    {
//		return hcf(n2, n1 % n2);
//	}
//}
//int main() {
//    int n1, n2;
//    printf("Enter two positive integers: ");
//    scanf("%d %d", &n1, &n2);
//    printf("G.C.D of %d and %d is %d.", n1, n2, hcf(n1, n2));
//    return 0;
//}


//Reverse
//#include<stdio.h>  
//  
//int reverse(int n,int s)
//{
//	if (n==0)
//	{
//		return s;
//	}
//	else
//	{
//		return reverse(n/10,s*10+(n%10));
//	}
//}
//   
//int main()  
//{  
//  int n,s;
//  scanf("%d",&n);
//  s=reverse(n,0);
//  printf("The no is %d",s);
//  return 0;
//}
  
  
//Pointer
//#include<stdio.h>
//int main(){
//int a=5,b=6,c;
//int *p1,*p2;
//p1=&a;
//p2=&b;
//c=*p1+*p2;
//printf("The sum is %d",c);  
//}
 
//Call by reference
//#include<stdio.h>
//void sum(int *p1,int *p2){
//	int c;
//	c=*p1+*p2;
//	printf("The sum is %d,c");
//}
//int main(){
//	int a,b;
//	scanf("%d %d",&a,&b)
//	sum(&a,&b);
//}


//Swaping using 3rd variable
//#include<stdio.h>
//void swap(int *p1,int *p2){
//	int c;
//	c=*p1;
//	*p1=*p2;
//	*p2=c;
//}
//int main(){
//	int a,b;
//	scanf("%d %d",&a,&b);
//	swap(&a,&b);
//	printf("The no is %d %d",a,b);
//}


//Dma
//#include<stdio.h>
//#include<malloc.h>
//int main(){
//	int *a;
//	a=(int*)malloc(sizeof(int));
//	scanf("%d",&a);
//	printf("The value is %d",&a);
//} 


//String
//#include<stdio.h>
//#include<string.h>
//int main(){
//	char st[30];
//	printf("Enter the string: ");
//	scanf("%d",&st);
//or gets(st);
//	printf("The string is %s",st);
//}

//String length
//#include<stdio.h>
//#include<string.h>
//int main(){
//	int l;
//	char st[30];
//	printf("Enter the string: ");
//	gets(st);
//	l=strlen(st);
//	printf("The length of string is %d",l);
//}
//
//
//String copy
//#include<stdio.h>
//#include<string.h>
//int main(){
//	char st[30],st1[30];
//	gets(st);
//	strcpy(st1,st);
//	printf("The copied string is %s",st1);
//}
//
//
//Concatination
//#include<stdio.h>
//#include<string.h>
//int main(){
//	char st[30],st1[30];
//	gets(st);
//	gets(st1);
//	strcat(st,st1);
//	printf("The copied is %s",st);
//}
//
//
//Reverse
//#include<stdio.h>
//#include<string.h>
//int main(){
//	char st[30];
//	gets(st);
//	strrev(st);
//	printf("The reversed is %s",st);
//}
//
//
//Dma of string
//#include<stdio.h>
//#include<string.h>
//int main(){
//	char *st[30];
//	st=(char*)malloc(sizeof(char));
//	gets(st);
//	printf("The string is %s",st);
//	puts(st);
//}
//
//
//Character removal
//#include<stdio.h>
//#include<malloc.h>
//#include<string.h>
//int main(){
//	char *st,*st1;
//	st=(char*)malloc(sizeof(char));
//	st1=(char*)malloc(sizeof(char));
//	gets(st);
//	st1=strchr(st,'n');
//	printf("The string is %s",st1);
//}
//
//
//Character removal from back
//#include<stdio.h>
//#include<malloc.h>
//#include<string.h>
//int main(){
//	char *st,*st1;
//	st=(char*)malloc(sizeof(char));
//	st1=(char*)malloc(sizeof(char));
//	gets(st);
//	st1=strrchr(st,'m');
//	printf("The string is %s",st1);
//}
//
//
//Lowercase or not
//#include<ctype.h>
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char ch;
//	printf("Enter Character: ");
//	scanf("%c",&ch);
//	if(islower(ch))
//	{
//		printf("It is lower");
//	}
//	else
//	{
//		printf("It is not lower");
//	}
//}
//
//
//Uppercase or not
//#include<ctype.h>
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char ch;
//	printf("Enter Character: ");
//	scanf("%c",&ch);
//	if(isupper(ch))
//	{
//		printf("It is upper");
//	}
//	else
//	{
//		printf("It is not upper");
//	}
//}
//
//
//Alphanumeric or not
//#include<ctype.h>
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char ch;
//	printf("Enter Character: ");
//	scanf("%c",&ch);
//	if(isalpha(ch))
//	{
//		printf("It is alphanumeric");
//	}
//	else
//	{
//		printf("It is not alphanumeric");
//	}
//}
//
//
//Digit or not
//#include<ctype.h>
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char ch;
//	printf("Enter Character: ");
//	scanf("%c",&ch);
//	if(isdigit(ch))
//	{
//		printf("It is digit");
//	}
//	else
//	{
//		printf("It is not digit");
//	}
//}
//
//
//Change to upper
//#include<ctype.h>
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char st,st1;
//	printf("Enter Character: ");
//	scanf("%c",&st);
//	st1=toupper(st);
//	printf("The character is %c",st1);
//}
//
//
//Change to lower
//#include<ctype.h>
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char st,st1;
//	printf("Enter Character: ");
//	scanf("%c",&st);
//	st1=tolower(st);
//	printf("The character is %c",st1);
//}
//
//
//Input string and print all character
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	int l,i;
//	char s[10];
//	printf("Enter the string: ");
//	scanf("%s",&s);
//	l=strlen(s);
//	printf("The characters in the string are: ");
//	for (i=0; i<l; i++)
//	{
//		printf("%c",s[i]);
//	}
//	return 0;
//}
//
//
//Count all vowels from the string
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	int p,l,c=0;
//	char s[10];
//	printf("PLease enter the word: ");
//	gets(s);
//	l=strlen(s);
//	printf("The vowels are: ");
//	for (p=0; p<l; p++)
//	{
//		if (s[p]=='a' || s[p]=='e' || s[p]=='i' || s[p]=='o' || s[p]=='u')
//		{
//			printf("%c",s[p]);
//			c++;
//		}
//	}
//	printf("The number of vowels are: %d",c);
//	return 0;
//}
//
//
//Initial to uppercase
//#include<stdio.h>
//#include<string.h>
//#include<ctype.h>
//int main()
//{
//	int i,l;
//	char s[10],ch;
//	printf("Please enter the string: ");
//	gets(s);
//	
//	l=strlen(s);
//    printf("The initials of the string are: ");
//    ch=toupper(s[0]);
//	printf("%c",ch);
//    for (i=1; i<l; i++)
//    {
//    	if (s[i]==' ')
//    	{
//    		ch=toupper(s[i+1]);
//    		printf("%c",ch);
//		}
//	}	
//}
//
//
//Palindrome
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	char s1[20],s2[30];
//	printf("Enter the string: ");
//	gets(s1);
//	strcpy(s2,s1);
//	strrev(s1);
//	if(strcmp(s1,s2)==0)
//	{
//		printf("The string is palindrome.");
//	}
//	else
//	{
//			printf("The string is not palindrome.");
//	}
//	return 0;
//}
//
//
//Count the number of words
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	int l,i,c=0;
//	char s[10];
//	printf("Enter the string: ");
//	gets(s);
//	for (i=0; i<strlen(s); i++)
//	{
//		if (s[i]==' ')
//		{
//			c=c+1;
//		}
//	}
//	printf("The number of words in the string are: %d",c+1);
//}
//
//
//Count the words and print it
//#include<stdio.h>
//#include<string.h>
//int main()
//{
//	int l,i,c=0;
//	char s[10];
//	printf("Enter the string: ");
//	gets(s);
//	for (i=0; i<strlen(s); i++)
//	{
//		if (s[i]==' ')
//		{
//			c=c+1;
//		}
//	}
//	printf("The number of words in the string are: %d",c+1);
//}
//
//
//Structure
//#include <stdio.h>
//struct student {
// char name[50];
// int roll;
// float marks;
//};
//int main() {
// struct student s1,s2;
// printf("Enter the name of 1st student: ");
// scanf("%s",s1.name);
// printf("Enter the roll of 1st student: ");
// scanf("%d",&s1.roll); 
// printf("Enter the marks of 1st student: ");
// scanf("%f",&s1.marks);
// printf("Enter the name of 2nd student: ");
// scanf("%s",s2.name);
// printf("Enter the roll of 2nd student: ");
// scanf("%d",&s2.roll); 
// printf("Enter the marks of 2nd student: ");
// scanf("%f",&s2.marks);
// printf("The name of 1st student is %s\n",s1.name );
// printf("The roll of 1st student is %d\n",s1.roll);
// printf("The marks of 1st student is %f\n",s1.marks);
// printf("The name of 2nd student is %s\n",s2.name);
// printf("The roll of 2nd student is %d\n",s2.roll);
// printf("The marks of 2nd student is %f\n",s2.marks);
//}
//
//
//Array of structure
//#include <stdio.h>
//struct student {
// char name[50];
// int roll;
// float marks;
//};
//int main() {
// int i,n;
// printf("Enter total number of students:");
// scanf("%d",&n);
// struct student s[n];
// 
// for(i=0;i<n;i++){
// printf("Enter the name of student %d: ",(i+1));
// scanf("%s",s[i].name);
// printf("Enter the roll of student %d: ",(i+1));
// scanf("%d",&s[i].roll); 
// printf("Enter the marks of student %d: ",(i+1));
// scanf("%f",&s[i].marks);
//}
// for(i=0;i<n;i++){
// printf("The name of student %d is %s\n",(i+1),s[i].name );
// printf("The roll of student %d is %d\n",(i+1),s[i].roll);
// printf("The marks of student %d is %f\n",(i+1),s[i].marks);
//}
//}
//
//
//Structure of array
//#include<stdio.h>
//struct student
//{
//	char name[30];
//	int roll;
//	float marks[3];
//};
//int main()
//{
//	int i,n,j;
//		printf("Number of student data u want to add: ");
//	scanf("%d",&n);
//	struct student s[n];
//
//	
//	for (i=0; i<n; i++)
//	{
//		printf("\n Enter the name of student %d: ",(i+1));
//		scanf("%s",&s[i].name);
//		printf("\n Enter the roll of student %d: ",(i+1));
//		scanf("%d",&s[i].roll);
//		for (j=0; j<=3; j++)
//		{
//			printf("\n Enter the marks of subject %d: ",(j+1));
//		    scanf("%f",&s[i].marks[j]);
//		}
//	}
//	
//	for (i=0; i<n; i++)
//	{
//		printf("\n The name of student %d is: %s",(i+1),s[i].name);
//		printf("\n The roll of the student %d is: %d",(i+1),s[i].roll);
//		for (j=0; j<=3; j++)
//		{
//			printf("\n The marks of subject %d: is %f ",(j+1),s[i].marks[j]);
//		}
//	}
//}
//
//
//Structure pointer
//#include<stdio.h>
//#include<malloc.h>
//struct student
//{
//	char name[30];
//	int roll;
//	float marks;
//};
//typedef  struct student stu;
//int main()
//{
//	
//	stu *s1,*s2;
//	s1=(stu*)malloc(sizeof(stu));
//	s2=(stu*)malloc(sizeof(stu));
//	printf("Enter the name of 1st student: ");
//	scanf("%s",&s1->name);
//	printf("Enter the roll of 1st student: ");
//	scanf("%d",&s1->roll);
//	printf("Enter the marks of the 1st student: ");
//	scanf("%f",&s1->marks);
//	printf("Enter the name of the 2nd student: ");
//	scanf("%s",&s2->name);
//	printf("Enter the roll of the 2nd student: ");
//	scanf("%d",&s2->roll);
//	printf("Enter the marks of the 2nd student: ");
//	scanf("%f",&s2->marks);
//	
//	printf("\n The name of the 1st student is: %s",s1->name);
//	printf("\n The roll of the 1st student is: %d",s1->roll);
//	printf("\n The mrks of the 1st student is: %f",s1->marks);
//	printf("\n The name of the 2nd student is: %s",s2->name);
//	printf("\n The roll of the 2nd student is: %d",s2->roll);
//	printf("\n The marks of the 2nd student is: %f",s2->marks);
//}
//
//
//Read and write operation of character in file
//#include<stdio.h>
//int main(){
//	FILE *fp;
//	char ch;
//	fp=fopen("abc.txt","w");
//	printf("Enter data: ");
//	while((ch=getchar())!=EOF)
//	{
//		putc(ch,fp);
//	}
//	fclose(fp);
//	
//	fp=fopen("abc.txt","r");
//	printf("The file is");
//	while((ch=getc(fp))!=EOF)
//	{
//		printf("%c",ch);
//	}
//	fclose(fp);
//}
//
//
//Read ,write and append operation of character in file
//#include<stdio.h>
//int main(){
//	FILE *fp;
//	char ch;
//	fp=fopen("abc.txt","a");
//	printf("Enter data: ");
//	while((ch=getchar())!=EOF)
//	{
//		putc(ch,fp);
//	}
//	fclose(fp);
//	
//	fp=fopen("abc.txt","r");
//	printf("The file is");
//	while((ch=getc(fp))!=EOF)
//	{
//		printf("%c",ch);
//	}
//	fclose(fp);
//}
//
//
//Read ,write operation of integer in file
//#include<stdio.h>
//int main(){
//	FILE *fp;
//	int i,n;
//	fp=fopen("cba.txt","w");
//	for(i=1;i<=10;i++)
//	{
//		printf("Enter the number: ");
//		scanf("%d",&n);
//		putw(n,fp);
//	}
//	fclose(fp);
//	
//	
//	fp=fopen("cba.txt","r");
//	printf("The file is ");
//	for(i=1;i<=10;i++)
//	{
//		n=getw(fp);
//		printf("%d",n);
//	}
//	fclose(fp);
//}
//
//
//
//#include <stdio.h>
//#include <stdlib.h>
//int main() {
//    FILE *fp;
//    fp=(FILE*)malloc(sizeof(FILE));
//    int number, quantity, i;
//    float price, value;
//    char item[10], filename[10];
//    printf("Input file name: ");
//    scanf("%s", filename);
//    fp = fopen(filename, "w");
//    printf("Input Inventory Date:\n");
//
//    for (i = 1; i <= 3; i++) {
//        printf("Enter the item name: ");
//        scanf("%s", item);
//        printf("Enter the number: ");
//        scanf("%d", &number);
//        printf("Enter the price: ");
//        scanf("%f", &price);
//        printf("Enter the quantity: ");
//        scanf("%d", &quantity);
//
//        value = price * quantity;
//        fprintf(fp, "%s %d %.2f %d %.2f\n", item, number, price, quantity, value);
//    }
//    fclose(fp);
//    
//    	fp=fopen(filename,"r");
//    	printf("itemname\tnumber\tprice\tquantity\tvalue\n");
//    	for(i=1;i<=3;i++){
//    		fscanf(fp, "%s %d %.2f %d %.2f\n",&item,&number,&price,&quantity);
//    		value=price*quantity;
//    		printf("%s\t \t%d \t%f \t%d\t\t %f\n", item, number, price, quantity, value);
//		}
//	fclose(fp);
//}

