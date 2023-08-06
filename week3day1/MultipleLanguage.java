package week3day1;

public abstract class MultipleLanguage {
	public void Java() {
		System.out.println("Java");
	}
	public void Selenium() {
		System.out.println("Selenium");
	}

	public static void main(String[] args) {
		Automation ob=new Automation();
		ob.Java();
		ob.Selenium();
		ob.pthyon();
		ob.ruby();
	}
	public void python() {
		System.out.println( "Python");
	}
	public void ruby() {
		System.out.println( "Ruby");
	}
}
