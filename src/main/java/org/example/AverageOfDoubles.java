package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AverageOfDoubles {


    public Double findAverageOfDoubles(List<Double> list){
        return list.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0);
    }

}
