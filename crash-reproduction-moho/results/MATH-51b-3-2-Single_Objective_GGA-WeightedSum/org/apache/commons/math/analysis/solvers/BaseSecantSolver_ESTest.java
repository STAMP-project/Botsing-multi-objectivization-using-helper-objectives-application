/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 17 22:42:06 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.SincFunction;
import org.apache.commons.math.analysis.solvers.RegulaFalsiSolver;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseSecantSolver_ESTest extends BaseSecantSolver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SincFunction sincFunction0 = new SincFunction();
      RegulaFalsiSolver regulaFalsiSolver0 = new RegulaFalsiSolver(1.0, 1.0, (-1.0));
      regulaFalsiSolver0.setup(730, sincFunction0, (-4.4643151915106134E-13), 1266.957, (-881.7066732292635));
      // Undeclared exception!
      regulaFalsiSolver0.doSolve();
  }
}
