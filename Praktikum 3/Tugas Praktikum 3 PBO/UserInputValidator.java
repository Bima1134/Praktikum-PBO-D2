/**
 * NIM / Nama: Bima Aditya Aryono
 * File      : UserInputValidator.java
 * Deskripsi : Melakukan asersi untuk inputan user, yaitu username,email dan umur
 * Tanggal   : 09-03-2024
 */


public class UserInputValidator {

    public static void validateUsername(String username) {
        String regex = "^[a-zA-Z][a-zA-Z0-9_]{4,19}$";
        if (username.length() < 5 && !Character.isDigit(username.charAt(0))) {
          assert username.matches(regex): "Username must be at least 5 characters long";
          System.out.println("Username must be at least 5 characters long");
        } 
        else if (username.length() > 20) {
          assert username.matches(regex): "Username must be at most 20 characters long";
          System.out.println("Username must be at most 20 characters long");
        } 
        else {
          assert username.matches(regex) : "Invalid Username";
        }
      }
    
    public static void validateEmail(String email) {
      String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    
      assert email.matches(regex) : "Invalid Email";
    }
    
    
    public static void validateAge(int age) {
      assert age>=17 && age<=99 : "Age Must be beetween 17 and 19";
    }
    
}
