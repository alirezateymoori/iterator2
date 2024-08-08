package com.demisco;

import java.util.ArrayList;
import java.util.List;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        for(String s:list){
            if(s.equals("A")){
                list.remove(s);
            }
        }

    }
}