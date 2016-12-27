package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Newuser on 2016-12-27.
 */
public class InitializeProgram {

    private double prob_crossover = 0;
    private double prob_mutation = 0;
    private double knapsack_capacity = 0;
    private int population_size = 0;
    private int number_of_items = 0;
    private int maximum_generations = 0;
    private ArrayList<Double> value_of_items = new ArrayList<Double>();
    private ArrayList<Double> weight_of_items = new ArrayList<Double>();

    public void getInput() {
        
        String input="";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Podajemy tutaj wartość ile elementów będziemy tworzyć
        System.out.println("Enter the number of items: ");
        try {
            input=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (isInteger(input)) {
            number_of_items = Integer.parseInt(input);
        }
        else {
            System.out.println("Not a number. Please try again.");
            System.exit(1);
        }

        // Podawanie ceny oraz wartości
        for(int i = 0; i < number_of_items; i++) {
            System.out.println("Enter price of item: " + (i + 1) + ": ");
            try {
                input=br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (isDouble(input)) {
                value_of_items.add(Double.parseDouble(input));
            }
            else {
                System.out.println("Not a number. Please try again.");
                System.exit(1);
            }

            System.out.println("Enter the width of item: " + (i + 1) + ": ");
            try {
                input=br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (isDouble(input)) {
                weight_of_items.add(Double.parseDouble(input));
            }
            else {
                System.out.println("Not a number. Please try again.");
                System.exit(1);
            }
        }

        // Określenie wielkości magazynu
        System.out.println("Enter the knapsack capacity: ");
        try {
            input=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (isInteger(input)) {
            knapsack_capacity = Integer.parseInt(input);
        }
        else {
            System.out.println("Not a number. Please try again.");
            System.exit(1);
        }

        // Określenie population size
        System.out.println("Enter the population size: ");
        try {
            input=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (isInteger(input)) {
            population_size = Integer.parseInt(input);
        }
        else {
            System.out.println("Not a number. Please try again.");
            System.exit(1);
        }

        // Określenie max iteracji
        System.out.println("Enter the maximum number of generations: ");
        try {
            input=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (isInteger(input)) {
            maximum_generations = Integer.parseInt(input);
        }
        else {
            System.out.println("Not a number. Please try again.");
            System.exit(1);
        }

        // Określenie Crossover prob
        System.out.println("Enter the crossover probability: ");
        try {
            input=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (isDouble(input)) {
            prob_crossover = Double.parseDouble(input);
        }
        else {
            System.out.println("Not a number. Please try again.");
            System.exit(1);
        }

        // Określenie Mutation probability
        System.out.println("Enter the mutation probability: ");
        try {
            input=br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (isDouble(input)) {
            prob_mutation = Double.parseDouble(input);
        }
        else {
            System.out.println("Not a number. Please try again.");
            System.exit(1);
        }

    }

    // Metoda sprawdza czy wartość jest double ( Używana przy podawaniu prob)
    private boolean isDouble(String input) {
        try {
            Double.parseDouble(input);
        }
        catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    // Metoda sprawdza czy podana wartość jest integerem jeżeli nie to przerywamy
    private boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            return false;
        }
        return true;
    }
    public double getProb_crossover() {
        return prob_crossover;
    }

    public void setProb_crossover(double prob_crossover) {
        this.prob_crossover = prob_crossover;
    }

    public double getProb_mutation() {
        return prob_mutation;
    }

    public void setProb_mutation(double prob_mutation) {
        this.prob_mutation = prob_mutation;
    }

    public double getKnapsack_capacity() {
        return knapsack_capacity;
    }

    public void setKnapsack_capacity(double knapsack_capacity) {
        this.knapsack_capacity = knapsack_capacity;
    }

    public int getPopulation_size() {
        return population_size;
    }

    public void setPopulation_size(int population_size) {
        this.population_size = population_size;
    }

    public int getNumber_of_items() {
        return number_of_items;
    }

    public void setNumber_of_items(int number_of_items) {
        this.number_of_items = number_of_items;
    }

    public int getMaximum_generations() {
        return maximum_generations;
    }

    public void setMaximum_generations(int maximum_generations) {
        this.maximum_generations = maximum_generations;
    }

    public ArrayList<Double> getValue_of_items() {
        return value_of_items;
    }

    public void setValue_of_items(ArrayList<Double> value_of_items) {
        this.value_of_items = value_of_items;
    }

    public ArrayList<Double> getWeight_of_items() {
        return weight_of_items;
    }

    public void setWeight_of_items(ArrayList<Double> weight_of_items) {
        this.weight_of_items = weight_of_items;
    }


}
