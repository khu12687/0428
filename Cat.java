class  Cat{
	String eyeColor="brown";
	int age=3;
	char gender='여';

	//메인 실행부가 있다는 것은, 단지 현재의 클래스를 실행용 클래스로 정의하는 것 뿐이다..
	//프로그램을 실행하기 위해서는, 메인함수가 반드시 1개는 있어야 하는데, 현재 클래스에
	//메인함수를 둔 것 뿐이다..(다른곳에 두어도 된다)
	public static void main(String[] args){
		Cat cat = new Cat(); //거푸집으로부터 인스턴스를 생성해야, 고양이가 가진 변수,함수들을 접근할수있다
		

		//고양이의 나이를 10살로 변경후, 나이를 다시 출력
		cat.age=10;
		System.out.println(cat.age);
	}
}

