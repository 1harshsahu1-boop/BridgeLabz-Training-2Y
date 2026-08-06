package com.arrays.basicProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SecondMinElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Second Minimum:"+arr[1]);
        System.out.println("Second Maximum:"+arr[arr.length-2]);
    }
}

