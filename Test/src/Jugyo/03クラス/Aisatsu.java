/* Java応用　*/

class Aisatsu{
	public static void main(String[] args){
		//メソッドを呼び出す
		AisatsuPrint(1);
		AisatsuPrint(2);
		AisatsuPrint(3);
	}		
		///メソッドを定義する
	static void AisatsuPrint(int num){
		if (num==1){
			System.out.println("おはよう。");
		} else if (num==2){
			System.out.println("こんにちは。");
		} else if (num==3){
			System.out.println("こんばんは。");
		}
	}
}
