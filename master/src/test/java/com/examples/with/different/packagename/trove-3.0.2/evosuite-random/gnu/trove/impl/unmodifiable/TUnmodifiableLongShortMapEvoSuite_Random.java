/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableLongShortMap;
import gnu.trove.map.TLongShortMap;
import gnu.trove.map.hash.TLongShortHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.Locale;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableLongShortMapEvoSuite_Random {

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
      int int0 = (-1);
      long long0 = (-531L);
      short short0 = (short)609;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap(int0, (float) int0, long0, short0);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      short short1 = (short)1621;
      short short2 = (short)2;
      // Undeclared exception!
      try {
        tUnmodifiableLongShortMap0.adjustOrPutValue((long) int0, short1, short2);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      long[] longArray0 = new long[2];
      long long0 = (-1659L);
      longArray0[0] = long0;
      long long1 = 76L;
      longArray0[1] = long1;
      short[] shortArray0 = new short[7];
      short short0 = (short)1759;
      shortArray0[0] = short0;
      short short1 = (short)0;
      shortArray0[1] = short1;
      short short2 = (short) (-30055);
      shortArray0[2] = short2;
      short short3 = (short)2781;
      shortArray0[3] = short3;
      short short4 = (short)1414;
      shortArray0[4] = short4;
      short short5 = (short)0;
      shortArray0[5] = short5;
      short short6 = (short) (-1);
      shortArray0[6] = short6;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap(longArray0, shortArray0);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      tUnmodifiableLongShortMap0.iterator();
      TLongShortHashMap tLongShortHashMap1 = new TLongShortHashMap();
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap1 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap1);
      tUnmodifiableLongShortMap1.valueCollection();
      long long2 = (-582L);
      tLongShortHashMap1.iterator();
      short short7 = (short)0;
      long long3 = 0L;
      tUnmodifiableLongShortMap1.values();
      short short8 = (short)1074;
      // Undeclared exception!
      try {
        tUnmodifiableLongShortMap1.adjustValue(long3, short8);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 0;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap(int0);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      TLongShortHashMap tLongShortHashMap1 = new TLongShortHashMap();
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap1 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap1);
      tUnmodifiableLongShortMap1.iterator();
      long long0 = (-1103L);
      short short0 = (short) (-22233);
      // Undeclared exception!
      try {
        tUnmodifiableLongShortMap1.adjustValue(long0, short0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 1802;
      float float0 = 836.07544F;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap(int0, float0);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      long long0 = 0L;
      short short0 = (short)14;
      // Undeclared exception!
      try {
        tUnmodifiableLongShortMap0.put(long0, short0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      TLongShortMap tLongShortMap0 = null;
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = null;
      try {
        tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap(tLongShortMap0);
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
      float float0 = (-1613.8219F);
      short short0 = (short)0;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap(int0, float0, (long) int0, short0);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      int int1 = 256;
      TLongShortMap tLongShortMap0 = null;
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap1 = null;
      try {
        tUnmodifiableLongShortMap1 = new TUnmodifiableLongShortMap(tLongShortMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      TLongShortMap tLongShortMap0 = null;
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = null;
      try {
        tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap(tLongShortMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 1993;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap();
      short short0 = (short) (-823);
      short short1 = (short)1;
      tLongShortHashMap0.adjustOrPutValue((long) int0, short0, short1);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      long long0 = 0L;
      tUnmodifiableLongShortMap0.get(long0);
      TLongShortHashMap tLongShortHashMap1 = new TLongShortHashMap(int0);
      tUnmodifiableLongShortMap0.iterator();
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap1 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap1);
      long long1 = 0L;
      tUnmodifiableLongShortMap1.hashCode();
      // Undeclared exception!
      try {
        tUnmodifiableLongShortMap1.remove(long1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 17135863;
      long long0 = 1897L;
      int int1 = 0;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap(int1, int0);
      TLongShortHashMap tLongShortHashMap1 = new TLongShortHashMap((TLongShortMap) tLongShortHashMap0);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap1);
      short short0 = (short)842;
      // Undeclared exception!
      try {
        tUnmodifiableLongShortMap0.put((long) int0, short0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 456;
      float float0 = 0.0F;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap();
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      long long0 = (-2026L);
      // Undeclared exception!
      try {
        tUnmodifiableLongShortMap0.remove(long0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      long[] longArray0 = new long[8];
      long long0 = 0L;
      longArray0[0] = long0;
      long long1 = (-1710L);
      longArray0[1] = long1;
      long long2 = (-1201L);
      longArray0[2] = long2;
      long long3 = (-609L);
      longArray0[3] = long3;
      long long4 = (-9223372036854775808L);
      longArray0[4] = long4;
      long long5 = (-533L);
      longArray0[5] = long5;
      long long6 = 295L;
      longArray0[6] = long6;
      long long7 = (-289L);
      longArray0[7] = long7;
      short[] shortArray0 = new short[8];
      short short0 = (short)0;
      shortArray0[0] = short0;
      short short1 = (short)325;
      shortArray0[1] = short1;
      short short2 = (short) (-879);
      shortArray0[2] = short2;
      short short3 = (short)2037;
      shortArray0[3] = short3;
      short short4 = (short) (-591);
      shortArray0[4] = short4;
      short short5 = (short)15689;
      shortArray0[5] = short5;
      short short6 = (short)0;
      shortArray0[6] = short6;
      short short7 = (short) (-1599);
      shortArray0[7] = short7;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap(longArray0, shortArray0);
      TLongShortHashMap tLongShortHashMap1 = new TLongShortHashMap((TLongShortMap) tLongShortHashMap0);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap1);
      Locale locale0 = Locale.TAIWAN;
      String string0 = locale0.toString();
      boolean boolean0 = tUnmodifiableLongShortMap0.equals((Object) string0);
      assertEquals(false, boolean0);
  }

  @Test
  public void test11()  throws Throwable  {
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap();
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      long long0 = 0L;
      short short0 = (short)0;
      // Undeclared exception!
      try {
        tUnmodifiableLongShortMap0.adjustValue(long0, short0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 19;
      float float0 = (-1091.9122F);
      long[] longArray0 = new long[3];
      long long0 = (-1L);
      longArray0[0] = long0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      short[] shortArray0 = new short[6];
      short short0 = (short)0;
      shortArray0[0] = short0;
      short short1 = (short)552;
      shortArray0[1] = short1;
      short short2 = (short)0;
      shortArray0[2] = short2;
      short short3 = (short) (-1085);
      shortArray0[3] = short3;
      short short4 = (short)0;
      shortArray0[4] = short4;
      short short5 = (short) (-1440);
      shortArray0[5] = short5;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap(longArray0, shortArray0);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      Locale locale0 = Locale.TAIWAN;
      Locale locale1 = Locale.UK;
      String string0 = locale0.getDisplayCountry(locale1);
      tUnmodifiableLongShortMap0.equals((Object) string0);
      short short6 = (short)0;
      TLongShortHashMap tLongShortHashMap1 = new TLongShortHashMap(int0, float0, (long) int0, short6);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap1 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap1);
      tUnmodifiableLongShortMap1.valueCollection();
      tLongShortHashMap1.compact();
      assertEquals(0, tLongShortHashMap1.size());
  }

  @Test
  public void test13()  throws Throwable  {
      long[] longArray0 = new long[6];
      long long0 = 1059L;
      longArray0[0] = long0;
      long long1 = 0L;
      longArray0[1] = long1;
      long long2 = (-5L);
      longArray0[2] = long2;
      int int0 = 61169;
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap(int0);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      String string0 = "";
      File file0 = new File(string0);
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream(file0, string0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // 
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = (-471);
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap(int0);
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      boolean boolean0 = tUnmodifiableLongShortMap0.isEmpty();
      assertEquals(true, boolean0);
      
      tUnmodifiableLongShortMap0.size();
      assertEquals(true, tUnmodifiableLongShortMap0.isEmpty());
  }

  @Test
  public void test15()  throws Throwable  {
      TLongShortHashMap tLongShortHashMap0 = new TLongShortHashMap();
      TUnmodifiableLongShortMap tUnmodifiableLongShortMap0 = new TUnmodifiableLongShortMap((TLongShortMap) tLongShortHashMap0);
      long long0 = 1L;
      tUnmodifiableLongShortMap0.getNoEntryKey();
      tLongShortHashMap0.getNoEntryValue();
      short short0 = (short)120;
      tUnmodifiableLongShortMap0.keySet();
      // Undeclared exception!
      try {
        tUnmodifiableLongShortMap0.putIfAbsent(long0, short0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
