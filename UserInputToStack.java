import java.util.Scanner;
import java.util.Stack;

public class UserInputToStack {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);// to collect user input (5 2 * 3 +)
		String number;
		int total = 0;

		System.out.println("Please enter your math formula: ");
		number = scan1.nextLine();

		// push user input(number) into a stack array
		Stack<Integer> stack = new Stack<Integer>();

		// cycle through the new array to determine if each character is a number or not
		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			int transferInt = Character.getNumericValue(ch);

			if (Character.isDigit(ch)) {// i = a number, then push to stack
				stack.push(transferInt);

			} else {// if i is an operator, pop the 2 prior numbers and apply
					// the operator to them
					// need to pop 2 times to get both of the numbers
				int a = stack.pop(); // apply operator
				int b = stack.pop();

				switch (ch) {
				case '*':
					total = a * b;
					break;
				case '/':
					total = b / a;
					break;
				case '+':
					total = a + b;
					break;
				case '-':
					total = b - a;
					break;

				default:
					break;
				}

				stack.push(total);
				System.out.println(total);
			}
		}
	}
}

/*
 * if(number.equals(0-9))stack.push(number);{ //if i = number, move to stack }
 */

// ??? int transInput = Character.getNumericValue(input)

// misc info from google...
// String i = Integer.toString(b);
// char a = i.charAt(0);
