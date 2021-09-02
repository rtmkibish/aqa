package homework.lesson2.homework4;

import java.util.Scanner;

public class Homework4 {
    public void done() {
        firstTask();
        secondTask();
    }

    public void firstTask() {
        System.out.println("Task #1\nWe are going to caluclate amount of paint!");
        double roomLength;
        double roomWidth;
        double roomHeight;
        double paintAmountForOneSquareMeter;
        double windowsAndDoorsSquarePercentage;
        double allWallsSquare;
        double squareToPaint;
        double paintOneLiterPrice;
        double paintTotalAmount;
        double paintWholeCost;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the room length: ");
        roomLength = scanner.nextDouble();
        System.out.print("Input the room width: ");
        roomWidth = scanner.nextDouble();
        System.out.print("Input the room height: ");
        roomHeight = scanner.nextDouble();
        System.out.print("Input amount of paint for one square meter: ");
        paintAmountForOneSquareMeter = scanner.nextDouble();
        System.out.print("Input percentage of windows and doors square: ");
        windowsAndDoorsSquarePercentage = scanner.nextDouble();
        System.out.print("Input paint price: ");
        paintOneLiterPrice = scanner.nextDouble();

        allWallsSquare = getWallsSquare(roomLength, roomWidth, roomHeight);
        squareToPaint = calcSquareToPaint(allWallsSquare, windowsAndDoorsSquarePercentage);
        paintTotalAmount = squareToPaint * paintAmountForOneSquareMeter;
        paintWholeCost = paintTotalAmount * paintOneLiterPrice;

        System.out.printf("You will need %.2f liter/s of paint which will cost %.2f grivnas.\n", paintTotalAmount, paintWholeCost);

    }

    public void secondTask() {
        System.out.println("Task #2\nWe are going to caluclate amount of goods that can be bought for a certaine praice and the change!");

        double moneyAmount;
        double singleGoodsPrice;
        int affordableGoodsNumber;
        double change;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your money amount: ");
        moneyAmount = scanner.nextDouble();
        System.out.print("Input the price for one goods: ");
        singleGoodsPrice = scanner.nextDouble();
        scanner.close();
        affordableGoodsNumber = (int)(moneyAmount / singleGoodsPrice);
        change = moneyAmount % singleGoodsPrice;
        if (affordableGoodsNumber > 0) {
           System.out.printf("You can afford %d items and get %.2f change.\n", affordableGoodsNumber, change);
        } else {
            System.out.println("You cannot afford this goods.");
        }
    }

    private double getWallsSquare(double length, double width, double height) {
        double wallsSquare = ((length * height) * 2) + ((width + height) * 2);
        return wallsSquare;
    }

    private double calcSquareToPaint(double wholeSquare, double windowsDorsPercentage) {
        double squareToNotPaint = getPercent(windowsDorsPercentage, wholeSquare);
        double squareToPaint = wholeSquare - squareToNotPaint;
        return squareToPaint;
    }

    private double getPercent(double percentNumber, double target) {
        double result = (percentNumber * target) / 100;
        return result;
    }
}
