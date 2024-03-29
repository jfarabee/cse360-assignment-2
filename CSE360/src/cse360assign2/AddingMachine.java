package cse360assign2;

/**
* This program is an addition/subtraction machine, capable of
* executing addition/subtraction instructions on a running total
* integer. It stores the history of instructions, and has a method
* to start from scratch.
* @author	Jacob Farabee, 1214326749
*/
public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * The AddingMachine class only exists to instantiate the
	 * total & history.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "" + total;
	}
	
	/**
	* Returns the running total of all calculations done 
	* on the calculator so far.
	* @return	Total value on calculator.
	*/
	public int getTotal () {
		return total;
	}
	
	/**
	* Adds an integer value to the running total.
	* The int argument is added to the total.
	* Does not return anything.
	* @param   int	The value to be added.
	*/
	public void add (int value) {
		total += value;
		history += " + " + value;
	}
	
	/**
	* Subtracts an integer value from the running total.
	* The int argument is subtracted from the total.
	* Does not return anything.
	* @param   int 	The value to be subtracted.
	*/
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
		
		
	/**
	* Returns a String containing the history of the calculator.
	* Includes all additions and subtractions in the order they
	* happened. This history is reset by clear().
	* @return	The history of calculations.
	*/
	public String toString () {
		return history;
	}


	/**
	* Clears the history of the calculator and sets the running
	* total to 0. Does not return anything.
	*/
	public void clear() {
		total = 0;
		history = "" + total;
	}
}
