package com.example.recyclerview1.datas;

import com.example.recyclerview1.R;
import com.example.recyclerview1.models.Food;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FoodData {
    private static String [] foodName = {
            "air force 1",
            "Converse Chuck Taylor 70s",
            "Converse White",
            "Converse Blue Denim",
            "Converse 70s Pink",
            "Converse kuda",
            "Converse kelinci",
    };

    private static String [] foodPrice = {
            "1200000",
            "1500000",
            "1000000",
            "700000",
            "900000",
            "1000000",
            "1000000",
            "1100000"
    };

    private static int [] foodImage = {
            R.drawable.af,
            R.drawable.converse,
            R.drawable.conversse,
            R.drawable.ccn,
            R.drawable.cnvrs,
            R.drawable.cnvrsrs,
            R.drawable.cnvrsrecycle,
            R.drawable.cncncn,
    };

    public static ArrayList<Food> getDataFood() {
        ArrayList<Food> list = new ArrayList<>();
        for(int i=0;i<foodName.length;i++){
            Food food = new Food(foodName[i],"Rp " + foodPrice[i], foodImage[i]);
            list.add(food);
        }
        return list;
    }
}
