//Simphiwe Mnisi
//4502211
//12practical

public class Practical {

    public static int mcsOn3(int[] X){
        int n = X.length;
        int maxsofar = 0;
        int countOn3 = 0;

        for(int low = 0; low < n; low++){
            for(int high = low; high < n; high++){
                int sum = 0;

                for(int r = low; r < high; r++){
                    sum += X[r];
                    countOn3++;
                    
                    if(sum > maxsofar){
                        maxsofar = sum;
                    }
                }
            }
        }
        return maxsofar;
    }
    
}
