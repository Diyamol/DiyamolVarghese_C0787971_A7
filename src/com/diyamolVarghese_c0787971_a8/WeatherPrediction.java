package com.diyamolVarghese_c0787971_a8;

import javax.swing.JOptionPane;

public class WeatherPrediction {
    public static void main(String[] args){
        FeelLikeCalculator calc=new FeelLikeCalculator();
        String day;
        int temp,feelsLike;
        int windSpeed;
        JOptionPane.showMessageDialog(null,"Welcome to Weather Prediction Toronto");
        day=JOptionPane.showInputDialog("Enter the day: ");
        temp=Integer.parseInt(JOptionPane.showInputDialog("Enter today's temperature: "));
        windSpeed=Integer.parseInt(JOptionPane.showInputDialog("Enter the wind speed"));
        feelsLike=calc.calculateFeelsLikeTemp(day,windSpeed,temp);
        //showResult(day,temp,windSpeed,feelsLike);
        if(feelsLike<1000){
            showResult(day,temp,windSpeed,feelsLike);
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter a valid day");
        }
    }

    public static void showResult(String day,int temp,int windSpeed,int feelsLike) {
        StringBuilder myString= new StringBuilder();
        myString.append("Weather prediction for "+day);
        myString.append("\nWind Speed : "+windSpeed+" mph");
        myString.append("\nTemperature : "+temp+" Celsius");
        myString.append("\nFeels Like Temperature : "+feelsLike);
        JOptionPane.showMessageDialog(null,myString);
    }
}
