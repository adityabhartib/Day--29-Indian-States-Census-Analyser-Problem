package com.bridgelabz;

import java.io.FileReader;

public class CensusAnalyser {
    public void readData() {
        try {
            FileReader fr=new FileReader("IndiaStateCensusData.csv");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
    } catch (Exception e) {
            System.out.println("Read Successfully ");
        }
    }
}
