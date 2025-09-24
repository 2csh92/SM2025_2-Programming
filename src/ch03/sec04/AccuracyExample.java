package ch03.sec04;

public class AccuracyExample {

	public static void main(String[] args) {
		int apple = 1;
		int number = 7;
		int totalPieces = apple * 10;
		
	    int remainingPieces = totalPieces - number;
	    
	    double result = remainingPieces / 10.0;
	    
		System.out.println("사과 1개에서 남은 양: " + result);
	}

}
