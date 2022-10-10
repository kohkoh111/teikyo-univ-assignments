package teikyo.ics.csp1lec14;
/*  */

public class Person{

	protected String name;
	protected int age;

    public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}
    
    public void printInfo(){
        System.out.println( this.getName());
    }
}