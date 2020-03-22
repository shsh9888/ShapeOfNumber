package com.example.shapeofnumber;

public class NumberShape {

    private int myNumber;

    public NumberShape(int num) {
        this.myNumber = num;
    }

    public double getMyNumber() {
        return myNumber;
    }

    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

    public boolean isTriangularNumber() {
        int sum =0;
        for (int i=1 ; i< this.myNumber; i++ ) {
            sum = sum +i;
            if (sum == this.myNumber) {
                return true;
            }
        }
        return false;
    }


    public boolean isSquareNumber() {
        for (int i=1 ; i <= Math.sqrt(this.myNumber); i++ ) {

            if (i * i == this.myNumber) {
                return true;
            }
        }
        return false;
    }
}
