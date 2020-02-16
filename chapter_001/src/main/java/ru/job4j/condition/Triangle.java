package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab,double ac,double bc){
        boolean result = ab+ac>bc;
        if (ac+bc>ab){
            result = true;
        }else if (ab+bc>ac){
            result = true;
        }
        return false;
    }
}
