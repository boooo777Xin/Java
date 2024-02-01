// Java応用 ミニテスト03
// 学籍番号　学科　名前
package Test0201;

import java.util.Random;

class miniTest03 {
	public static void main(String[] args) {
		// 文字の分割
		String str = "白菜,長ネギ,肉,ニンジン,エノキ,肉,豆腐,しらたき,つみれ";

		// String.split(",")で","区切りに配列にする。
		String[] guzai = str.split(",");

		// 肉を探す
		String search = "肉";
		int count = 0;
		for (int i = 0; i < guzai.length; i++) {
			String gu = guzai[i];
			if (gu.equals(search)) {
				count++;
			}
		}
		System.out.println(search + "は" + count + "つありました");

		// ランダムに食材をとんすい(お皿)に入れる
		Random rnd = new Random();
		int guzaiNum = guzai.length;
		//nextIntの中身は9
		int get1 = rnd.nextInt(guzaiNum);
		int get2 = rnd.nextInt(guzaiNum);

		// 重複しないようにする(ここは採点対象外)
		while (guzai[get1].equals(guzai[get2])) {
			get2 = rnd.nextInt(guzaiNum);
		}
		System.out.println("鍋から" + guzai[get1] + "と" + guzai[get2] + "を取りました");

	}
}