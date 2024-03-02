// Nama Program : Lecture.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Header/Body kelas Lecture
// Tanggal Dibuat : 02 Maret 2023

import java.util.ArrayList;
import java.util.List;

public class Lecture {
    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    // metohde

    // konstruktor

    public Lecture(String name, int age, String address, int employeeID){
        this.name=name;
        this.age=age;
        this.address=address;
        this.employeeID=employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getDetails(){
        return "Name:"+name +"\nAge:"+age+"\nAddress:"+address+"\nEmployee ID:"+employeeID; 
    }   

    public String getLectureName(){
        return this.name;
    }
    
    public void teachCourse (Course c){
        this.coursesTaught.add(c);
        c.addLecture(this);
    }

    public void viewTaughtCourses(){
        if (this.coursesTaught.isEmpty()){
            System.err.println("No Courses Taughted");
        }
        else{
            System.out.println("Taughted Courses of Lecture "+this.getLectureName()+":");
            for (int i=0;i<this.coursesTaught.size();i++){
                System.out.println(coursesTaught.get(i).getCourseName());
            }
        }
    }
}
