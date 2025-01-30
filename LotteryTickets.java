import java.util.Arrays;

public class LotteryTickets {

    public static void main(String[] args) {
        
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        ticket2[2] = 54;

        System.out.println("Ticket 1 numbers: ");
        printTicketNumbers(ticket);

        System.out.println("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);
    }

    public static void printTicketNumbers(int[] ticket) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.println(ticket[i] + " ");
        }
    }


    
}
// use Arrays.copyOf () to copy all the elements of ticket1 into ticket2. change the third value to 54