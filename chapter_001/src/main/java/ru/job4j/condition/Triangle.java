package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab,double ac,double bc){
        boolean result = false;
        if (ac + bc > ab && ab + bc > ac && ab + ac > bc){
            result = true;
        }
        return result;
    }
}
