package com.conceptualapps.myapplication5;

import java.util.Random;

/**
 * Created by chinmayi on 8/11/16.
 */
public class FactBook {
    public String getFacts(){
        String[] facts = {
                "testnew0","testnew1","testnew2","testnew3","testnew4"
        };
        String fact = "";
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);
        fact = facts[randomNumber];
        return fact;
    }
}
