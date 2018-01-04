import java.util.Scanner;
public class LogisticDifferentiation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your carrying capacity?");
		float cap = sc.nextFloat();
		
		System.out.println("What is your constant of proportionality " 
				+ "(rate at which population is increasing per day");
		float constP=sc.nextFloat();
		
		System.out.println("What is the initial population?");
		float initPop=sc.nextFloat();
		
		System.out.println("What numerical population value are you trying "
				+ "to predict when you will reach?");
		float pop=sc.nextFloat();
		
		float a = (cap - initPop)/initPop;
		float t = ((cap/(initPop*a))-1)/a;
		float time = (float)java.lang.Math.log(t)/(-constP);
		
		System.out.println("The time at which you will reach a population of "
				+ pop + " will be " + unitTime(time));
		
	}
	
	public static String unitTime(float unitT) {
		if(unitT>365) {
			unitT=unitT/365;
			return String.valueOf(unitT) + " years";
		}
		return String.valueOf(unitT) + " days";
	}
	
}
