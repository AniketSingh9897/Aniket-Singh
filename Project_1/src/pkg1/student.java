package pkg1;

public class student {
int age;
int rollno;
public void display1()
{
	System.out.println("Welcome to all of you");
	
}
public void display2()
{
	System.out.println("Automation is easy");
	
}
public static void main(String[]args)
{
student	test=new student();
test.display1();
test.display2();
test.age=69;
test.rollno=01;

System.out.println(test.age);
System.out.println("roll no is"+ test.rollno);
}}
	
	
	
