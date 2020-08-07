/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 17 17:23:02 UTC 2020
 */

package org.apache.commons.math.estimation;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AbstractEstimator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.estimation.AbstractEstimator"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 


  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractEstimator_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.estimation.EstimatedParameter",
      "org.apache.commons.math.linear.MatrixIndexException",
      "org.apache.commons.math.estimation.EstimationException",
      "org.apache.commons.math.estimation.WeightedMeasurement",
      "org.apache.commons.math.estimation.SimpleEstimationProblem",
      "org.apache.commons.math.linear.RealMatrixImpl",
      "org.apache.commons.math.MathException",
      "org.apache.commons.math.linear.BigMatrix",
      "org.apache.commons.math.estimation.Estimator",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimator",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$QuadraticProblem$LocalMeasurement",
      "org.apache.commons.math.linear.MatrixUtils",
      "org.apache.commons.math.estimation.AbstractEstimator",
      "org.apache.commons.math.linear.InvalidMatrixException",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest$QuadraticProblem",
      "org.apache.commons.math.estimation.LevenbergMarquardtEstimatorTest",
      "org.apache.commons.math.linear.RealMatrix",
      "org.apache.commons.math.estimation.EstimationProblem"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.apache.commons.math.estimation.WeightedMeasurement", false, AbstractEstimator_ESTest_scaffolding.class.getClassLoader()));
  }
}
