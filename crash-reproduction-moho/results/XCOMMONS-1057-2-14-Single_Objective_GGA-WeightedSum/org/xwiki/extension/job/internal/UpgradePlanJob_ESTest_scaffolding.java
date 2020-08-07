/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 31 14:45:12 UTC 2020
 */

package org.xwiki.extension.job.internal;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class UpgradePlanJob_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.xwiki.extension.job.internal.UpgradePlanJob"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UpgradePlanJob_ESTest_scaffolding.class.getClassLoader() ,
      "org.xwiki.job.event.status.JobStatus",
      "org.xwiki.logging.marker.AbstractContainerMarker",
      "org.xwiki.extension.ExtensionException",
      "org.xwiki.extension.job.plan.ExtensionPlanAction",
      "org.xwiki.logging.marker.TranslationMarker",
      "org.xwiki.extension.job.plan.internal.DefaultExtensionPlanTree",
      "org.xwiki.job.AbstractJob",
      "org.xwiki.component.namespace.NamespaceNotAllowedException",
      "org.xwiki.extension.job.ExtensionRequest",
      "org.xwiki.logging.marker.ContainerMarker",
      "org.xwiki.extension.job.plan.ExtensionPlanTree",
      "org.xwiki.job.JobGroupPath",
      "org.xwiki.extension.InstalledExtension",
      "org.xwiki.extension.job.internal.AbstractInstallPlanJob$ModifableExtensionPlanNode",
      "org.xwiki.extension.job.plan.ExtensionPlan",
      "org.xwiki.logging.marker.BeginTranslationMarker",
      "org.xwiki.extension.UninstallException",
      "org.xwiki.extension.InstallException",
      "org.xwiki.extension.job.plan.internal.DefaultExtensionPlanNode",
      "org.xwiki.logging.Message",
      "org.xwiki.context.ExecutionContextException",
      "org.xwiki.extension.job.internal.AbstractInstallPlanJob$ModifableExtensionPlanTree",
      "org.xwiki.job.GroupedJob",
      "org.xwiki.extension.job.internal.UpgradePlanJob",
      "org.xwiki.job.Request",
      "org.xwiki.component.annotation.Component",
      "org.xwiki.component.manager.ComponentLookupException",
      "org.xwiki.extension.ExtensionId",
      "org.xwiki.job.AbstractJobStatus",
      "org.xwiki.extension.job.internal.AbstractExtensionPlanJob",
      "org.xwiki.extension.job.internal.AbstractInstallPlanJob",
      "org.xwiki.component.annotation.InstantiationStrategy",
      "org.xwiki.extension.job.plan.internal.DefaultExtensionPlan",
      "org.xwiki.job.Job",
      "org.xwiki.extension.job.AbstractExtensionRequest",
      "org.xwiki.extension.Extension",
      "org.xwiki.extension.version.VersionConstraint",
      "org.xwiki.job.AbstractRequest",
      "org.xwiki.extension.job.InstallRequest",
      "org.xwiki.logging.marker.EndTranslationMarker",
      "org.xwiki.extension.LocalExtension",
      "org.xwiki.extension.ResolveException",
      "org.xwiki.extension.job.internal.AbstractExtensionJob",
      "org.xwiki.component.descriptor.ComponentInstantiationStrategy",
      "org.xwiki.observation.event.Event",
      "org.xwiki.extension.ExtensionDependency",
      "org.xwiki.logging.event.LogEvent",
      "org.xwiki.extension.version.IncompatibleVersionConstraintException",
      "org.xwiki.extension.job.plan.ExtensionPlanNode"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.xwiki.extension.job.plan.ExtensionPlanNode", false, UpgradePlanJob_ESTest_scaffolding.class.getClassLoader()));
  }
}
