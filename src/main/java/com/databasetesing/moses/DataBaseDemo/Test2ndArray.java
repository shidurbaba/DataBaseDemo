package com.databasetesing.moses.DataBaseDemo;

import org.apache.bcel.classfile.InnerClass;

public class Test2ndArray {

	public static void main(String[] args) {
		
		String [][] array1 = {	{"Hello", "World", "How", "Are ", "You"}, 
								{"My", "Name", "Is"},
								{"Jay", "Peris"}
								};
		
		int outArraySize = array1.length;
		System.out.println("The size of the outArraySize is " + outArraySize);
		for(int i = 1; i < outArraySize; i++) {
			int innerArrayElementSize = array1[i].length; //positions next to current array index element
			for(int j = 0; j< innerArrayElementSize; j++) {
				System.out.print(array1[i][j] + " ");
			}
			System.out.println(" : The size of the innerElementSize is " + innerArrayElementSize);

		}
	}

}
