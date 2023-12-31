package com.example.limit.micro.bean;

public class Limit {


    private int min;
    private int max;

    public Limit(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }



    @Override
    public String toString() {
        return "Limit{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
