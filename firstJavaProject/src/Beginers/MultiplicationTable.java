package Beginers;

public class MultiplicationTable { // Class
	/*
	 * void tablePrinter (int table) { //Method that takes a single argument
	 * System.out.printf("Times table of %d",table).println(); for(int i=1;i<11;i++)
	 * { System.out.printf("%d * %d = %d",table,i,table*i).println(); }
	 * System.out.println("THE END"); }
	 */

	void tablePrinter(int table) { // Method that takes a single argument
		tablePrinter(table, 1, 10);
	}

	void tablePrinter(int table, int from, int to) { // Method that takes a single argument
		System.out.printf("Times table of %d", table).println();
		for (int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
		}
		System.out.println("THE END");
	}

}
