class Duck {
	String name ="도날드";
	int age=7;
	static String color="white";
	public void setAge(){
		age=9;
	}

	public static void main(String[] args) {
		int x=9;
		new Duck();
		Duck d = new Duck();

		System.out.println("기본데이터 타입인 x는 "+x);
		System.out.println("객체데이터 타입인 d는 "+d);
	}
}
