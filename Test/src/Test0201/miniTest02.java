// Java応用 ミニテスト02
// 学籍番号　学科　名前
package Test0201;

class miniTest02 {
	public static void main(String[] args) {
		funnyBot(3);
		funnyBot(100);
	}

	static void funnyBot(int dosu) {
		// セリフを度数が偶数か奇数で分けて表示
		if (dosu % 2 == 0) {
			System.out.println("ガンガンいこうぜ");
		} else {
			System.out.println("いろいろやろうぜ");
		}

		// 度数分、掛け声をのばして表示
		System.out.print("イエ");
		for (int i = 0; i < dosu; i++) {
			System.out.print("ー");
		}
		System.out.println("イ！");
	}

	// 文字連結版
	static void funnyBot2(int dosu) {
		// セリフを度数が偶数か奇数で分けて表示
		String yeeeeeeeaaaaahh = "";
		if (dosu % 2 == 0) {
			yeeeeeeeaaaaahh += "ガンガンいこうぜ\n";
		} else {
			yeeeeeeeaaaaahh += "いろいろやろうぜ\n";
		}

		yeeeeeeeaaaaahh += "イエ";
		for (int i = 0; i < dosu; i++) {
			yeeeeeeeaaaaahh += "ー";
		}
		System.out.println(yeeeeeeeaaaaahh + "イ！");
	}
}