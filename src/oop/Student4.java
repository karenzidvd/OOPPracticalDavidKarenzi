package oop;

public class Student4 {
int rollno;
String name;

void insertRecord(int r, String n) {
	rollno=r;
	name=n;
}
void displayinformation() {
	System.out.println(rollno+" "+name);
}
}
