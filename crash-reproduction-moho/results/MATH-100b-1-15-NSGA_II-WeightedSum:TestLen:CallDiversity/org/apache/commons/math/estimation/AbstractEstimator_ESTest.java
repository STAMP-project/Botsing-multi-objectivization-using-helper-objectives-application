/*
 * This file was automatically generated by EvoSuite
 * Sat Jan 18 16:55:11 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimator;
import org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest;
import org.apache.commons.math.estimation.SimpleEstimationProblem;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true) 
public class AbstractEstimator_ESTest extends AbstractEstimator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LevenbergMarquardtEstimator levenbergMarquardtEstimator0 = new LevenbergMarquardtEstimator();
      SimpleEstimationProblem simpleEstimationProblem0 = new SimpleEstimationProblem();
      levenbergMarquardtEstimator0.initializeEstimate(simpleEstimationProblem0);
      LevenbergMarquardtEstimatorTest levenbergMarquardtEstimatorTest0 = new LevenbergMarquardtEstimatorTest((String) null);
      LevenbergMarquardtEstimatorTest.QuadraticProblem levenbergMarquardtEstimatorTest_QuadraticProblem0 = levenbergMarquardtEstimatorTest0.new QuadraticProblem();
      levenbergMarquardtEstimatorTest_QuadraticProblem0.addPoint(0.0, (-1.0), (-1.0));
      // Undeclared exception!
      levenbergMarquardtEstimator0.getCovariances(levenbergMarquardtEstimatorTest_QuadraticProblem0);
  }
}
