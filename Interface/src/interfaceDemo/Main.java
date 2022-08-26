package interfaceDemo;

interface Bank{
	float rateOfInterest();
}

class SBI implements Bank{
	public float rateOfInterest() {
		return 9.15f;
	}
}
class HDFC implements Bank{
	public float rateOfInterest() {
		return 9.7f;
	}
}
public class Main {

	public static void main(String[] args) {
		Bank b= new SBI();
		Bank h= new HDFC();
		System.out.println("ROI:" +b.rateOfInterest());
		System.out.println("ROI:" +h.rateOfInterest());

	}

}
