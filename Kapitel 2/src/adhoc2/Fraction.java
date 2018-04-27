package adhoc2;

public class Fraction {
    private Integer numerator;
    private Integer denominator;

    public Fraction(int numeratorC, int denominatorC) throws IllegalArgumentException {
        this.numerator = numeratorC;

        if (denominatorC == 0) {
            throw new IllegalArgumentException("Nenner ist 0!");
        } else {
            this.denominator = denominatorC;
        }

    }

    Fraction multiplyBy(Fraction source) {
        Fraction target = new Fraction((source.numerator * this.denominator), (source.denominator * this.numerator));
        return target;
    }

    @Override
    public String toString() {
        return (this.numerator + " / " + this.denominator);
    }

}
