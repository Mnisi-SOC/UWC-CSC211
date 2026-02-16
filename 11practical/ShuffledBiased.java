import java.util.Random;

public class ShuffledBiased {
     public static void main(String[] args) {

        int N = 10;
        int[] shuffled = new int[N];

        for (int i = 0; i < N; i++) {
            shuffled[i] = i + 1;
        }

        Random rand = new Random();

        for (int i = 0; i < N; i++) {
            int r = rand.nextInt(N); 

            int temp = shuffled[i];
            shuffled[i] = shuffled[r];
            shuffled[r] = temp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(shuffled[i] + " ");
        }
    }
}
