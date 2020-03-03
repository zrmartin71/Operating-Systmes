import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//Zoe Martin & Erica Johnson
//CS 4345 - Spring 2020
//Assignment 2

public class Rmdp {
	static int rowsA, rowsB, columnsA, columnsB;
	static List<String> bLine = new ArrayList<String>();
	static List<Integer> bNum = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		File input;
		if(args.length >0){
			try {
				System.out.print("Test Line");
				input = new File(args[0]);
				Scanner scan = new Scanner(input);
				
				//grabs line with dimensions of mats & display to user
				BufferedReader b = new BufferedReader(new FileReader(input.getAbsolutePath()));
				String dimensions= b.readLine();
				System.out.println("Matrix dimensions: " + dimensions);
				b.close();
				
				dimensionsDisplay(dimensions);
				
				//making sure i am grabbing the right lines
				while(scan.hasNext()) {
					String line = scan.nextLine();
					if(!line.equals(dimensions) && !line.equals("")) {
							
					String[] a = line.split(" ");
					
					for(int i = 0; i < a.length; i++) {
					
						if(a[i] != "") {
						bLine.add(a[i]);
						}
					}
					//System.out.print(a);
					
				//	bLine.add(a);	
					
				}
				}
				
				System.out.println(bLine);
				scan.close();
				
			}
			catch(Exception e) {
				System.out.println(e);
			}		
		}
		else {
			System.out.println("Invalid File - no agrument passed");
		}
		
	}
	
	//used to check if the matrices can be multiplied
	public static void dimensionsDisplay(String dimensions) {
		String[] nums = dimensions.split(" ");
		int rA = Integer.parseInt(nums[0]);
		int cA = Integer.parseInt(nums[1]);
		int rB = Integer.parseInt(nums[2]);
		int cB = Integer.parseInt(nums[3]);
		System.out.printf("Dimensions for matrix A: %dx%d\n", rA, cA);
		System.out.printf("Dimensions for matrix B: %dx%d\n", rB, cB);
		rowsA = rA;
		rowsB = rB;
		columnsA = cA;
		columnsB = cB;
		
		if(cA != cB) {
			System.out.println("These matrices cannot be multiplied");
		}
	}
	
}

class Multiply_Mats implements Runnable{
	String dimentions;
	String dimensions;
	int rowA;
	int colA;
	int rowB;
	int colB;

public Multiply_Mats(int Ar, int Ac, int Br, int Bc) {
	Ar = rowA;
	Ac = colA;
	Br = rowB;
	Bc = colB;
	
	int[][] matrix_a;
	int[][] matrix_b;
	
	matrix_a = new int[Ar][Ac];
	matrix_b = new int[Br][Bc];

	
	
	
}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
