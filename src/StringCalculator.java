
public class StringCalculator {
	
	public static int add (String numbers) {
		int answer = 0;
		if (numbers.equals("")) {
			answer = 0;
		}else if (!numbers.contains(",")) {
			answer = Integer.parseInt(numbers);
		}
		else {
			String[] numArray = numbers.split("\n |, ");
			numbers.replace("\n ", "");
			int i = 0;
			for (String s : numArray) {
				i = Integer.parseInt(s);
				answer += i;
			}
			
		}
		return answer;
		
	}
	

}
