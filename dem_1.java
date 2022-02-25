package testprototype_1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Pair;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.Values2D;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class dem_1 {
    
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
		
		Values2D mockValues2D = mock(Values2D.class);
		//KeyedValues mockKeyedValues = mock(KeyedValues.class);
		when(mockValues2D.getColumnCount()).thenReturn(2);
		when(mockValues2D.getRowCount()).thenReturn(2);
		when(mockValues2D.getValue(0,0)).thenReturn(7.5);
		when(mockValues2D.getValue(1,0)).thenReturn(2.5);
		when(mockValues2D.getValue(0,1)).thenReturn(9.5);
		when(mockValues2D.getValue(1,1)).thenReturn(3.5);
		int a[] = {0};
		int b[] = {0};
		double result_1 = DataUtilities.calculateColumnTotal(mockValues2D, 0);
		assertEquals(result_1, 10.0, 0.000000001d);
		
	}
    
	@Test
	public void testcalculateRowTotal_1() {
		
		Values2D mockValues2D = mock(Values2D.class);
		//KeyedValues mockKeyedValues = mock(KeyedValues.class);
		when(mockValues2D.getColumnCount()).thenReturn(2);
		when(mockValues2D.getRowCount()).thenReturn(2);
		when(mockValues2D.getValue(0,0)).thenReturn(7.5);
		when(mockValues2D.getValue(1,0)).thenReturn(2.5);
		when(mockValues2D.getValue(0,1)).thenReturn(9.5);
		when(mockValues2D.getValue(1,1)).thenReturn(3.5);
		//int a[] = {0};
		//int b[] = {0};
		double result_2 = DataUtilities.calculateRowTotal(mockValues2D, 1);
		assertEquals(result_2, 17.0, 0.000000001d);
		
	}
	
	@Test
	public void testcalculateColumnTotal_2() {
		
		Values2D mockValues2D = mock(Values2D.class);
		//KeyedValues mockKeyedValues = mock(KeyedValues.class);
		when(mockValues2D.getColumnCount()).thenReturn(2);
		when(mockValues2D.getRowCount()).thenReturn(2);
		when(mockValues2D.getValue(0,0)).thenReturn(7.5);
		when(mockValues2D.getValue(1,0)).thenReturn(2.5);
		when(mockValues2D.getValue(0,1)).thenReturn(9.5);
		when(mockValues2D.getValue(1,1)).thenReturn(3.5);
		int a[] = {0};
		//int b[] = {0};
		double result_3 = DataUtilities.calculateColumnTotal(mockValues2D, 0, a);
		assertEquals(result_3, 7.5, 0.000000001d);
		
	}
    
	@Test
	public void testcalculateRowTotal_2() {
		
		Values2D mockValues2D = mock(Values2D.class);
		//KeyedValues mockKeyedValues = mock(KeyedValues.class);
		when(mockValues2D.getColumnCount()).thenReturn(2);
		when(mockValues2D.getRowCount()).thenReturn(2);
		when(mockValues2D.getValue(0,0)).thenReturn(7.5);
		when(mockValues2D.getValue(1,0)).thenReturn(2.5);
		when(mockValues2D.getValue(0,1)).thenReturn(9.5);
		when(mockValues2D.getValue(1,1)).thenReturn(3.5);
		//int a[] = {0};
		int b[] = {0};
		double result_4 = DataUtilities.calculateRowTotal(mockValues2D, 1, b);
		assertEquals(result_4, 2.5, 0.000000001d);
	
	}
	
	@Test
	public void getCumulativePercentages() {
		
		//Comparable mockComparable = mock(Comparable.class);
		KeyedValues mockKeyedValues = mock(KeyedValues.class);
		KeyedValues Exp_Result = mock(KeyedValues.class);
		KeyedValues Act_Result = mock(KeyedValues.class);
		DefaultKeyedValues mockDefaultKeyedValues = mock(DefaultKeyedValues.class);
		//List<Comparable,Double> data = new ArrayList<Comparable,Double> ();
		//List<Number> exp_result = new ArrayList<Number> ();
		//data.setValue(mockKeyedValues.getKey(0), 60);
		//int[] index = {0,1,2,3,4,5,6,7,8,9};
		double[] data = {60.0,135.0,212.0,299.0,403.0,537.0,657.0,782.0,922.0,1072.0};
		double[] exp_result = {0.055970149,0.125932836,0.197761194,0.27891791,0.375932836,0.500932836,0.612873134,0.729477612,0.860074627,1.000000000};
	    //ArrayList<Pair> Data = new ArrayList<Pair> ();
	    //ArrayList<Pair> Exp_Result = new ArrayList<Pair> ();
	    
	   when(mockKeyedValues.getValue(mockKeyedValues.getKey(0))).thenReturn(60.0);
	   when(mockKeyedValues.getValue(mockKeyedValues.getKey(1))).thenReturn(75.0);
	   when(mockKeyedValues.getValue(mockKeyedValues.getKey(2))).thenReturn(77.0);
	   when(mockKeyedValues.getValue(mockKeyedValues.getKey(3))).thenReturn(87.0);
	   when(mockKeyedValues.getValue(mockKeyedValues.getKey(4))).thenReturn(104.0);
	   when(mockKeyedValues.getValue(mockKeyedValues.getKey(5))).thenReturn(134.0);
	   when(mockKeyedValues.getValue(mockKeyedValues.getKey(6))).thenReturn(120.0);
	   when(mockKeyedValues.getValue(mockKeyedValues.getKey(7))).thenReturn(125.0);
	   when(mockKeyedValues.getValue(mockKeyedValues.getKey(8))).thenReturn(140.0);
	   when(mockKeyedValues.getValue(mockKeyedValues.getKey(9))).thenReturn(150.0);
	   
	   when(Exp_Result.getValue(Exp_Result.getKey(0))).thenReturn(0.055970149);
	   when(Exp_Result.getValue(Exp_Result.getKey(1))).thenReturn(0.125932836);
	   when(Exp_Result.getValue(Exp_Result.getKey(2))).thenReturn(0.197761194);
	   when(Exp_Result.getValue(Exp_Result.getKey(3))).thenReturn(0.278917910);
	   when(Exp_Result.getValue(Exp_Result.getKey(4))).thenReturn(0.375932836);
	   when(Exp_Result.getValue(Exp_Result.getKey(5))).thenReturn(0.500932836);
	   when(Exp_Result.getValue(Exp_Result.getKey(6))).thenReturn(0.612873134);
	   when(Exp_Result.getValue(Exp_Result.getKey(7))).thenReturn(0.729477612);
	   when(Exp_Result.getValue(Exp_Result.getKey(8))).thenReturn(0.860074627);
	   when(Exp_Result.getValue(Exp_Result.getKey(9))).thenReturn(1.000000000);
	   
	   Act_Result = DataUtilities.getCumulativePercentages(mockKeyedValues); 
	   for(int i=0; i<10; i++)
	   {
	   assertEquals(mockKeyedValues.getValue(mockKeyedValues.getKey(i)) ,Exp_Result.getValue(Exp_Result.getKey(i)));
	   
	   }
	   
		
		
		
	}
	
	
}
