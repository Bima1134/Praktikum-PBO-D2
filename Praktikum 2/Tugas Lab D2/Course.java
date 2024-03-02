// Nama Program : Lecture.java
// Nim/Nama Pembuat : 24060122140113/ Bima Aditya Aryono
// Deksripsi : Header/Body kelas Course
// Tanggal Dibuat : 02 Maret 2023


import java.util.ArrayList;
import java.util.List;
public class Course {
    private String courseCode;
    private String courseName;
    private Lecture lecture;
    private List<Student> studentsEnrolled;

    public Course(String courseCode, String courseName){
        this.courseCode=courseCode;
        this.courseName=courseName;
        this.studentsEnrolled = new ArrayList<>();
    }
    
    public String getCourseName(){
        return this.courseName;
    }
    public String getCourseCode(){
        return this.courseCode;
    }

    public String getCourseLecture(){
        return this.lecture.getLectureName();
    }
    
    public void addLecture(Lecture lecture){
        this.lecture=lecture;
    }

    public void addStudent(Student s){
        if (!this.studentsEnrolled.contains(s)) {
            this.studentsEnrolled.add(s);
            s.enrollCourse(this);
        }
    }

    public void removeStudent(Student s){
        if (this.studentsEnrolled.contains(s)) {
            this.studentsEnrolled.remove(s);
            s.unEnrollCourse(this);
        }
    }

    public void viewEnrolledStudents(){
        if (this.studentsEnrolled.isEmpty()){
            System.err.println("No Students Enrolled to "+this.getCourseName());
        }
        else{
            System.out.println("Enrolled Students of "+this.courseName+" :");
            for (int i=0;i<this.studentsEnrolled.size();i++){
                System.out.println((i+1)+"."+(studentsEnrolled.get(i).getDetails())+"\n");
            }
        }
    }
}
