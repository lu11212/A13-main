
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test01"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)100);
    int i12 = calcolatrice0.divide(10, (-11));
    int i15 = calcolatrice0.divide(3, 16);
    int i18 = calcolatrice0.divide((-6), (-26));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test02"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide((int)'#', 10);
    int i15 = calcolatrice0.divide((int)'#', (int)' ');
    int i18 = calcolatrice0.divide(0, (int)' ');
    int i21 = calcolatrice0.divide(14, 4);
    int i24 = calcolatrice0.divide(16, (-4));
    int i27 = calcolatrice0.divide((-32), 7);
    int i30 = calcolatrice0.divide((-13), (-13));
    int i33 = calcolatrice0.divide((-35), 9);
    int i36 = calcolatrice0.divide((int)(short)0, (-100));
    int i39 = calcolatrice0.divide(14, 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test03"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'a');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)'a');
    int i9 = calcolatrice0.divide(1, (int)'4');
    int i12 = calcolatrice0.divide((int)'a', 6);
    int i15 = calcolatrice0.divide(48, (-32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test04"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide((int)(short)1, (-52));
    int i15 = calcolatrice0.divide(16, (int)'4');
    int i18 = calcolatrice0.divide(35, 52);
    int i21 = calcolatrice0.divide(35, (int)(short)-1);
    int i24 = calcolatrice0.divide((-14), (-14));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-35));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test05"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((int)'4', (int)(short)-1);
    int i12 = calcolatrice0.divide((int)'#', (-32));
    int i15 = calcolatrice0.divide((-33), (-3));
    int i18 = calcolatrice0.divide(3, 14);
    int i21 = calcolatrice0.divide((-11), 1);
    int i24 = calcolatrice0.divide((int)'4', (-19));
    int i27 = calcolatrice0.divide(3, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-52));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test06"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((int)'4', (int)(short)-1);
    int i12 = calcolatrice0.divide((int)'#', (-32));
    int i15 = calcolatrice0.divide(1, (int)' ');
    int i18 = calcolatrice0.divide(9, (-32));
    int i21 = calcolatrice0.divide((int)(short)10, (-13));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-52));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test07"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide(1, (-52));
    int i12 = calcolatrice0.divide(100, (-52));
    int i15 = calcolatrice0.divide((int)(byte)10, (-33));
    int i18 = calcolatrice0.divide((-6), (-32));
    int i21 = calcolatrice0.divide(0, 1);
    int i24 = calcolatrice0.divide(33, (int)(short)100);
    int i27 = calcolatrice0.divide((int)(byte)1, (-16));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test08"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide(100, (int)'4');
    int i15 = calcolatrice0.divide(0, (int)'4');
    int i18 = calcolatrice0.divide((int)(short)-1, (int)(byte)1);
    int i21 = calcolatrice0.divide(16, (int)'a');
    int i24 = calcolatrice0.divide((int)(short)1, (-9));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test09"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)100);
    int i12 = calcolatrice0.divide(52, (int)(byte)1);
    int i15 = calcolatrice0.divide(20, 20);
    int i18 = calcolatrice0.divide((int)'a', (-16));
    int i21 = calcolatrice0.divide(16, 52);
    int i24 = calcolatrice0.divide((int)(byte)100, 9);
    int i27 = calcolatrice0.divide((-32), 24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test10"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide((int)'4', (int)'4');
    int i18 = calcolatrice0.divide((-2), (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test11"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((-52), 32);
    int i12 = calcolatrice0.divide((int)(byte)1, (-5));
    int i15 = calcolatrice0.divide((int)(short)1, (-8));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test12"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)100);
    int i12 = calcolatrice0.divide(52, (int)(byte)1);
    int i15 = calcolatrice0.divide((int)(short)10, 17);
    int i18 = calcolatrice0.divide((-9), 1);
    int i21 = calcolatrice0.divide((int)' ', (-13));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-9));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-2));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test13"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)100);
    int i12 = calcolatrice0.divide(52, (int)(byte)1);
    int i15 = calcolatrice0.divide((int)(short)10, 17);
    int i18 = calcolatrice0.divide((-16), (int)(byte)-1);
    int i21 = calcolatrice0.divide((-14), 19);
    int i24 = calcolatrice0.divide((int)(short)1, 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test14"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)-1, (int)(short)100);
    int i12 = calcolatrice0.divide((int)(short)10, (int)(byte)10);
    int i15 = calcolatrice0.divide(0, 5);
    int i18 = calcolatrice0.divide((-24), (int)'#');
    int i21 = calcolatrice0.divide((-13), (int)(byte)1);
    int i24 = calcolatrice0.divide((int)(short)0, 19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-13));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test15"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide(1, (-52));
    int i12 = calcolatrice0.divide(100, (-52));
    int i15 = calcolatrice0.divide((int)(short)10, (int)(byte)10);
    int i18 = calcolatrice0.divide(10, (int)'a');
    int i21 = calcolatrice0.divide((-2), 52);
    int i24 = calcolatrice0.divide((-13), (-17));
    int i27 = calcolatrice0.divide(1, (-3));
    int i30 = calcolatrice0.divide(0, (int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test16"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide(0, (int)' ');
    int i12 = calcolatrice0.divide((int)(byte)-1, (-11));
    int i15 = calcolatrice0.divide(4, (-11));
    int i18 = calcolatrice0.divide((-97), 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-8));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test17"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide((int)(byte)100, (-1));
    int i18 = calcolatrice0.divide(3, (int)' ');
    int i21 = calcolatrice0.divide(0, (int)'4');
    int i24 = calcolatrice0.divide((-6), (-5));
    int i27 = calcolatrice0.divide(1, 100);
    int i30 = calcolatrice0.divide((int)(short)1, (-12));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test18"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(100, (int)(byte)100);
    int i18 = calcolatrice0.divide(0, (-32));
    int i21 = calcolatrice0.divide(10, (-33));
    int i24 = calcolatrice0.divide(0, (int)(short)-1);
    int i27 = calcolatrice0.divide(6, (int)'a');
    int i30 = calcolatrice0.divide(0, 48);
    int i33 = calcolatrice0.divide((-11), (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test19"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((int)(short)0, 1);
    int i12 = calcolatrice0.divide(52, (int)(short)10);
    int i15 = calcolatrice0.divide((int)(byte)10, (int)(byte)10);
    int i18 = calcolatrice0.divide(35, (-52));
    int i21 = calcolatrice0.divide((-13), (int)(byte)1);
    int i24 = calcolatrice0.divide(35, (-97));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-13));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test20"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide((int)'#', 10);
    int i15 = calcolatrice0.divide((int)'#', (int)' ');
    int i18 = calcolatrice0.divide(0, (int)' ');
    int i21 = calcolatrice0.divide(14, 4);
    int i24 = calcolatrice0.divide(16, (-4));
    int i27 = calcolatrice0.divide(0, (-7));
    int i30 = calcolatrice0.divide(14, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test21"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((int)(short)100, 100);
    int i12 = calcolatrice0.divide((int)(short)0, 1);
    int i15 = calcolatrice0.divide((-11), (int)(byte)-1);
    int i18 = calcolatrice0.divide((-1), (int)(byte)10);
    int i21 = calcolatrice0.divide((-2), (-26));
    int i24 = calcolatrice0.divide(19, (-12));
    int i27 = calcolatrice0.divide(19, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 19);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test22"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((int)(short)100, 100);
    int i12 = calcolatrice0.divide((int)(short)1, (-6));
    int i15 = calcolatrice0.divide((-12), (-9));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test23"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)'4');
    int i9 = calcolatrice0.divide((int)(short)1, (int)(short)10);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)(short)-1);
    int i15 = calcolatrice0.divide((-33), (int)(short)-1);
    int i18 = calcolatrice0.divide((int)(byte)1, 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test24"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(1, (int)(short)1);
    int i18 = calcolatrice0.divide((int)' ', (int)'#');
    int i21 = calcolatrice0.divide((-32), (int)(short)10);
    int i24 = calcolatrice0.divide(17, 11);
    int i27 = calcolatrice0.divide(0, 5);
    int i30 = calcolatrice0.divide((-48), (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test25"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide((int)' ', (int)'a');
    int i15 = calcolatrice0.divide((int)(short)-1, (int)(short)-1);
    int i18 = calcolatrice0.divide((int)(short)0, (int)(short)-1);
    int i21 = calcolatrice0.divide(1, (int)' ');
    int i24 = calcolatrice0.divide((int)(short)-1, (-100));
    int i27 = calcolatrice0.divide((-5), (-7));
    int i30 = calcolatrice0.divide((-26), (-1));
    int i33 = calcolatrice0.divide(0, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test26"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide(0, (int)(byte)100);
    int i15 = calcolatrice0.divide(52, (-100));
    int i18 = calcolatrice0.divide(20, (-100));
    int i21 = calcolatrice0.divide((-32), (int)'4');
    int i24 = calcolatrice0.divide((-6), 1);
    int i27 = calcolatrice0.divide(10, (-1));
    int i30 = calcolatrice0.divide((-48), (-9));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 5);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test27"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide((int)' ', (int)'a');
    int i15 = calcolatrice0.divide((int)(short)-1, (int)(short)-1);
    int i18 = calcolatrice0.divide((int)(short)0, (int)(short)-1);
    int i21 = calcolatrice0.divide(1, (int)' ');
    int i24 = calcolatrice0.divide((int)(short)-1, (-100));
    int i27 = calcolatrice0.divide((-20), 2);
    int i30 = calcolatrice0.divide(5, 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test28"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide(1, (-52));
    int i12 = calcolatrice0.divide(10, (int)'4');
    int i15 = calcolatrice0.divide((int)(byte)0, (int)'#');
    int i18 = calcolatrice0.divide(0, (int)'#');
    int i21 = calcolatrice0.divide((-13), (-100));
    int i24 = calcolatrice0.divide(7, 2);
    int i27 = calcolatrice0.divide((-3), 20);
    int i30 = calcolatrice0.divide(7, (-4));
    int i33 = calcolatrice0.divide((int)(short)10, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-5));

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test29"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(100, (int)(byte)100);
    int i18 = calcolatrice0.divide((int)(byte)1, 1);
    int i21 = calcolatrice0.divide(0, (int)(byte)100);
    int i24 = calcolatrice0.divide(33, (-4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-8));

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test30"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide((int)' ', (int)'a');
    int i15 = calcolatrice0.divide((int)(short)1, (-100));
    int i18 = calcolatrice0.divide((-3), 5);
    int i21 = calcolatrice0.divide(48, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 12);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test31"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide(0, (int)(byte)100);
    int i15 = calcolatrice0.divide(52, (-100));
    int i18 = calcolatrice0.divide((int)(byte)10, (int)'4');
    int i21 = calcolatrice0.divide((-100), (-1));
    int i24 = calcolatrice0.divide((-1), 6);
    int i27 = calcolatrice0.divide(100, (-33));
    int i30 = calcolatrice0.divide(48, (-6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-8));

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test32"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (-52));
    int i9 = calcolatrice0.divide(4, (-13));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test33"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)' ', (int)'#');
    int i12 = calcolatrice0.divide((int)(short)1, 5);
    int i15 = calcolatrice0.divide((int)'#', (-3));
    int i18 = calcolatrice0.divide((int)(byte)-1, (int)(byte)100);
    int i21 = calcolatrice0.divide(32, (int)(short)1);
    int i24 = calcolatrice0.divide((int)'4', (int)(byte)100);
    int i27 = calcolatrice0.divide((-35), (-33));
    int i30 = calcolatrice0.divide((-4), 100);
    int i33 = calcolatrice0.divide((-16), 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test34"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide((int)(short)100, (int)(byte)10);
    int i18 = calcolatrice0.divide((-33), (-5));
    int i21 = calcolatrice0.divide((-100), (int)(short)10);
    int i24 = calcolatrice0.divide((int)(byte)-1, (-14));
    int i27 = calcolatrice0.divide(1, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test35"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)' ', (int)'#');
    int i12 = calcolatrice0.divide((int)(short)1, 5);
    int i15 = calcolatrice0.divide((int)'#', (-3));
    int i18 = calcolatrice0.divide(0, 17);
    int i21 = calcolatrice0.divide((-6), 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test36"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide(0, (int)' ');
    int i12 = calcolatrice0.divide((int)(byte)-1, (-11));
    int i15 = calcolatrice0.divide(4, (-11));
    int i18 = calcolatrice0.divide((int)'a', (int)(short)100);
    int i21 = calcolatrice0.divide(33, (-24));
    int i24 = calcolatrice0.divide(20, (-32));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test37"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)' ', (int)'#');
    int i12 = calcolatrice0.divide((int)(short)1, 5);
    int i15 = calcolatrice0.divide((int)(short)100, (-3));
    int i18 = calcolatrice0.divide((int)(byte)0, (-19));
    int i21 = calcolatrice0.divide((int)(short)0, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-33));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test38"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(byte)0, (int)(byte)1);
    int i15 = calcolatrice0.divide(17, 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test39"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide((int)(short)100, (int)(byte)10);
    int i18 = calcolatrice0.divide((-33), (-5));
    int i21 = calcolatrice0.divide((-24), 7);
    // The following exception was thrown during execution in test generation
    try {
    int i24 = calcolatrice0.divide(32, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-3));

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test40"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)'4');
    int i9 = calcolatrice0.divide(52, 100);
    int i12 = calcolatrice0.divide((-100), 52);
    int i15 = calcolatrice0.divide(7, (int)' ');
    int i18 = calcolatrice0.divide(2, (-13));
    int i21 = calcolatrice0.divide(48, (int)(byte)1);
    int i24 = calcolatrice0.divide((int)(byte)-1, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test41"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(100, (int)(byte)100);
    int i18 = calcolatrice0.divide(0, (-32));
    int i21 = calcolatrice0.divide((-100), (-100));
    int i24 = calcolatrice0.divide(0, 17);
    int i27 = calcolatrice0.divide((int)'a', (-32));
    int i30 = calcolatrice0.divide((-50), (-6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 8);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test42"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide((-14), (int)'a');
    int i6 = calcolatrice0.divide((-20), (int)'4');
    int i9 = calcolatrice0.divide((int)(short)-1, 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test43"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(100, (int)(byte)100);
    int i18 = calcolatrice0.divide((int)(byte)1, 1);
    int i21 = calcolatrice0.divide((-52), (-52));
    int i24 = calcolatrice0.divide((-13), (-33));
    int i27 = calcolatrice0.divide((-13), (-33));
    int i30 = calcolatrice0.divide(32, (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-16));

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test44"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(100, (int)(byte)100);
    int i18 = calcolatrice0.divide((int)(byte)1, 1);
    int i21 = calcolatrice0.divide((-3), (-52));
    int i24 = calcolatrice0.divide((-33), 20);
    int i27 = calcolatrice0.divide((-16), 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test45"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(100, (int)(byte)100);
    int i18 = calcolatrice0.divide((int)(short)10, (-32));
    int i21 = calcolatrice0.divide((int)(byte)100, (int)'a');
    int i24 = calcolatrice0.divide((-20), (int)(short)10);
    int i27 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test46"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)'4');
    int i9 = calcolatrice0.divide((int)(short)1, (int)(short)10);
    int i12 = calcolatrice0.divide(9, (int)(byte)100);
    int i15 = calcolatrice0.divide((-5), (-33));
    int i18 = calcolatrice0.divide((-17), (-52));
    int i21 = calcolatrice0.divide((-7), (-33));
    int i24 = calcolatrice0.divide((int)(short)0, (-97));
    int i27 = calcolatrice0.divide(0, (-8));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test47"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)1, (int)(short)1);
    int i9 = calcolatrice0.divide((int)(byte)0, (int)(short)10);
    int i12 = calcolatrice0.divide((-32), (int)' ');
    int i15 = calcolatrice0.divide(4, (-17));
    int i18 = calcolatrice0.divide((-11), (int)'#');
    int i21 = calcolatrice0.divide(35, (-20));
    int i24 = calcolatrice0.divide((int)(short)10, 48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test48"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(100, (int)(byte)100);
    int i18 = calcolatrice0.divide(0, (-32));
    int i21 = calcolatrice0.divide(10, (-33));
    int i24 = calcolatrice0.divide((-10), (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test49"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide((int)(byte)100, (-1));
    int i18 = calcolatrice0.divide(3, (int)' ');
    int i21 = calcolatrice0.divide(52, 100);
    int i24 = calcolatrice0.divide((-2), (-11));
    int i27 = calcolatrice0.divide(0, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test50"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)' ', (int)'#');
    int i12 = calcolatrice0.divide((int)(short)1, 5);
    int i15 = calcolatrice0.divide((int)'#', (-3));
    int i18 = calcolatrice0.divide((int)(byte)-1, (int)(byte)100);
    int i21 = calcolatrice0.divide((-17), (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 8);

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test51"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)' ', (int)'#');
    int i12 = calcolatrice0.divide((int)(short)1, 5);
    int i15 = calcolatrice0.divide((int)'#', (-3));
    int i18 = calcolatrice0.divide((int)(byte)-1, (int)(byte)100);
    int i21 = calcolatrice0.divide(32, (int)(short)1);
    int i24 = calcolatrice0.divide((int)'4', (int)(byte)100);
    int i27 = calcolatrice0.divide((-35), (-33));
    int i30 = calcolatrice0.divide(25, 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test52"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)100);
    int i12 = calcolatrice0.divide(52, (int)(byte)1);
    int i15 = calcolatrice0.divide((int)(short)10, 17);
    int i18 = calcolatrice0.divide((-16), (int)(byte)-1);
    int i21 = calcolatrice0.divide((-14), 19);
    int i24 = calcolatrice0.divide((-13), (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test53"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)1);
    int i12 = calcolatrice0.divide(52, (int)(short)1);
    int i15 = calcolatrice0.divide((-32), (int)'a');
    int i18 = calcolatrice0.divide((int)(byte)10, 3);
    int i21 = calcolatrice0.divide((-7), 100);
    int i24 = calcolatrice0.divide((-32), (-50));
    int i27 = calcolatrice0.divide(0, 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test54"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((int)(short)100, 100);
    int i12 = calcolatrice0.divide((int)(short)0, 1);
    int i15 = calcolatrice0.divide((int)' ', (-52));
    int i18 = calcolatrice0.divide(0, (-52));
    int i21 = calcolatrice0.divide(100, (int)' ');
    int i24 = calcolatrice0.divide((-3), (-2));
    int i27 = calcolatrice0.divide((-97), (int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    int i30 = calcolatrice0.divide((int)(short)1, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArithmeticException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test55"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide(20, (int)(byte)1);
    int i12 = calcolatrice0.divide((int)(short)1, (-6));
    int i15 = calcolatrice0.divide(3, (-10));
    int i18 = calcolatrice0.divide((-8), 97);
    int i21 = calcolatrice0.divide(52, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test56"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide(3, (int)(byte)1);
    int i12 = calcolatrice0.divide((int)(byte)1, (-100));
    int i15 = calcolatrice0.divide(3, 10);
    int i18 = calcolatrice0.divide((int)'a', 10);
    int i21 = calcolatrice0.divide((int)(short)-1, (-16));
    int i24 = calcolatrice0.divide(14, 9);
    int i27 = calcolatrice0.divide((-8), 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test57"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((int)'4', (int)(short)-1);
    int i12 = calcolatrice0.divide((int)'#', (-32));
    int i15 = calcolatrice0.divide((-33), (int)'4');
    int i18 = calcolatrice0.divide((-6), 52);
    int i21 = calcolatrice0.divide((-17), (-12));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-52));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test58"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide((int)'#', 10);
    int i15 = calcolatrice0.divide((int)'#', (int)' ');
    int i18 = calcolatrice0.divide((int)(byte)-1, 52);
    int i21 = calcolatrice0.divide((-6), (-20));
    int i24 = calcolatrice0.divide((-52), (-20));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 2);

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test59"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)100);
    int i12 = calcolatrice0.divide(52, (int)(byte)1);
    int i15 = calcolatrice0.divide((int)'#', (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-35));

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test60"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)100);
    int i12 = calcolatrice0.divide((-6), (int)'a');
    int i15 = calcolatrice0.divide(14, (int)' ');
    int i18 = calcolatrice0.divide(32, 6);
    int i21 = calcolatrice0.divide(97, 52);
    int i24 = calcolatrice0.divide(97, (-8));
    int i27 = calcolatrice0.divide(97, 17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-12));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 5);

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test61"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)1);
    int i12 = calcolatrice0.divide(0, 10);
    int i15 = calcolatrice0.divide((-26), (-50));
    int i18 = calcolatrice0.divide((-13), 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test62"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((int)'4', (int)(short)-1);
    int i12 = calcolatrice0.divide((int)'#', (-32));
    int i15 = calcolatrice0.divide((-33), (-3));
    int i18 = calcolatrice0.divide(3, 14);
    int i21 = calcolatrice0.divide((-11), 1);
    int i24 = calcolatrice0.divide((int)' ', (-6));
    int i27 = calcolatrice0.divide(97, 3);
    int i30 = calcolatrice0.divide(32, (int)(byte)10);
    int i33 = calcolatrice0.divide(0, (-17));
    int i36 = calcolatrice0.divide(10, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-52));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 5);

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test63"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((int)(short)100, 100);
    int i12 = calcolatrice0.divide((int)(short)0, 1);
    int i15 = calcolatrice0.divide((int)(short)1, (-52));
    int i18 = calcolatrice0.divide((-3), 10);
    int i21 = calcolatrice0.divide((int)(short)100, 10);
    int i24 = calcolatrice0.divide((int)' ', 2);
    int i27 = calcolatrice0.divide((int)(byte)1, (-5));
    int i30 = calcolatrice0.divide((int)' ', 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 32);

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test64"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)' ', (int)'#');
    int i12 = calcolatrice0.divide((int)(short)1, 5);
    int i15 = calcolatrice0.divide((int)'#', (-3));
    int i18 = calcolatrice0.divide((int)(byte)-1, (int)(byte)100);
    int i21 = calcolatrice0.divide((-10), 11);
    int i24 = calcolatrice0.divide(9, 48);
    int i27 = calcolatrice0.divide(6, 25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test65"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(100, (int)(byte)100);
    int i18 = calcolatrice0.divide((int)(byte)1, 1);
    int i21 = calcolatrice0.divide((-3), (-52));
    int i24 = calcolatrice0.divide((-50), (-10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 5);

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test66"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(100, (int)(byte)100);
    int i18 = calcolatrice0.divide(0, (-32));
    int i21 = calcolatrice0.divide(10, (-33));
    int i24 = calcolatrice0.divide(9, 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 4);

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test67"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide(1, (-52));
    int i12 = calcolatrice0.divide(10, (int)'4');
    int i15 = calcolatrice0.divide((int)(byte)0, (int)'#');
    int i18 = calcolatrice0.divide(0, 16);
    int i21 = calcolatrice0.divide((-20), (int)(byte)10);
    int i24 = calcolatrice0.divide((-48), (-50));
    int i27 = calcolatrice0.divide((-24), (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-2));

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test68"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)'4');
    int i9 = calcolatrice0.divide((int)(short)1, (int)(short)10);
    int i12 = calcolatrice0.divide(11, (int)(byte)1);
    int i15 = calcolatrice0.divide((-16), (int)(short)-1);
    int i18 = calcolatrice0.divide(35, (-52));
    int i21 = calcolatrice0.divide(33, (-52));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test69"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'#', 5);
    int i9 = calcolatrice0.divide((-52), (int)' ');
    int i12 = calcolatrice0.divide((int)(byte)100, (-50));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-2));

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test70"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide((int)' ', (int)'a');
    int i15 = calcolatrice0.divide(0, (int)'#');
    int i18 = calcolatrice0.divide((-97), (-19));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 5);

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test71"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(byte)1, (int)(byte)-1);
    int i15 = calcolatrice0.divide(16, (int)(byte)1);
    int i18 = calcolatrice0.divide(32, (-7));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-4));

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test72"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(1, (int)(short)1);
    int i18 = calcolatrice0.divide((-5), 9);
    int i21 = calcolatrice0.divide((-3), (int)'#');
    int i24 = calcolatrice0.divide(5, 20);
    int i27 = calcolatrice0.divide((int)(byte)100, (-26));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-3));

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test73"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((-1), 100);
    int i15 = calcolatrice0.divide((-52), 10);
    int i18 = calcolatrice0.divide(33, (-5));
    int i21 = calcolatrice0.divide((-19), 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-2));

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test74"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(1, (int)(short)1);
    int i18 = calcolatrice0.divide((-5), 9);
    int i21 = calcolatrice0.divide((-3), (int)'#');
    int i24 = calcolatrice0.divide(5, 20);
    int i27 = calcolatrice0.divide(33, (-8));
    int i30 = calcolatrice0.divide((-33), 4);
    int i33 = calcolatrice0.divide((int)'#', (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-8));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-11));

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test75"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'a');
    int i6 = calcolatrice0.divide((int)(byte)-1, 100);
    int i9 = calcolatrice0.divide((int)(byte)10, (-16));
    int i12 = calcolatrice0.divide((int)'4', (-12));
    int i15 = calcolatrice0.divide((int)(short)100, (-12));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-4));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-8));

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test76"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(byte)0, (int)(byte)1);
    int i15 = calcolatrice0.divide((int)(byte)0, (-11));
    int i18 = calcolatrice0.divide((-5), 3);
    int i21 = calcolatrice0.divide(48, (-52));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test77"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide(0, 7);
    int i9 = calcolatrice0.divide(10, 10);
    int i12 = calcolatrice0.divide((-5), 26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test78"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide((int)(short)1, (int)'#');
    int i12 = calcolatrice0.divide(0, (int)(byte)100);
    int i15 = calcolatrice0.divide(52, (-100));
    int i18 = calcolatrice0.divide((int)(byte)10, (int)'4');
    int i21 = calcolatrice0.divide(32, (int)(byte)100);
    int i24 = calcolatrice0.divide((-26), 48);
    int i27 = calcolatrice0.divide((-32), (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test79"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)' ', (int)'#');
    int i12 = calcolatrice0.divide((int)(short)1, 5);
    int i15 = calcolatrice0.divide((int)(short)100, (-3));
    int i18 = calcolatrice0.divide(7, (int)(short)100);
    int i21 = calcolatrice0.divide((-8), (-13));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-33));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test80"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide(0, (int)' ');
    int i12 = calcolatrice0.divide((int)(byte)-1, (-11));
    int i15 = calcolatrice0.divide(0, (-20));
    int i18 = calcolatrice0.divide((-8), (-11));
    int i21 = calcolatrice0.divide(14, (-16));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test81"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide((int)(byte)100, (-1));
    int i18 = calcolatrice0.divide(0, 11);
    int i21 = calcolatrice0.divide(100, 6);
    int i24 = calcolatrice0.divide((int)' ', (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test82"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'a', 100);
    int i9 = calcolatrice0.divide((int)(byte)10, (int)(short)100);
    int i12 = calcolatrice0.divide(52, (int)(byte)1);
    int i15 = calcolatrice0.divide(20, 20);
    int i18 = calcolatrice0.divide((int)'a', (-16));
    int i21 = calcolatrice0.divide((int)'#', (-11));
    int i24 = calcolatrice0.divide((-4), (-5));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-6));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-3));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test83"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide(1, (-52));
    int i12 = calcolatrice0.divide(100, (-52));
    int i15 = calcolatrice0.divide((int)(byte)10, (-33));
    int i18 = calcolatrice0.divide((-6), (-32));
    int i21 = calcolatrice0.divide(0, 1);
    int i24 = calcolatrice0.divide(0, (-8));
    int i27 = calcolatrice0.divide(35, (int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test84"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)'4', (int)(byte)1);
    int i9 = calcolatrice0.divide((int)'4', (int)(short)-1);
    int i12 = calcolatrice0.divide((int)'#', (-32));
    int i15 = calcolatrice0.divide((-33), (-3));
    int i18 = calcolatrice0.divide(3, 14);
    int i21 = calcolatrice0.divide((-11), 1);
    int i24 = calcolatrice0.divide((-3), 52);
    int i27 = calcolatrice0.divide((-97), (-10));
    int i30 = calcolatrice0.divide(24, 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-52));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-11));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test85"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)-1, (int)(byte)10);
    int i9 = calcolatrice0.divide(1, (-52));
    int i12 = calcolatrice0.divide(10, (int)'4');
    int i15 = calcolatrice0.divide((int)(byte)0, (int)'#');
    int i18 = calcolatrice0.divide(0, 16);
    int i21 = calcolatrice0.divide((-20), (int)(byte)10);
    int i24 = calcolatrice0.divide((-48), (-50));
    int i27 = calcolatrice0.divide(10, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-2));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test86"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'4');
    int i6 = calcolatrice0.divide((int)(byte)10, (int)(byte)100);
    int i9 = calcolatrice0.divide((int)(byte)-1, (int)(short)1);
    int i12 = calcolatrice0.divide((int)(short)-1, (int)'4');
    int i15 = calcolatrice0.divide(1, (int)(short)1);
    int i18 = calcolatrice0.divide((-5), 9);
    int i21 = calcolatrice0.divide((int)(short)0, 14);
    int i24 = calcolatrice0.divide(2, (-35));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test87"); }


    Calcolatrice calcolatrice0 = new Calcolatrice();
    int i3 = calcolatrice0.divide(0, (int)'a');
    int i6 = calcolatrice0.divide((int)(byte)-1, 100);
    int i9 = calcolatrice0.divide((-100), (-7));
    int i12 = calcolatrice0.divide((-13), (-13));
    int i15 = calcolatrice0.divide((int)(byte)-1, (int)'4');
    int i18 = calcolatrice0.divide((-16), (-33));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

}
