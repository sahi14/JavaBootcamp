public class Receipt {

    public static void main(String[] args) {
        System.out.println("here's your receipt:\n");

        String[] apples = {"Gala", "Granny Smith", "Macintosh"};

        double[] prices = {1.99, 1.49, 1.29};

        for (int i = 0; i < 3; i++) {
            System.out.println("\t" + apples[i] + ": $" + prices[i] + "");
            
        }    }
    
}
