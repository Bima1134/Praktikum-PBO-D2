  
      System.out.println(Arduino.getDetails());
      System.out.println();
      System.out.println(Uno.getDetails());
      System.out.println();
      System.out.println(Farrel.getDetails());
      System.out.println();

      Arduino.teachCourse(cs101);   
      Arduino.teachCourse(cs102);
      Uno.teachCourse(cs103);
  
      cs101.addStudent(Farrel);
      cs101.addStudent(Ardana);
      cs101.addStudent(Gibran);
  
      cs102.addStudent(Farrel);
      cs102.addStudent(Ardana);
  
      cs103.addStudent(Farrel);
  
      Farrel.viewEnrolledCourses();
      Arduino.viewTaughtCourses();
      cs101.viewEnrolledStudents();
    
      System.out.println("\nBefore Removing student Farrel from Algorithms\n");
      cs103.viewEnrolledStudents();
      Farrel.viewEnrolledCourses();
      System.out.println("\nRemoving student Farrel from Algorithms\n");
      cs103.removeStudent(Farrel);
      cs103.viewEnrolledStudents();
      Farrel.viewEnrolledCourses();

     System.out.println("\nAdding student Gibran to Algorithms course");
     Gibran.enrollCourse(cs103);
     cs103.viewEnrolledStudents();
     Gibran.viewEnrolledCourses();
     System.out.println("\nAlgorithm will not show 2 time beacuse will add course if it is not exist in enrolled courses");
     cs102.viewEnrolledStudents();
     System.out.println("\nNow Gibran will enroll to Data Structures course");
     Gibran.enrollCourse(cs102);
     cs102.viewEnrolledStudents();
     Gibran.viewEnrolledCourses();

     Ardana.viewEnrolledCourses();
     cs101.viewEnrolledStudents();
     System.out.println("Ardana will unenroll from Intro to Computer Science");
     Ardana.unEnrollCourse(cs101);
     cs101.viewEnrolledStudents();
     Ardana.viewEnrolledCourses();

