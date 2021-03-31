/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.mycput.adpgroupassementproject;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author MICHEL MUEMBO ILUNGA
 * student number 218303335
 * This class calculate the area of a triangle
 */
public class TriangleArea {
    
    private static int numberOfside = 3;
    private double base;
    private double height;
    private double LenSideOne;
    private double LenSideTwo;
    private double LenSideThree;

    
    // setters

    public static void setNumberOfside(int numberOfside) {
        TriangleArea.numberOfside = numberOfside;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLenSideOne(double LenSideOne) {
        this.LenSideOne = LenSideOne;
    }

    public void setLenSideTwo(double LenSideTwo) {
        this.LenSideTwo = LenSideTwo;
    }

    public void setLenSideThree(double LenSideThree) {
        this.LenSideThree = LenSideThree;
    }

  
    
    // getters

    public static int getNumberOfside() {
        return numberOfside;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getLenSideOne() {
        return LenSideOne;
    }

    public double getLenSideTwo() {
        return LenSideTwo;
    }

    public double getLenSideThree() {
        return LenSideThree;
    }

    public static String getResponse() {
        return "Welcome to TDD With Junit 5";
    }
    
   
    
    // calculate area method
    public double findarea(){
        
        return (this.base * this.height)/2;
        
    }
    
    // calculate sides
    
    public double SideCalc(){
        return (this.LenSideOne + this.LenSideTwo + this.LenSideThree);
    }
   
   
    // to string method
    
       @Override
    public String toString() {
        return "TriangleArea{" + "base=" + base + ", height=" + height + ", LenSideOne=" + LenSideOne + ", LenSideTwo=" + LenSideTwo + ", LenSideThree=" + LenSideThree +'}';
    }
    
}
