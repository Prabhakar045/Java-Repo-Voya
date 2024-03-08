package interExtend;

public class CalciMain {

    public static void main(String[] args) {

        ICalculator iCalculator = new BasicCalculator();
        iCalculator.add(10,20);
        iCalculator.product(10,10);

        IScintific scintific = new ScintificCalc();
        scintific.cube(2);
        scintific.square(2);
    }
}
