package org.example;

public class LoopCount {

    int girth = 100;
    int densityWidth = 2;
    int densityHeight = 4;
    int startLoopAmount = girth * densityWidth;
    double densityHeightInRow = densityHeight / 2.0;

    int boundDensityHeight = 4;

    public double countBoundLoopAmount() {
        double bound = (startLoopAmount / 2.0) * 3.0;
        double boundLoopAmount = startLoopAmount * boundDensityHeight;
        double countBoundLoopAmount;
        countBoundLoopAmount = bound + boundLoopAmount;
        return countBoundLoopAmount;
    }

    public double countBodyLoopAmount() {
        while (countBoundLoopAmount() < densityHeight * 22) {
        if (countBoundLoopAmount() < densityHeight * 22) {}
        else {
            break;
        }
    }
//        for (int i = startLoopAmount; i < densityHeight * 22; i += densityHeight) {
//            ;
//        }
        return countBoundLoopAmount();
    }

    public int countFrontPartLoopAmount() {
        int startFrontPartLoopAmount = (startLoopAmount / 2) + 1;
        int sideLoopRetraction = 5 * 2;
        int midLoopRetraction = sideLoopRetraction + 7 * 2;
        int endFrontPartLoopAmount = startFrontPartLoopAmount - midLoopRetraction - sideLoopRetraction;

////        for (int i = startFrontPartLoopAmount; i <= endFrontPartLoopAmount; i + densityHeightInRow) {
////            for (int j = 0; j <; j + densityHeightInRow) {
//
//            }

        }
    
    }
    
