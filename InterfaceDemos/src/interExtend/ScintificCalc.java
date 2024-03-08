package interExtend;

public class ScintificCalc extends BasicCalculator implements IScintific{
    @Override
    public void square(int x) {
        System.out.println(x*x);
    }

    @Override
    public void cube(int x) {
        System.out.println(x*x*x);
    }
}
