package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String employeeName;
        double hourlyrate;
        double weeklyPay=0;
        double ovrTimeHoure;
        double overTime ;
        double workinHoures;
        System.out.println("read name of employee");
        employeeName = scanner.nextLine();
        System.out.println("read pay rate");
        hourlyrate = scanner.nextDouble();
        System.out.println("read working hour per week");
        workinHoures = scanner.nextInt();
	// write your code here
        if (workinHoures>60|| hourlyrate>25)
            System.out.println("unaproprate input");
        else
        {
            if(workinHoures>35){
                ovrTimeHoure = workinHoures - 35;
                overTime= ovrTimeHoure*1.5;
                weeklyPay = (hourlyrate*35) + (overTime*hourlyrate);


            }
            else
            weeklyPay = hourlyrate*workinHoures;

        }
        System.out.println( employeeName +" payed "+weeklyPay);
    }
}
