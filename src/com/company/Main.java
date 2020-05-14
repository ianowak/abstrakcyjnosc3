package com.company;

public class Main {

    public static void main(String[] args) {

        MojKalkulator mojKalkulator = new MojKalkulator();

        System.out.println(mojKalkulator.dodaj(21,32));
        System.out.println(mojKalkulator.odejmij(97,43));
        System.out.println(mojKalkulator.sinus(45));


        Kalkulator nowyKalkuulator = new MojKalkulator();
        System.out.println(nowyKalkuulator.dodaj(21,32));
        System.out.println(nowyKalkuulator.odejmij(97,43));
        }
    }


interface Kalkulator{
    double PI = 3.14159;
    double dodaj(double a, double b);

    double odejmij(double a, double b);
}

class MojKalkulator implements Kalkulator{

    public double sinus (double x){
        double rad = x*3.14159/180;
        return Math.sin(rad);
    }

    @Override
    public double dodaj(double a, double b) {
        return a+b;
    }

    @Override
    public double odejmij(double a, double b) {
        return a-b;
    }
}
