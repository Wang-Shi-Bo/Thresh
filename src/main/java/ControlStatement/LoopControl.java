package ControlStatement;

public class LoopControl {
    public static void main(String[] args) {
        LoopControl lc = new LoopControl();
        lc.printJinzita();
    }

    //normal
    public void forLoop1(){
        for (int i = 5; i < 10; i++){
            System.out.println("a");
        }
    }
    public void forLoop2(){
        //提升变量i当作用范围
        int i = 0;
        for (;i < 5;){
            System.out.println("i");
            i++;
        }
    }

    public void forLoop3(){
        //循环变量初始化可以有多个（但是类型要一样），
        //循环条件只能有一个表达式；但可以通过逻辑运算符将多个子条件组合在一起
        for (int i = 0,  j = 10; i < 10 && j > 0; i++, j--) {
            System.out.println("a");
        }
    }

    //practice
    public void forLoopPractice1(){
        int count = 0;
        int sum = 0;
        for (int i = 0; i < 100; i++){
            if (i % 9 == 0){
                count++;
                sum += i;
                System.out.println("i = " + i);
            }
        }
        System.out.println("count:" + count);
        System.out.println("sum:" + sum);
    }

    public void forLoopPractice2(){

        for (int i = 0 , j = 5; i < 6 && j >= 0; i++ , j--){
            System.out.println(i + " + " + j + " = " + (i + j));

        }

    }

    //while loop
    public void whileLoop1(){
        int i = 40;
        while (i <= 200){
            System.out.println("a");
            i++;
        }
    }


    //multiple loop
    public void multipleLoop1(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }
    // print jinzita
    public void printJinzita(){
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < i; j++){
                if (j == 2){
                    System.out.println( i + "+" +j);
                    break;
                }
            }
        }
    }

    // for & break
    public void forBreak(){
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            sum = sum + i;
            if (sum > 20){
                System.out.println("i = " + i);
                break;
            }
        }
    }

    //login
    public String loginCheck(String username, String password){
        int chance = 3;
        return "";

    }

}
