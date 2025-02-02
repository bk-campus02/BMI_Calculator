package org.fhcampus02.at;

public class BMICalculator {

    private String firstname;
    private String lastname;
    private int bodyHeight;
    private double bodyWeight;
    private char gender;


    // Constructor
    public BMICalculator(String firstname, String lastname, int bodyHeight, double bodyWeight, char gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
        this.gender = gender;
    }


    // Getter
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public char getGender() {
        return gender;
    }

    // Setter
    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }


    public double calculateBMI() {
        double heightInMeters = (double) bodyHeight / 100;
        double bmi = bodyWeight / (heightInMeters * heightInMeters);
        double round = Math.round(bmi * 100.0) / 100.0;
        return round;
    }

    public int calculateBMICategory() {
        int BMIcategory;
        double bmi = calculateBMI();

        if (gender == 'm') {
            if (bmi < 16.0) return -2;
            else if (bmi < 18.5) return -1;
            else if (bmi < 25.0) return 0;
            else if (bmi < 35.0) return 1;
            else return 2;
        } else if (gender == 'w') {
            if (bmi < 15.0) return -2;
            else if (bmi < 17.5) return -1;
            else if (bmi < 24.0) return 0;
            else if (bmi < 34.0) return 1;
            else return 2;
        }
        return 0; // Default case (shouldn't occur)

    }


    public String getBMICategoryName() {
        int category = calculateBMICategory();

        return switch (category) {
            case -2 -> "Sehr starkes Untergewicht";
            case -1 -> "Untergewicht";
            case 0 -> "Normalgewicht";
            case 1 -> "Übergewicht";
            case 2 -> "Sehr starkes Übergewicht";
            default -> "Unbekannte Kategorie";
        };
    }

}
