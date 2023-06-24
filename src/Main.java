public class Main {
    public static void main(String[] args) {
        int balance;
        int repAmount;
        int bonus;
        int sumbalance;

        balance = 100;
        repAmount = 1_050;
        if (repAmount > 1000) {
            bonus = repAmount / 100;
            sumbalance = balance + repAmount + bonus;

        } else {
            sumbalance = balance + repAmount;
            bonus = 0;
        }

        System.out.println("На Вашем счету: " + sumbalance + " руб. ");
        System.out.println("В том числе " + bonus + " начисленных бонусов");
    }
    }
