/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharSet;
import gnu.trove.map.TCharCharMap;
import gnu.trove.map.hash.TCharCharHashMap;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableCharCharMapEvoSuite_Random {

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
      int int0 = (-170);
      float float0 = 219.42351F;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, float0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char char0 = 'O';
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.put(char0, char0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = (-1943);
      float float0 = 10.0F;
      char char0 = '+';
      char char1 = 'p';
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, float0, char0, char1);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char[] charArray0 = tUnmodifiableCharCharMap0.values(tCharCharHashMap0._set);
      assertNotNull(charArray0);
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 0;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap1 = new TUnmodifiableCharCharMap((TCharCharMap) tUnmodifiableCharCharMap0);
      tUnmodifiableCharCharMap1.hashCode();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap2 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      tUnmodifiableCharCharMap2.keys();
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap2.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 5251529;
      float float0 = 0.0F;
      char[] charArray0 = new char[2];
      char char0 = '2';
      charArray0[0] = char0;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      tUnmodifiableCharCharMap0.values();
      char char1 = 'A';
      charArray0[1] = char1;
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap1 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap1);
      tUnmodifiableCharCharMap1.hashCode();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap2 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap1);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.increment(char0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 17135863;
      float float0 = 653.08734F;
      char char0 = ' ';
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.putAll((TCharCharMap) tCharCharHashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      char[] charArray0 = new char[6];
      char char0 = 'h';
      charArray0[0] = char0;
      char char1 = '1';
      charArray0[1] = char1;
      char char2 = 'e';
      charArray0[0] = char0;
      char char3 = 'c';
      charArray0[1] = char3;
      char char4 = 'X';
      charArray0[2] = char4;
      charArray0[3] = char2;
      charArray0[4] = char2;
      charArray0[5] = char0;
      charArray0[2] = char2;
      char char5 = '&';
      charArray0[3] = char5;
      char char6 = '{';
      charArray0[4] = char6;
      char char7 = '';
      charArray0[5] = char7;
      TCharCharMap tCharCharMap0 = null;
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = null;
      try {
        tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap(tCharCharMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      char[] charArray0 = new char[8];
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char char0 = '/';
      char char1 = 'T';
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.adjustOrPutValue(char0, char0, char1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 0;
      float float0 = 1778.7847F;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, float0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      int int1 = tUnmodifiableCharCharMap0.size();
      assertTrue(int0 == int1);
  }

  @Test
  public void test8()  throws Throwable  {
      char[] charArray0 = new char[3];
      char char0 = 'L';
      charArray0[0] = char0;
      char char1 = 'G';
      charArray0[1] = char1;
      charArray0[0] = char1;
      charArray0[1] = char1;
      charArray0[2] = char1;
      char char2 = ' ';
      charArray0[2] = char2;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char char3 = 'E';
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.remove(char3);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 0;
      float float0 = 1.0F;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char char0 = 'W';
      char char1 = '3';
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.putIfAbsent(char0, char1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = (-640);
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      tUnmodifiableCharCharMap0.size();
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap1 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap1);
      tUnmodifiableCharCharMap0.iterator();
      char char0 = 'a';
      tUnmodifiableCharCharMap1.get(char0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap1.putAll((TCharCharMap) tCharCharHashMap1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = (-459);
      char[] charArray0 = new char[9];
      char char0 = 'h';
      charArray0[0] = char0;
      char char1 = ',';
      charArray0[1] = char1;
      char char2 = '%';
      charArray0[2] = char2;
      char char3 = '%';
      charArray0[3] = char3;
      char char4 = 'E';
      charArray0[4] = char4;
      char char5 = '`';
      charArray0[5] = char5;
      char char6 = 'h';
      charArray0[6] = char6;
      char char7 = '8';
      charArray0[7] = char7;
      char char8 = 'E';
      charArray0[8] = char8;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap((TCharCharMap) tCharCharHashMap0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap1);
      TCharCharHashMap tCharCharHashMap2 = new TCharCharHashMap(int0, int0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap1 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap2);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap1.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = (-485);
      char[] charArray0 = new char[10];
      char char0 = '[';
      charArray0[0] = char0;
      char char1 = 't';
      charArray0[1] = char1;
      char char2 = 'o';
      charArray0[2] = char2;
      char char3 = '~';
      charArray0[3] = char3;
      char char4 = '!';
      charArray0[4] = char4;
      char char5 = 'e';
      charArray0[5] = char5;
      char char6 = 'e';
      charArray0[6] = char6;
      char char7 = '<';
      charArray0[7] = char7;
      char char8 = 'k';
      charArray0[8] = char8;
      char char9 = 'B';
      charArray0[9] = char9;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
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
  public void test13()  throws Throwable  {
      int int0 = (-1463);
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, int0);
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap((TCharCharMap) tCharCharHashMap0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap1);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap1 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap1);
      char char0 = 'm';
      char char1 = 'K';
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.adjustOrPutValue(char0, char1, char1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      char[] charArray0 = new char[10];
      char char0 = 'B';
      charArray0[0] = char0;
      char char1 = '5';
      charArray0[1] = char1;
      char char2 = 't';
      charArray0[2] = char2;
      char char3 = '-';
      charArray0[3] = char3;
      char char4 = 'Y';
      charArray0[4] = char4;
      char char5 = 'P';
      charArray0[5] = char5;
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      tUnmodifiableCharCharMap0.keys(tCharCharHashMap0._set);
      char char6 = '8';
      charArray0[6] = char6;
      char char7 = 'e';
      charArray0[7] = char7;
      char char8 = 'W';
      charArray0[8] = char8;
      char char9 = 's';
      charArray0[9] = char9;
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap1 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap1);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap1.putAll((TCharCharMap) tCharCharHashMap1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = (-224);
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      TUnmodifiableCharSet tUnmodifiableCharSet0 = (TUnmodifiableCharSet)tUnmodifiableCharCharMap0.keySet();
      assertNotNull(tUnmodifiableCharSet0);
      
      char char0 = 'G';
      boolean boolean0 = tUnmodifiableCharCharMap0.isEmpty();
      assertEquals(true, boolean0);
      
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap(int0, (float) int0, char0, char0);
      char char1 = tCharCharHashMap1.getNoEntryValue();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap1 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap1);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap1.adjustValue(char0, char1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      int int0 = 290;
      float float0 = 6.6360896E8F;
      char char0 = '2';
      char char1 = 'Z';
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, float0, char0, char1);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap1 = new TUnmodifiableCharCharMap((TCharCharMap) tUnmodifiableCharCharMap0);
      char char2 = '`';
      char char3 = ']';
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap1.put(char2, char3);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = 934;
      float float0 = 1.0F;
      char char0 = '5';
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(int0, float0, char0, char0);
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap((TCharCharMap) tCharCharHashMap0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap1);
      Locale locale0 = Locale.JAPANESE;
      String string0 = locale0.getVariant();
      boolean boolean0 = tUnmodifiableCharCharMap0.equals((Object) string0);
      assertEquals(false, boolean0);
      
      char char1 = 'r';
      TCharCharHashMap tCharCharHashMap2 = new TCharCharHashMap(int0, (float) int0, char1, char1);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap1 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap2);
      assertTrue(tUnmodifiableCharCharMap1.equals(tUnmodifiableCharCharMap0));
  }

  @Test
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[7];
      char char0 = 'R';
      charArray0[0] = char0;
      char char1 = 't';
      charArray0[1] = char1;
      char char2 = ',';
      charArray0[2] = char2;
      char char3 = ';';
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap((TCharCharMap) tCharCharHashMap0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap1);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap1 = new TUnmodifiableCharCharMap((TCharCharMap) tUnmodifiableCharCharMap0);
      Object object0 = null;
      tUnmodifiableCharCharMap1.equals(object0);
      assertTrue(tUnmodifiableCharCharMap1.equals(tUnmodifiableCharCharMap0));
      
      charArray0[3] = char3;
      char char4 = '2';
      charArray0[4] = char4;
      int int0 = 1615;
      float float0 = 97.3362F;
      char char5 = 'i';
      TCharCharHashMap tCharCharHashMap2 = new TCharCharHashMap(int0, float0, char3, char5);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap2 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap2);
      char char6 = '^';
      charArray0[5] = char6;
      char char7 = '\"';
      charArray0[6] = char7;
      TCharCharHashMap tCharCharHashMap3 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap3 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap3);
      assertFalse(tUnmodifiableCharCharMap3.equals(tUnmodifiableCharCharMap2));
  }
}
