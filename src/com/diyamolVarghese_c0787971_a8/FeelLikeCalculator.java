package com.diyamolVarghese_c0787971_a8;
import java.util.Arrays;
public class FeelLikeCalculator {
    private static String[] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    public static int calculateFeelsLikeTemp(String day,int windSpeed,int temp){
        int feelsLikeTemp=0;
            if(Arrays.stream(days).anyMatch(t -> t.equals(day))){
                feelsLikeTemp=temp*windSpeed;
            }
            else
            {
                feelsLikeTemp=10000;
            }
        return feelsLikeTemp;
    }
}

