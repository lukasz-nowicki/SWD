package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello GITHUB and SWD");
        InitializeProgram initialize = new InitializeProgram();
        Population popu = new Population();
        initialize.getInput();
        double which_gene = Math.random() * 100;
        System.out.println(which_gene);
        popu.makePopulation(initialize.getPopulation_size());
        System.out.println(popu.getPopulation().toString());

    }
}
