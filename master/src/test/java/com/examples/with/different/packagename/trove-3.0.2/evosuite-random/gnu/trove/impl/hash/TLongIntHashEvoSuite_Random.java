/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.TIntCollection;
import gnu.trove.map.TLongIntMap;
import gnu.trove.map.hash.TLongIntHashMap;
import gnu.trove.set.TLongSet;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.Properties.SandboxMode;
import org.evosuite.sandbox.Sandbox;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class TLongIntHashEvoSuite_Random {

  private static ExecutorService executor; 

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.agent.InstrumentingAgent.initialize(); 
    org.evosuite.Properties.SANDBOX_MODE = SandboxMode.RECOMMENDED; 
    Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    executor.shutdownNow(); 
    Sandbox.resetDefaultSecurityManager(); 
  } 

  @Before 
  public void initTestCase(){ 
    Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.agent.InstrumentingAgent.deactivate(); 
  } 


  @Test
  public void test0()  throws Throwable  {
      int int0 = Integer.MIN_VALUE;
      int int1 = (-63);
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0, int0, int0, int1);
      long[] longArray0 = new long[9];
      longArray0[0] = (long) int1;
      byte[] byteArray0 = tLongIntHashMap0._states;
      boolean boolean0 = tLongIntHashMap0.containsKey((long) int0);
      assertEquals(false, boolean0);
      
      longArray0[0] = (long) int1;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      longArray0[3] = (long) int1;
      longArray0[4] = (long) int1;
      longArray0[5] = (long) int1;
      longArray0[6] = (long) int0;
      longArray0[7] = (long) int0;
      longArray0[8] = (long) int0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int1;
      longArray0[3] = (long) int1;
      longArray0[4] = (long) int1;
      longArray0[5] = (long) int0;
      longArray0[6] = (long) int1;
      longArray0[7] = (long) int1;
      tLongIntHashMap0._set = longArray0;
      boolean boolean1 = true;
      // Undeclared exception!
      try {
        tLongIntHashMap0.reenableAutoCompaction(boolean1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      int int0 = 38747;
      int int1 = 841;
      float float0 = 937.5011F;
      long long0 = 423L;
      int int2 = 414;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int1, float0, long0, int2);
      int int3 = tLongIntHashMap0.size();
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int0);
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap();
      int[] intArray0 = new int[10];
      int int4 = (-1);
      int int5 = 0;
      intArray0[0] = int5;
      intArray0[1] = int1;
      int int6 = (-1);
      intArray0[2] = int6;
      intArray0[3] = int4;
      intArray0[4] = int0;
      intArray0[5] = int0;
      intArray0[6] = int2;
      intArray0[7] = int2;
      intArray0[8] = int5;
      intArray0[9] = int5;
      intArray0[0] = int4;
      intArray0[1] = int3;
      intArray0[2] = int3;
      intArray0[3] = int1;
      intArray0[4] = int1;
      intArray0[5] = int2;
      intArray0[6] = int2;
      intArray0[7] = int2;
      intArray0[8] = int0;
      intArray0[9] = int0;
      int[] intArray1 = tLongIntHashMap0.values(intArray0);
      assertEquals(414, tLongIntHashMap0.getNoEntryValue());
      assertEquals(423L, tLongIntHashMap0.getNoEntryKey());
      assertNotNull(intArray1);
      
      float float1 = (-805.43835F);
      TLongSet tLongSet0 = tLongIntHashMap1.keySet();
      assertEquals(0, tLongIntHashMap1.getNoEntryValue());
      assertEquals(0L, tLongSet0.getNoEntryValue());
      
      // Undeclared exception!
      try {
        tLongIntHashMap2.setAutoCompactionFactor(float1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Factor must be >= 0: -805.43835
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap0);
      tLongIntHashMap1.getAutoCompactionFactor();
      long long0 = 0L;
      boolean boolean0 = tLongIntHashMap1.containsKey(long0);
      assertEquals(false, boolean0);
      
      int[] intArray0 = new int[3];
      int int0 = 19373;
      intArray0[0] = int0;
      int int1 = 148;
      intArray0[1] = int1;
      int int2 = 0;
      intArray0[2] = int2;
      int[] intArray1 = tLongIntHashMap1.values(intArray0);
      assertNotNull(intArray1);
      
      tLongIntHashMap1.hashCode();
      int int3 = 0;
      int int4 = 43853;
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap(int4);
      tLongIntHashMap2.containsValue(int4);
      long long1 = tLongIntHashMap2.getNoEntryKey();
      long long2 = 56L;
      tLongIntHashMap2.contains(long2);
      long long3 = (-1L);
      tLongIntHashMap2.contains(long3);
      float float0 = 1526.248F;
      tLongIntHashMap2.tempDisableAutoCompaction();
      long long4 = tLongIntHashMap1.getNoEntryKey();
      assertTrue(long4 == long1);
      
      TLongIntHashMap tLongIntHashMap3 = new TLongIntHashMap(int3, float0, (long) int3, int3);
      assertEquals(0L, tLongIntHashMap3.getNoEntryKey());
      assertEquals(0, tLongIntHashMap3.getNoEntryValue());
      
      tLongIntHashMap1.putAll((TLongIntMap) tLongIntHashMap2);
      assertEquals(0, tLongIntHashMap0.getNoEntryValue());
      assertEquals(87719, tLongIntHashMap2.capacity());
      assertEquals(0, tLongIntHashMap2.getNoEntryValue());
      assertEquals(23, tLongIntHashMap1.capacity());
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = (-1);
      long long0 = 1970L;
      int int1 = (-1567);
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0, (float) int0, long0, int1);
      long[] longArray0 = new long[10];
      longArray0[0] = long0;
      longArray0[1] = long0;
      long long1 = 0L;
      longArray0[2] = long1;
      longArray0[3] = long0;
      longArray0[4] = (long) int1;
      longArray0[5] = (long) int1;
      longArray0[6] = (long) int0;
      longArray0[7] = (long) int0;
      longArray0[8] = (long) int1;
      longArray0[9] = (long) int1;
      long[] longArray1 = tLongIntHashMap0.keys(longArray0);
      assertNotNull(longArray1);
      
      int int2 = (-1175);
      int int3 = (-1);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int3, int3, int2, int2);
      long long2 = (-822L);
      boolean boolean0 = tLongIntHashMap1.contains(long2);
      assertEquals(false, boolean0);
      
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap(int2);
      tLongIntHashMap1.reenableAutoCompaction(boolean0);
      assertEquals((-1175L), tLongIntHashMap1.getNoEntryKey());
      assertEquals(-1175, tLongIntHashMap1.getNoEntryValue());
      
      boolean boolean1 = true;
      tLongIntHashMap2.reenableAutoCompaction(boolean1);
      TLongIntHashMap tLongIntHashMap3 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap2);
      assertEquals(0, tLongIntHashMap2.getNoEntryValue());
      assertEquals(0L, tLongIntHashMap2.getNoEntryKey());
      
      int int4 = 0;
      float float0 = 1008.4059F;
      TLongIntHashMap tLongIntHashMap4 = new TLongIntHashMap();
      assertEquals(23, tLongIntHashMap4.capacity());
      assertEquals(0, tLongIntHashMap4.getNoEntryValue());
      assertEquals(0L, tLongIntHashMap4.getNoEntryKey());
      
      TLongIntHashMap tLongIntHashMap5 = new TLongIntHashMap(int4, float0);
      int int5 = tLongIntHashMap5.size();
      tLongIntHashMap5.ensureCapacity(int5);
      assertEquals(0L, tLongIntHashMap5.getNoEntryKey());
      assertEquals(0, tLongIntHashMap5.getNoEntryValue());
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = (-1819);
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0);
      tLongIntHashMap0.valueCollection();
      int int1 = Integer.MAX_VALUE;
      Locale locale0 = Locale.JAPAN;
      char char0 = 'Z';
      String string0 = locale0.getExtension(char0);
      tLongIntHashMap0.equals((Object) string0);
      int int2 = 1731;
      float float0 = (-584.89453F);
      long long0 = (-687L);
      int int3 = 131;
      tLongIntHashMap0.adjustValue(long0, int3);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int2, float0);
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap1);
      long long1 = (-1815L);
      TLongIntHashMap tLongIntHashMap3 = new TLongIntHashMap(int1, (float) int1, long1, int1);
      int int4 = 915;
      tLongIntHashMap3.put(long1, int4);
      assertEquals(1, tLongIntHashMap3.size());
      
      long long2 = (-1370L);
      boolean boolean0 = tLongIntHashMap1.containsKey(long2);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      long[] longArray0 = new long[6];
      long long0 = 0L;
      longArray0[0] = long0;
      long long1 = (-1530L);
      longArray0[1] = long1;
      long long2 = 639L;
      longArray0[2] = long2;
      long long3 = (-841L);
      longArray0[3] = long3;
      long long4 = 590L;
      longArray0[4] = long4;
      long long5 = 0L;
      longArray0[5] = long5;
      int[] intArray0 = new int[4];
      int int0 = (-1238);
      intArray0[0] = int0;
      intArray0[1] = int0;
      intArray0[2] = int0;
      int int1 = (-971);
      intArray0[3] = int1;
      int int2 = 0;
      intArray0[0] = int2;
      int int3 = 1907;
      intArray0[1] = int3;
      int int4 = (-1945);
      intArray0[2] = int4;
      int int5 = 1973;
      intArray0[3] = int5;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      assertEquals(4, tLongIntHashMap0.size());
      
      tLongIntHashMap0.clear();
      assertEquals(0L, tLongIntHashMap0.getNoEntryKey());
  }

  @Test
  public void test6()  throws Throwable  {
      int int0 = 0;
      int int1 = (-1786);
      float float0 = 381.39334F;
      long long0 = 0L;
      int int2 = 759155483;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int1, float0, long0, int2);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap0);
      tLongIntHashMap1.compact();
      assertEquals(0L, tLongIntHashMap0.getNoEntryKey());
      assertEquals(759155483, tLongIntHashMap0.getNoEntryValue());
      
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap(int0);
      TIntCollection tIntCollection0 = tLongIntHashMap2.valueCollection();
      assertEquals(0, tIntCollection0.getNoEntryValue());
      assertEquals(0L, tLongIntHashMap2.getNoEntryKey());
  }

  @Test
  public void test7()  throws Throwable  {
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      long[] longArray0 = new long[2];
      tLongIntHashMap0.valueCollection();
      long long0 = (-288L);
      longArray0[0] = long0;
      longArray0[0] = long0;
      longArray0[1] = long0;
      longArray0[1] = long0;
      long long1 = 0L;
      longArray0[0] = long1;
      long long2 = (-1195L);
      tLongIntHashMap0.containsKey(long2);
      int int0 = (-1148);
      tLongIntHashMap0.adjustValue(longArray0[1], int0);
      long long3 = 0L;
      long[] longArray1 = tLongIntHashMap0.keys();
      assertNotNull(longArray1);
      
      longArray0[1] = long3;
      tLongIntHashMap0.keys(longArray0);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap0);
      assertEquals(23, tLongIntHashMap0.capacity());
      
      tLongIntHashMap0.compact();
      assertEquals(0, tLongIntHashMap0.getNoEntryValue());
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 1631;
      float float0 = (-1.0F);
      long long0 = 1138L;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0, float0, long0, int0);
      assertEquals(3, tLongIntHashMap0.capacity());
      
      tLongIntHashMap0.trimToSize();
      assertEquals(1631, tLongIntHashMap0.getNoEntryValue());
      assertEquals(1138L, tLongIntHashMap0.getNoEntryKey());
  }

  @Test
  public void test9()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
          tLongIntHashMap0.compact();
          String string0 = "\nequals() of a or b object are asymmetric";
          File file0 = null;
          // Undeclared exception!
          try {
            File.createTempFile(string0, string0, file0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Unable to create temporary file
             //
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test10()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            public void run() { 
        try {
          int int0 = 850;
          float float0 = 1808.8612F;
          TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0, float0, (long) int0, int0);
          TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap0);
          long long0 = 1729L;
          tLongIntHashMap1.increment(long0);
          int int1 = 1437;
          long long1 = 1L;
          int int2 = 0;
          TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap(int1, (float) int1, long1, int2);
          tLongIntHashMap2.isEmpty();
          TLongIntHashMap tLongIntHashMap3 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap2);
          String string0 = "";
          FileOutputStream fileOutputStream0 = null;
          try {
            fileOutputStream0 = new FileOutputStream(string0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1567)
             // org.evosuite.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:303)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:203)
             // java.io.FileOutputStream.<init>(FileOutputStream.java:104)
             // sun.reflect.GeneratedConstructorAccessor15.newInstance(Unknown Source)
             // sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.lang.reflect.Constructor.newInstance(Constructor.java:525)
             // org.evosuite.testcase.ConstructorStatement$1.execute(ConstructorStatement.java:226)
             // org.evosuite.testcase.AbstractStatement.exceptionHandler(AbstractStatement.java:144)
             // org.evosuite.testcase.ConstructorStatement.execute(ConstructorStatement.java:188)
             // org.evosuite.testcase.TestRunnable.call(TestRunnable.java:291)
             // org.evosuite.testcase.TestRunnable.call(TestRunnable.java:1)
             // java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:334)
             // java.util.concurrent.FutureTask.run(FutureTask.java:166)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1110)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:603)
             // java.lang.Thread.run(Thread.java:722)
             //
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    }); 
    future.get(6000, TimeUnit.MILLISECONDS); 
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 0;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0);
      int int1 = tLongIntHashMap0.remove((long) int0);
      assertEquals(0, int1);
      assertEquals(true, tLongIntHashMap0.isEmpty());
      assertEquals(0L, tLongIntHashMap0.getNoEntryKey());
  }

  @Test
  public void test12()  throws Throwable  {
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      float float0 = tLongIntHashMap0.getAutoCompactionFactor();
      boolean boolean0 = true;
      tLongIntHashMap0.reenableAutoCompaction(boolean0);
      int int0 = 210;
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int0, float0);
      assertEquals(23, tLongIntHashMap0.capacity());
      
      int int1 = 164;
      tLongIntHashMap0.ensureCapacity(int1);
      tLongIntHashMap1.putAll((TLongIntMap) tLongIntHashMap0);
      tLongIntHashMap1.values();
      tLongIntHashMap1.capacity();
      tLongIntHashMap0.putAll((TLongIntMap) tLongIntHashMap1);
      tLongIntHashMap0.hashCode();
      assertEquals(0L, tLongIntHashMap0.getNoEntryKey());
  }

  @Test
  public void test13()  throws Throwable  {
      long[] longArray0 = new long[9];
      long long0 = (-950L);
      longArray0[0] = long0;
      long long1 = 1L;
      longArray0[1] = long1;
      long long2 = 0L;
      longArray0[2] = long2;
      long long3 = 813L;
      longArray0[3] = long3;
      long long4 = (-577L);
      longArray0[4] = long4;
      long long5 = 0L;
      longArray0[5] = long5;
      long long6 = 1L;
      longArray0[6] = long6;
      long long7 = 2012L;
      longArray0[7] = long7;
      long long8 = (-1817L);
      longArray0[8] = long8;
      int[] intArray0 = new int[3];
      int int0 = 0;
      intArray0[0] = int0;
      int int1 = 189;
      intArray0[1] = int1;
      int int2 = 448;
      intArray0[2] = int2;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      int int3 = tLongIntHashMap0.getNoEntryValue();
      assertEquals(23, tLongIntHashMap0.capacity());
      assertEquals("{-950=0, 1=189, 0=448}", tLongIntHashMap0.toString());
      assertEquals(0, int3);
      
      int int4 = (-1944);
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int4);
      tLongIntHashMap1.containsValue(int4);
      assertEquals(0L, tLongIntHashMap1.getNoEntryKey());
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = 0;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0);
      boolean boolean0 = tLongIntHashMap0.containsKey((long) int0);
      assertEquals(false, boolean0);
      assertEquals(0L, tLongIntHashMap0.getNoEntryKey());
      assertEquals(0, tLongIntHashMap0.getNoEntryValue());
  }

  @Test
  public void test15()  throws Throwable  {
      int int0 = 0;
      float float0 = 0.0F;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(int0, float0, (long) int0, int0);
      long[] longArray0 = new long[1];
      longArray0[0] = (long) int0;
      tLongIntHashMap0.keys(longArray0);
      float float1 = (-875.48096F);
      String string0 = "_*F^Ckus^tn?Q";
      PrintStream printStream0 = null;
      try {
        printStream0 = new PrintStream(string0, string0);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
         //
         // _*F^Ckus^tn?Q
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap();
      long long0 = 301L;
      int int0 = 34;
      tLongIntHashMap0.adjustValue(long0, int0);
      int int1 = 1966;
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap();
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap(int1);
      TLongIntHashMap tLongIntHashMap3 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap2);
      long long1 = (-837L);
      TLongIntHashMap tLongIntHashMap4 = new TLongIntHashMap(int1, (float) int1, long1, int1);
      int int2 = (-1987);
      long long2 = (-559L);
      tLongIntHashMap4.remove(long2);
      TLongIntHashMap tLongIntHashMap5 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap3);
      tLongIntHashMap1.capacity();
      HashMap<Object, Object> hashMap0 = null;
      try {
        hashMap0 = new HashMap<Object, Object>(int2, (float) long1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -1987
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = 803;
      long[] longArray0 = new long[8];
      longArray0[0] = (long) int0;
      longArray0[1] = (long) int0;
      longArray0[2] = (long) int0;
      longArray0[3] = (long) int0;
      longArray0[4] = (long) int0;
      longArray0[5] = (long) int0;
      longArray0[6] = (long) int0;
      longArray0[7] = (long) int0;
      int[] intArray0 = new int[10];
      intArray0[0] = int0;
      intArray0[1] = int0;
      intArray0[2] = int0;
      intArray0[3] = int0;
      intArray0[4] = int0;
      intArray0[5] = int0;
      intArray0[6] = int0;
      intArray0[7] = int0;
      intArray0[8] = int0;
      intArray0[9] = int0;
      TLongIntHashMap tLongIntHashMap0 = new TLongIntHashMap(longArray0, intArray0);
      assertEquals(0, tLongIntHashMap0.getNoEntryValue());
      assertEquals(1, tLongIntHashMap0.size());
      assertEquals(23, tLongIntHashMap0.capacity());
      assertEquals(0L, tLongIntHashMap0.getNoEntryKey());
      
      int int1 = 1;
      TLongIntHashMap tLongIntHashMap1 = new TLongIntHashMap(int1, int0);
      TLongIntHashMap tLongIntHashMap2 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap1);
      tLongIntHashMap2.size();
      TLongIntHashMap tLongIntHashMap3 = new TLongIntHashMap(int0, int0);
      TLongIntHashMap tLongIntHashMap4 = new TLongIntHashMap((TLongIntMap) tLongIntHashMap3);
      tLongIntHashMap4.clear();
      tLongIntHashMap2.hashCode();
      assertEquals(0, tLongIntHashMap2.getNoEntryValue());
      assertEquals(0L, tLongIntHashMap2.getNoEntryKey());
      assertEquals(0L, tLongIntHashMap1.getNoEntryKey());
  }
}
