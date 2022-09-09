package com.example.datastructure.processControl;
import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
//        Random rand = new Random();
//        int score = rand.nextInt(20 + 10) - 10;
        int score = 0;
        System.out.print("输入整数：");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()){
            score = scanner.nextInt();
            if (score > 10 || score< 0){
                System.out.println("分数范围有误");
                return;
            }
        }else{
            System.out.println("输入的数据不是整数");
            return;
        }

        switch (score){
            case 6: System.out.println("分数评级 " + score + " E"); break;
            case 7: System.out.println("分数评级 " + score + " D"); break;
            case 8: System.out.println("分数评级 " + score + " C"); break;
            case 9: System.out.println("分数评级 " + score + " B"); break;
            case 10: System.out.println("分数评级 " + score + " A"); break;
            default: System.out.println("分数评级 " + score + " F"); break;
        }
    }
}
