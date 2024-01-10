/* Java*/
class CarShow {
    public static void main(String[] args){
        // 車をつくります
        Car car = new Car();
        Car car2 = new Car();
        // CarSpecial scar = new CarSpecial();
        CarNew ncar = new CarNew();

        // car.spec();
        car2.price = 200;
        car2.type = "ディーゼル車";
        // car2.spec();
        car.spec();
        // scar.spec();
        ncar.spec();
        
    }
}