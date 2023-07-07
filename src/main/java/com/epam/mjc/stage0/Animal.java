package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        if (numberOfPaws == 1) {
            if (hasFur) return String.format("This animal is mostly %s. It has %d paw and a fur.", color, numberOfPaws);
            else return String.format("This animal is mostly %s. It has %d paw and no fur.", color, numberOfPaws);
        } else {
            if (hasFur) return String.format("This animal is mostly %s. It has %d paws and a fur.", color, numberOfPaws);
            else return String.format("This animal is mostly %s. It has %d paws and no fur.", color, numberOfPaws);
        }
    }
}
