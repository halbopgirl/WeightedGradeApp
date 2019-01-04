package weightedgradeapp;

public class CalcGrade {
private static double grade;
private static double weight;
private static double totalWeight = 0;
private static double weightedGrade = 0;

public static void evaluate(double newGrade, double newWeight) {
grade = newGrade;
weight = newWeight;
totalWeight += weight;
weightedGrade += ((weight/100)*grade);
}//end addGradeValue

public static String calculate() {
if (totalWeight == 100.0) {
return "Your overall weighted grade is: " + weightedGrade;
} else {
return "So far you have " + weightedGrade + " of " + totalWeight + " possible points.";
}//end if else
}//end evaluate

}//end class