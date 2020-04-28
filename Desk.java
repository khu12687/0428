public class Desk {
	int x;
	static int y;
	
	{ //A 인스턴스 초기화 영역 //이 영역은 이 클래스로부터 인스턴스가 생성될때마다 호출된다!! x를위한
		for(int i=0;i<10;i++){
			x++;
		}
	}
	
	
	static { //B static 초기화 영역
				// 클래스 원본 코드가 Load 될때, (즉 실행시)
		for(int i=0;i<20;i++){
			y++;
		}
	}
	                              
	public static void main(String[] args){
		System.out.println(x); //C 에러
		int a=new Desk().x; //D
		System.out.println(a); //E
		System.out.println(y); //F
		
	}
}
