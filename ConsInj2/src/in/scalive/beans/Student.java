package in.scalive.beans;

public class Student {

private int rollno;

public Student(int rollno) {
System.out.println("bean initilized using int parameter");
	this.rollno = rollno;
}

public int getRollno() {
	return rollno;
}

public void setRollno(int rollno) {
	this.rollno = rollno;
}


}
