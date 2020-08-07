/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 30 17:09:57 UTC 2020
 */

package org.xwiki.model.internal.reference;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ExplicitStringEntityReferenceResolver_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ExplicitStringEntityReferenceResolver_ESTest_scaffolding.class.getClassLoader() ,
      "org.xwiki.model.reference.EntityReferenceResolver",
      "org.xwiki.model.internal.reference.ExplicitStringEntityReferenceResolver",
      "org.xwiki.component.annotation.Role",
      "org.xwiki.component.phase.Initializable",
      "org.xwiki.stability.Unstable",
      "org.xwiki.component.annotation.Component",
      "org.xwiki.model.reference.EntityReference",
      "org.xwiki.model.internal.reference.SymbolScheme",
      "org.xwiki.model.internal.reference.AbstractEntityReferenceResolver",
      "org.xwiki.model.internal.reference.AbstractStringEntityReferenceResolver",
      "org.xwiki.model.EntityType",
      "org.xwiki.component.phase.InitializationException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.xwiki.model.internal.reference.SymbolScheme", false, ExplicitStringEntityReferenceResolver_ESTest_scaffolding.class.getClassLoader()));
  }
}
