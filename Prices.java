public class Prices {

    public static void main(String[] args) {
        
        double[][] prices = {
            {12.99, 8.99, 9.99, 10.49, 11.99},
            {0.99, 1.99, 2.49, 1.49, 2.99},
            {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        for (int i = 0; i < 3; i++) {
            System.out.println("Baking: " + prices[i][0] + " " + prices[i][1] + " " + prices[i][2] + " " + prices[i][3] + " " + prices[i][4] + " ");

        }

        
    }
    
}
