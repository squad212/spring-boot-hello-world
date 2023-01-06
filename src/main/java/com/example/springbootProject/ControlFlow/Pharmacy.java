package com.example.springbootProject.ControlFlow;

public class Pharmacy {
    private String firstMedicine = "Ibrobrufin";
    private String secondMedicine = "Advil";

    public int getMedicinePrice(String name) {
        if (firstMedicine == name) {
            return 20;
        } else if (secondMedicine ==name) {
            return 40;
        } else {
            return 0;
        }
    }

    public int totalPrice(int firstMed, int secondMed) {
        int result = firstMed + secondMed;
        return result;
    }


    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        int firstMed = pharmacy.getMedicinePrice("Ibrobrufin");
        int secondMed = pharmacy.getMedicinePrice("Advil");
        int totalAmount = pharmacy.totalPrice(firstMed,secondMed);
        System.out.println(totalAmount);

    }
}
