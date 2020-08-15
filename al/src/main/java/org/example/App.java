package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 //        int [] a = new int[]{2, 9, 12, 43};
 //        int [] b = new int[]{4, 8, 5, 3, 43};
 ////        int [] a = new int[]{2, 1};
 ////        int [] b = new int[]{3, 3};
 //        System.out.println(solution(a, b));
 System.out.println(checkStr);
 System.out.println(checkStr(checkStr));
 */
public class App
{
    public static void main( String[] args )
    {
        solution("azABaabza");
    }
    static public int solution(String S) {
        // write your code in Java SE 8
        int result = 99999999;

        for (int i = 0; i < S.length() - 1; i++) {
            for (int j = i + 1; j < S.length(); j++) {
                String checkStr = S.substring(i, j+1);

                if (checkStr(checkStr) && result > checkStr.length()) {
                    result = checkStr.length();
                }
            }
        }
        if (result == 99999999) return -1;
        return result;
    }

    static public boolean checkStr(String S) {
        boolean[] upper = new boolean[26];
        boolean[] lower = new boolean[26];

        for (int i = 0; i < S.length(); i++) {
            int charNum = S.charAt(i);
            if (charNum >= 65 && charNum <= 90) {
                upper[charNum - 65] = true;
            } else {
                lower[charNum - 97] = true;
            }
        }
        for (int i = 0; i < upper.length; i++) {
            if (upper[i] != lower[i]) {
                return false;
            }
        }
        return true;
    }

//    static public int solution(String S) {
//        // write your code in Java SE 8
//        int result = -1;
//        int[] upper = new int[26];
//        int[] lower = new int[26];
////97 ~ 122
//// 65 ~ 90
//        for (int i = 0; i < S.length(); i++) {
//            int charNum = S.charAt(i);
//            if (charNum >= 65 && charNum <= 90) {
//                upper[charNum - 65] = 1;
//            } else {
//                lower[charNum - 97] = 1;
//            }
//        }
//
//        for (int i = 0; i < upper.length; i++) {
//            if (upper[i] == 1) {
//
//            }
//        }
//
//        return result;
//    }

























    static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n - 1;) {
            if (i < m - 1 && B[i] < A[k])
                i += 1; else if (k < n - 1 && B[i] > A[k]) k += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }


//    static int solution(int[] A, int[] B) {
//        int n = A.length;
//        int m = B.length;;
//        Arrays.sort(A);
//        Arrays.sort(B);
//        int i = 0; int k = 0;
//        while (i < m && k < n) {
//            if (B[i] < A[k])
//                i += 1; else k += 1;
//            if (k < n && i < m && A[k] == B[i])
//                return A[k];
//        }
//        return -1;
//    }

//    static public int[] solution(int[] A, int K) {
//        // write your code in Java SE 8
//        if (A == null || A.length == 0) {
//            return new int[0];
//        }
//
//        K =  K % A.length;
//        if (K == 0) return A;
//
//        int[] result = new int[A.length];
//
//        for(int i = 0; i < A.length; i++) {
//            if (i + K >= A.length) {
//                result[i + K - A.length] = A[i];
//            } else {
//                result[i + K] = A[i];
//            }
//
//        }
//
//        return result;
//    }

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

//    static public int solution(int X, int Y, int D) {
//        if (Y - X == 0) return 0;
//
//        int midValue = (Y - X) / D;
//        if ((Y - X) % D != 0) midValue += 1;
//
//        return midValue;
//    }
//
//    static public int solution(int X, int[] A) {
//        // write your code in Java SE 8
//        int r = -1;
//        int[] result = new int[X];
//
//        for (int i = 0; i < A.length; i++) {
//            if (result[A[i] - 1] == 0) result[A[i] -1] = i+1;
//        }
//
//        for (int temp: result) {
//            if (temp == 0) return -1;
//
//            if (r < temp) r = temp;
//        }
//
//        return r-1;
//    }
}






//        -- write your code in PostgreSQL 9.4
//        SELECT p.id, p.title, COALESCE(sum(r.number_of_tickets), 0) as reserved_tickets
//        from plays as p
//        left join reservations as r
//        on p.id = r.play_id
//        group by p.id, p.title
//        order by reserved_tickets desc, p.id asc;

//import java.util.*;
//
//        class Solution {
//            int solution(int[] A, int[] B) {
//                int n = A.length;
//                int m = B.length;;
//                Arrays.sort(A);
//                Arrays.sort(B);
//                int i = 0;
//                for (int k = 0; k < n - 1;) {
//                    if (i < m - 1 && B[i] < A[k])
//                        i += 1; else if (k < n - 1 && B[i] > A[k]) k += 1;
//                    if (A[k] == B[i])
//                        return A[k];
//                }
//                return -1;
//            }
//        }
//




//        int [] a = {1,2,3,4,5};
//        int [] result = solution(null, 0);
//
//        for (int item: result) {
//            System.out.println(item);
//        }
//        int [] b = {1, 3, 1, 4, 2, 3, 5, 4};
//        System.out.println(solution(20, 50, 20));
//        System.out.println(solution(5, b));
