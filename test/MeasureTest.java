import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MeasureTest {

    @Test
    public void shouldCheckForEquality() throws Exception {
        QuantitativeMeasure measureOne = new QuantitativeMeasure(1, Unit.KILOGRAM);
        QuantitativeMeasure measureTwo = new QuantitativeMeasure(1000, Unit.GRAM);
        assertEquals(true, measureOne.equals(measureTwo));
    }
    @Test
    public void shouldCheckForEqualityOfTwoDifferentUnit() throws Exception {
        Measure measureOne = new QuantitativeMeasure(1, Unit.KILOGRAM);
        Measure measureTwo = new QuantitativeMeasure(1, Unit.KILOMETER);
        assertEquals(false, measureOne.equals(measureTwo));
    }
    @Test
    public void shouldAddTwoWeights() throws Exception {
        QuantitativeMeasure measureOne = new QuantitativeMeasure(10, Unit.KILOGRAM);
        QuantitativeMeasure measureTwo = new QuantitativeMeasure(1000, Unit.GRAM);
        Measure finalMeasure = new QuantitativeMeasure(11, Unit.KILOGRAM);
        assertEquals(finalMeasure, measureOne.add(measureTwo));
    }

    @Test
    public void shouldCheckForEqualityOfTemperatures() throws Exception {
        NonQuantitativeMeasure measureOne = new NonQuantitativeMeasure(2,Unit.CELSIUS);
        NonQuantitativeMeasure measureTwo = new NonQuantitativeMeasure(275.15, Unit.KELWIN);
        assertEquals(true,measureOne.equals(measureTwo));
    }


}