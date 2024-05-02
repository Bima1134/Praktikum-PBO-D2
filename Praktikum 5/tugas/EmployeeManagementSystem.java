package tugas;


public class EmployeeManagementSystem {
    public static void main(String[] args) {
      // TODO: buatlah objek dari FullTimeEmployee dan PartTimeEmployee
      FullTimeEmployee Farrel = new FullTimeEmployee(101, "John Doe", 4000);
      PartTimeEmployee Gibran = new PartTimeEmployee(201, "Jane Smith", 15, 30);
      /* TODO: lakukan print dengan contoh format seperti berikut:
    Full-Time Employee Details:
    ID: 101
    Name: John Doe
    Monthly Salary: $4000.0
    Salary: $4000.0
    Full-Time Employee Schedule: Monday to Friday, 9:00 AM - 5:00 PM
      */
    Farrel.printDetails();
    Gibran.printDetails();
  
      /* TODO: lakukan print dengan contoh format seperti berikut:
    Part-Time Employee Details:
    ID: 201
    Name: Jane Smith
    Hourly Rate: $15.0
    Houts Worked: 30
    Salary: $450.0
    Part-Time Employee Schedule: Flexible hours
      */
  
    }
}
  