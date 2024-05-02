package tugas;

public class FullTimeEmployee extends Employee implements WorkSchedule {
    private double monthlySalary;
  
    public FullTimeEmployee(int id, String name, double monthlySalary) {
      // TODO: implementasikan konstruktor
      super(id,name);
      this.monthlySalary=monthlySalary;
    }
    public void displaySchedule(){
      System.out.println("Full Time Employee Schedule: Monday to Friday, 9:00 AM - 5:00 PM");
    }

    public  double calculateSalary(){
      return this.monthlySalary;
    }

    public void printDetails() {
      System.err.println("Full Time Employee Details:");
      System.out.println("ID: " + this.id + "\nName: " + this.name + "\nMonthly Salary: $" + this.monthlySalary + "\nSalary: $" + this.calculateSalary());
      this.displaySchedule();
    }
  
}
    // TODO: lanjutkan buat method-method yang dimiliki oleh WorkSchedule
  