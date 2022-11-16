import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {

            int ticketAmnt=1;

            int[] randomNumbers;
            int[][] lottery = new int[ticketAmnt][];

            int ticketCount = 0;
            boolean unique;
            while (ticketCount < ticketAmnt) {
                randomNumbers = new int[6];
                int haveSix = 0;
                while (haveSix < 6) {
                    int randomNum = (int) (Math.random() * 49 + 1);
                    unique = true;
                    for (int n : randomNumbers) {
                        if (n == randomNum) {
                            unique = false;
                            break;
                        }
                    }
                    if (unique) {
                        randomNumbers[haveSix] = randomNum;
                        haveSix++;
                    }
                }

                Arrays.sort(randomNumbers);


                unique = true;
                for (int[] ary : lottery) {

                    if (Arrays.toString(ary).equals(Arrays.toString(randomNumbers))) {

                        unique = false;
                        break;
                    }
                }
                if (unique) {
                    lottery[ticketCount] = randomNumbers;
                    ticketCount++;
                }
            }


            for (int i = 0; i < lottery.length; i++) {
                System.out.println("Ticket #" + (i + 1) + ": --> "
                        + Arrays.toString(lottery[i]).replaceAll("[\\[\\]]", ""));
            }
        }
    }
