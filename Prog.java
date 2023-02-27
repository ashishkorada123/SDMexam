import java.util.Scanner;

public class Prog{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number 1:");
        int i=sc.nextInt();
        System.out.println("Enter number 2:");
        int j= sc.nextInt();

        if(i>j){
            System.out.println("1st number: "+i+" is greater than the second number :"+j);
        }
        else if(j>i){
            System.out.println("2nd number: "+j+" is greater than the first number :"+i);
        }
        else{
            System.out.println("Both the entered numbers are equal");
        }   


    }
}