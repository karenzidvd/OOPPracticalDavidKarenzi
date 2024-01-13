package Student;

public class Student {
	int rollno;//instance variable
	String name;
	static String college ="INES";
	
	Student(int r, String n){
	rollno = r;
	name = n;
	}
	
	void display (){System.out.println(rollno+" "+name+" "+college);}
	}

	