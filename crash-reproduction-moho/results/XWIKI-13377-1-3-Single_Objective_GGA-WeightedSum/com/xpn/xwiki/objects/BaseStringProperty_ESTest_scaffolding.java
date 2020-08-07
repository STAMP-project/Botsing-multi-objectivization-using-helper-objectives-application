/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Mar 30 19:29:33 UTC 2020
 */

package com.xpn.xwiki.objects;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

@EvoSuiteClassExclude
public class BaseStringProperty_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.xpn.xwiki.objects.BaseStringProperty"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(BaseStringProperty_ESTest_scaffolding.class.getClassLoader() ,
      "org.dom4j.Document",
      "org.xwiki.bridge.DocumentModelBridge",
      "com.xpn.xwiki.objects.BaseProperty",
      "org.dom4j.Node",
      "org.dom4j.Branch",
      "org.xwiki.model.reference.EntityReference",
      "com.xpn.xwiki.doc.merge.MergeResult",
      "com.xpn.xwiki.objects.BaseElement",
      "com.xpn.xwiki.objects.BaseStringProperty",
      "com.xpn.xwiki.objects.ObjectInterface",
      "com.xpn.xwiki.doc.merge.MergeConfiguration",
      "org.xwiki.model.reference.ObjectPropertyReference",
      "com.xpn.xwiki.objects.BaseCollection",
      "com.xpn.xwiki.objects.CompatibilityObjectInterface",
      "org.xwiki.localization.ContextualLocalizationManager",
      "org.xwiki.model.reference.DocumentReference",
      "com.xpn.xwiki.XWikiContext",
      "com.xpn.xwiki.objects.PropertyInterface",
      "org.dom4j.Element",
      "com.xpn.xwiki.doc.XWikiDocument",
      "org.xwiki.model.reference.EntityReferenceSerializer",
      "com.xpn.xwiki.objects.ElementInterface"
    );
  } 
}
