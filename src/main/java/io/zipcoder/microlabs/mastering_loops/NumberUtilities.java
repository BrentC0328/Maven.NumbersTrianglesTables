package io.zipcoder.microlabs.mastering_loops;


public class NumberUtilities {

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static String getEvenNumbers(int start, int stop) {
        String numbers = "";

        for(int i = start; i <+ stop; i++){
            Integer tempNumber = i;
            if(isEven(i)){
                numbers = numbers + tempNumber;
            }
        }

        return numbers;
    }


    public static String getOddNumbers(int start, int stop) {
        String numbers = "";

        for(int i = start; i < stop; i++){
            Integer tempNumber = i;
            if(!isEven(i)){
                numbers += tempNumber;
            }
        }

        return numbers;

    }


    public static String getSquareNumbers(int start, int stop, int step) {
      return getExponentiations(start, stop, step, 2);
    }

    public static String getRange(int start) {
        return getExponentiations(0, start, 1, 1);
    }

    public static String getRange(int start, int stop) {
        return getExponentiations(start, stop, 1, 1);
    }


    public static String getRange(int start, int stop, int step) {
        return getExponentiations(start, stop, step, 1);
    }

    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String exponents = "";

        for (int i = start; i < stop; i += step){
            int exponentHolder = 1;

            for(int j = 1; j <= exponent; j++){
                exponentHolder *= i;
            }
            exponents += exponentHolder;
        }

        return exponents;
    }
}
