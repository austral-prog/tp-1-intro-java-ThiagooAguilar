package com.template;

public class App {

    // 1. Sum of Two Integers
    public int sum(int a, int b) {
        int value = a + b;
        return value;
    }


    // 2. Check Even or Odd
    public boolean isEven(int a) {
        boolean even = false;
        if (a % 2 == 0) {
            even = true;
        }
        return even;
    }




    // 3. Maximum of Two Numbers
    public int max(int a,int b) {
            int biggest = 0;
            if (a > b) {
                biggest = a;
            }else if (a < b) {
                biggest = b;
            }
            return biggest;
        }


    // 4. Factorial of a Number
    public int factorial(int n) {
        int answer = 1;
        if (n == 0) {
            answer = 1;
        }else if (n != 0) {
        while (n > 1) {
            answer *= n;
            n=n-1;


            }
        }
        return answer;
    }

    // 5. Count Characters in a String
    public int countChars(String input) {
        int count = 0;
        count = input.length();
            return count;
    }
    // 6. Reverse a String
    public String reverse(String input) {
        String reverseString = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            reverseString = reverseString + input.charAt(i);
        }
        return reverseString;
    }

    // 7. Check Prime Number
    public boolean isPrime(int number) {
        boolean prime = true;
        for(int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    // 8. Find the Smallest Element in an Array
    public int findMin(int[] array) {
       int index= array.length;
       int min = array[0];
       for (int i = 1; i < index; i++) {
           if (array[i] < min) {
               min = array[i];
           }else if (array[i] == min) {
               min = array[i];
           }else if (array[i] > min) {
               min = min;
           }
       }
        return min;
    }

    // 9. Sum of Elements in an Array
    public int arraySum(int[] array) {
        int index= array.length;
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += array[i];
        }
        return sum;
    }

    // 10. Convert Celsius to Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        double degree_farenheit = (celsius * 9/5) + 32;
        return degree_farenheit;
    }
}
