package Main;

import DBTask.CreateDBTable;
import DBTask.DataBaseTask;
import DBTask.ReadFileContent;
import JavaTaskSynamicSizeArray.QueriesForDynamicArray;
import ListAndBookTask.BookTasks;
import JavaCollection.HashMapExample;
import JavaCollection.HashSetExample;
import JavaCollection.ListExample;
import JavaExercisesTask.*;
import JavaTaskSynamicSizeArray.DynamicSizeArrayQueries;
import ListAndBookTask.ListOfRandomlyGeneratedAlphanumericStrings;
import OOPTask.Circle;
import OOPTask.Rectangle;
import OOPTask.Square;
import Utils.*;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, IOException {
        ReadStringFromConsole readStringFromConsole = new ReadStringFromConsole();
        ReadAnArrayFromConsole readAnArrayFromConsole = new ReadAnArrayFromConsole();
        PrintArrayElements printArrayElements = new PrintArrayElements();
        CheckPalindrome checkPalindrome = new CheckPalindrome();
        BubbleSort bubbleSort = new BubbleSort();
        MagicalSquare magicalSquare = new MagicalSquare();
        ReverseArrayOfFloats reverseArrayOfFloats = new ReverseArrayOfFloats();
        SumOfOddAndEvenNumbers sumOfOddAndEvenNumbers = new SumOfOddAndEvenNumbers();
        DynamicSizeArrayQueries dynamicSizeArrayQueries = new DynamicSizeArrayQueries();
        ListExample listExample = new ListExample();
        HashSetExample hashSetExample = new HashSetExample();
        HashMapExample hashMapExample = new HashMapExample();
        ListOfRandomlyGeneratedAlphanumericStrings list = new ListOfRandomlyGeneratedAlphanumericStrings();
        BookTasks bookExample = new BookTasks();
        Scanner scanner = new Scanner(System.in);
        DataBaseTask dataBaseTask = new DataBaseTask();
        ReadFileContent readFileContent = new ReadFileContent();
        CreateDBTable createDBTable = new CreateDBTable();
        ReadDynamicSizeArray readDynamicSizeArray = new ReadDynamicSizeArray();
        QueriesForDynamicArray queriesForDynamicArray = new QueriesForDynamicArray();
        GenerateRandomAlphanumericString generateRandomAlphanumericString = new GenerateRandomAlphanumericString();
        SortAListInDescendingOrder sortAListInDescendingOrder = new SortAListInDescendingOrder();
        RemoveElementFromTheListByASpecificParameter removeElementFromTheList = new RemoveElementFromTheListByASpecificParameter();

        System.out.println("1. Check if a string of characters is a Palindrome\n" +
                "2. Inverse the elements of an array\n" +
                "3. Sort array elements using Bubble Sort\n" +
                "4. Determine sum of odd numbers and the amount of even numbers\n" +
                "5. Check if two-dimensional matrix is Magic\n" +
                "6. OOP Task\n" +
                "7. Dynamic size Array Task\n" +
                "8. Collection Task\n" +
                "9. List of 20 randomly alphanumeric strings and Book Task\n" +
                "10. Data Base Connection Task\n" +
                "11. Exit");

        boolean quit = false;
        do {
            System.out.println("\nChoose one of the above displayed options by number: ");
            int number = scanner.nextInt();

            switch (number) {
                case 1:
                    String givenStringAtConsole = readStringFromConsole.readStringFromConsole();
                    checkPalindrome.checkIfAStringIsPalindrome(givenStringAtConsole);
                    break;
                case 2:
                    double[] arrayToReverse = readAnArrayFromConsole.readAndPrintDoubleArrayFromConsole();
                    printArrayElements.printDoubleArray(reverseArrayOfFloats.reverseAnArray(arrayToReverse));
                    break;
                case 3:
                    int[] givenArray = readAnArrayFromConsole.readAndPrintIntArrayFromConsole();
                    printArrayElements.printIntArray(bubbleSort.sortElementsInArrayBubbleSort(givenArray));
                    break;
                case 4:
                    int[] arrayToBeChecked = readAnArrayFromConsole.readAndPrintIntArrayFromConsole();
                    System.out.println("\nSum of ODD elements is: " + sumOfOddAndEvenNumbers.findSumOfOddElements(arrayToBeChecked));
                    System.out.println("Total Number of EVEN elements is: " + sumOfOddAndEvenNumbers.findTotalNumberOfEvenElements(arrayToBeChecked));
                    break;
                case 5:
                    magicalSquare.readMatrixFromConsoleAndSeeIfItIsMagic();
                    break;
                case 6:
                    Circle circle = new Circle(5);
                    circle.displayFigureName();
                    circle.calculateFigureArea();
                    circle.calculateFigurePerimeter();

                    System.out.println("\n");

                    Square square = new Square(6);
                    square.showFigureName();
                    square.displaySideNumbers();
                    square.calculateFigureArea();
                    square.calculateFigurePerimeter();

                    System.out.println("\n");

                    Rectangle rectangle = new Rectangle(4, 5);
                    rectangle.showFigureName();
                    rectangle.displaySideNumbers();
                    rectangle.calculateFigureArea();
                    rectangle.calculateFigurePerimeter();
                    break;
                case 7:
                    ArrayList<ArrayList<Integer>> arrayList = readDynamicSizeArray.readDynamicArray();
                    ArrayList<QueryHelper<Integer, Integer>> pairList = queriesForDynamicArray.readQueriesFromConsole();
                    dynamicSizeArrayQueries.displayElementFromArrayBasedOnGivenQuery(arrayList, pairList);
                    break;
                case 8:
                    listExample.getListElementsJoined(listExample.createAndReturnList());
                    listExample.reverseList(listExample.createAndReturnList());
                    listExample.displayElementWithIndexTwo(listExample.createAndReturnList());
                    listExample.addAListToAnotherOne(listExample.createAndReturnList());
                    listExample.printList(listExample.createAndReturnList());
                    hashSetExample.determineHashSetSize(hashSetExample.createAndReturnHashSet());
                    hashSetExample.iterateHashSetElements(hashSetExample.createAndReturnHashSet());
                    hashSetExample.determineTotalMultipliedElements(hashSetExample.createAndReturnHashSet());
                    hashMapExample.displayHashMapKeys();
                    hashMapExample.displayHashMapValues();
                    hashMapExample.setValueForSecondKey(hashMapExample.createAndReturnHashMap());
                    hashMapExample.removeValueOfThirdKey(hashMapExample.createAndReturnHashMap());
                    hashMapExample.printMapValues(hashMapExample.createAndReturnHashMap());
                    break;
                case 9:
                    List listWithRandomlyCreatedAlphaNumerics = list.addAStringToList();
                    sortAListInDescendingOrder.sortInDescendingOrder(listWithRandomlyCreatedAlphaNumerics);
                    removeElementFromTheList.removeElementFromTheList(listWithRandomlyCreatedAlphaNumerics, "les");
                    bookExample.getfirstSpanishBook();
                    bookExample.sortListOfBooksByAuthor();
                    bookExample.getTheBookWithMaximumPagesByTitle();
                    bookExample.getAListOfBooksThatHaveMoreThan200Pages();
                    break;
                case 10:
                    createDBTable.checkAndCreateDBWithTablesAndData();
                    dataBaseTask.writeWordCountInAnotherTable("Word1");
                    dataBaseTask.extractDBResultInAMap();
                    readFileContent.writeToFile("Word1", new File("input.txt"));
                    readFileContent.extractResultsInAMap();
                    break;
                case 11:
                    System.out.println("\nEXIT");
                    quit = true;
                    break;
                default:
                    System.out.println("Please enter a number from 1 to 11");
            }
        }
        while (!quit);
    }
}