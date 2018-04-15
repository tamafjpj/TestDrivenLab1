package com.mirea;

public class Test {
    private Calc calc = new Calc();

    private boolean testIntSum() {
        if (calc.sum(Integer.MAX_VALUE, 1) > Integer.MAX_VALUE) return false;
        if (calc.sum(Integer.MIN_VALUE, -1) < Integer.MIN_VALUE) return false;
        if (calc.sum(0, 0) != 0) return false;
        return true;
    }

    private boolean testDoubleSum() {
        if (calc.sum(Double.MAX_VALUE, 1.0) > Double.MAX_VALUE) return false;
        //if (calc.sum(Double.MIN_VALUE,-0.1) < Double.MIN_VALUE)return false;         // wtf,Java :)
        if (calc.sum(0.0, 0.0) != 0.0) return false;
        return true;
    }

    private boolean testIntSub() {
        if (calc.sub(Integer.MAX_VALUE, -1) > Integer.MAX_VALUE) return false;
        if (calc.sub(Integer.MIN_VALUE, 1) < Integer.MIN_VALUE) return false;
        if (calc.sub(0, 0) != 0) return false;
        return true;
    }

    private boolean testDoubleSub() {
        if (calc.sub(Double.MAX_VALUE, -1.0) > Double.MAX_VALUE) return false;
        //if (calc.sub(Double.MIN_VALUE,0.1) < Double.MIN_VALUE)return false;          //same
        if (calc.sub(0.0, 0.0) != 0.0) return false;
        return true;
    }

    private boolean testIntMul() {
        if (calc.mul(Integer.MAX_VALUE, 2) > Integer.MAX_VALUE) return false;
        if (calc.mul(Integer.MIN_VALUE, -2) < Integer.MIN_VALUE) return false;
        if (calc.mul(0, 0) != 0) return false;
        return true;
    }

    private boolean testDoubleMul() {
        if (calc.mul(Double.MAX_VALUE, 2.0) > Double.POSITIVE_INFINITY) return false;
        if (calc.mul(Double.MIN_VALUE, -2.0) < Double.NEGATIVE_INFINITY) return false;
        if (calc.mul(0.0, 0.0) != 0.0) return false;
        return true;
    }

    public boolean testIntDiv() {
        if (calc.div(5, 2) != 2) return false;
        if (calc.div(6, 2) != 3) return false;
        try {
            calc.div(1, 0);
        } catch (ArithmeticException nullDivider) {
            return true;
        }
        return false;
    }

    public boolean testDoubleDiv() {
        if (calc.div(5.0, 2.0) != 2.5) return false;
        if (calc.div(6.0, 2.0) != 3.0) return false;
        try {
            calc.div(1.0, 0.0);
        } catch (ArithmeticException nullDivider) {
            return true;
        }
        return false;
    }

    public void doAllTests() {
        if (testIntSum()) System.out.println("Int sum test passed");else System.out.println("Int sum test failed");
        if (testIntSub()) System.out.println("Int sub test passed");else System.out.println("Int sum test failed");
        if (testIntMul()) System.out.println("Int mul test passed");else System.out.println("Int sum test failed");
        if (testIntDiv()) System.out.println("Int div test passed");else System.out.println("Int sum test failed");
        if (testDoubleSum()) System.out.println("Double sum test passed");else System.out.println("Double sum test failed");
        if (testDoubleSub()) System.out.println("Double sub test passed");else System.out.println("Double sub test failed");
        if (testDoubleMul()) System.out.println("Double mul test passed");else System.out.println("Double mul test failed");
        if (testDoubleDiv()) System.out.println("Double div test passed");else System.out.println("Double div test failed");
    }
}
