package com.fju;

public abstract class Box {
    int length;
    int width;
    int height;

    public boolean validate(int a, int b, int c) {
        return (a <= length && b <= width && c <= height);
    }

    public String getName() {
        return "Box";
    }

    public abstract int getPrice();
}