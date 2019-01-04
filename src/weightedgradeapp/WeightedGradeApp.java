/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightedgradeapp;

import java.awt.*;
public class WeightedGradeApp extends StandardFrame {

public WeightedGradeApp() {
super("Calculate Weighted Grade", 500, 220);
add(new GPACalculatorPanel());
}//end constructor

static public void main(String[] args) {
WeightedGradeApp gradeApp = new WeightedGradeApp();
gradeApp.display();
}//end main

}//end class