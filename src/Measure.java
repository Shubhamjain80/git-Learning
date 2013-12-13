public class Measure {
    private double value;
    protected Unit unit;

    public Measure(double value, Unit unit) {
        this.value = value;
        this.unit = unit;
    }


    protected double baseValue() {
        return unit.actualValue(value);
    }


    private boolean baseValuesAreEqual(Measure that) {
        return this.baseValue() == that.baseValue();
    }


    @Override
    public boolean equals(Object that) {
        if (this!=null && that!=null && that.getClass() == this.getClass()) {
            return unit.typesAreEqual(((Measure)that).unit) && baseValuesAreEqual((Measure) that);
        }
        return false;
    }
}
