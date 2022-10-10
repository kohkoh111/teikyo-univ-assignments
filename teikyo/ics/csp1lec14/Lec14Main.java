package teikyo.ics.csp1lec14;

import teikyo.ics.csp1lec14.staff.Teacher;
import teikyo.ics.csp1lec14.student.English;
import teikyo.ics.csp1lec14.student.Science;
import teikyo.ics.csp1lec14.student.Student;

public class Lec14Main{

    public static void main(String[] args){
        Teacher t = new Teacher();
        Student s = new Student();
        English en = new English();
        Science sc = new Science();
        try{
            for(int i = 0; i < args.length; i++){
                if(args[i].equals("Teacher")){
                    t.setValues(args[i+1], Integer.parseInt(args[i+2]));
                    t.printInfo();
                }
                else if(args[i].equals("Student")){
                    s.setValues(args[i+1], Integer.parseInt(args[i+2]));
                    if(args[i+3].equals("English")){
                        s.setStudyName(en);
                    }
                    else if(args[i+3].equals("Science")){
                        s.setStudyName(sc);
                    }
                    s.printInfo();
                }
            }
        }catch(ArrayIndexOutOfBoundsException ae){            
            System.out.println("プログラム引数を見直してください");
            ae.printStackTrace();
        }catch(NumberFormatException ne){
            System.out.println("年齢が正しく入力されていません");
            ne.printStackTrace();
        }
    }
}