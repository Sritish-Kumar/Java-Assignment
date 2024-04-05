package dsa_iter;

interface DetailInfo{
	void display();
	void count();
}

class AamAadmi implements DetailInfo{
	static int maxcount;
	String name;
	public void display(){
		System.out.println("Name of the person: "+this.name);
	}
	public void count() {
		this.maxcount = name.length();
		System.out.println("The characters present in the name is: "+this.maxcount);
	}
}

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AamAadmi s1 = new AamAadmi();
		s1.name = "Stark";
		s1.display();
		s1.count();
	}

}
