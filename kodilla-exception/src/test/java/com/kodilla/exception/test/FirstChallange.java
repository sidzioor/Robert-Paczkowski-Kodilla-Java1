package com.kodilla.exception.test;

class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println(result);
        }catch(ArithmeticException s){
            System.out.println("Oh no! Something went wrong! "+s);
        }finally{
            System.out.println("Remember you can't divide by zero");
        }

    }
}