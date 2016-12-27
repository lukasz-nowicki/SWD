package com.company;

import java.util.ArrayList;

/**
 * Created by Newuser on 2016-12-27.
 */
public class Population {

    private ArrayList<String> population = new ArrayList<String>();

    //Funkcja tworzy geny tyle ile podajemy podczas form
    public void makePopulation(int pop_size){
        GeneticAlorithm gen = new GeneticAlorithm();
        System.out.println("POP SIZE "+pop_size);
        for(int i=0;i<pop_size;i++){
            population.add(gen.makeGene(pop_size));
        }
    }
    public ArrayList<String> getPopulation() {
        return population;
    }

    public void setPopulation(ArrayList<String> population) {
        this.population = population;
    }
}
