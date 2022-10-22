public class House {
    public int countOfSquares;
    public int countOfVillage;
    public double coefficientOfSquares;
    public boolean gas;

    public House() {
    }

    public House(int countOfSquares, int countOfVillage, double coefficientOfSquares, boolean gas) {
        this.countOfSquares = countOfSquares;
        this.countOfVillage = countOfVillage;
        this.coefficientOfSquares = coefficientOfSquares;
        this.gas = gas;
    }

    public int getCountOfSquares() {
        return countOfSquares;
    }

    public void setCountOfSquares(int countOfSquares) {
        this.countOfSquares = countOfSquares;
    }

    public int getCountOfVillage() {
        return countOfVillage;
    }

    public void setCountOfVillage(int countOfVillage) {
        this.countOfVillage = countOfVillage;
    }

    public double getCoefficientOfSquares() {
        return coefficientOfSquares;
    }

    public void setCoefficientOfSquares(double coefficientOfSquares) {
        this.coefficientOfSquares = coefficientOfSquares;
    }

    public boolean isGas() {
        return gas;
    }

    public void setGas(boolean gas) {
        this.gas = gas;
    }
}
