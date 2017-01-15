package com.conceptualapps.myapplication5;

import java.util.Random;

/**
 * Created by chinmayi on 8/11/16.
 */
public class colorWheel {
    public String[] mColors = {
            "#111111","#222222","#666666","#444444","#888888"
    };
    public int getColor(){

        String color = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];
        int colorAsInt = color.hashCode();
        return colorAsInt;
    }
}
