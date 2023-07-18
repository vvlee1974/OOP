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

    public void setRealPart(Double realPart) {
        this.realPart = realPart;
    }

    public Double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(Double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
}
