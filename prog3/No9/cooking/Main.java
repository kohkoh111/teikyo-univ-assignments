package cooking;
import mytool.*;
import mytool.colorpen.RedPen;
import myfood.*;

public class Main{
    public static void main(String[] args) {
        // MyPen p = new MyPen();
        // MyApple a = new MyApple();
        // RedPen r = new RedPen();
        // System.out.println("I have a " + p.getName());
        // System.out.println("I have an " + a.getName());
        // System.out.println("I have a " + r.getName());
        MyItem[] items = {new MyPen(), new MyApple(), new RedPen()};
        for(MyItem i: items)
        System.out.println("I have a/an " + i.getName());
    }
}