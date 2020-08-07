/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 17 22:51:03 UTC 2020
 */

package org.apache.commons.math.analysis.solvers;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class BaseAbstractUnivariateRealSolver_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseAbstractUnivariateRealSolver_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.math.exception.MathIllegalStateException",
      "org.apache.commons.math.exception.util.Localizable",
      "org.apache.commons.math.util.Incrementor",
      "org.apache.commons.math.exception.MathIllegalArgumentException",
      "org.apache.commons.math.exception.util.ExceptionContext",
      "org.apache.commons.math.analysis.solvers.AbstractUnivariateRealSolver",
      "org.apache.commons.math.exception.MaxCountExceededException",
      "org.apache.commons.math.analysis.solvers.BaseAbstractUnivariateRealSolver",
      "org.apache.commons.math.analysis.solvers.SecantSolver",
      "org.apache.commons.math.analysis.solvers.UnivariateRealSolver",
      "org.apache.commons.math.exception.util.LocalizedFormats",
      "org.apache.commons.math.analysis.UnivariateRealFunction",
      "org.apache.commons.math.analysis.solvers.BaseUnivariateRealSolver",
      "org.apache.commons.math.exception.TooManyEvaluationsException",
      "org.apache.commons.math.exception.util.ExceptionContextProvider",
      "org.apache.commons.math.exception.NoBracketingException",
      "org.apache.commons.math.exception.util.ArgUtils"
    );
  } 
}
