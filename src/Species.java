/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KostasA
 */

import java.util.*;

public class Species {
    private String name;
    private int population;
    private double growthRate;
    
    public Species() {
        name = null;
        population = 0;
        growthRate = 0;
    }
    
    public Species (String initialName, int initialPopulation, double initialGrowthRate) {
        name = initialName;
        if (initialPopulation >= 0)
            population = initialPopulation;
        else
        {
            System.out.println("ERROR: Negative population.");
            System.exit(0);
        }
        growthRate = initialGrowthRate;
    }
    
    @Override
    public String toString()
    {
        return ("Name = " + name + "\n" + "Population = " + population + "\n" + "Growth rate = " + growthRate +"%");
    }
    
}
