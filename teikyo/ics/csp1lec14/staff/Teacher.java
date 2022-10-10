package teikyo.ics.csp1lec14.staff;

import teikyo.ics.csp1lec14.Job;
import teikyo.ics.csp1lec14.Person;
import teikyo.ics.csp1lec14.Settable;
import teikyo.ics.csp1lec14.Worker;

public class Teacher extends Person implements Worker, Settable{

    Job job = new Lecturer();

	public Teacher(){
		this.name = "Taro";
		this.age = 40;
		this.job = new Lecturer();
	}
    
    public Job getJob(){
        return new Lecturer();
    }

	public String getJobName(){
		return this.job.getJobName();
	}

	@override
	public String toString(){
		return this.getName() + "/" + this.getAge() + "/" + this.getJobName();
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