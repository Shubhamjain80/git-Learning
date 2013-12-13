public enum Unit {
    GRAM(1, Unit.WEIGHT),
    KILOGRAM(1000, Unit.WEIGHT),


    METER(1, Unit.LENGTH),
    KILOMETER(1000, Unit.LENGTH),

    CELSIUS(273.15, Unit.TEMPERATURE),
    KELWIN(0, Unit.TEMPERATURE);


    private static final String LENGTH = "Length";
    private static final String WEIGHT = "Weight";
    private static final String TEMPERATURE = "Temperature";

    private final double baseValue;
    private final String type;

    Unit(double baseValue, String type) {
        this.baseValue = baseValue;
        this.type = type;
    }



    private double conversionBetweenTemperature(double value) {
        if (this == CELSIUS)
            return value + baseValue;
        return value;
    }



    double baseValue() {
        return baseValue;
    }

    boolean typesAreEqual(Unit that) {
        return this.type == that.type;
    }

    double actualValue(double value) {
        if (this.type == TEMPERATURE) {
            return conversionBetweenTemperature(value);
        }
        return baseValue * value;
    }


}