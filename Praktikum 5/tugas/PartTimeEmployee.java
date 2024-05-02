package tugas;

public class PartTimeEmployee extends Employee implements WorkSchedule {
    private double hourlyRate;
    private int hoursWorked;
  
    public PartTimeEmployee(int id, String name, double hourlyRate, int hoursWorked) {
      // TODO: implementasikan konstruktor
      super(id, name);
      this.hourlyRate=hourlyRate;
      this.hoursWorked=hoursWorked;
    }

    public void displaySchedule(){
      System.out.println("Part Time Employee Schedule: Flexible hours");
    }

    public double calculateSalary(){
      return hourlyRate*hoursWorked;
    }

    public void printDetails() {
      System.err.println("Part Time Employee Details:");
      System.out.println("ID: " + this.id + "\nName: " + this.name + "\nHourly Rate: $" + this.hourlyRate + "\nHours Worked: " + this.hoursWorked +"\nSalary: $"+this.calculateSalary());
      this.displaySchedule();
  }
  
    // TODO: lanjutkan buat method-method yang dimiliki oleh WorkSchedule
}
  