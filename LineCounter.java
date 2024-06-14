public class LineCounter {
    public static void main(String[] args) {
        String[] programs = {
                /*
                 * Name:- Yogesh Jethani
                 * Class:- Tech DIV A
                 * R-No:- A22CSE017
                 */

                /*
                 * 1. Write a Java Program that will accept a number from the user and calculate
                 * its square and cube
                 * and display the same.
                 */

                /*
                 * import java.util.Scanner;
                 * 
                 * class Calc{
                 * Scanner sc = new Scanner(System.in);
                 * int num;
                 * public void getNum(){
                 * System.out.print("Enter a number : ");
                 * num = sc.nextInt();
                 * }
                 * public void display(){
                 * System.out.println("Your number is : "+num);
                 * System.out.println("Square of "+num+" is : "+(num*num));
                 * System.out.println("Cube of "+num+" is : "+(num*num*num));
                 * }
                 * }
                 * 
                 * public class assignment_2{
                 * public static void main(String []args){
                 * Calc obj = new Calc();
                 * obj.getNum();
                 * obj.display();
                 * }
                 * }
                 */

                /* 2. Write a Java program to calculate simple interest */

                /*
                 * import java.util.Scanner;
                 * 
                 * class SI{
                 * Scanner sc = new Scanner(System.in);
                 * int t;
                 * float p,r;
                 * public void getData(){
                 * System.out.print("Enter Principal amount : ");
                 * p = sc.nextFloat();
                 * System.out.print("Enter Rate of Interest : ");
                 * r = sc.nextFloat();
                 * System.out.print("Enter Time period (in years): ");
                 * t = sc.nextInt();
                 * }
                 * public void display(){
                 * System.out.println("The Simple Interest for following is : ");
                 * System.out.println("Time period : "+t+" years");
                 * System.out.println("Rate of Interest : "+r+"%");
                 * System.out.println("Principle Amount : "+p+"Rs");
                 * float i = ((p*r*t)/100);
                 * System.out.println("Interest applied is : "+i+"Rs");
                 * System.out.println("Total amount : "+(p+i)+"Rs");
                 * }
                 * }
                 * 
                 * public class assignment_2{
                 * public static void main(String []args){
                 * SI o = new SI();
                 * o.getData();
                 * o.display();
                 * }
                 * }
                 */

                /*
                 * 3. Write a Java program to enter two values using scanner class and perform
                 * arithmaric operation
                 * using switch case
                 */

                /*
                 * import java.util.Scanner;
                 * 
                 * public class assignment_2 {
                 * static int num1;
                 * static int num2;
                 * public static void add(int a,int b)
                 * {
                 * int sum=a+b;
                 * System.out.print("The sum is : ");
                 * System.out.println(sum);
                 * System.out.println("\n");
                 * }
                 * public static void sub(int a,int b)
                 * {
                 * int sub=a-b;
                 * System.out.print("The substraction is : ");
                 * System.out.println(sub);
                 * System.out.println("\n");
                 * }
                 * public static void mul(int a,int b)
                 * {
                 * int mul=a*b;
                 * System.out.print("The multiplication is : ");
                 * System.out.println(mul);
                 * System.out.println("\n");
                 * }
                 * public static void div(int a,int b)
                 * {
                 * if(b==0){
                 * System.out.println("Exception case!!!\n");
                 * }
                 * else{
                 * int div=a/b;
                 * System.out.print("The division is : ");
                 * System.out.println(div);
                 * System.out.println("\n");
                 * }
                 * }
                 * 
                 * public static void main(String[] args) {
                 * Scanner sc = new Scanner(System.in);
                 * int choice;
                 * do {
                 * System.out.println("***** Calculator *****");
                 * System.out.
                 * print("1. To add two numbers\n2.To substract two numbers\n3.To multiply two numbers\n4.To divide two numbers\n5.Exit\n"
                 * );
                 * System.out.print("Enter your choice : ");
                 * choice = sc.nextInt();
                 * switch (choice) {
                 * case 1: {
                 * System.out.print("Enter num1 : ");
                 * num1=sc.nextInt();
                 * System.out.print("Enter num2 : ");
                 * num2=sc.nextInt();
                 * add(num1,num2);
                 * break;
                 * }
                 * case 2:{
                 * System.out.print("Enter num1 : ");
                 * num1=sc.nextInt();
                 * System.out.print("Enter num2 : ");
                 * num2=sc.nextInt();
                 * sub(num1,num2);
                 * break;
                 * }
                 * case 3:{
                 * System.out.print("Enter num1 : ");
                 * num1=sc.nextInt();
                 * System.out.print("Enter num2 : ");
                 * num2=sc.nextInt();
                 * mul(num1,num2);
                 * break;
                 * }
                 * case 4:{
                 * System.out.print("Enter num1 : ");
                 * num1=sc.nextInt();
                 * System.out.print("Enter num2 : ");
                 * num2=sc.nextInt();
                 * div(num1,num2);
                 * break;
                 * }
                 * case 5:{
                 * break;
                 * }
                 * default:{
                 * System.out.println("Please enter a valid input");
                 * break;
                 * }
                 * }
                 * }while(choice != 5);
                 * System.out.println("Thank you for using this program");
                 * }
                 * }
                 */

                /*
                 * 4.write a Java program to enter a value from user and check perticuler value
                 * is positive, negative or
                 * zero
                 */

                /*
                 * import java.util.Scanner;
                 * 
                 * class Check{
                 * Scanner sc = new Scanner(System.in);
                 * int num;
                 * public void getNum(){
                 * System.out.print("Enter a number : ");
                 * num = sc.nextInt();
                 * }
                 * public void check(){
                 * if(num>0){
                 * System.out.println("The entered number is positive");
                 * }
                 * else if(num<0){
                 * System.out.println("The entered number is negative");
                 * }
                 * else{
                 * System.out.println("The number is Zero");
                 * }
                 * }
                 * }
                 * 
                 * public class assignment_2{
                 * public static void main(String []args){
                 * Check o = new Check();
                 * o.getNum();
                 * o.check();
                 * }
                 * }
                 */

                /*
                 * 5. Write a java program to draw below pattern
                 * 1
                 * 1 2
                 * 1 2 3
                 * 1 2 3 4
                 */

                /*
                 * import java.util.Scanner;
                 * 
                 * public class assignment_2{
                 * public static void main(String[] args)
                 * {
                 * Scanner sc= new Scanner(System.in);
                 * System.out.print("Enter number of rows : ");
                 * int n = sc.nextInt();
                 * for(int i=0;i<n;i++)
                 * {
                 * for(int j=0;j<=i;j++)
                 * {
                 * System.out.print((j+1)+" ");
                 * }
                 * System.out.print("\n");
                 * }
                 * }
                 * }
                 */

                /*
                 * 6. Write a java code to create a class CityGuide and enter your choice to
                 * print
                 * M- Mumbai
                 * D- Delhi
                 * A- Ahmedabad
                 * C- Calcutta
                 */

                /*
                 * import java.util.Scanner;
                 * 
                 * class CityGuide{
                 * Scanner sc = new Scanner(System.in);
                 * String City;
                 * public void getCode(){
                 * System.out.println("M- Mumbai\r\n" + "D- Delhi\r\n" + "A- Ahmedabad\r\n" +
                 * "C- Calcutta ");
                 * System.out.print("Enter a city code : ");
                 * City = sc.next();
                 * }
                 * public void display(){
                 * if (City.equals("M")) {
                 * System.out.println("You have selected: Mumbai");
                 * } else if (City.equals("D")) {
                 * System.out.println("You have selected: Delhi");
                 * } else if (City.equals("A")) {
                 * System.out.println("You have selected: Ahmedabad");
                 * } else if (City.equals("C")) {
                 * System.out.println("You have selected: Calcutta");
                 * } else {
                 * System.out.println("Invalid Input");
                 * }
                 * }
                 * }
                 * 
                 * public class assignment_2{
                 * public static void main(String[] args)
                 * {
                 * CityGuide o = new CityGuide();
                 * o.getCode();
                 * o.display();
                 * }
                 * }
                 */

                /* 7. Write a java code to print fibonacci series */

                /*
                 * import java.util.Scanner;
                 * 
                 * public class assignment_2{
                 * public static void printFib(int a, int b, int n)
                 * {
                 * if(n==0)
                 * {
                 * return;
                 * }
                 * int c=a+b;
                 * System.out.println(c);
                 * printFib(b,c,n-1);
                 * }
                 * public static void main(String[] args)
                 * {
                 * int a=0;
                 * int b=1;
                 * int n;
                 * Scanner sc = new Scanner(System.in);
                 * System.out.print("Enter number of terms in the series : ");
                 * n=sc.nextInt();
                 * System.out.println("Your series for "+n+" terms is :");
                 * System.out.println(a);
                 * System.out.println(b);
                 * printFib(a,b,n-1);
                 * }
                 * }
                 */

                /*
                 * 8. Write a java code to display a dialog box Yes, No, Cancel. (Hint Use
                 * JoptionPane)
                 */
                /*
                 * import javax.swing.JOptionPane;
                 * import java.util.*;
                 * public class assignment_2 {
                 * public static void main(String[] args) {
                 * Scanner sc = new Scanner(System.in);
                 * int a,b,res,x;
                 * do{
                 * System.out.print("Enter first number : ");
                 * a = sc.nextInt();
                 * System.out.print("Enter second Number : ");
                 * b = sc.nextInt();
                 * res = a+b;
                 * String[] options = {"Yes","No","Cancel"};
                 * x = JOptionPane.showOptionDialog(null,
                 * "Do you want to print the Answer","Click a Button",JOptionPane.
                 * DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                 * if(x==0){
                 * System.out.println("The Addition is : "+res);
                 * System.exit(0);
                 * }
                 * else if(x==1){
                 * System.out.println("The answer won't be printed");
                 * System.exit(0);
                 * }
                 * }while(x!=2);
                 * }
                 * }
                 */

                /*
                 * 9. Write a java code to check different options of showConfirm Dialog,
                 * Message Dialog and Input Dialog
                 */
                /*
                 * import javax.swing.JOptionPane;
                 * import java.util.*;
                 * public class assignment_2 {
                 * public static void main(String[] args) {
                 * Scanner sc = new Scanner(System.in);
                 * String input;
                 * int choice;
                 * do{
                 * System.out.
                 * print("1. Take User Input (Input Dialog Box)\n2. showConfirm Dialog Box\n3. Message Dialog Box\n4. Exit\n\nEnter Your Choice : "
                 * );
                 * choice = sc.nextInt();
                 * switch(choice){
                 * case 1 : {
                 * JOptionPane.showMessageDialog(null, "This is the CLUB Entry Gate", "Message",
                 * JOptionPane.INFORMATION_MESSAGE);
                 * break;
                 * }
                 * case 2 : {
                 * input = JOptionPane.showInputDialog( "Please Enter Your Name",
                 * JOptionPane.PLAIN_MESSAGE);
                 * if(input != null)
                 * {
                 * System.out.println("Thank You "+input);
                 * }
                 * break;
                 * }
                 * case 3 : {
                 * int age;
                 * int x =
                 * JOptionPane.showConfirmDialog(null,"Are you 18 Y.O. or Above?","Confirm",
                 * JOptionPane.YES_NO_OPTION);
                 * if(x==0){
                 * System.out.println("You can enter.");
                 * }
                 * else{
                 * age =
                 * Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age",JOptionPane.
                 * INFORMATION_MESSAGE));
                 * System.out.println("Show up after "+(18-age)+" years OK!!!");
                 * }
                 * break;
                 * }
                 * default :
                 * {
                 * System.out.println("Please enter a valid input\n");
                 * break;
                 * }
                 * }
                 * }while(choice!=4);
                 * }
                 * }
                 */

                /*
                 * 10. Write a java code to get two values using input dialog and display
                 * addition operation using
                 * message dialog
                 */
                /*
                 * import javax.swing.JOptionPane;
                 * import java.util.*;
                 * public class assignment_2 {
                 * public static void main(String[] args) {
                 * int num1 =
                 * Integer.parseInt(JOptionPane.showInputDialog("Enter first Number : "
                 * ,JOptionPane.INFORMATION_MESSAGE));
                 * int num2 =
                 * Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number : "
                 * ,JOptionPane.INFORMATION_MESSAGE));
                 * int sum = num1+num2;
                 * JOptionPane.showMessageDialog(null, "The addition is : "+sum, "ADD",
                 * JOptionPane.INFORMATION_MESSAGE);
                 * }
                 * }
                 */

                /*
                 * 11. Write a java code to get two strings using dialog and check both strings
                 * are equal or not.
                 */
                /*
                 * import javax.swing.JOptionPane;
                 * import java.util.*;
                 * public class assignment_2 {
                 * public static void main(String[] args) {
                 * String s1 = JOptionPane.showInputDialog("Enter first String : ",JOptionPane.
                 * INFORMATION_MESSAGE);
                 * String s2 = JOptionPane.showInputDialog("Enter Second String : ",JOptionPane.
                 * INFORMATION_MESSAGE);
                 * if(s1.equals(s2)){
                 * JOptionPane.showMessageDialog(null, "The Strings are Same","Result",
                 * JOptionPane.INFORMATION_MESSAGE);
                 * }
                 * else{
                 * JOptionPane.showMessageDialog(null, "The Strings are NOT Same","Result",
                 * JOptionPane.INFORMATION_MESSAGE);
                 * }
                 * }
                 * }
                 */

                /* 12. Create a class classroom and calculate area of Room */

                /*
                 * import java.util.Scanner;
                 * class classroom{
                 * int length,breadth;
                 * public void getdata(){
                 * Scanner sc = new Scanner(System.in);
                 * System.out.print("Enter length of room : ");
                 * length = sc.nextInt();
                 * System.out.print("Enter width of the room : ");
                 * breadth = sc.nextInt();
                 * }
                 * public void display(){
                 * System.out.println("Area of classroom with length : "+length+"m And width : "
                 * +breadth+"m is : "+(length*breadth)+" sqmetres");
                 * }
                 * }
                 * public class assignment_2{
                 * public static void main(String[] args){
                 * classroom c = new classroom();
                 * c.getdata();
                 * c.display();
                 * }
                 * }
                 */
                /* 13. Write a Java program to sort array elements in descending order */
                /*
                 * import java.util.Scanner;
                 * public class assignment_2{
                 * static int size;
                 * public static void bubble_sort(int array[],int size)
                 * {
                 * for(int i=0;i<size;i++)
                 * {
                 * for(int j=0;j<size-1;j++)
                 * {
                 * if(array[j]<array[j+1])
                 * {
                 * int temp = array[j];
                 * array[j] = array[j+1];
                 * array[j+1] = temp;
                 * }
                 * }
                 * }
                 * for(int k=0;k<size;k++)
                 * {
                 * System.out.print(" "+array[k]);
                 * }
                 * }
                 * public static void main(String[] args) {
                 * Scanner sc= new Scanner(System.in);
                 * System.out.print("Enter size of your array : ");
                 * size=sc.nextInt();
                 * int L[] = new int[size]; //declaration
                 * for(int i=0;i<size;i++)
                 * {
                 * System.out.print("ENTER ELEMENT "+(i+1)+" : ");
                 * L[i]= sc.nextInt();
                 * }
                 * System.out.println();
                 * System.out.print("Your array before sorting is :");
                 * for(int i=0;i<size;i++)
                 * {
                 * System.out.print(" "+L[i]);
                 * }
                 * System.out.println();
                 * System.out.print("Your array after sorting is :");
                 * bubble_sort(L,size);
                 * System.out.println();
                 * }
                 * }
                 */

                /* 14. Write a Java program to display sum of all the elements of array. */

                /*
                 * import java.util.Scanner;
                 * public class assignment_2{
                 * static int size;
                 * static int total=0;
                 * public static void sum_of_elements(int array[],int size)
                 * {
                 * System.out.print("Your array is : ");
                 * for(int i=0;i<size;i++)
                 * {
                 * System.out.print(" "+array[i]);
                 * total+=array[i];
                 * }
                 * System.out.println();
                 * System.out.println("The sum of allelements of array : "+total);
                 * }
                 * public static void main(String[] args) {
                 * Scanner sc= new Scanner(System.in);
                 * System.out.print("Enter size of your array : ");
                 * size=sc.nextInt();
                 * int L[] = new int[size]; //declaration
                 * for(int i=0;i<size;i++)
                 * {
                 * System.out.print("ENTER ELEMENT "+(i+1)+" : ");
                 * L[i]= sc.nextInt();
                 * }
                 * sum_of_elements(L,size);
                 * }
                 * }
                 */

                /* 15. Write a Java program to search an element in an array. */
                /*
                 * import java.util.Scanner;
                 * public class assignment_2{
                 * public static void main(String[] args)
                 * {
                 * int i;
                 * Scanner sc = new Scanner(System.in);
                 * System.out.print("Enter size of your array : ");
                 * int size = sc.nextInt();
                 * int arr[] = new int[size]; //declaration
                 * for(i=0;i<size;i++)
                 * {
                 * System.out.print("ENTER ELEMENT "+(i+1)+" : ");
                 * arr[i]= sc.nextInt();
                 * }
                 * System.out.println();
                 * System.out.print("Your array is : ");
                 * for(i=0;i<size;i++)
                 * {
                 * System.out.print(" "+arr[i]);
                 * }
                 * System.out.println();
                 * System.out.print("Enter the element you want to search for : ");
                 * int key = sc.nextInt();
                 * int j=0;
                 * while(j<=size && arr[j] != key)
                 * {
                 * j++;
                 * }
                 * if(arr[j]==key)
                 * {
                 * System.out.println("Element "+key+" found at index "+j);
                 * }
                 * else
                 * {
                 * System.out.println("Key not Found");
                 * }
                 * }
                 * }
                 */

                /* 16. Write a Java program to find largest number from an array. */
                /*
                 * import java.util.Scanner;
                 * public class assignment_2{
                 * public static void main(String[] args)
                 * {
                 * int key;
                 * Scanner sc = new Scanner(System.in);
                 * //Declaring the array
                 * System.out.print("Enter size of your array : ");
                 * int size = sc.nextInt();
                 * int arr[] = new int[size];
                 * 
                 * //Taking elements for the array
                 * for(int i=0;i<size;i++)
                 * {
                 * System.out.print("ENTER ELEMENT "+(i+1)+" : ");
                 * arr[i]= sc.nextInt();
                 * }
                 * System.out.println();
                 * 
                 * //Printing array
                 * System.out.print("Your array is : ");
                 * for(int i=0;i<size;i++)
                 * {
                 * System.out.print(" "+arr[i]);
                 * }
                 * System.out.println();
                 * 
                 * //Finding largest element from array
                 * key = arr[0];
                 * for(int i=0;i<size;i++){
                 * if(arr[i]>=key){
                 * key = arr[i];
                 * }
                 * }
                 * System.out.println("The largest element from array is : "+key);
                 * }
                 * }
                 */

                /*
                 * 17. Write a Java Program to sort the elements of an array in ascending order
                 */

                /*
                 * import java.util.Scanner;
                 * public class assignment_2{
                 * static int size;
                 * public static void bubble_sort(int array[],int size)
                 * {
                 * for(int i=0;i<size;i++)
                 * {
                 * for(int j=0;j<size-1;j++)
                 * {
                 * if(array[j]>array[j+1])
                 * {
                 * int temp = array[j];
                 * array[j] = array[j+1];
                 * array[j+1] = temp;
                 * }
                 * }
                 * }
                 * for(int k=0;k<size;k++)
                 * {
                 * System.out.print(" "+array[k]);
                 * }
                 * }
                 * public static void main(String[] args) {
                 * Scanner sc= new Scanner(System.in);
                 * System.out.print("Enter size of your array : ");
                 * size=sc.nextInt();
                 * int L[] = new int[size]; //declaration
                 * for(int i=0;i<size;i++)
                 * {
                 * System.out.print("ENTER ELEMENT "+(i+1)+" : ");
                 * L[i]= sc.nextInt();
                 * }
                 * System.out.println();
                 * System.out.print("Your array before sorting is :");
                 * for(int i=0;i<size;i++)
                 * {
                 * System.out.print(" "+L[i]);
                 * }
                 * System.out.println();
                 * System.out.print("Your array after sorting is :");
                 * bubble_sort(L,size);
                 * System.out.println();
                 * }
                 * }
                 */

                /* 18. Write a Java Program which will find the length of the string */
                /*
                 * import java.util.Scanner;
                 * public class assignment_2{
                 * public static void main(String[] args)
                 * {
                 * Scanner sc = new Scanner(System.in);
                 * String str;
                 * System.out.print("Enter a string : ");
                 * str = sc.nextLine();
                 * System.out.println("Your string is : "+str);
                 * System.out.println("Length of your string is : "+str.length());
                 * }
                 * }
                 */

                /* 19. Write a Java Program which will copy one string to other string. */
                /*
                 * import java.util.Scanner;
                 * public class assignment_2{
                 * public static void main(String[] args)
                 * {
                 * Scanner sc = new Scanner(System.in);
                 * String str1,str2;
                 * System.out.print("Enter string one : ");
                 * str1 = sc.nextLine();
                 * System.out.println("Source : " + str1);
                 * str2 = str1;
                 * System.out.println("Copied string " + str2);
                 * }
                 * }
                 */

                /* 20. Write a Java Program which will concatenate two strings. */
                /*
                 * import java.util.Scanner;
                 * public class assignment_2{
                 * public static void main(String[] args)
                 * {
                 * Scanner sc = new Scanner(System.in);
                 * String source,choice,destination="";
                 * System.out.print("Enter a string for source : ");
                 * source = sc.nextLine();
                 * System.out.print("Do you want to enter string at destination? : ");
                 * choice = sc.nextLine();
                 * if(choice.equalsIgnoreCase("Yes") || choice.equalsIgnoreCase("y")){
                 * System.out.print("Enter string at destination : ");
                 * destination = sc.nextLine();
                 * }
                 * System.out.println("Source: " + source);
                 * System.out.println("Destination: " + destination+" "+source);
                 * }
                 * }
                 */

                /*
                 * 21. Write a Java Program which will find the position of the particular
                 * character.
                 */

                /*
                 * import java.util.Scanner;
                 * public class assignment_2{
                 * public static void main(String[] args)
                 * {
                 * Scanner sc = new Scanner(System.in);
                 * String str;
                 * char ch;
                 * int flag=0;
                 * System.out.print("Enter a string : ");
                 * str = sc.nextLine();
                 * System.out.println("Your string is : "+str);
                 * int size = str.length();
                 * int arr[] = new int[size];
                 * System.out.print("Enter a character to be searched within the string : ");
                 * ch = sc.next().charAt(0);
                 * for(int i=0; i<size; i++){
                 * char temp = str.charAt(i);
                 * if(temp==ch){
                 * arr[flag]=i;
                 * flag++;
                 * }
                 * }
                 * if(flag==0)
                 * {
                 * System.out.println("Character not found wiithin the string");
                 * }
                 * else{
                 * System.out.print("Character "+"'"+ch+"'"+" is found at following indexes : "
                 * );
                 * for(int i : arr){
                 * if(i!=0){
                 * System.out.print(" "+i);
                 * }
                 * }
                 * }
                 * }
                 * }
                 */

                /* 22. Write a Java Program which will compare two strings */

                /*
                 * import java.util.Scanner;
                 * public class assignment_2{
                 * public static void main(String[] args)
                 * {
                 * Scanner sc = new Scanner(System.in);
                 * String str1,str2;
                 * System.out.print("Enter string one : ");
                 * str1 = sc.nextLine();
                 * System.out.print("Enter string two : ");
                 * str2 = sc.nextLine();
                 * System.out.println("String 1 : " + str1);
                 * System.out.println("String 2 : " + str2);
                 * if(str1.equals(str2)){
                 * System.out.println("Both strings are identitcal");
                 * }
                 * else{
                 * System.out.println("The strings are not identical");
                 * }
                 * }
                 * }
                 */

                /*
                 * 23. Write a class called Word and define a static method displayWordStats( )
                 * which displays on
                 * standard output the word,total no. of characters in the word and the number
                 * of vowels in the
                 * word.
                 */

                /*
                 * import java.util.Scanner;
                 * 
                 * class Word{
                 * String word;
                 * 
                 * //Default Cosntructor
                 * public Word(){
                 * word="";
                 * }
                 * 
                 * //Constructor to get Word
                 * public Word(String w){
                 * this.word = w;
                 * }
                 * 
                 * public void displayWordStats(){
                 * int size, vow=0;
                 * System.out.println("The Word is : "+word);
                 * size = word.length();
                 * System.out.println("Total number of Characters : "+size);
                 * for(int i=0; i<size; i++){
                 * char temp = word.charAt(i);
                 * if(temp=='A' || temp=='E' || temp=='I'||temp=='O'||temp=='U'||temp=='a' ||
                 * temp=='e'||temp=='i'||temp=='o'||temp=='u'){
                 * vow++;
                 * }
                 * }
                 * System.out.println("Number of vowels : "+vow);
                 * }
                 * }
                 * public class assignment_2{
                 * public static void main(String[] args)
                 * {
                 * Word w = new Word("Yatharth");
                 * w.displayWordStats();
                 * }
                 * }
                 */

                /*
                 * 24. Write a program to create a class to demonstrate the use of the methods
                 * of String class.
                 */
                /*
                 * import java.util.Scanner;
                 * import java.util.String;
                 * 
                 * public class assignment_2{
                 * public static void main(String[] args) {
                 * String str1 = "Hello, World!";
                 * String str2 = "Java Programming";
                 * String str3 = "   Spaces Before and After   ";
                 * 
                 * // Length of the string
                 * int length = str1.length();
                 * System.out.println("Length of str1: " + length);
                 * 
                 * // Concatenation
                 * String concatenated = str1.concat(" Welcome to ").concat(str2);
                 * System.out.println("Concatenated string: " + concatenated);
                 * 
                 * // Substring
                 * String substring = str2.substring(0, 4);
                 * System.out.println("Substring of str2: " + substring);
                 * 
                 * // Index of
                 * int indexOfWorld = str1.indexOf("World");
                 * System.out.println("Index of 'World' in str1: " + indexOfWorld);
                 * 
                 * // Replace
                 * String replaced = str2.replace('a', 'A');
                 * System.out.println("String after replacing 'a' with 'A': " + replaced);
                 * 
                 * // Uppercase and lowercase
                 * String uCaseStr2 = str2.toUpperCase();
                 * String lCaseStr2 = str2.toLowerCase();
                 * System.out.println("Uppercase of str2: " + uCaseStr2);
                 * System.out.println("Lowercase of str2: " + lCaseStr2);
                 * 
                 * // Trimming spaces
                 * String trimmedStr3 = str3.trim();
                 * System.out.println("Trimmed str3: " + trimmedStr3);
                 * 
                 * // Checking equality
                 * boolean isEqual = str1.equals("Hello, World!");
                 * System.out.println("Is str1 equal to 'Hello, World!': " + isEqual);
                 * 
                 * // Checking if a string starts or ends with a specific substring
                 * boolean startsWithHello = str1.startsWith("Hello");
                 * boolean endsWithJava = str2.endsWith("Java");
                 * System.out.println("str1 starts with 'Hello': " + startsWithHello);
                 * System.out.println("str2 ends with 'Java': " + endsWithJava);
                 * 
                 * // Splitting a string
                 * String[] words = str2.split(" ");
                 * System.out.println("Words in str2:");
                 * for (String word : words) {
                 * System.out.println(word);
                 * }
                 * }
                 * }
                 */

                /* 25. Write a program to sort string array */

                /*
                 * import java.util.Scanner;
                 * class Str_Arr{
                 * Scanner sc = new Scanner(System.in);
                 * String arr[];
                 * int size;
                 * public void getData(){
                 * System.out.print("Enter size of array : ");
                 * size = sc.nextInt();
                 * arr = new String[size];
                 * sc.nextLine();
                 * for(int i=0;i<size;i++){
                 * System.out.print("Enter String "+(i+1)+" : ");
                 * arr[i] = sc.nextLine();
                 * }
                 * }
                 * public void display(){
                 * int i=0;
                 * for(String s : arr){
                 * System.out.println("Element "+(i+1)+" : "+s);
                 * i++;
                 * }
                 * }
                 * // Bubble Sort to sort the string array
                 * public void bubbleSort() {
                 * for (int i = 0; i < size - 1; i++) {
                 * for (int j = 0; j < size - i - 1; j++) {
                 * if (arr[j].compareTo(arr[j + 1]) > 0) //returns 0 if equal and greater than 0
                 * if bigger string
                 * {
                 * // Swap the elements
                 * String temp = arr[j];
                 * arr[j] = arr[j + 1];
                 * arr[j + 1] = temp;
                 * }
                 * }
                 * }
                 * }
                 * }
                 * 
                 * public class assignment_2 {
                 * public static void main(String[] args) {
                 * Str_Arr obj = new Str_Arr();
                 * obj.getData();
                 * System.out.println("Original array:");
                 * obj.display();
                 * 
                 * // Sort the array
                 * obj.bubbleSort();
                 * 
                 * System.out.println("Sorted array:");
                 * obj.display();
                 * }
                 * }
                 */

        };

        int totalLines = 0;

        for (String program : programs) {
            int linesInProgram = countLines(program);
            System.out.println("Lines in a program: " + linesInProgram);
            totalLines += linesInProgram;
        }

        System.out.println("Total lines in all programs: " + totalLines);
    }

    public static int countLines(String text) {
        String[] lines = text.split("\r\n|\r|\n");
        return lines.length;
    }
}
