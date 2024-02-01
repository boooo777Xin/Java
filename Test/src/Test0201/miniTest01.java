// Java応用 ミニテスト01
// 学籍番号　学科　名前
package Test0201;
class miniTest01{
	public static void main(String[] args) {
		int susume = 2;
		int tomare = 99;
		System.out.println(susume + "は" + singou(susume));
        System.out.println(tomare + "は" + singou(tomare));
	}
	
	// 数字によって、信号の色を返します
	static String singou(int  num) {
		String tentou;
		switch(num){
			case 0:
				tentou = "赤";
				break;
			case 1:
				tentou = "黄";
				break;
			case 2:
				tentou = "青";
				break;
			default:
				tentou = "信号無視";
		}
		return tentou;
	}
}