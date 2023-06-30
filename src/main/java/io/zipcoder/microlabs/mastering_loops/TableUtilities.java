package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = " ";

        for (int i = 1; i <= tableSize; i++) {

            for (int j = 1; j <= tableSize; j++) {
                int temp = i * j;
                if( temp == 1){
                    result += " " + temp + " |";
                }
                else if (temp < 10) {
                    result += "  " + temp + " |";
                } else if (temp >= 10 && temp < 100) {
                    result += " " +temp + " |";
                } else {
                    result += temp + " |";
                }
            }


                result += "\n";

        }
        return result;
    }
}