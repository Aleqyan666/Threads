package org.example;

import java.util.function.BiFunction;

public class Concatenation {



        public String concatenate(Double string1, Double string2){
            BiFunction<Double, Double, String> concatenate = (str1, str2) -> "" + str1 + str2;


            String result = concatenate.apply(string1, string2);

            System.out.println("\nConcatenated string: " + result);

            return result;
        }


}
