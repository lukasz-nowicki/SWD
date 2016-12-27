package com.company;

/**
 * Created by Newuser on 2016-12-27.
 */

// Główny algorytm
public class GeneticAlorithm {

    private double prob_crossover = 0;
    private double prob_mutation = 0;
    InitializeProgram init = new InitializeProgram();
    StringBuilder gen = new StringBuilder(init.getNumber_of_items());


    // Funkcja zwraca gen
    private String makeGene(){
        char chromosome;
        int number_of_items = init.getNumber_of_items();
        //Pentla generująca geny
        for (int i=0; i<number_of_items;i++){
            chromosome='0';
            double randomValue = Math.random();
            if(randomValue>0.5){
                chromosome='1';
            }
            gen.append(chromosome);
        }
        return gen.toString();
    }

}
