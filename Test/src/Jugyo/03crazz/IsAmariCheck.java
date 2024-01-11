class IsAmariCheck {
	public static void main(String[] args) {
		AmariCheck(4,8);
		AmariCheck(5,4);
	}
	
	static void AmariCheck(int x,int y) {
		if(y % x == 0) {
			System.out.println("余り:true");
		} else {
			System.out.println("余り:false");
		}
	}
}
