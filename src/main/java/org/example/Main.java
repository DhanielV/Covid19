package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        ArrayList<Covid19Data> datas = fh.loadAllDatas();

        for (Covid19Data data : datas) {
            System.out.println(data);

        }
    }
}