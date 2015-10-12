/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.sync.TSynchronizedLongIntMap;
import gnu.trove.map.TLongIntMap;
import gnu.trove.map.hash.TLongIntHashMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedLongIntMapEvoSuite_Random {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.agent.InstrumentingAgent.initialize(); 
  } 

  @Before 
  public void initTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.deactivate(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      TLongIntMap tLongIntMap0 = null;
      String string0 = "";
      StringTokenizer stringTokenizer0 = new StringTokenizer(string0, string0);
      // Undeclared exception!
      try {
        stringTokenizer0.nextToken();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      String string0 = "";
      File file0 = new File(string0, string0);
      File file1 = file0.getCanonicalFile();
      String string1 = "}";
      File file2 = new File(file1, string1);
      File file3 = file2.getParentFile();
      File file4 = file3.getAbsoluteFile();
      String string2 = file4.toString();
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0, (Object) string2);
      long long0 = (-1470L);
      tSynchronizedLongIntMap0.increment(long0);
      tSynchronizedLongIntMap0.keys(tLongIntHashMap0._set);
      TSynchronizedLongIntMap tSynchronizedLongIntMap1 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0);
      tSynchronizedLongIntMap1.values();
      TSynchronizedLongIntMap tSynchronizedLongIntMap2 = new TSynchronizedLongIntMap((TLongIntMap) tSynchronizedLongIntMap1);
      tSynchronizedLongIntMap0.clear();
      assertEquals("{}", tSynchronizedLongIntMap0.toString());
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 224;
      float float0 = 0.0F;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0, float0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      String string0 = byteArrayOutputStream0.toString();
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0, (Object) string0);
      tSynchronizedLongIntMap0.containsKey((long) int0);
      int int1 = 76;
      tSynchronizedLongIntMap0.putIfAbsent((long) int0, int1);
      tLongIntHashMap0.setAutoCompactionFactor((float) int1);
      TSynchronizedLongIntMap tSynchronizedLongIntMap1 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0);
      tSynchronizedLongIntMap1.valueCollection();
      int int2 = (-406);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int2, int2);
      tSynchronizedLongIntMap0.keySet();
      assertEquals(7, tLongIntHashMap0.capacity());
      
      long long0 = 997L;
      TSynchronizedLongIntMap tSynchronizedLongIntMap2 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap1);
      String string1 = Long.toBinaryString(long0);
      tSynchronizedLongIntMap2.isEmpty();
      TSynchronizedLongIntMap tSynchronizedLongIntMap3 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap1, (Object) string1);
      tSynchronizedLongIntMap2.toString();
      tSynchronizedLongIntMap3.keys();
      TSynchronizedLongIntMap tSynchronizedLongIntMap4 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap1);
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap((TLongIntMap) tSynchronizedLongIntMap4);
      tSynchronizedLongIntMap3.values();
      TSynchronizedLongIntMap tSynchronizedLongIntMap5 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap2);
      tSynchronizedLongIntMap2.size();
      int int3 = 45;
      int int4 = 0;
      tSynchronizedLongIntMap4.getNoEntryValue();
      int int5 = tSynchronizedLongIntMap5.adjustOrPutValue((long) int2, int3, int4);
      assertEquals(0, int5);
  }

  @Test
  public void test3()  throws Throwable  {
      long[] longArray0 = new long[10];
      long long0 = (-1628L);
      longArray0[0] = long0;
      long long1 = 1639L;
      longArray0[1] = long1;
      long long2 = 1874L;
      longArray0[2] = long2;
      long long3 = 0L;
      longArray0[3] = long3;
      long long4 = (-754L);
      longArray0[4] = long4;
      long long5 = 1L;
      longArray0[5] = long5;
      long long6 = 1L;
      longArray0[6] = long6;
      long long7 = (-838L);
      longArray0[7] = long7;
      long long8 = 1L;
      longArray0[8] = long8;
      long long9 = 770L;
      longArray0[9] = long9;
      int[] intArray0 = new int[4];
      int int0 = 0;
      intArray0[0] = int0;
      int int1 = 1;
      intArray0[1] = int1;
      int int2 = 1760;
      intArray0[2] = int2;
      int int3 = 0;
      intArray0[3] = int3;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0);
      tSynchronizedLongIntMap0.clear();
      assertEquals(true, tLongIntHashMap0.isEmpty());
      assertEquals(0, tSynchronizedLongIntMap0.size());
  }

  @Test
  public void test4()  throws Throwable  {
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      Locale locale0 = Locale.ITALY;
      Locale locale1 = Locale.CANADA_FRENCH;
      Object object0 = null;
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0, object0);
      long long0 = 1862L;
      // Undeclared exception!
      try {
        tSynchronizedLongIntMap0.remove(long0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 0;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      String string0 = "";
      float float0 = 586.8111F;
      tLongIntHashMap0.setAutoCompactionFactor(float0);
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0, (Object) string0);
      int[] intArray0 = new int[1];
      intArray0[0] = int0;
      tSynchronizedLongIntMap0.values(intArray0);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap();
      TSynchronizedLongIntMap tSynchronizedLongIntMap1 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap1);
      tSynchronizedLongIntMap1.iterator();
      float float1 = 10.0F;
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap(int0, float1);
      TSynchronizedLongIntMap tSynchronizedLongIntMap2 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap2);
      tSynchronizedLongIntMap2.keys();
      tSynchronizedLongIntMap1.remove((long) int0);
      tSynchronizedLongIntMap2.valueCollection();
      tSynchronizedLongIntMap1.size();
      String string1 = tSynchronizedLongIntMap2.toString();
      assertEquals("{}", string1);
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 0;
      int int1 = 0;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int1);
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0);
      tSynchronizedLongIntMap0.adjustValue((long) int0, int0);
      float float0 = 566.0954F;
      long long0 = 0L;
      int int2 = 0;
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int0, float0, long0, int2);
      long long1 = (-167L);
      tLongIntHashMap1.contains((long) int1);
      tSynchronizedLongIntMap0.keys(tLongIntHashMap1._set);
      tLongIntHashMap1.adjustValue(long1, int0);
      long long2 = 1791L;
      tLongIntHashMap1.containsKey(long2);
      Locale locale0 = Locale.US;
      locale0.getDisplayScript();
      String string0 = locale0.getDisplayVariant();
      TSynchronizedLongIntMap tSynchronizedLongIntMap1 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap1, (Object) string0);
      int[] intArray0 = new int[8];
      intArray0[0] = int2;
      tSynchronizedLongIntMap1.remove(long1);
      tLongIntHashMap1.capacity();
      intArray0[1] = int2;
      intArray0[2] = int0;
      int int3 = (-409);
      intArray0[3] = int3;
      tSynchronizedLongIntMap1.containsKey(long0);
      int int4 = (-1184);
      intArray0[4] = int4;
      int int5 = (-1696);
      intArray0[5] = int5;
      intArray0[6] = int0;
      long long3 = 1L;
      tSynchronizedLongIntMap0.increment(long3);
      intArray0[7] = int0;
      tSynchronizedLongIntMap0.values(intArray0);
      int int6 = tSynchronizedLongIntMap1.get((long) int0);
      assertFalse(int6 == int3);
  }

  @Test
  public void test7()  throws Throwable  {
      TLongIntMap tLongIntMap0 = null;
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = null;
      try {
        tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap(tLongIntMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      long[] longArray0 = new long[8];
      long long0 = 415L;
      longArray0[0] = long0;
      long long1 = 0L;
      longArray0[1] = long1;
      long long2 = (-9223372036854775808L);
      longArray0[2] = long2;
      long long3 = (-1L);
      longArray0[3] = long3;
      long long4 = 0L;
      longArray0[4] = long4;
      long long5 = 0L;
      longArray0[5] = long5;
      long long6 = 1962L;
      longArray0[6] = long6;
      long long7 = (-1030L);
      longArray0[7] = long7;
      int[] intArray0 = new int[1];
      int int0 = 0;
      intArray0[0] = int0;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      String string0 = Integer.toHexString(int0);
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0, (Object) string0);
      long long8 = tSynchronizedLongIntMap0.getNoEntryKey();
      assertFalse(long8 == long6);
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 2030;
      TLongIntMap tLongIntMap0 = null;
      int int1 = 337;
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(int1);
      String string0 = "S$J\"RmI+U2>4";
      try {
        byteArrayOutputStream0.toString(string0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // S$J\"RmI+U2>4
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = (-1921);
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0);
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0);
      int int1 = 164089;
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int1, int1, int1, int1);
      TSynchronizedLongIntMap tSynchronizedLongIntMap1 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap1);
      long long0 = 0L;
      int int2 = 99;
      tSynchronizedLongIntMap0.adjustValue(long0, int2);
      TSynchronizedLongIntMap tSynchronizedLongIntMap2 = new TSynchronizedLongIntMap((TLongIntMap) tSynchronizedLongIntMap1);
      tSynchronizedLongIntMap2.valueCollection();
      boolean boolean0 = tSynchronizedLongIntMap1.increment((long) int0);
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap();
      TSynchronizedLongIntMap tSynchronizedLongIntMap3 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap2);
      long long1 = (-1L);
      int int3 = 60;
      tSynchronizedLongIntMap1.adjustOrPutValue(long1, int1, int3);
      long long2 = 0L;
      tLongIntHashMap1.remove(long2);
      TLongIntHashMap tLongIntHashMap3 = new TLongIntHashMap((TLongIntMap) tSynchronizedLongIntMap3);
      TSynchronizedLongIntMap tSynchronizedLongIntMap4 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap3);
      tLongIntHashMap3.keySet();
      long long3 = (-1085L);
      tLongIntHashMap2.reenableAutoCompaction(boolean0);
      int int4 = 0;
      tSynchronizedLongIntMap2.putIfAbsent(long3, int4);
      boolean boolean1 = false;
      int int5 = 1239;
      int int6 = tSynchronizedLongIntMap1.putIfAbsent((long) int2, int5);
      assertEquals(3, tLongIntHashMap1.size());
      
      Locale locale0 = Locale.TAIWAN;
      String string0 = locale0.toLanguageTag();
      locale0.getExtensionKeys();
      tLongIntHashMap0.equals((Object) string0);
      tLongIntHashMap3.reenableAutoCompaction(boolean1);
      int int7 = tSynchronizedLongIntMap4.getNoEntryValue();
      assertFalse(int7 == int6);
  }

  @Test
  public void test11()  throws Throwable  {
      long[] longArray0 = new long[8];
      long long0 = 0L;
      longArray0[0] = long0;
      long long1 = (-1L);
      longArray0[1] = long1;
      long long2 = 284L;
      longArray0[2] = long2;
      long long3 = (-1L);
      longArray0[3] = long3;
      long long4 = (-298L);
      longArray0[4] = long4;
      long long5 = 1174L;
      longArray0[5] = long5;
      long long6 = 942L;
      longArray0[6] = long6;
      long long7 = 0L;
      longArray0[7] = long7;
      int[] intArray0 = new int[8];
      int int0 = 738;
      intArray0[0] = int0;
      int int1 = (-1480);
      intArray0[1] = int1;
      int int2 = 0;
      intArray0[2] = int2;
      int int3 = 1756;
      intArray0[3] = int3;
      int int4 = (-2001);
      intArray0[4] = int4;
      int int5 = 1363;
      intArray0[5] = int5;
      int int6 = 32;
      intArray0[6] = int6;
      int int7 = 0;
      intArray0[7] = int7;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0);
      String string0 = tLongIntHashMap0.toString();
      TSynchronizedLongIntMap tSynchronizedLongIntMap1 = new TSynchronizedLongIntMap((TLongIntMap) tSynchronizedLongIntMap0, (Object) string0);
      long long8 = 1253L;
      int int8 = tSynchronizedLongIntMap1.remove(long8);
      assertFalse(int8 == int6);
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = (-1554);
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0);
      Locale locale0 = Locale.TAIWAN;
      String string0 = locale0.getDisplayScript();
      long long0 = 0L;
      Long long1 = new Long(long0);
      String string1 = long1.toString();
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0, (Object) string1);
      long long2 = (-338L);
      tSynchronizedLongIntMap0.remove(long2);
      long[] longArray0 = new long[8];
      longArray0[0] = (long) int0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      longArray0[3] = (long) int0;
      longArray0[4] = (long) int0;
      longArray0[5] = (long) int0;
      longArray0[6] = (long) int0;
      longArray0[7] = (long) int0;
      tLongIntHashMap0._set = longArray0;
      TSynchronizedLongIntMap tSynchronizedLongIntMap1 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0, (Object) string0);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tSynchronizedLongIntMap1);
      int int1 = (-653);
      String string2 = Integer.toString(int0, int1);
      TSynchronizedLongIntMap tSynchronizedLongIntMap2 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap1, (Object) string2);
      long long3 = 722L;
      tSynchronizedLongIntMap2.adjustValue(long3, int1);
      long long4 = (-1468L);
      tSynchronizedLongIntMap2.get(long4);
      int[] intArray0 = new int[5];
      TSynchronizedLongIntMap tSynchronizedLongIntMap3 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap1);
      intArray0[0] = int1;
      int int2 = 0;
      intArray0[1] = int2;
      intArray0[2] = int0;
      intArray0[3] = int1;
      intArray0[4] = int0;
      int[] intArray1 = tSynchronizedLongIntMap1.values(intArray0);
      assertSame(intArray0, intArray1);
  }

  @Test
  public void test13()  throws Throwable  {
      int int0 = 966;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0);
      String string0 = Integer.toBinaryString(int0);
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0, (Object) string0);
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: 1111000110://11110001101111000110?1111000110#1111000110
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = 0;
      long long0 = (-9223372036854775808L);
      int int1 = (-1572);
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0, (float) int0, long0, int1);
      TLongIntHashMap tLongIntHashMap1 = null;
      try {
        tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap0);
        fail("Expecting exception: OutOfMemoryError");
      
      } catch(OutOfMemoryError e) {
         //
         // Java heap space
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 2965421;
      long[] longArray0 = new long[5];
      longArray0[0] = (long) int0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      longArray0[3] = (long) int0;
      longArray0[4] = (long) int0;
      int[] intArray0 = new int[4];
      intArray0[0] = int0;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[3] = int0;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      Object object0 = null;
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0, object0);
      TSynchronizedLongIntMap tSynchronizedLongIntMap1 = new TSynchronizedLongIntMap((TLongIntMap) tSynchronizedLongIntMap0);
      // Undeclared exception!
      try {
        tSynchronizedLongIntMap1.equals(object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      int int0 = (-1731);
      long[] longArray0 = new long[6];
      longArray0[0] = (long) int0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      longArray0[3] = (long) int0;
      longArray0[4] = (long) int0;
      longArray0[5] = (long) int0;
      int[] intArray0 = new int[9];
      intArray0[0] = int0;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[3] = int0;
      intArray0[4] = int0;
      intArray0[5] = int0;
      intArray0[6] = int0;
      intArray0[7] = int0;
      intArray0[8] = int0;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      String string0 = "";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected scheme name at index 0: ://#
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = 165;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0, int0);
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0);
      tSynchronizedLongIntMap0.clear();
      assertEquals(0, tSynchronizedLongIntMap0.getNoEntryValue());
  }

  @Test
  public void test18()  throws Throwable  {
      TLongIntMap tLongIntMap0 = null;
      int int0 = 0;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0);
      TSynchronizedLongIntMap tSynchronizedLongIntMap0 = new TSynchronizedLongIntMap((TLongIntMap) tLongIntHashMap0);
      tSynchronizedLongIntMap0.containsValue(int0);
      String string0 = "";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected scheme name at index 0: :#
         //
      }
  }
}
