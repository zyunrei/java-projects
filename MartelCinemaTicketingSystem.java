/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Desktop
 */
public class CinemaTicketingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double Baseticketprice = 200.0;
        
        while (true) {
            System.out.print("Enter Age or exit: ");
            String name = input.nextLine();
            
            if (name.equalsIgnoreCase("exit")) {
            System.out.println("Thank you for using the cinema ticketing system!"); 
            break;
            }
            
            int age;
            try {
                age=Integer.parseInt(name);
            }catch (NumberFormatException e) { 
                System.out.println("Invalid input! Enter an age or 'exit'."); 
                continue; }
            
            System.out.print("Enter the day: ");
            String day = input.nextLine();
            
            System.out.print("How many tickets: ");
            int tickets = input.nextInt();
            input.nextLine();
            
            double ticketdiscount = Baseticketprice;

            if (age<=7) {
            ticketdiscount = 0;
            } else if (age>=60) {
            ticketdiscount = Baseticketprice *0.8;
            } else {
            ticketdiscount = Baseticketprice;
            }

            double wednesdaydiscount = Baseticketprice * 0.5;
            if (day.equalsIgnoreCase("Wednesday")) {
                if (wednesdaydiscount < ticketdiscount) {
                    ticketdiscount = wednesdaydiscount;
                }
            }

            double total = ticketdiscount * tickets;
            String totalticketdiscount;
            
            if (ticketdiscount == 0) { 
            totalticketdiscount = "Free ticket for below 7 years old"; 
            } else if (day.equalsIgnoreCase("Wednesday") && ticketdiscount == wednesdaydiscount) {
                totalticketdiscount = "50% Wednesday discount";
            } else if (age >= 60 && ticketdiscount == Baseticketprice * 0.8) {
                totalticketdiscount = "20% Senior discount";
            } else {
                totalticketdiscount = "No discount";
            }
            
            if (total > 1000) {
                total *= 0.9;
                totalticketdiscount += " give 10% off if spend over ₱1000";
            } 
            
            System.out.println("_________________________");
            System.out.println("     Ticket Overview   ");
            System.out.println("Ticket Price: ₱" + Baseticketprice);
            System.out.println("Number of Tickets: " + tickets);
            System.out.println("Discount: " + totalticketdiscount);
            System.out.println("Total Amount: ₱" + total);
            if (total < 200 && ticketdiscount != 0) {
                System.out.println("Minimum purchase not reached.");
            }
            System.out.println("_________________________");
            
        }
        
    }
    
}
 