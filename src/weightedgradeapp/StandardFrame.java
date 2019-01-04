/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightedgradeapp;

import javax.swing.*;

public class StandardFrame extends JFrame {
static final int WIDTH = 300, HEIGHT = 300;

//constructors for frame of interface
public StandardFrame() {
super("My Application");
setFrame(WIDTH, HEIGHT);
}
public StandardFrame(String boxTitle) {
super(boxTitle);
setFrame(WIDTH, HEIGHT);
}
public StandardFrame(String boxTitle, int width, int height) {
super(boxTitle);
setFrame(width, height);
}
public void display() {
setVisible(true);
}
private void setFrame(int width, int height) {
setSize(width, height);
setLocationRelativeTo(null);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}