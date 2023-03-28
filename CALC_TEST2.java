package src;

import java.util.Scanner;

public class CALC_TEST2 {

    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner sc1 = new Scanner(System.in);
        float num1 = sc1.nextFloat();
        System.out.println("Введите второе число");
        Scanner sc2 = new Scanner(System.in);
        float num2 = sc1.nextFloat();
        System.out.println("Введите знак");
        Scanner sc3 = new Scanner(System.in);
        char znak = sc3.next().charAt(0);
        calc(znak, num1, num2);
        System.out.println(calc(znak,num1,num2));
    }
    public static void calc(char znak,float num1,float num2) {
        switch (znak) {
            case '+' -> plus(num1, num2);
            case '-' -> minus(num1, num2);
            case '*' -> mnosh(num1, num2);
            case '/' -> delenie(num1, num2);
            case '^' -> stepen(num1, num2);
            case 's' -> sin(num1);
            case 'c' -> cos(num1);
            case 't' -> tg(num1);
            case 'k' -> koren(num1);
            default -> System.out.println("НЕТУ ТАКОГО, ТЫ АБОБА");
        }

    }
    static float plus(float num1, float num2){
        float result = num1 + num2;
        return result;
    }
    static float minus(float num1,float num2){
        float result = num1 - num2;
        return result;
    }
    static float mnosh(float num1,float num2){
        float result = num1 * num2;
        return result;
    }
    static float delenie(float num1,float num2){
        float result = num1 / num2;
        return result;
    }
    static float stepen(float num1,float num2){
        float result = (float) Math.pow(num1,num2);
        return result;
    }
    static float sin(float num1){
        double num1r = Math.toRadians(num1);
        float result = (float) Math.sin(num1r);
        return result;
    }
    static float cos(float num1){
        double num1r = Math.toRadians(num1);
        float result = (float) Math.cos(num1r);
        return result;
    }
    static float tg(float num1){
        double num1r = Math.toRadians(num1);
        float result = (float) Math.tan(num1r);
        return result;
    }
    static float koren(float num1){
        float result = (float) Math.sqrt(num1);
        return result;
    }
}

