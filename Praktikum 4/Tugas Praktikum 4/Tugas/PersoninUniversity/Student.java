// Nama Program : Student.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Header/Body kelas Student
// Tanggal Dibuat : 02 Maret 2023

package Tugas.PersoninUniversity;
import java.util.ArrayList;
import java.util.List;



import Tugas.course.*;
import Tugas.person.*;

public class Student extends Person {
    // atribut
    // objek

    
    private int studentID;
    private List<Course> coursesEnrolled;

    
    // methods
    // konstruktor
    public Student(String name, int age, String address, int studentID){
        super(name,age,address);
        this.studentID=studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    // getter
    public String getDetails(){
        return super.getDetails()+"\nID Student: "+studentID; 
    }
    public String getStudentName(){
        return super.getName();
    }

    // setter
    public void enrollCourse(Course c){
        if(!this.coursesEnrolled.contains(c)){
            this.coursesEnrolled.add(c);
            c.addStudent(this);
        }
    }

    public void unEnrollCourse(Course c){
        if(this.coursesEnrolled.contains(c)){
            this.coursesEnrolled.remove(c);
            c.removeStudent(this);
        }
    }

    public void viewEnrolledCourses(){
        if (this.coursesEnrolled.isEmpty()){
            System.err.println("No Courses Enrolled");
        }
        else{
            System.out.println("Enrolled Courses of Student "+this.getStudentName()+":");
            for (int i=0;i<this.coursesEnrolled.size();i++){
                System.out.println((i+1)+"."+(coursesEnrolled.get(i).getCourseName()));
            }
            System.out.println();
        }
    }

}
