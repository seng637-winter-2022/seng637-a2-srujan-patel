package testprototype_1;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RangeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void shiftTest() {
	
		Range base = new Range(-3.0,3.0);
		double delta = 4.0;
		boolean allowZeroCrossing = true;
		Range exp_output = new Range(1.0,7.0);
		Range act_output = Range.shift(base, delta, allowZeroCrossing);
		assertEquals(act_output, exp_output);
	}

	@Test
	public void isNaNRangeTest() {
	    double upper;
	    double lower;
	    Range range = new Range(-3.25, 3.25);
        boolean act_output = range.isNaNRange();
        assertEquals(act_output, true);
        
	}

	@Test
	public void expandToIncludeTest() {
	    Range range = new Range(-3.25, 3.25);
        double value = 4.0;
        Range act_output = Range.expandToInclude(range, value);
        Range exp_output = new Range(-3.25, 4.0);
        assertEquals(act_output, exp_output);
	}
	
	@Test
	public void combineIgnoringNaNTest() {
	    Range range1 = new Range(-3.25, 3.25);
        Range range2 = new Range(-2.5, 4.5);
        Range exp_output = new Range(-3.25, 4.5);
        Range act_output = Range.combineIgnoringNaN(range1, range2);
        assertEquals(act_output, exp_output);
	}
	
	@Test
	public void intersectsTest() {
	    double b0 = -3.25;
	    double b1 = 9.47;
	    Range range = new Range(5.0, 7.5);
	    Boolean act_output = range.intersects(b0, b1);
	    assertEquals(act_output, true);
	    
	}
}
