
// Java応用 ミニテスト03
// 学籍番号　学科　名前
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

class miniTest03ListVer {
	public static void main(String[] args) {

		// 先入れ方式
		List<String> guzaiList1 = List.of("白菜", "長ネギ", "肉",
				"ニンジン", "エノキ", "肉",
				"豆腐", "しらたき", "つみれ");

		// 後入れ方式
		List<String> guzaiList2 = new ArrayList<>();
		guzaiList2.add("白菜");
		guzaiList2.add("長ネギ");
		guzaiList2.add("肉");
		guzaiList2.add("ニンジン");
		guzaiList2.add("エノキ");
		guzaiList2.add("肉");
		guzaiList2.add("豆腐");
		guzaiList2.add("しらたき");
		guzaiList2.add("つみれ");

		/*
		 * List型は配列と同じく入れた順に0,1,2,3...と並ぶ。
		 * ※上記二つは同じ並びです。
		 */

		Set<String> guzaiSet = new HashSet<>(guzaiList1);
		/*
		 * Set型はList型と違い、中身の重複を許容しない。
		 * かつ順番はバラバラ。

		 */

		String search = "肉";
		int count = 0;

		/*
		 * 〇拡張For文
		 * 配列,コレクションクラスのもの(List,Set,Map等)を用いてだけ
		 * 表現できる特殊なFor文、要素の中身を使い切るまで繰り返し処理を行う。
		 * 
		 * for(配列の中の型 変数 : 使いたい配列,コレクションクラスの変数)
		 * {処理}
		 * 
		 */
		for (String guzai : guzaiList1) {
			if (guzai.equals(search)) {
				count++;
			}
		}

		System.out.println(search + "は" + count + "つありました");

		// ランダムに食材をとんすい(お皿)に入れる
		Random rnd = new Random();
		int guzaiNum = guzaiList1.size();
		int get1 = rnd.nextInt(guzaiNum);
		int get2 = rnd.nextInt(guzaiNum);

		// 重複しないようにする
		while (get1 == get2) {
			get2 = rnd.nextInt(guzaiNum);
		}

		System.out.println("鍋から" + guzaiList1.get(get1) + "と" + guzaiList1.get(get2) + "を取りました");
	}
}