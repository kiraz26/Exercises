package arrayexercise;

public class ArrayExercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array = new String[5];
		array[0]="halil";
		array[1]="talha";
		array[2]="ali";
		array[3]="halit";
		array[4]="yusuf";
		
		System.out.println(array[4]);
		
		for (String name : array) {
			System.out.print(name+" ");
		}
		
		
	}

}
