package Farmer_Loan_Form;

import java.util.Scanner;

class form{
    String name;
    String state;
    String city;
    String village;
    int pin_code;
    String pan_card_number;
    long aadhar_card_number;
    int loan_amount;
    float simple_intrest;
    float time_duration;
    String input;
    static float intrest_rate;
    static{
        intrest_rate = 5.2f;
    }
    void input(){
        System.out.println("Welcome to INDIAN BANK🏦, please fill your form");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Name ");
        name = scan.nextLine();
        System.out.println("Your name is: "+ name);

        System.out.println("Enter your City");
        city = scan.nextLine();
        System.out.println("Your city is: "+ city);

        System.out.println("Enter your State");
        state = scan.nextLine();
        System.out.println("Your State is: "+state);

        System.out.println("Enter your Village");
        village = scan.nextLine();
        System.out.println("Your village is: "+village);

        System.out.println("Enter your Pin Code");
        pin_code = scan.nextInt();
        System.out.println("Your pin Code is: "+pin_code);

        System.out.println("Please enter your Aadhar Card Number");
        aadhar_card_number = scan.nextLong();
        System.out.println("Your Aadhar Number is: "+ aadhar_card_number);

        System.out.println("Please enter your Pan Card Number");
        pan_card_number = scan.next();
        System.out.println("Your Pan Card Number is: "+ pan_card_number);

        System.out.println("Enter your prefer loan amount");
        loan_amount = scan.nextInt();
        System.out.println("Your Loan Amount is: "+ loan_amount);
        System.out.println("Enter Your time duration");
        time_duration = scan.nextInt();
    }

    void total_intrest_amount(){
        simple_intrest = (intrest_rate * loan_amount * time_duration)/100;
        System.out.println("Your total intrest amount is:" + simple_intrest);
    }
    void total(){
        float total = loan_amount + simple_intrest;
        System.out.println("Your Total Amount is: " + total);
    }
}
public class Loan_Form {
    public static void main(String[] args) {
        form form = new form();
        form.input();
        form.total_intrest_amount();
        form.total();
    }
}
