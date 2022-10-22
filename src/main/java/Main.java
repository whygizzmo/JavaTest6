

public class Main {

    public static void main(String[] args) {
        House house = new House(65,3,0,false);

        double price = resultPrice(house);
        System.out.println(price);

    }






    public static double resultPrice(House house){
        if (house.countOfSquares>1 && house.countOfSquares<20){
            house.coefficientOfSquares=0.1;
        } else if (house.countOfSquares>=20 && house.countOfSquares<40) {
            house.coefficientOfSquares=0.2;
        }else if (house.countOfSquares>=40 && house.countOfSquares<80) {
            house.coefficientOfSquares=0.4;
        }else if (house.countOfSquares>=80) {
            house.coefficientOfSquares=0.72;
        }else {house.coefficientOfSquares=0.000000000001;}



        double resSum = house.countOfSquares * (double)house.countOfVillage * house.coefficientOfSquares;

        if (house.gas==true){
            resSum *= 0.5;
        }
        return resSum;
    }
}