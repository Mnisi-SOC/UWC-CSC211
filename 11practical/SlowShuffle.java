import java.util.Random;

public class SlowShuffle { 
    public static void main(String[] args) {

        int N = 10;
        int[] shuffled = new int[N];
        boolean[] isNotPresent = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            isNotPresent[i] = true;
        }

        Random rand = new Random();
        int index = 0;

        while (index < N - 1) {
            int r = rand.nextInt(N) + 1;

            if (isNotPresent[r]) {
                shuffled[index] = r;
                isNotPresent[r] = false;
                index++;
            }
        }

        for (int i = 1; i <= N; i++) {
            if (isNotPresent[i]) {
                shuffled[index] = i;
                break;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(shuffled[i] + " ");
        }
    }
}
