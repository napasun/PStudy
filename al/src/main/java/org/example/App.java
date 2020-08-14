package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int [] a = {1,2,3,4,5};
        int [] result = solution(null, 0);

        for (int item: result) {
            System.out.println(item);
        }
    }

    static public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        if (A == null || A.length == 0) {
            return new int[0];
        }

        K =  K % A.length;
        if (K == 0) return A;

        int[] result = new int[A.length];

        for(int i = 0; i < A.length; i++) {
            if (i + K >= A.length) {
                result[i + K - A.length] = A[i];
            } else {
                result[i + K] = A[i];
            }

        }

        return result;
    }
}
