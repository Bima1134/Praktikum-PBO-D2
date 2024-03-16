// Nama Program : Lecture.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Header/Body kelas Lecture
// Tanggal Dibuat : 02 Maret 2023
package Tugas.PersoninUniversity;
import java.util.ArrayList;
import java.util.List;

import Tugas.course.Course;
import Tugas.person.Person;


public class Lecture extends Person {
    private int employeeID;
    private List<Course> coursesTaught;

    // metode

    // konstruktor

    public Lecture(String name, int age, String address, int employeeID){
        super(name,age,address);
        this.employeeID=employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public String getDetails(){
        return super.getDetails()+"\nEmployee ID:"+employeeID; 
    }   

    public String getLectureName(){
        return super.getName();
    }

    public int getLectureAge(){
        return super.getAGE();
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
