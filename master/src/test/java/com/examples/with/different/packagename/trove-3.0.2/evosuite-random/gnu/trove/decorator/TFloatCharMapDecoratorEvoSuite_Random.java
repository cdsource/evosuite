/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.decorator;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.decorator.TFloatCharMapDecorator;
import gnu.trove.map.TFloatCharMap;
import gnu.trove.map.hash.TFloatCharHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.RandomAccessFile;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TFloatCharMapDecoratorEvoSuite_Random {

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
      float[] floatArray0 = new float[8];
      float float0 = 10.0F;
      floatArray0[0] = float0;
      float float1 = 0.0F;
      floatArray0[1] = float1;
      float float2 = 753.12115F;
      floatArray0[2] = float2;
      float float3 = 0.0F;
      floatArray0[3] = float3;
      float float4 = (-280.29507F);
      floatArray0[4] = float4;
      float float5 = 0.0F;
      floatArray0[5] = float5;
      float float6 = (-265.10013F);
      floatArray0[6] = float6;
      float float7 = 635.9337F;
      floatArray0[7] = float7;
      char[] charArray0 = new char[1];
      char char0 = '1';
      charArray0[0] = char0;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator((TFloatCharMap) tFloatCharHashMap0);
      Locale locale0 = Locale.JAPAN;
      String string0 = locale0.getDisplayVariant();
      tFloatCharMapDecorator0.containsKey((Object) string0);
      TFloatCharMapDecorator tFloatCharMapDecorator1 = new TFloatCharMapDecorator();
      Set<Map.Entry<Float, Character>> set0 = (Set<Map.Entry<Float, Character>>)tFloatCharMapDecorator1.entrySet();
      assertNotNull(set0);
  }

  @Test
  public void test1()  throws Throwable  {
      float[] floatArray0 = new float[7];
      float float0 = (-1779.6063F);
      floatArray0[0] = float0;
      float float1 = 918.37616F;
      floatArray0[1] = float1;
      float float2 = 0.0F;
      floatArray0[2] = float2;
      float float3 = Float.NEGATIVE_INFINITY;
      floatArray0[3] = float3;
      float float4 = 10.0F;
      floatArray0[4] = float4;
      float float5 = (-1.0F);
      floatArray0[5] = float5;
      float float6 = 0.0F;
      floatArray0[6] = float6;
      char[] charArray0 = new char[6];
      char char0 = 'w';
      charArray0[0] = char0;
      char char1 = '8';
      charArray0[1] = char1;
      char char2 = '7';
      charArray0[2] = char2;
      char char3 = '{';
      charArray0[3] = char3;
      char char4 = 'T';
      charArray0[4] = char4;
      char char5 = '1';
      charArray0[5] = char5;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator((TFloatCharMap) tFloatCharHashMap0);
      assertEquals(false, tFloatCharMapDecorator0.isEmpty());
  }

  @Test
  public void test2()  throws Throwable  {
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator();
      String string0 = "h";
      String string1 = "P'@>} ";
      URI uRI0 = new URI(string0, string1, string1);
      URI uRI1 = null;
      try {
        uRI1 = new URI(string1, string0, string1);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Illegal character in scheme name at index 1: P'@>} :h#P'@%3E%7D%20
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator();
      Set<Float> set0 = tFloatCharMapDecorator0.keySet();
      assertNotNull(set0);
  }

  @Test
  public void test4()  throws Throwable  {
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator();
      TFloatCharMap tFloatCharMap0 = tFloatCharMapDecorator0.getMap();
      TFloatCharMapDecorator tFloatCharMapDecorator1 = new TFloatCharMapDecorator(tFloatCharMap0);
      // Undeclared exception!
      try {
        tFloatCharMapDecorator1.size();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator();
      // Undeclared exception!
      try {
        tFloatCharMapDecorator0.clear();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      TFloatCharMap tFloatCharMap0 = null;
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator();
      tFloatCharMapDecorator0.entrySet();
      float float0 = (-979.6439F);
      Float float1 = new Float(float0);
      String string0 = "t";
      // Undeclared exception!
      try {
        File.createTempFile(string0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Prefix string too short
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator();
      // Undeclared exception!
      try {
        tFloatCharMapDecorator0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator();
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 481;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, int0);
      AbstractMap.SimpleImmutableEntry<Integer, TFloatCharHashMap> abstractMap_SimpleImmutableEntry0 = new AbstractMap.SimpleImmutableEntry<Integer, TFloatCharHashMap>((Integer) int0, tFloatCharHashMap0);
      abstractMap_SimpleImmutableEntry0.getKey();
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap(int0);
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator((TFloatCharMap) tFloatCharHashMap1);
      float float0 = 94.55425F;
      char char0 = '!';
      TFloatCharHashMap tFloatCharHashMap2 = new TFloatCharHashMap(int0, float0, float0, char0);
      AbstractMap.SimpleImmutableEntry<Object, Float> abstractMap_SimpleImmutableEntry1 = new AbstractMap.SimpleImmutableEntry<Object, Float>((Object) tFloatCharHashMap2, (Float) float0);
      TFloatCharHashMap tFloatCharHashMap3 = (TFloatCharHashMap)tFloatCharMapDecorator0.getMap();
      tFloatCharMapDecorator0.hashCode();
      TFloatCharMapDecorator tFloatCharMapDecorator1 = new TFloatCharMapDecorator((TFloatCharMap) tFloatCharHashMap3);
      double double0 = (-329.7526630785087);
      tFloatCharMapDecorator0.getMap();
      Float float1 = new Float(double0);
      String string0 = ">";
      File file0 = new File(string0);
      String string1 = file0.getPath();
      tFloatCharMapDecorator1.toString();
      tFloatCharMapDecorator1.put((Float) float0, (Character) char0);
      Character character0 = tFloatCharMapDecorator0.get((Object) string1);
      tFloatCharMapDecorator0.put(float1, character0);
      tFloatCharMapDecorator1.put(float1, character0);
      assertEquals(false, tFloatCharMapDecorator0.isEmpty());
      assertEquals(2, tFloatCharHashMap3.size());
  }

  @Test
  public void test10()  throws Throwable  {
      float[] floatArray0 = new float[7];
      float float0 = 0.0F;
      floatArray0[0] = float0;
      float float1 = 1.0F;
      floatArray0[1] = float1;
      float float2 = 0.0F;
      floatArray0[2] = float2;
      float float3 = 6.6360896E8F;
      floatArray0[3] = float3;
      float float4 = (-1.0F);
      floatArray0[4] = float4;
      float float5 = 1905.6041F;
      floatArray0[5] = float5;
      float float6 = 0.0F;
      floatArray0[6] = float6;
      char[] charArray0 = new char[7];
      char char0 = 'Q';
      charArray0[0] = char0;
      char char1 = 'p';
      charArray0[1] = char1;
      char char2 = '$';
      charArray0[2] = char2;
      char char3 = '}';
      charArray0[3] = char3;
      char char4 = 'N';
      charArray0[4] = char4;
      char char5 = 'K';
      charArray0[5] = char5;
      char char6 = '0';
      charArray0[6] = char6;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator((TFloatCharMap) tFloatCharHashMap0);
      String string0 = "YSL#<\\1-!G";
      RandomAccessFile randomAccessFile0 = null;
      try {
        randomAccessFile0 = new RandomAccessFile(string0, string0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal mode \"YSL#<\\1-!G\" must be one of \"r\", \"rw\", \"rws\", or \"rwd\"
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator();
      double double0 = 0.0;
      Float float0 = new Float(double0);
      char char0 = '';
      Character character0 = new Character(char0);
      // Undeclared exception!
      try {
        tFloatCharMapDecorator0.isEmpty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 0;
      float float0 = 0.0F;
      float[] floatArray0 = new float[1];
      float float1 = 0.0F;
      floatArray0[0] = float1;
      char[] charArray0 = new char[3];
      char char0 = '&';
      charArray0[0] = char0;
      char char1 = '2';
      charArray0[1] = char1;
      char char2 = '<';
      charArray0[2] = char2;
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(floatArray0, charArray0);
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator((TFloatCharMap) tFloatCharHashMap0);
      // Undeclared exception!
      try {
        tFloatCharMapDecorator0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TFloatCharMap tFloatCharMap0 = null;
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator(tFloatCharMap0);
      // Undeclared exception!
      try {
        tFloatCharMapDecorator0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator();
      String string0 = ">";
      Locale locale0 = Locale.JAPAN;
      String string1 = locale0.toString();
      Locale locale1 = Locale.JAPANESE;
      String string2 = locale0.getDisplayVariant(locale1);
      tFloatCharMapDecorator0.containsValue((Object) string2);
      tFloatCharMapDecorator0.containsKey((Object) string1);
      float float0 = (-1.0F);
      Float float1 = new Float(float0);
      char char0 = 'r';
      Character character0 = new Character(char0);
      Locale.forLanguageTag(string1);
      // Undeclared exception!
      try {
        tFloatCharMapDecorator0.put((Float) float0, character0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator();
      float float0 = 0.5F;
      Float float1 = new Float(float0);
      TFloatCharMapDecorator tFloatCharMapDecorator1 = new TFloatCharMapDecorator();
      char char0 = 'u';
      Character character0 = new Character(char0);
      // Undeclared exception!
      try {
        tFloatCharMapDecorator1.put((Float) float0, character0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      int int0 = (-543);
      TFloatCharHashMap tFloatCharHashMap0 = new TFloatCharHashMap(int0, int0);
      TFloatCharMapDecorator tFloatCharMapDecorator0 = new TFloatCharMapDecorator((TFloatCharMap) tFloatCharHashMap0);
      float float0 = 591.629F;
      Float float1 = new Float(float0);
      TFloatCharHashMap tFloatCharHashMap1 = new TFloatCharHashMap((TFloatCharMap) tFloatCharHashMap0);
      Character character0 = tFloatCharMapDecorator0.get((Object) tFloatCharHashMap1);
      tFloatCharMapDecorator0.entrySet();
      tFloatCharMapDecorator0.put(float1, character0);
      PipedInputStream pipedInputStream0 = null;
      PipedOutputStream pipedOutputStream0 = null;
      try {
        pipedOutputStream0 = new PipedOutputStream(pipedInputStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
