public class HighScore {

    public static void main(String[] args) {

        int highScore = 0;
        int seat = 0;
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        System.out.println("Here are the scores: ");


        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
                
                seat = i;
            }
            
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

        //workbook 6.6

        System.out.println("its the gentleman in seat: " + seat );
    }

    public static int randomNumber() {
        double decimal = Math.random() * 50000;
        return (int)decimal;

    }
    
}
