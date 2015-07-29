
public class Student extends Human {
protected boolean contract;


public Student(String name, String gender, int age, boolean contract) {
	super(name, gender, age);
	this.contract = contract;
}

public Student() {
	super();
	this.contract = true;
}

public String getContract() {
	if (contract) return "Have"; else return "Don't have";
}

public void setContract(boolean contract) {
	this.contract = contract;
}

public String info(){
	return "Name: " + this.getName() + ". Gender: " + this.getGender() +". Age: "+this.getAge() 
	+ ". Contract: " + this.getContract() ;	
}

@Override
public String toString(){
return info();
}

}
