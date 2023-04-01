package Week03;

import java.util.Arrays;

public class week03CodingAssingnment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		int[] ages = {3,9,23,64,2,8,28,93,13 };
		
		int subtract = (ages[ages.length-1]-ages[0]);
		System.out.println(subtract); 
		double sum = 0;
		for (int age : ages) {
			sum += age;
		}
			double average = sum/ages.length;
			System.out.println(average);
		
		//2
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		int sumOfNumbers = 0;
		for (String name : names) {
			sumOfNumbers += name.length();
		}
			double averageLength = sumOfNumbers / names.length;
			System.out.println(averageLength);
		
		String allNames= "";
		for (String name : names) {
			allNames += name +  " ";
		}
		System.out.println(allNames);
		//3
		//Last element in an array = array[array.length-1]
		//4
		//First element in array = array[0]
		
		
		//5
		int[] nameLengths = new int[names.length];
		for (int i= 0; i < names.length; i++) {
			nameLengths[i] =  names[i].length();
			System.out.println(Arrays.toString(nameLengths));
			System.out.println(i);
		}
		//6
	    int sums =0;
		for (int x : nameLengths){
			sums += x;
			System.out.println(x);
		}
		System.out.println(sums);
		
		//7
		System.out.println(multiplyString("Waddup!",6));
		
		//8
		System.out.println(fullName("Jim","Bob"));
		
		//9
		int[] numbers =  {25,16,4,42};
		System.out.println(isGreaterThan100(numbers,100));
		
		//10
		double[] numbers2 = {12.5,16.7,35.6};
		System.out.println(averageNumber(numbers2));
		
		//11
		double[] doubles = {26.4,39.8,25.3,12.7};
		double[] doubles2 = {46.8,4.9,13.6,27.5};
		System.out.println(isAverageGreater(doubles,doubles2));
		
		//12
		System.out.println(willBuyDrink(true, 11.45));
		
		//13
		String[] strings = {"Percy", "Christopher","Alexander"};
		String[] strings2 = {"Nancy","Samantha","Jill"};
		System.out.println(isAverageStringLengthGreater(strings,strings2));
		
	}
	//Methods
	//7
	public static String multiplyString(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str;
		}
		return result;
	}
	//8
	public static String fullName(String firstName, String lastName) {
	String fullName = firstName + " " + lastName;
	return fullName;
	}
	//9
	public static boolean isGreaterThan100(int[] numbers, int i) {
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		return (sum >i);
	}
	//10
	public static double averageNumber(double[] numbers) {
		double sum = 0;
		for (double number: numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	//11
	public static boolean isAverageGreater (double[] numbers, double [] numbers2) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
			}
		double sum2 = 0;
		for (double number : numbers2) {
			sum2 += number;
			}
		if (( sum / numbers.length) > (sum2 / numbers2.length)) { 
			return true;
		}
		return false;
		}
		
	//12
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.5) {
			return true;
		}
		return false;
	}
	//13
	public static boolean isAverageStringLengthGreater(String[] strings , String[] strings2) {
		double sumstr = 0;
		for (String string : strings) {
			sumstr += string.length();
		}
		double sumstr2 = 0;
		for (String string2: strings2) {
			sumstr2 += string2.length();
		}
		if ((sumstr/strings.length)>(sumstr2/strings2.length)) {
			return true;
		}
		return false;
	}
}
