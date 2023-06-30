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
        String squaredNumbers = "";

        for (int i = start; i < stop; i += step){
            squaredNumbers += (i * i);

        }


        return squaredNumbers;
    }

    public static String getRange(int start) {
        return getRange(0, start, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String range = "";
        for (int i = start; i < stop; i += step){
            range += i;
        }
        return range;
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
