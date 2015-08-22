
	class Student{
		//メンバ変数(フィールド)
		private String name;
        private int age,number;
        private int publicID=100;
	        
		//コンストラクタ
        public int getID(){
        	return publicID;
        }
	        
		 public Student(String n,int a,int b,int c){
			name =n;
			setNumber(a);
			setAge(b);
			setID(c);
		 }
		 
		 public void setID(int c){ 
			 publicID = c;
		 }
		 
		 
		 public void setNumber(int a){
			 if(a<0){
				 number=0;
			 }else{
				 number=a;
			 }
		 }
		 public int getNumber(){
			 return number;
		 }
		 
		 public void setAge(int b){
			 if(b<0){
				 age=0;
			 }else{
				 age=b;
			 }
		 }
		 public int getAge(){
			 return age;
		 }
		 
		 void hello() {
			 this.name+="様";
			 System.out.println("私の名前は"+name+"です。高校"+number+"年生の"+age+"歳です");
		 }
	 }
	
