import org.junit.Test;
import static org.junit.Assert.*;
public class ArrayMethodsTest {
    
    @Test
    public void testWholeSum() {
      // Test #1
      float[] testArray1 = {1.0f, 2.0f, 3.0f, 4.0f};
      float expectedSum1 = 10.0f;
      assertEquals(expectedSum1, ArrayMethods.wholeSum(testArray1), 0.001f);  
      // Test #2
      float[] testArray2 = {-7.5f, 3.2f};
      float expectedSum2 = -4.3f;
      assertEquals(expectedSum2, ArrayMethods.wholeSum(testArray2), 0.001f);  
      // Test #3
      float[] testArray3 = {};
      float expectedSum3 = 0.0f;
      assertEquals(expectedSum3, ArrayMethods.wholeSum(testArray3), 0.001f);

      // Test #4
      float[] testArray4 = {-5.0f, -2.5f, -3.0f, -1.0f};
      float expectedMax4 = -1.0f;
      assertEquals(expectedMax4, ArrayMethods.max(testArray4), 0.001f);

      // Test #5
      float[] testArray5 = {0.0f, 0.0f, 0.0f};
      float expectedMax5 = 0.0f;
      assertEquals(expectedMax5, ArrayMethods.max(testArray5), 0.001f);

      // Test #6
      float[] testArray6 = {2.0f};
      float expectedMax6 = 2.0f;
      assertEquals(expectedMax6, ArrayMethods.max(testArray6), 0.001f);
    }
    @Test
    public void testSumWithRange() {
        // Test #1
        float[] testArray1 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo1 = 1;
        int hi1 = 3;
        float expectedSum1 = 5.0f;
        assertEquals(expectedSum1, ArrayMethods.sum(testArray1, lo1, hi1), 0.001f);

        // Test #2
        float[] testArray2 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo2 = 0;
        int hi2 = 4;
        float expectedSum2 = 10.0f;
        assertEquals(expectedSum2, ArrayMethods.sum(testArray2, lo2, hi2), 0.001f);

        // Test #3
        float[] testArray3 = {1.0f, 2.0f, 3.0f, 4.0f};
        int lo3 = 2;
        int hi3 = 2;
        float expectedSum3 = 0.0f;
        assertEquals(expectedSum3, ArrayMethods.sum(testArray3, lo3, hi3), 0.001f);

       // Test #4
       float[] testArray4 = {-5.0f, -2.5f, -3.0f, -1.0f};
       float expectedMax4 = -1.0f;
       assertEquals(expectedMax4, ArrayMethods.max(testArray4), 0.001f);

       // Test #5
       float[] testArray5 = {0.0f, 0.0f, 0.0f};
       float expectedMax5 = 0.0f;
       assertEquals(expectedMax5, ArrayMethods.max(testArray5), 0.001f);

       // Test #6
       float[] testArray6 = {2.0f};
       float expectedMax6 = 2.0f;
       assertEquals(expectedMax6, ArrayMethods.max(testArray6), 0.001f);
    }

    @Test
    public void testSumWithoutRange() {
        // Test #1
        float[] testArray1 = {1.0f, 2.0f, 3.0f, 4.0f};
        float expectedSum1 = 10.0f;
        assertEquals(expectedSum1, ArrayMethods.sum(testArray1), 0.001f);

        // Test #2
        float[] testArray2 = {-7.5f, 3.2f};
        float expectedSum2 = -4.3f;
        assertEquals(expectedSum2, ArrayMethods.sum(testArray2), 0.001f);

        // Test #3
        float[] testArray3 = {};
        float expectedSum3 = 0.0f;
        assertEquals(expectedSum3, ArrayMethods.sum(testArray3), 0.001f);
        
        // Test #4
        float[] testArray4 = {-5.0f, -2.5f, -3.0f, -1.0f};
        float expectedMax4 = -1.0f;
         assertEquals(expectedMax4, ArrayMethods.max(testArray4), 0.001f);
  
        // Test #5
        float[] testArray5 = {0.0f, 0.0f, 0.0f};
        float expectedMax5 = 0.0f;
        assertEquals(expectedMax5, ArrayMethods.max(testArray5), 0.001f);
  
        // Test #6
        float[] testArray6 = {2.0f};
        float expectedMax6 = 2.0f;
        assertEquals(expectedMax6, ArrayMethods.max(testArray6), 0.001f);
    }
    // min test cases
    @Test
    public void testMinWithRange() {
        // Test #1
        float[] testArray1 = {1.0f, 3.0f, 2.0f, 4.0f};
        float expectedMin1 = 2.0f;
        assertEquals(expectedMin1, ArrayMethods.min(testArray1, 1, 4), 0.001f);

        // Test #2
        float[] testArray2 = {1.0f, 3.0f, 2.0f, 4.0f};
        float expectedMin2 = 1.0f;
        assertEquals(expectedMin2, ArrayMethods.min(testArray2), 0.001f);

        // Test #3
        float[] testArray3 = {};
        float expectedMin3 = Float.NaN;
        assertEquals(expectedMin3, ArrayMethods.min(testArray3), 0.001f);

        // Test #4
        float[] testArray4 = {-5.0f, -2.5f, -3.0f, -1.0f};
        float expectedMin4 = -5.0f;
        assertEquals(expectedMin4, ArrayMethods.min(testArray4), 0.001f);

        // Test #5
        float[] testArray5 = {0.0f, 0.0f, 0.0f};
        float expectedMin5 = 0.0f;
        assertEquals(expectedMin5, ArrayMethods.min(testArray5), 0.001f);

        // Test #6
        float[] testArray6 = {2.0f};
        float expectedMin6 = 2.0f;
        assertEquals(expectedMin6, ArrayMethods.min(testArray6), 0.001f);
    }

    // max test cases 
    @Test
    public void testMaxWithRange() {
        // Test #1
        float[] testArray1 = {1.0f, 3.0f, 2.0f, 4.0f};
        float expectedMax1 = 4.0f;
        assertEquals(expectedMax1, ArrayMethods.max(testArray1, 1, 4), 0.001f);

        // Test #2
        float[] testArray2 = {1.0f, 3.0f, 2.0f};
        float expectedMax2 = 3.0f;
        assertEquals(expectedMax2, ArrayMethods.max(testArray2), 0.001f);

        // Test #3
        float[] testArray3 = {1.0f, 3.0f, 2.0f};
        float expectedMax3 = Float.NaN;
        assertEquals(expectedMax3, ArrayMethods.max(testArray3, 0, 0), 0.001f);


        // Test #4
        float[] testArray4 = {-5.0f, -2.5f, -3.0f, -1.0f};
        float expectedMax4 = -1.0f;
        assertEquals(expectedMax4, ArrayMethods.max(testArray4), 0.001f);
   
        // Test #5
        float[] testArray5 = {0.0f, 0.0f, 0.0f};
        float expectedMax5 = 0.0f;
        assertEquals(expectedMax5, ArrayMethods.max(testArray5), 0.001f);
   
        // Test #6
        float[] testArray6 = {2.0f};
        float expectedMax6 = 2.0f;
        assertEquals(expectedMax6, ArrayMethods.max(testArray6), 0.001f);
    }
    
    //Lowest test cases
    @Test
    public void testArrayLowest() {
        // Test #1
        float[] testArray1 = {1.0f, 3.0f, 2.0f, 4.0f};
        int k1 = 2;
        float[] expectedArray1 = {1.0f, 2.0f};
        float[] result1 = ArrayMethods.lowest(testArray1, k1);
        assertArrayEquals(expectedArray1, result1, 0.001f);

        // Test #2
        float[] testArray2 = {2.0f, 3.0f, 2.0f, 3.0f};
        int k2 = 3;
        float[] result2 = ArrayMethods.lowest(testArray2, k2);
        float[] expectedArray2 = {2.0f, 2.0f, 3.0f};
        assertArrayEquals(expectedArray2, result2, 0.001f);

        // Test #3
        float[] testArray3 = {4.0f, 3.0f, 2.0f, 1.0f};
        int k3 = 2;
        float[] result3 = ArrayMethods.lowest(testArray3, k3);
        float[] expectedArray3 = {1.0f, 2.0f};
        assertArrayEquals(expectedArray3, result3, 0.001f);


        // Test #4
        float[] testArray4 = {4.0f, 3.0f, 2.0f, 1.0f};
        int k4 = 1;
        float[] result4 = ArrayMethods.lowest(testArray4, k4);
        float[] expectedArray4 = {1.0f};
        assertArrayEquals(expectedArray4, result4, 0.001f);

        // Test #5
        float[] testArray5 = {4.0f, 3.0f};
        int k5 = 3;
        float[] result5 = ArrayMethods.lowest(testArray5, k5);
        float[] expectedArray5 = {3.0f, 4.0f, Float.NaN};
        assertArrayEquals(expectedArray5, result5, 0.001f);
    }

   @Test
    public void testArrayHighest() {
        // Test #1: Valid input, k = 2
        float[] testArray1 = {1.0f, 3.0f, 2.0f, 4.0f};
        int k1 = 2;
        float[] expectedHighest1 = {4.0f, 3.0f}; // The expected highest values
        
        float[] result1 = ArrayMethods.highest(testArray1, k1); 
        assertArrayEquals(expectedHighest1, result1, 0.001f);

        // Test #2: k = 0
        float[] testArray2 = {4.0f, 3.0f};
        int k2 = 0;
        float[] expectedHighest2 = {}; // Expected result when k is 0
        
        float[] result2 = ArrayMethods.highest(testArray2, k2); 
        assertArrayEquals(expectedHighest2, result2, 0.001f);

        // Test #3: k larger than array size
        float[] testArray3 = {4.0f, 3.0f};
        int k3 = 3;
        float[] expectedHighest3 = {4.0f, 3.0f, Float.NaN}; // Expected result when k is larger than the array size
        
        float[] result3 = ArrayMethods.highest(testArray3, k3); 
        assertArrayEquals(expectedHighest3, result3, 0.001f);
    }

    @Test
    public void testIsEqualTo() {
        // Test #1
        float[] testArray1 = {1.0f, 2.0f, 3.0f, 2.0f};
        float target1 = 2.0f;
        boolean[] expectedArray1 = {false, true, false, true};
        boolean[] result1 = ArrayMethods.isEqualTo(testArray1, target1);
        assertArrayEquals(expectedArray1, result1);

        // Test #2
        float[] testArray2 = {1.0f, -9999.0f, 3.0f, 2.0f};
        float target2 = -9999.0f;
        boolean[] expectedArray2 = {false, true, false, false};
        boolean[] result2 = ArrayMethods.isEqualTo(testArray2, target2);
        assertArrayEquals(expectedArray2, result2);

        // Extra Test #3
        float[] testArray3 = {1.0f, 1.0f, 1.0f, 1.0f};
        float target3 = 1.0f;
        boolean[] expectedArray3 = {true, true, true, true};
        boolean[] result3 = ArrayMethods.isEqualTo(testArray3, target3);
        assertArrayEquals(expectedArray3, result3);

        // Extra Test #4
        float[] testArray4 = {2.5f, 3.0f, 2.5f, 2.5f};
        float target4 = 2.5f;
        boolean[] expectedArray4 = {true, false, true, true};
        boolean[] result4 = ArrayMethods.isEqualTo(testArray4, target4);
        assertArrayEquals(expectedArray4, result4);

        // Extra Test #5
        float[] testArray5 = {0.0f, 0.0f, 0.0f, 0.0f};
        float target5 = -1.0f;
        boolean[] expectedArray5 = {false, false, false, false};
        boolean[] result5 = ArrayMethods.isEqualTo(testArray5, target5);
        assertArrayEquals(expectedArray5, result5);
    }

    @Test
    public void testLogicalNot() {
        // Test #1
        boolean[] testArray1 = {false, true, false, false};
        boolean[] expectedArray1 = {true, false, true, true};
        boolean[] result1 = ArrayMethods.logicalNot(testArray1);
        assertArrayEquals(expectedArray1, result1);

         // Test #2
         boolean[] testArray2 = {true, false, true, true};
         boolean[] expectedArray2 = {false, true, false, false};
         boolean[] result2 = ArrayMethods.logicalNot(testArray2);
         assertArrayEquals(expectedArray2, result2);
 
         // Test #3
         boolean[] testArray3 = {false, false, true, false, true};
         boolean[] expectedArray3 = {true, true, false, true, false};
         boolean[] result3 = ArrayMethods.logicalNot(testArray3);
         assertArrayEquals(expectedArray3, result3);
 
         // Test #4
         boolean[] testArray4 = {true, true, true, true, true};
         boolean[] expectedArray4 = {false, false, false, false, false};
         boolean[] result4 = ArrayMethods.logicalNot(testArray4);
         assertArrayEquals(expectedArray4, result4);
    }

    @Test
    public void testMean() {
        // Test #1
        float[] testArray1 = {1.0f, -9999.0f, 3.0f, 2.0f};
        boolean[] indicator1 = {true, false, true, true};
        float expectedMean1 = 2.0f;
        float result1 = ArrayMethods.mean(testArray1, indicator1);
        assertEquals(expectedMean1, result1, 0.001f);

        // Extra Test #1
        float[] testArray2 = {0.5f, 0.5f, 0.5f, 0.5f};
        boolean[] indicator2 = {true, true, true, true};
        float expectedMean2 = 0.5f;
        float result2 = ArrayMethods.mean(testArray2, indicator2);
        assertEquals(expectedMean2, result2, 0.001f);

        // Extra Test #2
        float[] testArray3 = {1.0f, 2.0f, 3.0f, 4.0f};
        boolean[] indicator3 = {false, false, false, false};
        float expectedMean3 = Float.NaN;
        float result3 = ArrayMethods.mean(testArray3, indicator3);
        assertEquals(expectedMean3, result3, 0.001f);

        // Extra Test #3
        float[] testArray4 = {1.5f, 2.5f, 3.5f, 4.5f};
        boolean[] indicator4 = {true, true, false, true};
        float expectedMean4 = 2.8333f;
        float result4 = ArrayMethods.mean(testArray4, indicator4);
        assertEquals(expectedMean4, result4, 0.001f);

        // Extra Test #4
        float[] testArray5 = {1.0f, 0.0f, 0.0f, 0.0f};
        boolean[] indicator5 = {false, true, false, true};
        float expectedMean5 = 0.0f;
        float result5 = ArrayMethods.mean(testArray5, indicator5);
        assertEquals(expectedMean5, result5, 0.001f);
    }

    @Test
    public void testIsGreaterThan() {
        // Test #1
        float[] testArray1 = {1.0f, 2.0f, 3.0f, 2.5f};
        float threshold1 = 2.5f;
        boolean[] expectedArray1 = {false, false, true, false};
        boolean[] result1 = ArrayMethods.isGreaterThan(testArray1, threshold1);
        assertArrayEquals(expectedArray1, result1);

        // Test #2
        float[] testArray2 = {0.5f, 0.5f, 0.5f, 0.5f};
        float threshold2 = 1.0f;
        boolean[] expectedArray2 = {false, false, false, false};
        boolean[] result2 = ArrayMethods.isGreaterThan(testArray2, threshold2);
        assertArrayEquals(expectedArray2, result2);

        // Test case: All elements are less than the threshold
        float[] testArray = {1.0f, 2.0f, 3.0f, 4.0f};
        float threshold = 5.0f;
        boolean[] expectedArray = {false, false, false, false};
        boolean[] result = ArrayMethods.isGreaterThan(testArray, threshold);
        assertArrayEquals(expectedArray, result);


        // Test #4 (Additional Test)
        float[] testArray4 = {5.0f, 6.0f, 7.0f, 8.0f};
        float threshold4 = 7.5f;
        boolean[] expectedArray4 = {false, false, false, true};
        boolean[] result4 = ArrayMethods.isGreaterThan(testArray4, threshold4);
        assertArrayEquals(expectedArray4, result4);
    

   }
    @Test
    public void testLogicalAnd() {
        // Test #1
        boolean[] array1 = {false, true, true, false};
        boolean[] array2 = {false, true, false, true};
        boolean[] expectedArray1 = {false, true, false, false};
        boolean[] result1 = ArrayMethods.logicalAnd(array1, array2);
        assertArrayEquals(expectedArray1, result1);

        // Test #2 (Additional Test)
        boolean[] array3 = {true, true, true, true};
        boolean[] array4 = {false, false, false, false};
        boolean[] expectedArray2 = {false, false, false, false};
        boolean[] result2 = ArrayMethods.logicalAnd(array3, array4);
        assertArrayEquals(expectedArray2, result2);

        // Test #3 (Additional Test)
        boolean[] array5 = {true, false, true};
        boolean[] array6 = {true, true, false};
        boolean[] expectedArray3 = {true, false, false};
        boolean[] result3 = ArrayMethods.logicalAnd(array5, array6);
        assertArrayEquals(expectedArray3, result3);

        // Test #4 (Additional Test)
        boolean[] array7 = {true, false, false};
        boolean[] array8 = {true, false, true};
        boolean[] expectedArray4 = {true, false, false};
        boolean[] result4 = ArrayMethods.logicalAnd(array7, array8);
        assertArrayEquals(expectedArray4, result4);
    }
    @Test
    public void testCount() {
        // Test #1
        boolean[] testArray1 = {false, true, true, false, true};
        int expectedCount1 = 3;
        int result1 = ArrayMethods.count(testArray1);
        assertEquals(expectedCount1, result1);
      

        // Test #2 (Additional Test)
        boolean[] testArray2 = {true, true, true, true, true};
        int expectedCount2 = 5;
        int result2 = ArrayMethods.count(testArray2);
        assertEquals(expectedCount2, result2);

        // Test #3 (Additional Test)
        boolean[] testArray3 = {false, false, false, false, false};
        int expectedCount3 = 0;
        int result3 = ArrayMethods.count(testArray3);
        assertEquals(expectedCount3, result3);

         // Test #4 (Additional Test)
         boolean[] testArray4 = {true, true, false, true, false};
         int expectedCount4 = 3;
         int result4 = ArrayMethods.count(testArray4);
         assertEquals(expectedCount4, result4);
 
         // Test #5 (Additional Test)
         boolean[] testArray5 = {};
         int expectedCount5 = 0;
         int result5 = ArrayMethods.count(testArray5);
         assertEquals(expectedCount5, result5);
    }

    @Test
    public void testFindFirst() {
        // Test #1
        boolean[] testArray1 = {false, false, true, false, true};
        int expectedIndex1 = 2;
        int result1 = ArrayMethods.findFirst(testArray1);
        assertEquals(expectedIndex1, result1);

        // Test #2
        boolean[] testArray2 = {false, false, false};
        int expectedIndex2 = -1;
        int result2 = ArrayMethods.findFirst(testArray2);
        assertEquals(expectedIndex2, result2);

        // Test #3 (Additional Test)
        boolean[] testArray3 = {true, true, true};
        int expectedIndex3 = 0;
        int result3 = ArrayMethods.findFirst(testArray3);
        assertEquals(expectedIndex3, result3);

        // Test #4 (Additional Test)
        boolean[] testArray4 = {false, false, false, true};
        int expectedIndex4 = 3;
        int result4 = ArrayMethods.findFirst(testArray4);
        assertEquals(expectedIndex4, result4);
  }
    @Test
    public void testFind() {
        // Test #1
        boolean[] testArray1 = {false, true, true, false, true};
        int[] expectedIndices1 = {1, 2, 4};
        int[] result1 = ArrayMethods.find(testArray1);
        assertArrayEquals(expectedIndices1, result1);

        // Test #2
        boolean[] testArray2 = {false, false, false};
        int[] expectedIndices2 = {};
         int[] result2 = ArrayMethods.find(testArray2);
         assertArrayEquals(expectedIndices2, result2);
 
         // Test #3 (Additional Test)
         boolean[] testArray3 = {true, true, true};
         int[] expectedIndices3 = {0, 1, 2};
         int[] result3 = ArrayMethods.find(testArray3);
         assertArrayEquals(expectedIndices3, result3);
 
         // Test #4 (Additional Test)
         boolean[] testArray4 = {false, true, false, true, false};
         int[] expectedIndices4 = {1, 3};
         int[] result4 = ArrayMethods.find(testArray4);
         assertArrayEquals(expectedIndices4, result4);
    }
}

    



