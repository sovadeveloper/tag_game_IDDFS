package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Graph {
    int n = 4;
    int m = 16;
    int[][] goal = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
    ArrayList<int[][]> open = new ArrayList<>();

    public void depthMethod(int[][] start){
        open.add(start);
        int i = 0;

        while(i < 362880) {
            System.out.println("Шаг: " + (i + 1));
            int[][] before = open.get(i);
            printCurrentArr(before);
            System.out.println();

            checker(leftZeroPosition(before));
            checker(rightZeroPosition(before));
            checker(topZeroPosition(before));
            checker(downZeroPosition(before));
            if(equalsCollection(start)){
                System.out.println("Финиш!");
                break;
            }
            if(open.size() - 1 == i){
                System.out.println("Решений нет");
                break;
            }
            i++;
        }
    }

    private boolean equalsCollection(int[][] start){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                if(start[i][j] == goal[i][j]){
                    return true;
                }
            }
        }
        return false;
    }

    private void checker(int[][] current){
        for(int i = 0; i < open.size(); i++){
            if(Arrays.equals(open.get(i), current)){
                break;
            }else {
                open.add(current);
            }
        }
    }

    private int[][] leftZeroPosition(int[][] current){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(current[i][j] == 0){
                    if(j != 0){
                        int note = current[i][j - 1];
                        current[i][j- 1] = 0;
                        current[i][j] = note;
                        return current;
                    }
                }
            }
        }
        return current;
    }

    private int[][] rightZeroPosition(int[][] current){
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(current[i][j] == 0){
                    if(j != 3){
                        int note = current[i][j + 1];
                        current[i][j + 1] = 0;
                        current[i][j] = note;
                        return current;
                    }
                }
            }
        }
        return current;
    }

    private int[][] topZeroPosition(int[][] current){
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(current[i][j] == 0){
                    if(i != 0){
                        int note = current[i - 1][j];
                        current[i - 1][j] = 0;
                        current[i][j] = note;
                        return current;
                    }
                }
            }
        }
        return current;
    }

    private int[][] downZeroPosition(int[][] current){
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(current[i][j] == 0){
                    if(i != 3){
                        int note = current[i + 1][j];
                        current[i + 1][j] = 0;
                        current[i][j] = note;
                        return current;
                    }
                }
            }
        }
        return current;
    }

    public void printCurrentArr(int[][] current){
        for(int i = 0; i < n; i++){
            System.out.println();
            for(int j = 0; j < n; j++){
                System.out.print(current[i][j]);
                System.out.print(" ");
            }
        }
    }
}
