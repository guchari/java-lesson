
public class Human {

	public static void main(String[] args) {
		// オブジェクトの作成
		Student student1 = new Student("リーマス",5,15,8);
		Student student2 = new Student("フリーザ",4,14,8);
		Student student3 = new Student("ジェームズ",6,16,8);
		School school1=new 	School("ケフカ",9,32,99);
		//自己紹介
		
		student1.hello();
		student2.hello();
		student3.hello();
		school1.hello();
		
		
		int result = student1.getAge();//
		result += student2.getAge();
		result += student3.getAge();
		student1.setID(65535);
		int c = student1.getID();
		
		System.out.println(result);
		System.out.println(c);
		//String result =;//
		//System.out.println("全員の年齢を足すと" + result + "歳です。");//
	}
}
	

	 
	 
	


