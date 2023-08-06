package week3day1;

public class Student {
	
	public void getStudentInfo(int id , String name) {
			System.out.println("Student Id:" +id );
			System.out.println("Student name:" +name);
			
		}
		public void getStudentInfo(int id) {
			System.out.println("Student Id:" +id );
					
		}
		public void getStudentInfo(String email , long phno) {
			System.out.println("Student email:" +email );
			System.out.println("Student phno:" +phno);
					
		}
		
		

		public static void main(String[] args) {
			Student stu=new Student();
			stu.getStudentInfo(123456789);
			stu.getStudentInfo(123456789, "Padmaja Aravamudan");
		stu.getStudentInfo("padmaja.aravamudan@gmail.com", 9003034345l);

		}

}
