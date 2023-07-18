package org.example.lesson7.finalWork;

public class ComplexNumber {
    private Double realPart;
    private Double imaginaryPart;

    public ComplexNumber(Double realPart, Double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber() {
    }

    public Double getRealPart() {
        return realPart;
    }

    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        if (imaginaryPart > 0) {
            return realPart + " + " + imaginaryPart + "i";
        } else if (imaginaryPart < 0) {
            return realPart + " - " + Math.abs(imaginaryPart)  + "i";
        } else return String.valueOf(realPart);
    }
}
