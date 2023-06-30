package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        String result = "";
        for (int i = 1; i <= numberOfRows; i++){
            result += getRow(i) ;
            if(i != numberOfRows){
                result += "\n";
            }
        }
        return result;
    }

    public static String getRow(int numberOfStars) {
        String result = "";
        for (int i = 0; i < numberOfStars; i++){
            result += "*";
        }
        return result;
    }

    public static String getSmallTriangle() {
        //4
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        //10
        return getTriangle(10);
    }
}
