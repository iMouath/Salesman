package com.mouath.salesman;

import java.util.LinkedList;


public class Graph {
    private LinkedList<City> cities;
    private LinkedList<GraphEdge> edges;

    public Graph()
    {
        cities = null;
        edges = null;
    }

    public LinkedList<City> getCities()
    {
        return cities;
    }
    public LinkedList<GraphEdge> getEdges()
    {
        return edges;
    }
    public void addCity(String name)
    {
        cities.add(new City(name));
    }
}
