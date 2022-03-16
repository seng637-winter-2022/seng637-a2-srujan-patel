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
	
		//Checking at values closer to null
		Range base = new Range(-0.00000001,0.00000001);
		double delta = 0.00000002;
		boolean allowZeroCrossing = true;
		Range exp_output = new Range(0.00000001,0.00000003);
		Range act_output = Range.shift(base, delta, allowZeroCrossing);
		
		//Checking at larger values at large displacements
		Range base1 = new Range(-99999.99999,99999.99999);
		double delta1 = 88888.88888;
		boolean allowZeroCrossing1 = false;
		Range exp_output1 = new Range(-11111.11111,188888.88887);
		Range act_output1 = Range.shift(base1, delta1, allowZeroCrossing1);
				
		assertEquals(exp_output, act_output);
		assertEquals(exp_output1, act_output1);
	}

	@Test
	public void isNaNRangeTest() {
	    
		double upper;
	    double lower;
	    Range range = new Range(-3.25, 3.25);
        boolean act_output = range.isNaNRange();
        
        double upper1;
	    double lower1;
	    Range range1 = new Range(Double.NaN, Double.NaN);
        boolean act_output1 = range.isNaNRange();
        
        assertEquals(false,act_output);
        assertEquals(true,act_output1);
        
	}

	@Test
	public void expandToIncludeTest() {
	    
		//Checking at large values
		Range range = new Range(-99999.99999,99999.99999);
        double value = 999999999.0;
        Range act_output = Range.expandToInclude(range, value);
        Range exp_output = new Range(-99999.99999,999999999.0);
        
        //Checking at null values
        Range range1 = new Range(0.0000000,0.0000000);
        double value1 = 0.0000000;
        Range act_output1 = Range.expandToInclude(range, value);
        Range exp_output1 = new Range(0.0000000,0.0000000);
        
        assertEquals(exp_output,act_output);
        assertEquals(exp_output1,act_output1);
        
	}
	
	@Test
	public void combineIgnoringNaNTest() {
	    
		Range range1 = new Range(-99999.99999, Double.NaN);
        Range range2 = new Range(Double.NaN, 99999.99999);
        Range exp_output = new Range(-99999.99999, 99999.99999);
        Range act_output = Range.combineIgnoringNaN(range1, range2);
        
        Range range11 = new Range(Double.NaN, 0.00000000);
        Range range22 = new Range(-0.00000001, Double.NaN);
        Range exp_output1 = new Range(-0.00000001, 0.00000000);
        Range act_output1 = Range.combineIgnoringNaN(range11, range22);
        
        assertEquals(exp_output,act_output);
        assertEquals(exp_output1,act_output1);
        
	}
	
	@Test
	public void intersectsTest() {
	    
		double b0 = -0.00000001;
	    double b1 = 0.00000001;
	    Range range = new Range(0.00000002,0.00000003);
	    Boolean act_output = range.intersects(b0, b1);
	    
	    double b01 = -99999.99999;
	    double b11 = 99999.99999;
	    Range range1 = new Range(-99999.9901,99999.9901);
	    Boolean act_output1 = range.intersects(b0, b1);
	    
	    assertEquals(false,act_output);
	    assertEquals(true,act_output);

	}
}
