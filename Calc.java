package com.mirea;

public class Calc {
    public int sum(int a,int b){
     return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int dividend,int divider)throws ArithmeticException{
        if(divider==0)throw new ArithmeticException("Null Divider");
        return dividend/divider;
    }
    public double sum(double a,double b){
        return a+b;
    }
    public double sub(double a,double b){
        return a-b;
    }
    public double mul(double a,double b){
        return a*b;
    }
    public double div(double dividend,double divider)throws ArithmeticException{
        if(divider==0.0)throw new ArithmeticException("Null Divider");
        return roundResult(dividend/divider,5);
    }
    public double roundResult(double d,int precise) {
        d = d*Math.pow(10,precise);
        int i = (int) d;
        return (double) i/Math.pow(10,precise);
    }
}
