// Georgian Student Number : 200416930
// Lakehead Student Number : 0877826

import java.util.Scanner;

public class GradeCentre {

    private static float sum; //The sum of all 5 of the grades
    private static float avg = 0; //The float which will be the average of all 5 of the grades
    private static int[] gradeValue = new int[5]; //The int array that will hold the grade values (out of 100)
    private static String[] gradeLetter = new String[5]; //The String array that holds the letter value that corresponds to the imputed grade
    private static String avgLetter; //The String that is used to represent the letter value that goes to the overall average value
    static Scanner scan = new Scanner(System.in); // input scanner

    public static void main(String[]args) { //Im using the main method as one of the 3 main methods
        for(int x=0 ; x<= 4 ; x++) { //The FOR loop that makes the code go through the following until x is greater than 4 (since the count starts at 0)
            //get data from CollectData
            CollectData(x); //gets the data for the CollectData method, when given the value of x
            gradeLetter[x] = Letter(gradeValue[x]); //sets gradeLetter at xth term to the value that is collected from the Letter method when given the gradeValue when at the xth term
            //return and display grades
            System.out.printf("%nGrade: " + gradeValue[x]);
            //display letter grading
            System.out.printf("%nLetter Grading: " + gradeLetter[x] + "%n");
            //make if statement for final average
            if (x == 4) {//An if statement that makes the loop go through the following when x is equal to 4 (the 5th term)
                //calculate the average
                avg = sum / 5; //takes the sum of all 5 grades and then divides it by 5(total number of grades) then assigns the answer as the value for the variable avg
                //Show all results
                System.out.printf("%n--------RESULTS--------"); //Goes through the 5 different marks and prints the info off
                //results 1 (x=0)
                System.out.printf("%nGrade: " + gradeValue[0]);
                System.out.printf("%nLetter Grading: " + gradeLetter[0] + "%n");
                //results 2 (x=1)
                System.out.printf("Grade: " + gradeValue[1]);
                System.out.printf("%nLetter Grading: " + gradeLetter[1] + "%n");
                //results 3 (x=2)
                System.out.printf("Grade: " + gradeValue[2]);
                System.out.printf("%nLetter Grading: " + gradeLetter[2] + "%n");
                //results 4 (x=3)
                System.out.printf("%nGrade: " + gradeValue[3]);
                System.out.printf("%nLetter Grading: " + gradeLetter[3] + "%n");
                //results 5 (x=4)
                System.out.printf("Grade: " + gradeValue[4]);
                System.out.printf("%nLetter Grading: " + gradeLetter[4] + "%n");
                //Total Average
                System.out.printf("%n--------OVERALL--------");
                System.out.printf("%nAverage: " + "%.1f", avg);
                //get grade avg as a letter
                avgLetter = Letter(avg);
                //return average as a letter grading
                System.out.printf("%nAverage Letter Grading: " + avgLetter);
            }
        }
    }
    //Core data method
    public static void CollectData(int y){
            int n = y +1; //Since y starts at 0 and people usually start counting with 1,
            System.out.printf("What is grade #" + n + ": ");
            gradeValue[y] = scan.nextInt(); //gets the inputted grade value to assign to the xth term
            sum = sum + gradeValue[y]; //adds the inputted grade value to the float 'sum'
    }
    //Letter grading method
    public static String Letter(float valueIN){
        String valueOUT; //the string that holds the value that is given back to the main method
            if (valueIN < 50) {  //if the in value is less than 50 it is assigned F
                valueOUT = ("F"); }
            else if (valueIN >= 50 & valueIN < 60) { //the else if statement which assigns the values that meet the criteria as a D
                valueOUT = ("D"); }
            else if (valueIN >= 60 & valueIN < 70) {//the else if statement which assigns the values that meet the criteria as a C
                valueOUT = ("C"); }
            else if (valueIN >= 70 & valueIN < 80) {//the else if statement which assigns the values that meet the criteria as a B
                valueOUT = ("B"); }
            else if (valueIN >= 80 & valueIN <= 100) { //the else if statement which assigns the values that meet the criteria as a A
                valueOUT = ("A"); }
            else { //the else statement which assigns the values that don't meet the criteria for any of the previous, as N/A
                valueOUT = ("N/A"); }
        return valueOUT;
    }
}