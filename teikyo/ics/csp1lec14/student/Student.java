package teikyo.ics.csp1lec14.student;

import teikyo.ics.csp1lec14.Learner;
import teikyo.ics.csp1lec14.Person;
import teikyo.ics.csp1lec14.Settable;
import teikyo.ics.csp1lec14.Study;

public class Student extends Person implements Learner, Settable{

	Study study;
	
	public Student(){
		this.study = new Programming();
		this.age = 20;
		this.name = "Hanako";
	}
	
	public Study getStudy(){
        return study;
    }

	public String getStudyName(){
		return this.study.getStudyName();
	}

	@Override
	public String toString(){
		return this.getName() + "/" + this.getAge() + "/" + this.getStudyName();
	}

	@Override
	public void printInfo(){
		System.out.println(toString());
	}

	public void setValues(String name, int age){
		this.name = name;
		this.age = age;
	}
}