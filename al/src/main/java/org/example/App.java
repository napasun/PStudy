package org.example;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        int [] a = {1,2,3,4,5};
//        int [] result = solution(null, 0);
//
//        for (int item: result) {
//            System.out.println(item);
//        }
        int [] b = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(20, 50, 20));
        System.out.println(solution(5, b));
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

//    public int solution(int X, int Y, int D) {
//        // write your code in Java SE 8
//        int result = 0;
//
//        while(X < Y) {
//            X += D;
//            ++result;
//        }
//
//        return result;
//    }

    static public int solution(int X, int Y, int D) {
        if (Y - X == 0) return 0;

        int midValue = (Y - X) / D;
        if ((Y - X) % D != 0) midValue += 1;

        return midValue;
    }

    static public int solution(int X, int[] A) {
        // write your code in Java SE 8
        int r = -1;
        int[] result = new int[X];

        for (int i = 0; i < A.length; i++) {
            if (result[A[i] - 1] == 0) result[A[i] -1] = i+1;
        }

        for (int temp: result) {
            if (temp == 0) return -1;

            if (r < temp) r = temp;
        }

        return r-1;
    }
}
