package com.carlosPortfolio.studyFlow.Enum;

public enum Mood {
    EXCELLENT(5),
    GOOD(4),
    NEUTRAL(3),
    BAD(2),
    TERRIBLE(1);

    private int value;
    Mood(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}

// Used emojis with hover in the UI
//Hover -> “Estresado / Frustrado”
// Emoji -> “Cansado / Desmotivado”
// Emoji -> “Neutral”
// Emoji -> “Motivado / Concentrado”
// Emoji -> “Feliz / Satisfecho”