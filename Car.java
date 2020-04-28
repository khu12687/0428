/*
아래의 조건으로 클래스를 정의하세요.

클래스명 : 자동차

속성1   :  노란색 컬러
속성2   :  200만원 

기능1   :  색상을 빨간색으로 변경하는 기능
기능2   :  가격을 500만원으로 변경하는 기능

*/
class Car{
	String color = "yellow";
	int price = 200;

	public void changeColor(){
		color ="red";
	}
	public void changePrice(){
		price =500;
	}
}
