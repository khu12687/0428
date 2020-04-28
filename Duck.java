class Duck {
	String name ="도날드";
	int age=7;
	static String color="white"; //클래스 변수
	//클래스 변수란?
	//static 으로 선언된 변수로서, 이렇게 선언된 변수는 
	//인스턴스 생성시 해당 인스턴스에 소속되지 않고, 클래스 원본에
	//소속되므로, 클래스 변수라한다!!
	public void setAge(){
		age=9;
	}

	public static void main(String[] args) {
		color ="red"; //에러안남!! 
		int x=9;
		new Duck();
		Duck d = new Duck();

		//변수 d에는 객체 자체를 담을 수 없으므로, 객체의 인스턴스는 
		//heap에 생성시키고, 그 heap 생성된 인스턴스의 주소값을 d가 담고있기때문에
		//d와 같은 변수를 '객체를  담고 있는게 아니라 객체의 주소값, 즉 객체를 가리킨다'고 하여
		//레퍼런스변수라 한다!!
		//레퍼런스 변수에는 데이터 자체가 아닌 주소값만 들어있다!!

		/*
		자바 가상 머신의 메로리 구조
		1.static 영역 (Method 영역)
			-클래스의 원본코드가 올라오는 영역!!
			 실행될때  원본코드 그대로 스테틱에 올라오고 인스턴스생성할때 맴버변수는 딸려감
			하지만 static 을 붙인 맴버변수는 안딸려감 //전역변수개념

		2.stack 영역 (FILO)
			-지역변수가 올라오는 영역!!
			소멸은 브레스가 끝날때

		3.heap 영역
			-객체의 인스턴스가 올라오는 영역!!
			소멸은 GC(gabage collector)가 담당한다.
		*/
		System.out.println("기본데이터 타입인 x는 "+x);
		System.out.println("객체데이터 타입인 d는 "+d);
	}
}
