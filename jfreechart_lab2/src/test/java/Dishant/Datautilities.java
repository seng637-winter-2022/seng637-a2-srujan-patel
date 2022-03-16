package Dishant;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class Dishant {
    
	private Values2D mockValues2D;
	private KeyedValues mockKeyedValues;
	private int[] a = null;
	private int[] b = null;
	
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testcalculateColumnTotal_1() {
		
		//Checking at large values
		Values2D mockValues2D = mock(Values2D.class);
		when(mockValues2D.getColumnCount()).thenReturn(2);
		when(mockValues2D.getRowCount()).thenReturn(2);
		when(mockValues2D.getValue(0,0)).thenReturn(99999.99999);
		when(mockValues2D.getValue(1,0)).thenReturn(99999.99999);
		
		
		// Checking at values closer to null
		Values2D mockValues2D1 = mock(Values2D.class);
		when(mockValues2D1.getColumnCount()).thenReturn(2);
		when(mockValues2D1.getRowCount()).thenReturn(2);
		when(mockValues2D1.getValue(0,0)).thenReturn(0.000000001);
		when(mockValues2D1.getValue(1,0)).thenReturn(0.000000001);
		
		// MC/DC testing
		
		Values2D mockValues2D2 = mock(Values2D.class);
		when(mockValues2D2.getColumnCount()).thenReturn(2);
		when(mockValues2D2.getRowCount()).thenReturn(0);
		
		Values2D mockValues2D3 = mock(Values2D.class);
		when(mockValues2D3.getColumnCount()).thenReturn(2);
		when(mockValues2D3.getRowCount()).thenReturn(2);
		when(mockValues2D3.getValue(0,0)).thenReturn(0);
		when(mockValues2D3.getValue(1,0)).thenReturn(0);
		
		
		double result_1 = DataUtilities.calculateColumnTotal(mockValues2D, 0);
		double result_11 = DataUtilities.calculateColumnTotal(mockValues2D1, 0);
		double result3_1 = DataUtilities.calculateColumnTotal(mockValues2D2, 0);
		double result3_2 = DataUtilities.calculateColumnTotal(mockValues2D3, 0);
		
		
		assertEquals(199999.99998, result_1, 0.000000001d);
		assertEquals(0.000000002, result_11, 0.000000001d);
		assertEquals(0, result3_1, 0.000000001d);
		assertEquals(0, result3_2, 0.000000001d);
	}
    
	@Test
	public void testcalculateRowTotal_1() {
		
		//Checking at large values
		Values2D mockValues2D = mock(Values2D.class);
		when(mockValues2D.getColumnCount()).thenReturn(2);
		when(mockValues2D.getRowCount()).thenReturn(2);
		when(mockValues2D.getValue(1,0)).thenReturn(99999.99999);
		when(mockValues2D.getValue(1,1)).thenReturn(99999.99999);
		
		// Checking at values closer to null
		Values2D mockValues2D1 = mock(Values2D.class);
		when(mockValues2D1.getColumnCount()).thenReturn(2);
		when(mockValues2D1.getRowCount()).thenReturn(2);
		when(mockValues2D1.getValue(1,0)).thenReturn(0.000000001);
		when(mockValues2D1.getValue(1,1)).thenReturn(0.000000001);
		
		// MC/DC testing
		Values2D mockValues2D2 = mock(Values2D.class);
		when(mockValues2D2.getColumnCount()).thenReturn(0);
		when(mockValues2D2.getRowCount()).thenReturn(2);
		
		Values2D mockValues2D3 = mock(Values2D.class);
		when(mockValues2D3.getColumnCount()).thenReturn(2);
		when(mockValues2D3.getRowCount()).thenReturn(2);
		when(mockValues2D3.getValue(1,0)).thenReturn(0);
		when(mockValues2D3.getValue(1,1)).thenReturn(0);

		
		double result_2 = DataUtilities.calculateRowTotal(mockValues2D, 1);
		double result_22 = DataUtilities.calculateRowTotal(mockValues2D1, 1);
		double result3_1 = DataUtilities.calculateRowTotal(mockValues2D2, 1);
		double result3_2 = DataUtilities.calculateRowTotal(mockValues2D3, 1);
		
		
		assertEquals(199999.99998, result_2, 0.000000001d);
		assertEquals(0.000000002, result_22, 0.000000001d);
		assertEquals(0, result3_1, 0.000000001d);
		assertEquals(0, result3_2, 0.000000001d);
		
	}
	
	@Test
	public void testcalculateColumnTotal_2() {
		
		Values2D mockValues2D = mock(Values2D.class);
		when(mockValues2D.getColumnCount()).thenReturn(4);
		when(mockValues2D.getRowCount()).thenReturn(4);
		when(mockValues2D.getValue(0,0)).thenReturn(-99999.99999);
		when(mockValues2D.getValue(1,0)).thenReturn(-0.000000001);
		when(mockValues2D.getValue(2,0)).thenReturn(-99999.99999);
		when(mockValues2D.getValue(3,0)).thenReturn(0.000000001);
		
		int a[] = {0,2};
		int b[] = {1,3};
		
		//Checking at large negative values(magnitude wise)
		double result_3 = DataUtilities.calculateColumnTotal(mockValues2D, 0, a);
		
		//Checking at values close to null
		double result_33 = DataUtilities.calculateColumnTotal(mockValues2D, 0, b);
		
		// MC/DC Testing
		
		Values2D mockValues2D1 = mock(Values2D.class);
		when(mockValues2D1.getColumnCount()).thenReturn(4);
		when(mockValues2D1.getRowCount()).thenReturn(4);
		when(mockValues2D1.getValue(0,0)).thenReturn(0);
		when(mockValues2D1.getValue(1,0)).thenReturn(9);
		when(mockValues2D1.getValue(2,0)).thenReturn(0);
		when(mockValues2D1.getValue(3,0)).thenReturn(9);
		
		int a1[] = {0,2};
		//int b1[] = {1,3};
		int c[]  = {0,4};
		int d[] = new int[2];
		
		double result3_1 = DataUtilities.calculateColumnTotal(mockValues2D1, 0, c);
		double result3_2 = DataUtilities.calculateColumnTotal(mockValues2D1, 0, a1);
		//double result3_3 = DataUtilities.calculateColumnTotal(mockValues2D1, 0, b1);
		double result3_4 = DataUtilities.calculateColumnTotal(mockValues2D, 0, d);
		
		
		assertEquals(-199999.99998, result_3, 0.000000001d);
		assertEquals(0.000000000, result_33, 0.000000001d);
		assertEquals(0, result3_1, 0.000000001d);
		assertEquals(0, result3_2, 0.000000001d);
		assertEquals(0, result3_4, 0.000000001d);
		
	}
    
	@Test
	public void testcalculateRowTotal_2() {
		
		Values2D mockValues2D = mock(Values2D.class);
		when(mockValues2D.getColumnCount()).thenReturn(4);
		when(mockValues2D.getRowCount()).thenReturn(4);
		when(mockValues2D.getValue(0,0)).thenReturn(-99999.99999);
		when(mockValues2D.getValue(0,1)).thenReturn(-0.000000001);
		when(mockValues2D.getValue(0,2)).thenReturn(-99999.99999);
		when(mockValues2D.getValue(0,3)).thenReturn(0.000000001);
		
		int a[] = {0,2};
		int b[] = {1,3};
		
		//Checking at large negative values(magnitude wise)
		double result_3 = DataUtilities.calculateColumnTotal(mockValues2D, 0, a);
		
		//Checking at values close to null
		double result_33 = DataUtilities.calculateColumnTotal(mockValues2D, 0, b);
		
		// MC/DC Testing
		Values2D mockValues2D1 = mock(Values2D.class);
		when(mockValues2D1.getColumnCount()).thenReturn(4);
		when(mockValues2D1.getRowCount()).thenReturn(4);
		when(mockValues2D1.getValue(0,0)).thenReturn(0);
		when(mockValues2D1.getValue(0,1)).thenReturn(9);
		when(mockValues2D1.getValue(0,2)).thenReturn(0);
		when(mockValues2D1.getValue(0,3)).thenReturn(9);
		
		int a1[] = {0,2};
		//int b1[] = {1,3};
		int c[]  = {0,4};
		int d[] = new int[2];
		
		double result3_1 = DataUtilities.calculateRowTotal(mockValues2D1, 0, c);
		double result3_2 = DataUtilities.calculateRowTotal(mockValues2D1, 0, a1);
		//double result3_3 = DataUtilities.calculateRowTotal(mockValues2D1, 0, b1);
		double result3_4 = DataUtilities.calculateRowTotal(mockValues2D, 0, d);
				
		
		assertEquals(-199999.99998, result_3, 0.000000001d);
		assertEquals(0.000000000, result_33, 0.000000001d);
		assertEquals(0, result3_1, 0.000000001d);
		assertEquals(0, result3_2, 0.000000001d);
		assertEquals(0, result3_4, 0.000000001d);
	
	}
	
	@Test
	public void getCumulativePercentages() {
		
		KeyedValues mockKeyedValues = mock(KeyedValues.class);
		KeyedValues Exp_Result = mock(KeyedValues.class);
		KeyedValues Act_Result = mock(KeyedValues.class);
				
		double[] data = {60.0,75.0,77.0,87.0,104.0,134.0,120.0,125.0,140.0,150.0};
		double[] exp_result = {0.055970149,0.125932836,0.197761194,0.278917910,0.375932836,0.500932836,0.612873134,0.729477612,0.860074627,1.000000000};
	    
	    for(int i=0; i<data.length; i++) {
		
	    	when(mockKeyedValues.getValue(mockKeyedValues.getKey(i))).thenReturn(data[i]);
	    
	    }
	    
	    for(int i=0; i<data.length; i++) {
	    
	    	when(Exp_Result.getValue(Exp_Result.getKey(i))).thenReturn(exp_result[i]);
	    
	    }
	   
	    Act_Result = DataUtilities.getCumulativePercentages(mockKeyedValues);
	    
	    
	    // MC/DC Testing
	    KeyedValues mockKeyedValues1 = mock(KeyedValues.class);
		KeyedValues Exp_Result1 = mock(KeyedValues.class);
		KeyedValues Act_Result1 = mock(KeyedValues.class);
				
		double[] data1 = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		double[] exp_result1 = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
	    
	    for(int i=0; i<data1.length; i++) {
		
	    	when(mockKeyedValues1.getValue(mockKeyedValues1.getKey(i))).thenReturn(data1[i]);
	    
	    }
	    
	    for(int i=0; i<data1.length; i++) {
	    
	    	when(Exp_Result1.getValue(Exp_Result1.getKey(i))).thenReturn(exp_result1[i]);
	    
	    }
	   
	    Act_Result1 = DataUtilities.getCumulativePercentages(mockKeyedValues1);
	    
	    KeyedValues mockKeyedValues2 = mock(KeyedValues.class);
		KeyedValues Exp_Result2 = mock(KeyedValues.class);
		KeyedValues Act_Result2 = mock(KeyedValues.class);
				
		double[] data2 = new double[5];
		double[] exp_result2 = {0.0,0.0,0.0,0.0,0.0};
	    
	    for(int i=0; i<data2.length; i++) {
		
	    	when(mockKeyedValues2.getValue(mockKeyedValues2.getKey(i))).thenReturn(data2[i]);
	    
	    }
	    
	    for(int i=0; i<data2.length; i++) {
	    
	    	when(Exp_Result2.getValue(Exp_Result2.getKey(i))).thenReturn(exp_result2[i]);
	    
	    }
	   
	    Act_Result2 = DataUtilities.getCumulativePercentages(mockKeyedValues2);
	    
	    
	    
	    assertEquals(Exp_Result, Act_Result);
	    assertEquals(Exp_Result1, Act_Result1);
	    assertEquals(Exp_Result2, Act_Result2);
	}
	
	
}