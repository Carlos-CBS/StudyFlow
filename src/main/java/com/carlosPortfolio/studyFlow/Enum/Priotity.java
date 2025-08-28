package com.carlosPortfolio.studyFlow.Enum;

public enum Priotity {
    LOW(30),
    MEDIUM(60),
    HIGH(90);

    private int value;
    Priotity(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
