
package za.ac.mycput.adpgroupassementproject;

/**
 *
 * @author Lonwabo Mshudulu (215181689)
 */
public class RectangleArea {
    
    private static int numberOfside = 4;
    private double length;
    private double width;
    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double sideFour;
    
    //setters

    public static void setNumberOfside(int numberOfside) {
        RectangleArea.numberOfside = numberOfside;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public void setSideFour(double sideFour) {
        this.sideFour = sideFour;
    }
    
    //getters
    
    public static int getNumberOfside() {
        return numberOfside;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public double getSideFour() {
        return sideFour;
    }
    
    public static String getResponse() {
        return "ADP is cool! Java is Nice!";
    }
    
    // calculate rectangle area
    public double rectangleArea() {
        return this.length * this.width;
    }
    
    // calculate sides
    public double calculateSides() {
        return (this.sideOne + this.sideTwo + this.sideThree + this.sideFour);
    }
    
    //toString method

    @Override
    public String toString() {
        return "RectangleArea{" + "length=" + length + ", width=" + width + ", sideOne=" + sideOne + ", sideTwo=" + sideTwo + ", sideThree=" + sideThree + ", sideFour=" + sideFour + '}';
    }
    
}
