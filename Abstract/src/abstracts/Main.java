package abstracts;

abstract class Movie{
	abstract String setTitle(String name);

	
	
}
class mymovie extends Movie{
	String setTitle(String name) {
		return name;
		
	}

	String setTitle() {
		// TODO Auto-generated method stub
		return null;
	}
}
public class Main {

	public static void main(String[] args) {
		Movie m=new mymovie();
		System.out.println(m.setTitle("robert"));

	}

}
