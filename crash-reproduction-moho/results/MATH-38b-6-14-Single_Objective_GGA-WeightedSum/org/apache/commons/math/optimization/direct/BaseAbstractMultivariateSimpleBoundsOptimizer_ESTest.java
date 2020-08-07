/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 17 22:29:02 UTC 2020
 */

package org.apache.commons.math.optimization.direct;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.analysis.MultivariateFunction;
import org.apache.commons.math.analysis.SumSincFunction;
import org.apache.commons.math.optimization.GoalType;
import org.apache.commons.math.optimization.direct.BOBYQAOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest extends BaseAbstractMultivariateSimpleBoundsOptimizer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SumSincFunction sumSincFunction0 = new SumSincFunction((-2668.831645358921));
      BOBYQAOptimizer bOBYQAOptimizer0 = new BOBYQAOptimizer(12, (-2988.0671487), 131.0);
      GoalType goalType0 = GoalType.MINIMIZE;
      double[] doubleArray0 = new double[4];
      // Undeclared exception!
      bOBYQAOptimizer0.optimize(12, (MultivariateFunction) sumSincFunction0, goalType0, doubleArray0, (double[]) null, (double[]) null);
  }
}
