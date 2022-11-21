package com.bridgelabz;

import org.junit.jupiter.api.BeforeAll;;
import org.junit.jupiter.api.Test;

public class indiaCensusAnalyserTest {
    @BeforeAll
    public static void print_msg(){
        System.out.println("----Welcome to Census Analyser----");
    }
    CensusAnalyser censusAnalyser;
    @Test
    void given_file_should_return_information() {
        censusAnalyser = new CensusAnalyser();
        censusAnalyser.readData();
    }
}
