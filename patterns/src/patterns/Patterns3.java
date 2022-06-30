package patterns;

public class Patterns3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int rows=1;rows<=4;rows++){
			for(int col=1;col<=rows;col++){
				System.out.print("* ");
			}System.out.println();
		}
		for(int rows=1;rows<=4;rows++){
			for(int col=1;col<=4-rows;col++){
				System.out.print("* ");
			}System.out.println();
	}
	}
}
