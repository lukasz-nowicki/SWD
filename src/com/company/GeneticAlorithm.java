package com.company;

import java.util.ArrayList;

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
    public String makeGene(int pop_size){
        System.out.println("W gen sieze: "+pop_size);
        char chromosome;
        int number_of_items = pop_size;
        //Pentla generująca geny
        for (int i=0; i<number_of_items;i++){
            chromosome='0';
            double randomValue = Math.random();
            if(randomValue>0.5){
                chromosome='1';
            }
            gen.append(chromosome);
        }
        System.out.println("Zwracam "+gen.toString());
        return gen.toString();
    }

    //Funkcja która tworzy mutacje źródło: WIKI
    public void mutateGen(){

    }
}
