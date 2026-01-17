/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author BED
 */
public class MartelGradeSystem {
    /**
     * @param args the command line arguments
     */
    static int[] ids = new int[100];
    static String[] names = new String[100];
    static String[] remarks = new String[100];
    static double[] averages = new double[100];
    static int count = 0;
    
    public static void main(String[] args) {
        studentgrademanagement(); 
    }
    
    public static void studentgrademanagement() {
    Scanner s  = new Scanner(System.in);
        
        do {
        System.out.println("");
        System.out.println("STUDENT GRADE MANAGEMENT SYSTEM");
        System.out.println("");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Exit");
        System.out.print("Enter Choice: ");
        int c = s.nextInt();
        
        if (c==1){
        addStudents();
        
        } else if(c==2) {
        allStudents();
        
        } else if(c==3) {
            System.out.println("");
        System.out.println("Goodbye!");
            System.out.println("");
        break;
        } else {
            System.out.println("");
        System.out.println("Invalid Choice!");
            System.out.println("");
        }
        }  while (true); 
    }
    
    
    public static void addStudents() {
    Scanner s  = new Scanner(System.in);
    
    System.out.println("");
    System.out.print("Enter name: ");
    String name = s.nextLine();

    System.out.print("Enter ID Number: ");
    int id = s.nextInt();
    
    int gr1 = Grades("Enter 1st grade: ");
    int gr2 = Grades("Enter 2nd grade: ");
    int gr3 = Grades("Enter 3rd grade: ");
    
    double a = (gr1+gr2+gr3) /3.0;
    String remark = remarks(a);
    
    names[count] = name;
    ids[count] = id;
    averages[count] = a;
    remarks[count] = remark;
    
    count++;
        System.out.println("");
    System.out.println("Student added!");
        System.out.println("");
    }
    
    
    public static void allStudents() {
        
        if (count == 0) {
        System.out.println("");
        System.out.println("No students added yet.");
        System.out.println("");
        return;
        }
        
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-8s %-18s %-10s %-12s%n",
            "ID", "Name", "Average", "Remark");
        System.out.println("-------------------------------------------------");
    
     for (int i = 0; i < count; i++) {
        System.out.printf("%-8d %-18s %-10.2f %-12s%n",
                ids[i], names[i], averages[i], remarks[i]);
    }
        System.out.println("-------------------------------------------------");
        System.out.println("");
    }
    
    static String remarks(double a) {
            if (a >= 90) {
            return "Excellent";
        } else if (a >= 80) {
            return "Very Good";
        } else if (a >= 70) {
            return "Good";
        } else if (a >= 60) {
            return "Needs Improvement";
        } else {
            return "Failed";
        }
    }
    
    static int Grades(String validation) {
        Scanner s  = new Scanner(System.in);
        
        int grade;
        do {
            System.out.print(validation);
            grade = s.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("");
                System.out.println("Grade must be 0 to 100.");
                System.out.println("");
            }
        } while (grade < 0 || grade > 100);

        return grade;
    }
        
        
}
