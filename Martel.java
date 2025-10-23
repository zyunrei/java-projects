/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myloginsystem;
import java.util.Scanner;
/**
 *
 * @author Desktop
 */
public class Martel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] user = new String[1000][2];
        int users = 0;
        
        while (true) {
        System.out.print(" ");
        System.out.println("==== LOGIN SYSTEM ====");
        System.out.println("[1] Login");
        System.out.println("[2] Register");
        System.out.println("[3] Exit");
        System.out.print("Choose an option: ");
        int choices = scanner.nextInt();
        scanner.nextLine();
        
        if (choices==1) {
          System.out.print("Enter username: ");
          String name = scanner.nextLine();
          System.out.print("Enter password: ");
          String password = scanner.nextLine();
          
          boolean found = true;
                for (int i = 0; i < users; i++) {
                    if (user[i][0].equals(name) && user[i][1].equals(password)) {
                        System.out.println("");
                        System.out.println("Hello, " + name + "!");
                        System.out.println("");
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("");
                    System.out.println("Invalid username or password!");
                    System.out.println("");
                }
          
          
        } else if (choices==2) {
          System.out.print("Enter new username: ");
          String newusername = scanner.nextLine();
          boolean exists = false;
                    for (int i = 0; i < users; i++) {
                        if (user[i][0].equals(newusername)) {
                            exists = true;
                            break;
                        }
                    }

                    if (exists) {
                        System.out.println("");
                        System.out.println("Username already exists!");
                        System.out.println("");
                        continue;
                    }
          
          
          
          System.out.print("Enter new password: ");
          String pass = scanner.nextLine();
          System.out.print("Confirm new password: ");
          String confirmpass = scanner.nextLine();
          if (!confirmpass.equals(pass)) {
                        System.out.println("");
                        System.out.println("Passwords do not match!");
                        System.out.println("");
                    } else {
                        user[users][0] = pass;
                        user[users][1] = confirmpass;
                        users++;
                        System.out.println("");
                        System.out.println("Registration successful!");
                        System.out.println("");
                    }
          
          
          
        } else if (choices==3) {
          System.out.println("");
          System.out.println("    Goodbye!   ");
          System.out.println("");
          break;
        } else {
          System.out.println("");
          System.out.println("Invalid input!");
          System.out.println("");
        }
        
        }
        
    }
    
}
