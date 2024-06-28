package org.example;

    public class Main {
        public static void main(String[] args) {
            String original = "Hello, World!";
            String reversed = reverse(original);
            System.out.println(reversed);
        }

        public static String reverse(String str) {
            if (str.isEmpty()) {
                return str;
            }
            return reverse(str.substring(1)) + str.charAt(0);
        }
    }
