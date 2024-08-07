package com.example;

public class Main {
    public static void main(String[] args) {
        int n = 6;
        System.out.println("Iterative: " + FibonacciIterative.fibonacci(n));
        System.out.println("Recursive: " + FibonacciRecursive.fibonacci(n));
        System.out.println("DP: " + FibonacciDP.fibonacci(n));
    }
}
