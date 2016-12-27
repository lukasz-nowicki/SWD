package com.company;

/**
 * Created by Newuser on 2016-12-27.
 */

// Główny algorytm
public class GeneticAlorithm {

    private double prob_crossover = 0;
    private double prob_mutation = 0;

    // Funkcja zwraca gen
    private String makeGene(){
        InitializeProgram init = new InitializeProgram();
        StringBuilder gen = new StringBuilder(init.getNumber_of_items());
        return "";
    }
}
