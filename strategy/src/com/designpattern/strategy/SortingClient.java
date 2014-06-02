package com.designpattern.strategy;


/**
 * 
 * @author kyan
 *
 */
public class SortingClient {

	public static void main(String[] args) {
		double[] list = {1, 2.4, 7.9, 3.2, 1.2};
		SortingContext context = new SortingContext();
		// Quick sort
		context.setSorter(new QuickSort());
		context.sortDouble(list);
		
		// Bubble sort
		context.setSorter(new BubbleSort());
		context.sortDouble(list);
	}
}
