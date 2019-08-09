import java.io.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class InformationParser {
	public static void main(String args[]){
		//--------First Branch---------------------
		checkFile("gender1");
		checkFile("education.txt");
		checkFile("work.txt");
		checkFile("health.txt");
		System.out.println("----------------------");
		//----------second branch-------------------
		checkFile("edu_work.txt");
		checkFile("edu_gen.txt");
		checkFile("edu_health.txt");
		System.out.println("--------------------------");
		//---------third branch---------------------
		checkFile("edu_health_gen.txt");
		checkFile("edu_health_work.txt");
		System.out.println("--------------------------");
		
		checkFile("edu_health_work_gen");
	//	checkFile("edu_health_gen_work");
		
	}

	public static int[][] fileReader(String inFile) throws IOException{
		File inputFile = new File(inFile);
		Scanner iFS = new Scanner(inputFile);
		Scanner iFS2 = new Scanner(inputFile);
		Scanner iFS3 = new Scanner(inputFile);

		int row = 0;
		while(iFS.hasNextLine()){
			row++;
			iFS.nextLine();
		}

		int column = 0;
		String numbers = iFS2.nextLine();
		String[] splitN = numbers.trim().split("\\s+");
		column = Array.getLength(splitN);

		int count = 0;
		int[] allVal = new int[row * column];
		while(iFS3.hasNext()){
			allVal[count++] = iFS3.nextInt();
			//System.out.println(allVal[count++]);
		}
		iFS.close();
		iFS2.close();
		iFS3.close();

		int[][] pivotTable = new int[row][column];
		int c = 0;
		for (int i = 0; i < row; i++){
			for(int j = 0; j < column; j++){
				pivotTable[i][j] = allVal[c++];
			//	System.out.print(pivotTable[i][j] + " ");
			}
		//	System.out.println();
		}
		return pivotTable;
	}
	public static double expectantCalculator(int[][] pivotTable){
		double info = 0,expectant = 0,freq,entry;
		
		int row,col;
		row = pivotTable.length;
		col = pivotTable[0].length;
		
		
		for (int i = 0; i < row - 1; i++){
			info = 0;
			for (int j = 0; j < col - 1; j++){
				freq = pivotTable[i][pivotTable[0].length - 1];
				entry = pivotTable[i][j];
				
				if(entry != 0)
					info += (entry/freq)*log2(freq/entry);


			}

			double temp1 = pivotTable[i][col-1];
			double temp2 = pivotTable[row-1][col-1];
			
			double frac = temp1/temp2;
			
			expectant +=  frac*info;
			//System.out.println(expectant);
			
		}
		return expectant;
	}

	private static double log2(double d) {
		return Math.log(d)/Math.log(2.0);
	}

	public static void checkFile(String inFile){
		try{
			int[][] file = fileReader(inFile);
			double expectant = expectantCalculator(file);
			System.out.println("Expectant for " + inFile + ": "  + expectant);
		} catch(IOException e){
			System.out.println("Error reading file '" + inFile + "' ") ;
		}
	}
}


