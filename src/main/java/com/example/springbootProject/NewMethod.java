package com.example.springbootProject;

public class NewMethod {
    public static void main(String[] args) {
       // getPersonDetails("Saroj", "Khatri");
        String personCharacter = getPersonDetails("Saroj",
        " khatri");
        System.out.println(personCharacter);

    }

    public static String getPersonDetails(String firstName, String lastName) {
        //System.out.println(firstName + " " + lastName + " is a good boy. ");
        return firstName + " " + lastName + " is a good boy.";
    }
}
