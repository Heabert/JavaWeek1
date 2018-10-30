package Chapter2;

public class GradingProblem {

	public static void main(String[] args) {
		char [] keys= {'D','B','D','C','C','D','A','E','A','D'};
		char [] [] answers={
				{'A','B','A','C','C','D','E','E','A','D'},
				{'D','B','A','B','C','A','E','E','A','D'},
				{'E','D','D','A','C','A','E','E','A','D'},
				{'C','B','A','E','D','C','E','E','A','D'},
				{'A','B','D','C','C','D','E','E','A','D'},
				{'B','B','E','C','C','D','E','E','A','D'},
				{'B','B','A','C','C','D','E','E','A','D'},
				{'E','B','E','C','C','D','E','E','A','D'}
		};
		
		for (int i=0; i < answers.length; i++) {
			int count = 0;
			for (int h=0; h < answers[i].length; h++) {
				if(answers[i][h] == keys[h])
				count++;
			}
			System.out.println(" " + i + "   " +  count);
		}
	
	}
}
