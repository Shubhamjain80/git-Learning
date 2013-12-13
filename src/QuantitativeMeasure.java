public class QuantitativeMeasure extends Measure {

    public QuantitativeMeasure(double value, Unit unit) {
        super(value, unit);
    }

    private double addBaseValues(QuantitativeMeasure that) {
        return (this.baseValue() + that.baseValue()) / this.unit.baseValue();
    }

    public Measure add(QuantitativeMeasure that) {
        if (this!=null && that!=null && unit.typesAreEqual(that.unit))
            return new QuantitativeMeasure(this.addBaseValues(that), this.unit);
        return null;
    }


}
