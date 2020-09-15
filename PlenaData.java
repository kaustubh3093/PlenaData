import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PlenaData {

	/*Will print the string on console*/
	public static void printToConsole(String str) {
		System.out.println(str);
	}
	
	/*
	 * Ask the User for input
	 * Call the generateOutput Method
	 * Print the result using printToConsole method
	 * */
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    PlenaData plenaData = new PlenaData();
	    Result result = new Result();
	    printToConsole("Input the String");
	    String input = scanner.nextLine();  
	    printToConsole("Output to the User");
	    printToConsole(result.generateOutput(input));
	    scanner.close();
	}

}
