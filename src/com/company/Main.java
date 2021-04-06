package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        int[][] test = {{1, 0, 3, 2}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
        graph.depthMethod(test);
    }
}
