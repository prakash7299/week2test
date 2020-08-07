package org.dxctraining;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class StudentMain 
{
	Set<Student> store=new HashSet<>();
    public static void main( String[] args )
    {
    	StudentMain obj1 = new StudentMain();
		obj1.runapp();
    }

	private void runapp() {
		Student student1=new Student("101",27);
		store.add(student1);
		Student student2=new Student("102",19);
		store.add(student2);
		Student student3=new Student("103",18);
		store.add(student3);
		Student student4=new Student("104",22);
		store.add(student4);
		display();
	}
	
	void display() {
		for(Student student:store) {
			if(student.getAge()>21) {
				System.out.println("student rollno :"+student.getRollno()+"student age"+student.getAge());
			}
			
		}
		
	}
}
