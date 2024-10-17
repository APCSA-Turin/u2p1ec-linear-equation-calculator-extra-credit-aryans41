package com.example.project;
public class Main { 
    public static void main(String[] args) {
        LinearCalculator c = new LinearCalculator("(3,4)","(3,-4)");
        String expectedOutput = "The midpoint of this line is: (3.0,0.0)";
        String studentOutput = c.Midpoint();
        System.out.println(studentOutput);
    }
}