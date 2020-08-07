/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Jan 17 18:18:13 UTC 2020
 */

package org.xwiki.wiki.template.internal;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class DefaultWikiTemplateManager_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.xwiki.wiki.template.internal.DefaultWikiTemplateManager"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DefaultWikiTemplateManager_ESTest_scaffolding.class.getClassLoader() ,
      "org.xwiki.wiki.provisioning.WikiProvisioningJobExecutor",
      "org.xwiki.query.QueryException",
      "org.xwiki.query.Query",
      "org.xwiki.model.internal.reference.AbstractStringEntityReferenceSerializer",
      "org.xwiki.component.annotation.Component",
      "org.xwiki.wiki.template.WikiTemplateManager",
      "org.xwiki.model.reference.EntityReference",
      "org.xwiki.model.internal.reference.DefaultSymbolScheme$1",
      "org.xwiki.wiki.provisioning.WikiProvisioningJobException",
      "org.xwiki.model.internal.reference.DefaultSymbolScheme",
      "org.apache.commons.lang3.StringUtils",
      "org.xwiki.wiki.template.WikiTemplatePropertyGroup",
      "org.xwiki.wiki.properties.WikiPropertyGroupProvider",
      "org.xwiki.component.annotation.Role",
      "org.xwiki.wiki.template.internal.DefaultWikiTemplateManager",
      "org.xwiki.model.reference.LocalDocumentReference",
      "org.xwiki.wiki.properties.WikiPropertyGroupException",
      "org.xwiki.wiki.provisioning.WikiProvisioningJob",
      "org.xwiki.model.EntityType",
      "org.xwiki.wiki.template.WikiTemplateManagerException",
      "org.xwiki.model.reference.EntityReferenceSerializer",
      "org.xwiki.wiki.manager.WikiManager",
      "org.xwiki.model.internal.reference.LocalizedStringEntityReferenceSerializer",
      "org.xwiki.job.Job",
      "org.xwiki.model.internal.reference.SymbolScheme",
      "org.xwiki.query.QueryManager",
      "org.xwiki.wiki.descriptor.WikiDescriptor",
      "org.xwiki.wiki.manager.WikiManagerException",
      "org.xwiki.model.internal.reference.DefaultStringEntityReferenceSerializer",
      "org.xwiki.wiki.properties.WikiPropertyGroup",
      "org.xwiki.model.reference.ObjectReference",
      "org.xwiki.model.reference.DocumentReference",
      "org.xwiki.model.reference.WikiReference",
      "org.xwiki.wiki.descriptor.WikiDescriptorManager"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.inject.Provider", false, DefaultWikiTemplateManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.query.QueryManager", false, DefaultWikiTemplateManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.wiki.descriptor.WikiDescriptorManager", false, DefaultWikiTemplateManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.wiki.manager.WikiManager", false, DefaultWikiTemplateManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.wiki.properties.WikiPropertyGroupProvider", false, DefaultWikiTemplateManager_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.xwiki.wiki.provisioning.WikiProvisioningJobExecutor", false, DefaultWikiTemplateManager_ESTest_scaffolding.class.getClassLoader()));
  }
}
