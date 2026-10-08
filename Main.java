import java.util.Scanner;

class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    double calculateDiscount() {
        double total = calculateTotal();
        if (total >= 500) {
            return total * 0.1; // 10% discount
        } else {
            return 0;
        }
    }

    double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    void displayBill() {
        System.out.println("\n----- Movie Ticket Bill -----");
        System.out.println("Movie Name       : " + movieName);
        System.out.println("Ticket Price     : " + ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Total Amount     : " + calculateTotal());
        System.out.println("Discount         : " + calculateDiscount());
        System.out.println("Final Amount     : " + calculateFinalAmount());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
        String name = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();

        MovieTicket mt = new MovieTicket(name, price, tickets);
        mt.displayBill();

        sc.close();
    }
}
