package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "Afara este vreme buna";
        char[] chars = name.toCharArray();
        int i = 0;

        for (i = 0; i<name.length(); i++) {
            if (chars[i] == ' ') {
                System.out.println("");
            } else {
                System.out.println(chars[i]);

            }
        }
    }
}