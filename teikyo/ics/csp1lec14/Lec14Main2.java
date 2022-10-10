package teikyo.ics.csp1lec14;

public class Lec14Main2{

    public static void main(String[] args){
        try{
            Class c = Class.forName(args[0]);
            Class s = c.getSuperclass();
            System.out.println("Target class is " + c.getCanonicalName());
            while(s != null){
                System.out.println("Super class is " + s.getCanonicalName());
                s = s.getSuperclass();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}