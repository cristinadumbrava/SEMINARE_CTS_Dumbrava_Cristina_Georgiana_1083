package main;

import classes.Administrator;
import classes.Soare;

public class Main {
    public static void main(String[] args){
        Administrator administrator1 = Administrator.getInstance();
        Administrator administrator2 = Administrator.getInstance();

        System.out.println(administrator1.toString());
        System.out.println(administrator2.toString());

        Soare soare1 = Soare.getInstance(100, " galben");
        Soare soare2 = Soare.getInstance(200, "portocaliu");//constructorul e apelat o singura data, doar la primul apel, deci nu mai creeaza acest obiect

        System.out.println(soare1.toString());
        System.out.println(soare2.toString());



    }
}
