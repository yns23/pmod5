public record UnmodifiableFraction(Fraction fraction) implements Fraction {

    
    public UnmodifiableFraction {
    }

    @Override
    public int getNumerator() {
        return fraction.getNumerator();
    }

    @Override
    public int getDenominator() {
        return fraction.getDenominator();
    }

    @Override
    public void setNumerator(int numerator) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setDenominator(int denominator) {
        throw new UnsupportedOperationException();
    }
}
