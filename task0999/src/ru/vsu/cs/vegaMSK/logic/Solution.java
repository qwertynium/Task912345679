package ru.vsu.cs.vegaMSK.logic;

import java.util.ArrayList;
import java.util.List;

//4 пп
public class Solution {
    public static List<Integer> cod (List<Integer> list1){
        List<Integer> list = new ArrayList();
        int colvo = 0;
        double max = 0;
        for(int i = 0; i < list1.size(); i++){
            colvo = 0;
            for(int j = i; j < list1.size(); j++){
                if(list1.get(i) == list1.get(j)){
                    colvo++;
                }
            }
            if(colvo > max ){
                list.clear();
                max = colvo;
                list.add(list1.get(i));
            }else  if(colvo == max){
                list.add(list1.get(i));
            }

        }for(int c = 0; c < list.size(); c++){
            System.out.println(list.get(c));}
        return list;
    }


}