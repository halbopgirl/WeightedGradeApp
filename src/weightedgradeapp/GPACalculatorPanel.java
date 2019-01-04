/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightedgradeapp;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GPACalculatorPanel extends JPanel {
//labels
private JLabel gradeLabel = new JLabel("Grade", JLabel.CENTER);
private JLabel weightLabel = new JLabel("Weight (% out of 100)", JLabel.CENTER);
private JLabel weightedGradeLabel = new JLabel("Weighted Grade:", JLabel.CENTER);
//text fields
private JTextField enterGrade = new JTextField("");
private JTextField enterWeight = new JTextField("");
private JTextField weightedGrade = new JTextField("");
//buttons
private JButton addGrade = new JButton("Add Weighted Grade");
private JButton calcGrade = new JButton("Calculate Grade");


//Create Panel
public GPACalculatorPanel() {
setLayout(new BorderLayout());
setBackground(Color.black);

//IO panel
JPanel gradeCalcPanel = new JPanel();
gradeCalcPanel.setLayout(new GridLayout(3, 2, 0, 5));
weightedGrade.setBackground(Color.lightGray);
weightedGrade.setEditable(false);
gradeCalcPanel.add(gradeLabel);
gradeCalcPanel.add(weightLabel);
gradeCalcPanel.add(enterGrade);
gradeCalcPanel.add(enterWeight);
gradeCalcPanel.add(weightedGradeLabel);
gradeCalcPanel.add(weightedGrade);
add(gradeCalcPanel, BorderLayout.CENTER);

//Buttons panel
JPanel buttonsPanel = new JPanel();
buttonsPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
addGrade.setToolTipText("Submit this weighted grade");
calcGrade.setToolTipText("Calculates total weighted grade");
buttonsPanel.add(addGrade);
buttonsPanel.add(calcGrade);
add(buttonsPanel, BorderLayout.SOUTH);

addGrade.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 
setResultLbl("Added");
double getGrade = 0; 
double getWeight = 0; 
try {
getGrade = Double.parseDouble(enterGrade.getText());
getWeight = Double.parseDouble(enterWeight.getText());
} catch (NullPointerException npe) {    
} catch (NumberFormatException nfe) {    
}
CalcGrade.evaluate(getGrade, getWeight); 
enterGrade.setText("");
enterWeight.setText("");
}//end actionPerformed
}//close bracket for ActionListener
);
calcGrade.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent e){ 
setResultLbl("Weighted Grade");
double getGrade = 0; 
double getWeight = 0; 
try {
getGrade = Double.parseDouble(enterGrade.getText());
getWeight = Double.parseDouble(enterWeight.getText());
} catch (NullPointerException npe) {    
} catch (NumberFormatException nfe) {    
}
CalcGrade.evaluate(getGrade, getWeight);
CalcGrade.calculate();
setResultTxt(CalcGrade.calculate());
}//end actionPerformed
}//close bracket for ActionListener
);
}//end GPACalculatorPanel()

double getGrade() {
double getGrade = Double.parseDouble(enterGrade.getText());
return getGrade;
}
double getWeight() {
double getWeight = Double.parseDouble(enterWeight.getText());
return getWeight;
}
void setResultLbl(String label) {
weightedGradeLabel.setText(label);
}
void setResultTxt(String result) {
weightedGrade.setText(result); 
}

}//end GPACalculatorPanel class
