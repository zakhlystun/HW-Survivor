package ru.netology.services;

public class IncomeToSurviveService {
    public int calculate(int income, int expenses, int threshold){
        int actualBalance = 0;
        int monthCounter = 0;
        for (int i = 0; i < 12; i++) {
            if (actualBalance >= threshold) {
                actualBalance -= expenses;
                actualBalance /= 3;
                monthCounter++;
            } else {
                actualBalance += income;
                actualBalance -= expenses;
            }
        }
        return monthCounter;
    }

}
