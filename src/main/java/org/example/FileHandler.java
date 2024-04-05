package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("src/11_noegletal_pr_region_pr_aldersgruppe.csv");

    public ArrayList<Covid19Data> loadAllDatas(){
        ArrayList<Covid19Data> datas = new ArrayList<>();
        Scanner sc = null;
        try {
            sc = new Scanner(file, StandardCharsets.UTF_8);
            sc.nextLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Covid19Data data = null;
        while (sc.hasNext()){
            String line = sc.nextLine();
            String[] attributes = line.split(";");
            data = new Covid19Data(
                ((attributes[0])), //region
                        attributes[1], //aldersgruppe
                        Integer.parseInt(attributes[2]), //bekræftede tilfælde i alt
                        Integer.parseInt(attributes[3]), //døde
                        Integer.parseInt(attributes[4]), //indlagte på intensiv
                        Integer.parseInt(attributes[5]), //indlagte
                        attributes[6] //dato
            );
            datas.add(data);

            }
        sc.close();
        return datas;
        }


}
