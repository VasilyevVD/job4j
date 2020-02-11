package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro (int value){
        return value / 70;
    }
    public static int rubleToDollar (int value){
        return value /60;
    }
    public static int euro1ToRuble (int x ){
        return x * 70 ;
    }
    public static int dollar1ToRuble (int  y ){
        return y * 60 ;
    }

    public static   void    main(String [] args){
        int euro=rubleToEuro(70) ;
        System.out.println("70 rubles are " + euro +"euro");
        int in =140;
        int expected =2;
        int out =rubleToEuro(in);
        boolean passed =expected ==out;
        System.out.println("140 rubles are 2 Euro. Test result:"+ passed);
        int dollar=rubleToDollar(60);
        System.out.println(" 60 ruble are " + dollar +"dollar");
        in =180;
        expected =3;
        out =rubleToDollar(in);
        passed =expected== out;
        System.out.println("180 rubles are 3 Dollars. Test result :"+passed);
        int euro1=euro1ToRuble(3);
        System.out.println(" euro are "+euro1 +"  ruble");
         in=4;
        expected=280;
        out=euro1ToRuble(in);
        passed =expected==out;
        System.out.println("4 euro are 280 rubles.Test result :"+passed);
        int dollar1=dollar1ToRuble( 5);
        System.out.println( " dollar are " +dollar1 + "  ruble");
        in=5;
        expected=300;
        out = dollar1ToRuble(in);
        passed =expected==out;
        System.out.println("5 Dollar are 300 Rubles. Test result :"+passed);
    }
    }

