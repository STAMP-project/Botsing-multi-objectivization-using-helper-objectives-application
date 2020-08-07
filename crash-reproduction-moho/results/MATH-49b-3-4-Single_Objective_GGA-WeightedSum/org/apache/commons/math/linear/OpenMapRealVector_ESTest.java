/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 10:25:46 UTC 2020
 */

package org.apache.commons.math.linear;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.linear.OpenMapRealVector;
import org.apache.commons.math.linear.RealVector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class OpenMapRealVector_ESTest extends OpenMapRealVector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      double[] doubleArray0 = new double[8];
      doubleArray0[0] = 1.0E-12;
      doubleArray0[1] = 1.0;
      OpenMapRealVector openMapRealVector0 = new OpenMapRealVector(doubleArray0);
      // Undeclared exception!
      openMapRealVector0.ebeMultiply((RealVector) openMapRealVector0);
  }
}
