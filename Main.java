import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //1: Make an array size  3  with these values : { "Saleh","Khalid","Majed" } and print it
        System.out.println("Exercise 1:");
        String users[]={"Saleh","Khalid","Majed"};
        for (int i = 0; i < users.length ; i++) {
            System.out.println(users[i]);
        }

        //2: Print the numbers from 1 -  33 , don't print the numbers that multiple of 5
        System.out.println("Exercise 2:");
        for (int i = 1; i <= 33 ; i++) {

            if(i%5==0){
                continue;
            }
            System.out.println(i);
        }


        //3: Make an array size 5 with random string values and print it in reverse order
        System.out.println("Exercise 3:");
        String arr[]=new String[5];
        arr[0]="Red";
        arr[1]="Blue";
        arr[2]="Black";
        arr[3]="Yellow";
        arr[4]="Grey";

        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }

        //4: Make an array size 10 with random string values ,
        // and don’t print the values that start with letter 'A'
        System.out.println("Exercise 4:");
        String names[]={"Haya","Abdullah","Fahad","Ahmed","Nuha",
                "Shahad","Kholod","Khalid","Mohammed","Fatima"};
        for (int i = 0; i < names.length ; i++) {
            if(names[i].charAt(0)=='A'){
                continue;
            }
            System.out.println(names[i]);

        }

        //5: Create a method that print an array.
        System.out.println("Exercise 5:");
        int num[]={1,5,6};
        printArr(num);

        //6: Create a method that takes 3 numbers create an array from these numbers and return it.
        System.out.println("Exercise 6:");
        int n1=5;
        int n2=9;
        int n3=11;
        int number[]=arr(n1,n2,n3);
        System.out.println(Arrays.toString(number));
        //7: Create a method that takes your first name and last name
        // and return hello meessage with you full name .
        System.out.println("Exercise 7:");
        String fName="Haya";
        String lNAme="Almalki";
        printName(fName,lNAme);

        //8: Create a method that takes 4 numbers and return the average of these numbers
        System.out.println("Exercise 8:");
        int num1=2;
        int num2=3;
        int num3=5;
        int num4=10;
        int average=average(num1,num2,num3,num4);
        System.out.println(average);

        //9:Create a methid that takes array of numbers and return the biggest number
        System.out.println("Exercise 9:");
        int numbers[]={5,2,7,10,0,1};
        int bigNum=biggestNumber(numbers);
        System.out.println(bigNum);

    }
    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] arr(int num1, int num2, int num3){
        int numbers[]={num1,num2,num3};
        return numbers;
    }

    public static void printName(String firstName,String lastName){
        System.out.println("Hello "+firstName+" "+lastName);
    }

    public static int average(int num1,int num2, int num3, int num4){
        int avr=(num1+num2+num3+num4)/4;
        return avr;
    }

    public static int biggestNumber(int []numbers){
        int bigNum=0;
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]>bigNum){
                bigNum=numbers[i];
            }
        }
        return bigNum;
    }
}