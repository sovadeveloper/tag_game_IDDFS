package com.company;

import java.awt.*;
import java.util.List;

public class Node {
    private int x;
    private int y;
    private List<Integer> incident;

    public Node() {
    }

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Node(int x, int y, List<Integer> incident) {
        this.x = x;
        this.y = y;
        this.incident = incident;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public List<Integer> getIncident() {
        return incident;
    }

    public void setIncident(List<Integer> incident) {
        this.incident = incident;
    }
}
