package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 4, 2, 3};
        int[] b = {3, 3, 4, 7};
        int[] c = {1};
	    System.out.println(sumFound(a, 5));
	    System.out.println(sumFound(b, 6));
	    System.out.println(sumFound(c, 2));

    }

    public static boolean sumFound(int[] arr, int z) {
        if((arr != null || arr.length >= 2) && isDistinct(arr)) {
            for (int i = 0; i < arr.length-1; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] + arr[j] == z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isDistinct(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }

        }
        return true;
    }
}
