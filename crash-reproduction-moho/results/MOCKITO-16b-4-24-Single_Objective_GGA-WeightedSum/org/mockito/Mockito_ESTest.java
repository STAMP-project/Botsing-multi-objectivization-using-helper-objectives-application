/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 31 12:28:37 UTC 2020
 */

package org.mockito;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class Mockito_ESTest extends Mockito_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(1876);
      // Undeclared exception!
      Mockito.when(integer0);
  }
}
