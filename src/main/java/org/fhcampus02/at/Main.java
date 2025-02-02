package org.fhcampus02.at;

public class Main {
    public static void main(String[] args) {

        BMICalculator calc = new BMICalculator("B", "Happy", 187, 90, 'w');

        calc.setBodyHeight(170);
        calc.setBodyWeight(70);

        System.out.println();

        System.out.println("Der BMI beträgt: " + calc.calculateBMI());

        System.out.println();

        calc.calculateBMICategory();
        System.out.println("Die Kategorie anhand des BMI ist die folgende: " + calc.calculateBMICategory());

        System.out.println();
        calc.calculateBMICategory();

        System.out.println("Die Kategorie stellt fest: " + calc.getBMICategoryName());

    }
}