import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

//Zoe Martin & Erica Johnson
//CS 4345 - Spring 2020
//Assignment 2

public class Rmdp {
	static int rowsA, rowsB, columnsA, columnsB;
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
					if(!line.equals(dimensions)) {
						System.out.println(line);
					}
				}
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
	
	//will be used to populate Matrices
	public static void makeMatrices(File input, String dimensions) {
		Scanner scan;
		Double [][] matrixA = new Double[rowsA][columnsA];
		try {
			scan = new Scanner(new BufferedReader(new FileReader(input.getAbsolutePath())));
			//making sure i am grabbing the right lines
			while(scan.hasNext()) {
				String line = scan.nextLine();
				if(line.equals(dimensions) || line.equals("")) {
					continue;
				}
				
				String[] row = line.split("  ");
				
				for(int rowA = 0; rowA < matrixA.length;rowA++) {
					for(int colA = 0; colA < matrixA[rowA].length;colA++) {
						for(int i = 0; i < row.length; i++) {
							matrixA[rowA][colA] = Double.parseDouble(row[i]);
							continue;
						}
					}
				}
				
				break;
			}
			System.out.println(Arrays.deepToString(matrixA));
			scan.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Multiply_Mats implements Runnable{
	String dimentions;
	int[][] matrix_a;
	int[][] martix_b;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
