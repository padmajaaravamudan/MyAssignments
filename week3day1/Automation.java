package week3day1;

	public class Automation extends MultipleLanguage {
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

		public void pthyon() {
			
			super.python();
		}

		public void ruby() {
		
			super.ruby();
		}

		
		}

