package com.andreakim.activecalculator;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by andreakim on 6/14/16.
 */
public class Active {

    List<String> doMath(String choices) {

        List<String> display = new ArrayList<String>();
        if (choices.equals("Addition")) {
            display.add("+ Addition");
        } else if (choices.equals("Subtraction")) {
            display.add("- Subtraction");
        } else if(choices.equals("Multiplication")) {
            display.add("x Multiplication");
        } else if(choices.equals("Division")) {
            display.add("/ Division");
        }
        return display;

    }



}
