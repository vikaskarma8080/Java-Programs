package org.example.programs;
import java.util.ArrayList;
import java.util.Arrays;
public class CountInversion {
    public int computeInversionCount(ArrayList<Integer> inArr, int s) {
        int inversionCount = 0;
        for (int i = 0; i < s; i++) {
            for (int j = i + 1; j < s; j++) {
                if (inArr.get(i) > inArr.get(j)) {
                    inversionCount = inversionCount + 1;
                }
            }
        }
        return inversionCount;
    }
    public static void main(String argvs[]) {
        CountInversion obj = new CountInversion();
        ArrayList<Integer> inArr = new ArrayList<Integer>(Arrays.asList(7, 4, 9, 1, 3, 5, 0, 6, 2, 8));
        int size = inArr.size();
        int ans = obj.computeInversionCount(inArr, size);
        System.out.println("The total inversion count of the input array is: " + ans);
    }
}