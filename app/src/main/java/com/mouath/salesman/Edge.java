package com.mouath.salesman;


public class Edge {
    private double weight;
    private City destination;

    public Edge(double weight, City destination)
    {
        this.weight = weight;
        this.destination = destination;
    }

    public double getWeight()
    {
        return weight;
    }
    public City getCity()
    {
        return destination;
    }
}