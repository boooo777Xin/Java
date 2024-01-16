package Class1Kadai;

//Carクラスを継承
public class CarNew extends Car {

    CarNew() {

        // Carクラスのコンストラクタを継承
        super();

        // 継承しているCarクラスの変数を、CarNew用に更新
        this.type = "2WD";
        this.price = 80;

    }

}
