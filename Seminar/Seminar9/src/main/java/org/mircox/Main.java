package org.mircox;

import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        int sumOddNumbers = sumOddNumbers(numbers);
        System.out.println("Sum of odd numbers in array is: " + sumOddNumbers);

        int productSquaredNumbers = productSquaredNumbers(numbers);
        System.out.println("Product of squared numbers in array is: " + productSquaredNumbers);

        List<Integer> perfectNumbers = List.of(6, 28, 496, 8128, 33550336);
        int maxPerfectNumber = maxPerfectNumber(perfectNumbers);
        System.out.println("Max perfect number in array is: " + maxPerfectNumber);

        List<Pair<Student, Integer>> studentGrades = List.of(
                new Pair<>(new Student("Bob", "UBB"), 9),
                new Pair<>(new Student("Dob", "UBB"), 10),
                new Pair<>(new Student("Zob", "UBB"), 8),
                new Pair<>(new Student("Rob", "UBB"), 7)
        );

        System.out.println("Students with best grades are: " + studentMaxGrade(studentGrades));

    }

    public static List<Student> studentMaxGrade(List<Pair<Student, Integer>> studentGrades) {
        int maxGrade = studentGrades.
                stream()
                .map(Pair::getSecond)
                .max(Integer::compareTo)
                .orElse(-1);

        return studentGrades
                .stream()
                .filter(entry -> entry.getSecond() == maxGrade)
                .map(Pair::getFirst)
                .toList();
//        return studentGrades
//                .stream()
//                .filter(studentGrade -> Objects.equals(studentGrade
//                        .getSecond(), studentGrades
//                        .stream()
//                        .map(Pair::getSecond)
//                        .max(Integer::compareTo)
//                        .orElse(-1)))
//                .map(Pair::getFirst)
//                .toList();
    }

    public static int sumOddNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 != 0)
//                .mapToInt(Integer::intValue)
                .mapToInt(n -> Integer.valueOf(n))
                .sum();
    }

    public static int productSquaredNumbers(List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(n -> n * n)
                .reduce(1, (a, b) -> a * b);
    }

    public static int maxPerfectNumber(List<Integer> numbers) {
        return numbers.stream()
//                .filter(Main::isPerfectNumber)
                .filter(num -> (num == IntStream
                        .rangeClosed(1, num / 2)
                        .filter(div -> num % div == 0)
                        .sum()))
                .max(Integer::compareTo)
                .orElse(-1);
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }

}