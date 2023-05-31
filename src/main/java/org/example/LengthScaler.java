package org.example;

import java.util.ArrayList;
import java.util.List;

public class LengthScaler {


    public List<String> lengthScalerFor5(List<String> list){
        List<String> filteredList = new ArrayList<>();
        list.forEach(str -> {
            if (str.length() > 5) {
                filteredList.add(str);
            }
        });
        return filteredList;
    }

}
