package task_3;

import java.util.ArrayList;
import java.util.List;

class String_calculator{
/*	public static void main(String[] args) {
		String s = "//;\n1;2;3;1";
		//String s = "1,-2,3,-2";
		System.out.println(String_calc(s));
	}
*/
	static int String_calc(String s){
		// write test to check for empty string
		int sum = 0;
		if(s.isEmpty())
			return sum;

		char delimeter;
		int position = 0;
		if(s.charAt(0) == '/' && s.charAt(1) == '/'){
			delimeter = s.charAt(2);
			position = 1;
		}
		
		else delimeter = ',';

		return PrintNumbers(s,delimeter,position);
	}

	static int PrintNumbers(String s, char delimeter, int position){

		int sum = 0;

    	List<Integer> negativeList = new ArrayList<Integer>();

		String[] arrSplit = s.split("[\n"+ delimeter +"]+");
		
		for (int i=position; i < arrSplit.length; i++){
			int number = Integer.parseInt(arrSplit[i]);
			if(number < 0){
				negativeList.add(number);
			}
			else
				sum = sum + number;
    	}

    	if (negativeList.size() > 0) {
            throw new RuntimeException("Negatives not allowed: " + negativeList.toString());
        }

    	return sum;
	}
}
