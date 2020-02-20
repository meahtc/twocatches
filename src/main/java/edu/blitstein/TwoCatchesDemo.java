package edu.blitstein;

import edu.blitstein.exception.DivideByZeroException;
import edu.blitstein.exception.NegativeNumberException;
import edu.blitstein.widget.WidgetScore;

import java.util.Scanner;

public class TwoCatchesDemo {
    public static void main(String[] args) {
        WidgetScore widgetScore = new WidgetScore();
        String finishPoint = "begin";
        try {
            System.out.println("Enter number of widgets produced:");
            Scanner keyboard = new Scanner(System.in);
            widgetScore.inputWidgets(keyboard.nextInt());
            System.out.println("How many were defective?");
            widgetScore.inputDefective(keyboard.nextInt());
            String outMsg = "One in every " + widgetScore.ratio() + " widgets is defective.";
            System.out.println(outMsg);
            finishPoint = "try";
        } catch (DivideByZeroException e) {
            System.out.println("Congratulations! A perfect record!");
            finishPoint = "DivideByZeroException";
        } catch (NegativeNumberException e) {
            System.out.println("Cannot have a negative number of " + e.getMessage());
            finishPoint = "NegativeNumberException";
        } finally {
            System.out.println("Finished after: " + finishPoint);
        }
        System.out.println("End of program.");
    }
}