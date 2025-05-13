package controlStatement;

import java.util.Optional;
import java.util.Scanner;

public class BranchControl {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please in put : ");
        double a = myScanner.nextDouble();
        double b = myScanner.nextDouble();
        BranchControl bc = new BranchControl();
        double c = bc.getSum(a,b);
        System.out.println(c);
    }

    /**
     * if case
     * */
    public double getSum(double a, double b){
        if (a > 10.0 && b <20.0){
            return  a + b;
        }else{
            return a - b;
        }
    }

    /**
    * switch case
    * */
    public Optional<String> getDay(String day){
        switch(day){
            case "1":
                System.out.println(day);
                // 使用break语句终止switch语句的执行，防止代码继续执行下一个case
                break;
            case "2":
                System.out.println(day);
                // 使用break语句终止switch语句的执行，防止代码继续执行下一个case
                break;
            default:
                    return Optional.empty();
        }
        return Optional.of(day);
    }
}